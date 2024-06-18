/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import com.mongodb.ConnectionString;
import herencias.TratamientoPassword;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import java.util.Arrays;
import java.util.Collections;
import org.bson.Document;

public class ConexionBaseDatosNoSQL extends TratamientoPassword {

    private static MongoClient mongoClient = null;
    private static MongoDatabase database = null;

    /*
    public static MongoDatabase conectar() {
        try {
            // Create MongoClient with specified settings
            String uri = "mongodb+srv://yaascanioa:cT0fHnZYZeC50U55@cluster0.t6p69xd.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
            mongoClient = MongoClients.create(
                    MongoClientSettings.builder()
                            .applyToClusterSettings(builder
                                    ->//builder.hosts(Collections.singletonList(new ServerAddress(uri))))
                                    builder.hosts(Collections.singletonList(new ServerAddress("127.0.0.1", 27017))))
                            .build());

            // Connect to the database named "proyectobomberos"
            database = mongoClient.getDatabase("proyectobomberos");
            return database;
        } catch (Exception e) {
            System.err.println("Error en la conexión a MongoDB: " + e);
        }
        return null;
    }
    */
    
    public static MongoDatabase conectar() {
        try {
            // MongoDB Atlas connection URI
            String uri = "mongodb+srv://yaascanioa:cT0fHnZYZeC50U55@cluster0.t6p69xd.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

            // Create MongoClient with the URI
            mongoClient = MongoClients.create(MongoClientSettings.builder()
                    .applyConnectionString(new ConnectionString(uri))
                    .build());

            // Connect to the database named "proyectobomberos"
            database = mongoClient.getDatabase("proyectobomberos");
            return database;
        } catch (Exception e) {
            System.err.println("Error en la conexión a MongoDB: " + e);
        }
        return null;
    }

