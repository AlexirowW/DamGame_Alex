package dam.gala.damgame.comm;

import android.os.StrictMode;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class MailClient {
    public static void enviarCorreoSsl(String correo, String contrasegna, String destinatario,String asunto, String cuerpo) {
        final String USERNAME = "windtumbleweedspain@gmail.com";
        final String PASSWORD = "PruebaProyectoClaseDesierto";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication
                    getPasswordAuthentication() {
                        return new
                                PasswordAuthentication(USERNAME,
                                PASSWORD);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(USERNAME));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(destinatario)
            );
            message.setSubject(asunto);
            message.setText(cuerpo);

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            Transport.send(message);

            System.out.println("Enviado");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