    // Ensure the client is properly closed
    public static void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }

    public void insertarUsuarios(String usuario, String pass, String email, String rango, String sexo, String pais,
            String mensaje1, String mensaje2, String mensaje3, String user1, String user2,
            String user3, double salario, int horas) {
        String encryptedPassword = encryptPassword(pass);

        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document document = new Document("USUARIO", usuario)
                    .append("CONTRA", encryptedPassword)
                    .append("EMAIL", email)
                    .append("RANGO", rango)
                    .append("SEXO", sexo)
                    .append("PAIS", pais)
                    .append("MENSAJE1", mensaje1)
                    .append("MENSAJE2", mensaje2)
                    .append("MENSAJE3", mensaje3)
                    .append("USER1", user1)
                    .append("USER2", user2)
                    .append("USER3", user3)
                    .append("SALARIO", salario)
                    .append("HORASVOLUNTARIO", horas);

            collection.insertOne(document);
            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al insertar." + e);
        }
    }

    public boolean comprobarUsuario(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            // Create a query to check if the user exists
            Document query = new Document("USUARIO", user);

            // Check if a document with the specified user exists
            boolean exists = collection.find(query).iterator().hasNext();

            ConexionBaseDatosNoSQL.cerrarConexion();
            return exists;
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }
        return false;
    }

    public boolean comprobarPass(String usuario, String pass) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            // Create a query to find the user with the given username
            Document query = new Document("USUARIO", usuario);

            // Find the document for the user
            Document userDoc = collection.find(query).first();

            boolean bandera = false;

            if (userDoc != null) {
                String passBD = userDoc.getString("CONTRA");

                if (passBD.equals(pass)) {
                    bandera = true;
                }
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
            return bandera;
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return false;
    }

    // Método que devuelve el email del usuario
    public String devolverEmail(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document userDoc = collection.find(query).first();

            if (userDoc != null) {
                return userDoc.getString("EMAIL");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return null;
    }

    // Método que devuelve el sexo del usuario
    public String devolverSexo(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document userDoc = collection.find(query).first();

            if (userDoc != null) {
                return userDoc.getString("SEXO");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return null;
    }

    // Método que devuelve el sexo del user1
    public String devolverSexoUser1(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document userDoc = collection.find(query).first();

            if (userDoc != null) {
                return userDoc.getString("SEXOUSER1");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return null;
    }

    // Método que devuelve el rango del usuario
    public String devolverRango(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document userDoc = collection.find(query).first();

            if (userDoc != null) {
                return userDoc.getString("RANGO");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return null;
    }

    /*
    --------------------------------------------
    |  Método para la modificación de usuarios|
    --------------------------------------------
     */
    // Método para modificar usuarios en la base de datos
    public void modificarUsuarios(String usuario, String nuevoSexo, String nuevoEmail, String nuevoRango, String pass) {
        String encryptedPassword = encryptPassword(pass);

        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            // Crear un documento con los nuevos valores
            Document updates = new Document()
                    .append("SEXO", nuevoSexo)
                    .append("EMAIL", nuevoEmail)
                    .append("RANGO", nuevoRango)
                    .append("CONTRA", encryptedPassword);

            // Crear una consulta para encontrar el usuario por nombre
            Document query = new Document("USUARIO", usuario);

            // Realizar la actualización
            collection.updateOne(query, new Document("$set", updates));

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    /*
    -------------------------------------------------------------
    |  Métodos para devolver los mensajes y usuarios del mensaje|
    -------------------------------------------------------------
     */
    // Método que devuelve el mensaje del usuario 1
    public String devolverMensaje1(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document userDoc = collection.find(query).first();

            if (userDoc != null) {
                return userDoc.getString("MENSAJE1");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return null;
    }

    // Método que devuelve el usuario del mensaje 1
    public String devolverUser1(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document userDoc = collection.find(query).first();

            if (userDoc != null) {
                return userDoc.getString("USER1");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return null;
    }

    // Método que devuelve la foto del usuario 1
    public String devolverFoto(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USER1", user);
            Document userDoc = collection.find(query).first();

            if (userDoc != null) {
                return userDoc.getString("SEXO");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return ""; // Devuelve una cadena vacía en lugar de null
    }

    // Método que devuelve el mensaje del usuario 2
    public String devolverMensaje2(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document userDoc = collection.find(query).first();

            if (userDoc != null) {
                return userDoc.getString("MENSAJE2");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return null;
    }

    // Método que devuelve el usuario del mensaje 2
    public String devolverUser2(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document userDoc = collection.find(query).first();

            if (userDoc != null) {
                return userDoc.getString("USER2");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return null;
    }

    // Método que devuelve el mensaje del usuario 3
    public String devolverMensaje3(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document userDoc = collection.find(query).first();

            if (userDoc != null) {
                return userDoc.getString("MENSAJE3");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return null;
    }

    // Método que devuelve el usuario del mensaje 3
    public String devolverUser3(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document userDoc = collection.find(query).first();

            if (userDoc != null) {
                return userDoc.getString("USER3");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return null;
    }

    // Método para modificar mensaje y user 1
    public void modificarMensaje1(String mensaje1, String userReceptor, String sexo, String userEmisor) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document filter = new Document("USUARIO", userEmisor);
            Document update = new Document("$set", new Document("MENSAJE1", mensaje1)
                    .append("USER1", userReceptor)
                    .append("SEXOUSER1", sexo));

            UpdateResult result = collection.updateOne(filter, update);

            if (result.getMatchedCount() > 0) {
                System.out.println("Actualización exitosa.");
            } else {
                System.out.println("No se encontró el usuario.");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    // Método para modificar mensaje y user 2
    public void modificarMensaje2(String mensaje2, String userReceptor, String sexo, String userEmisor) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document filter = new Document("USUARIO", userEmisor);
            Document update = new Document("$set", new Document("MENSAJE2", mensaje2)
                    .append("USER2", userReceptor)
                    .append("SEXOUSER2", sexo));

            UpdateResult result = collection.updateOne(filter, update);

            if (result.getMatchedCount() > 0) {
                System.out.println("Actualización exitosa.");
            } else {
                System.out.println("No se encontró el usuario.");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    // Método para modificar mensaje y user 3
    public void modificarMensaje3(String mensaje3, String userReceptor, String sexo, String userEmisor) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document filter = new Document("USUARIO", userEmisor);
            Document update = new Document("$set", new Document("MENSAJE3", mensaje3)
                    .append("USER3", userReceptor)
                    .append("SEXOUSER3", sexo));

            UpdateResult result = collection.updateOne(filter, update);

            if (result.getMatchedCount() > 0) {
                System.out.println("Actualización exitosa.");
            } else {
                System.out.println("No se encontró el usuario.");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    // Método para insertar mensajes
    public void insertarMensajes(String mensaje, String enviado, String recibido, int ID_Usuario, String tiempo) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("mensajes");

            Document documento = new Document("Mensaje", mensaje)
                    .append("NombreUsuarioEnviado", enviado)
                    .append("NombreUsuarioRecibido", recibido)
                    .append("ID_Usuario", ID_Usuario)
                    .append("Tiempo", tiempo);

            collection.insertOne(documento);

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e);
        }
    }

    // Método que devuelve el ID del usuario
    public int devolverID_Usuario(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document usuario = collection.find(Filters.eq("USUARIO", user)).first();

            if (usuario != null) {
                return usuario.getInteger("ID");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return 0;
    }

    // Método que devuelve el historial de mensajes
    public String devolverHistorial(int id_user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("mensajes");

            Iterable<Document> mensajes = collection.find(Filters.eq("ID_Usuario", id_user));
            StringBuilder resultado = new StringBuilder();
            int contador = 0;

            for (Document mensaje : mensajes) {
                contador++;
                resultado.append("\nEnviado por: ").append(mensaje.getString("NombreUsuarioEnviado"))
                        .append(" el ").append(mensaje.getString("Tiempo"))
                        .append(": \n******************************************************\n")
                        .append("Mensaje enviado: ").append(mensaje.getString("Mensaje"))
                        .append("\n******************************************************\n");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
            return "Total de mensajes enviados a usted: " + contador + "\n" + resultado.toString();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return "";
    }

    // Método que devuelve el historial de mensajes en japonés
    public String devolverHistorialJP(int id_user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("mensajes");

            Iterable<Document> mensajes = collection.find(Filters.eq("ID_Usuario", id_user));
            StringBuilder resultado = new StringBuilder();
            int contador = 0;

            for (Document mensaje : mensajes) {
                contador++;
                resultado.append("送信者: ").append(mensaje.getString("NombreUsuarioEnviado"))
                        .append(" 投稿日 ").append(mensaje.getString("Tiempo"))
                        .append(": \n******************************************************\n")
                        .append("メッセージを送信しました: ").append(mensaje.getString("Mensaje"))
                        .append("\n******************************************************\n");
            }

            ConexionBaseDatosNoSQL.cerrarConexion();
            return "あなたに送信されたメッセージの合計数： " + contador + "\n" + resultado.toString();
        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return "";
    }

    // Método para insertar emergencia
    public void insertarEmergencia(String nombre, String prioridad, String tipo, String descripcion, String nombreCreador, String estado, String idioma) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("emergencias");

            Document documento = new Document("Nombre", nombre)
                    .append("Prioridad", prioridad)
                    .append("Tipo", tipo)
                    .append("Descripcion", descripcion)
                    .append("NombreCreador", nombreCreador)
                    .append("Estado", estado)
                    .append("Idioma", idioma);

            collection.insertOne(documento);

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al insertar: " + e);
        }
    }

    // Método para modificar caso del usuario
    public void modificarCasoUsuario(int id_caso, String usuario) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            collection.updateOne(Filters.eq("USUARIO", usuario), Updates.set("ID_Caso", id_caso));

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    // Método para eliminar caso del usuario
    public void eliminarCasoUsuario(String usuario) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            collection.updateOne(Filters.eq("USUARIO", usuario), Updates.unset("ID_Caso"));

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    // Método para modificar caso en la colección de emergencias
    public void modificarCaso(int id_Usuario, String caso) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("emergencias");

            collection.updateOne(Filters.eq("Nombre", caso), Updates.set("ID_Usuario", id_Usuario));

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    // Método para finalizar un caso
    public void eliminarCaso(String caso, String idioma) {
        String estado = "";
        if (idioma.equals("ESP")) {
            estado = "Finalizado";
        } else if (idioma.equals("JP")) {
            estado = "終了";
        }

        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("emergencias");

            collection.updateOne(Filters.eq("Nombre", caso), Updates.set("Estado", estado));

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    // Método para modificar caso a estado en curso
    public void modificarCasoEnCurso(String caso, String idioma) {
        String estado = "";
        if (idioma.equals("ESP")) {
            estado = "En curso";
        } else if (idioma.equals("JP")) {
            estado = "進行中";
        }

        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("emergencias");

            collection.updateOne(Filters.eq("Nombre", caso), Updates.set("Estado", estado));

            ConexionBaseDatosNoSQL.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error al actualizar: " + e);
        }
    }

    // Método que devuelve el ID del caso dado su nombre
    public int devolverID_Caso(String caso) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("emergencias");

            Document doc = collection.find(Filters.eq("Nombre", caso)).first();

            ConexionBaseDatosNoSQL.cerrarConexion();

            if (doc != null) {
                return doc.getInteger("ID", 0);
            }
        } catch (Exception e) {
            System.out.println("Error al acceder.");
        }
        return 0;
    }

    // Método que verifica si un usuario tiene un caso asignado
    public boolean devolverCasoUsuario(String usuario) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document doc = collection.find(Filters.eq("USUARIO", usuario)).first();

            ConexionBaseDatosNoSQL.cerrarConexion();

            return doc != null && doc.getInteger("ID_Caso", 0) != 0;
        } catch (Exception e) {
            System.out.println("Error al acceder.");
        }
        return false;
    }

    // Método que devuelve el ID del caso asignado a un usuario
    public int devolverIDCasoUsuario(String usuario) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document doc = collection.find(Filters.eq("USUARIO", usuario)).first();

            ConexionBaseDatosNoSQL.cerrarConexion();

            if (doc != null) {
                return doc.getInteger("ID_Caso", 0);
            }
        } catch (Exception e) {
            System.out.println("Error al acceder.");
        }
        return 0;
    }

    // Método que verifica si existe un caso con el nombre dado
    public boolean comprobarCaso(String caso) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("emergencias");

            Document doc = collection.find(Filters.eq("Nombre", caso)).first();

            ConexionBaseDatosNoSQL.cerrarConexion();

            return doc != null;
        } catch (Exception e) {
            System.out.println("Error al acceder.");
        }
        return false;
    }

    // Método que devuelve el último caso basado en el idioma
    public String devolverUltimoCaso(String idioma) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("emergencias");

            Document query = new Document("Estado", new Document("$nin", Arrays.asList("Finalizado", "En curso", "終了", "進行中")));
            if (!idioma.equals("Sin seleccionar")) {
                query.append("Idioma", idioma.equals("ESP") ? "ESP" : "JP");
            }

            Document doc = collection.find(query).sort(new Document("ID", 1)).first();

            ConexionBaseDatosNoSQL.cerrarConexion();

            if (doc != null) {
                String resultado = "";
                if (idioma.equals("ESP")) {
                    resultado += "Nombre de la emergencia: " + doc.getString("Nombre") + "\n\nPrioridad: " + doc.getString("Prioridad") + "\n\nTipo: " + doc.getString("Tipo") + "\n\nDescripción: " + doc.getString("Descripcion");
                } else if (idioma.equals("JP")) {
                    resultado += "緊急事態の名前：" + doc.getString("Nombre") + "\n\n優先度：" + doc.getString("Prioridad") + "\n\nタイプ：" + doc.getString("Tipo") + "\n\n説明：" + doc.getString("Descripcion");
                }
                return resultado;
            }
        } catch (Exception e) {
            System.out.println("Error al acceder.");
        }
        return "";
    }

    // Método que devuelve el ID del último caso basado en el idioma
    public int devolverIDCaso(String idioma) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("emergencias");

            Document query = new Document("Estado", new Document("$nin", Arrays.asList("Finalizado", "En curso", "終了", "進行中")));
            if (!idioma.equals("Sin seleccionar")) {
                query.append("Idioma", idioma.equals("ESP") ? "ESP" : "JP");
            }

            Document doc = collection.find(query).sort(new Document("ID", 1)).first();

            ConexionBaseDatosNoSQL.cerrarConexion();

            if (doc != null) {
                return doc.getInteger("ID", -1);
            }
        } catch (Exception e) {
            System.out.println("Error al acceder.");
        }
        return -1;
    }

    // Método que devuelve el nombre del caso basado en el ID
    public String devolverNombreCaso(int id) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("emergencias");

            Document doc = collection.find(Filters.eq("ID", id)).first();

            ConexionBaseDatosNoSQL.cerrarConexion();

            if (doc != null) {
                return doc.getString("Nombre");
            }
        } catch (Exception e) {
            System.out.println("Error al acceder.");
        }
        return "";
    }

    // Devuelve la cantidad de casos en un idioma concreto
    public int devolverCantidadCasos(String idioma) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("emergencias");

            Document query = new Document("Estado", new Document("$nin", Arrays.asList("Finalizado", "En curso", "終了", "進行中")));

            if (idioma.equals("ESP")) {
                query.append("Idioma", "ESP");
            } else if (idioma.equals("JP")) {
                query.append("Idioma", "JP");
            }

            long count = collection.countDocuments(query);

            ConexionBaseDatosNoSQL.cerrarConexion();
            return (int) count;

        } catch (Exception e) {
            System.out.println("Error al acceder." + e);
        }

        return 0;
    }

    // Método que devuelve las horas de voluntariado de un usuario
    public int devolverHoras(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document projection = new Document("HORASVOLUNTARIO", 1).append("_id", 0);

            Document result = collection.find(query).projection(projection).first();

            ConexionBaseDatosNoSQL.cerrarConexion();

            if (result != null && result.containsKey("HORASVOLUNTARIO")) {
                return result.getInteger("HORASVOLUNTARIO");
            }

        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return 0;
    }

    // Método que devuelve el salario de un usuario
    public double devolverSalario(String user) {
        try {
            MongoDatabase database = ConexionBaseDatosNoSQL.conectar();
            MongoCollection<Document> collection = database.getCollection("usuarios");

            Document query = new Document("USUARIO", user);
            Document projection = new Document("SALARIO", 1).append("_id", 0);

            Document result = collection.find(query).projection(projection).first();

            ConexionBaseDatosNoSQL.cerrarConexion();

            if (result != null && result.containsKey("SALARIO")) {
                return result.getDouble("SALARIO");
            }

        } catch (Exception e) {
            System.out.println("Error al acceder: " + e);
        }

        return 0.0;
    }

}
