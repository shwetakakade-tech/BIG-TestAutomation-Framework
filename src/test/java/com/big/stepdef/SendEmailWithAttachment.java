package com.big.stepdef;
import java.io.File;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
public class SendEmailWithAttachment {
	
	public static void sendEmailWithMultiAttachement() {
		  // Sender's email and app password
      final String senderEmail = "bigqapune@gmail.com";
      final String senderPassword = "ybdr luvl diqr iocx";

      // Recipient's email
      String recipientEmail = "processmodeluuid0002eb38-0226-8000-1f40-7f0000014e7a@bigappmarket-dev.appiancloud.com";
    //  String recipientEmail = "shweta.kakade@bitsinglass.com";

      // SMTP server settings for Gmail
      String host = "smtp.gmail.com";

      // Setup mail server properties
      Properties properties = new Properties();
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.starttls.enable", "true");
      properties.put("mail.smtp.host", host);
      properties.put("mail.smtp.port", "587");

      // Authenticate session
      Session session = Session.getInstance(properties, new Authenticator() {
          @Override
          protected PasswordAuthentication getPasswordAuthentication() {
              return new PasswordAuthentication(senderEmail, senderPassword);
          }
      });

      try {
          // Create email message
          Message message = new MimeMessage(session);
          message.setFrom(new InternetAddress(senderEmail));
          message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
          message.setSubject("Test Email with Attachment");

          // Create message body part
          BodyPart messageBodyPart = new MimeBodyPart();
          messageBodyPart.setText("Hi,\n\nPlease find the attached file.\n\nRegards,\nJavaMail");

          // Create multipart for message and attachment
          Multipart multipart = new MimeMultipart();
          multipart.addBodyPart(messageBodyPart);

          // Attachment part
          MimeBodyPart attachmentPart = new MimeBodyPart();
          MimeBodyPart attachmentPart1 = new MimeBodyPart();
          MimeBodyPart attachmentPart2 = new MimeBodyPart();
          String userDirectory = System.getProperty("user.dir");
          String fileName1 = "QPR_Reinsurance_Bordereau_Report.pdf";
          String fileName2 = "QPR_Submission_Example_Current_year.xlsx"; // Replace with your file name
          String fileName3 = "Reinsurance_Contract_Example_Insurance.docx"; // Replace with your file name// Replace with your file name
          
                   
          String filePath1 = userDirectory + File.separator+ File.separator + fileName1; // Adjust "path" if your file is in a subdirectory
          String filePath2 = userDirectory + File.separator+ File.separator + fileName2;
          String filePath3 = userDirectory + File.separator+ File.separator + fileName3;
          //    String filePath = "C:\\Users\\shweta.kakade_bitsin\\Documents\\Automation Training\\AppainFeature.txt"; // Change file path
          String FilePath1= filePath1;
          String FilePath2= filePath2;
          String FilePath3= filePath3;
          //   DataSource source = new FileDataSource(filePath);
          DataSource source = new FileDataSource(FilePath1);
          attachmentPart.setDataHandler(new DataHandler(source));
          attachmentPart.setFileName(source.getName());
          
          DataSource source1 = new FileDataSource(filePath2);
          attachmentPart1.setDataHandler(new DataHandler(source1));
          attachmentPart1.setFileName(source1.getName());
          
          
          DataSource source2 = new FileDataSource(filePath3);
          attachmentPart2.setDataHandler(new DataHandler(source2));
          attachmentPart2.setFileName(source2.getName());
          
          multipart.addBodyPart(attachmentPart);
          multipart.addBodyPart(attachmentPart1);
          multipart.addBodyPart(attachmentPart2);
          // Set content to message
          message.setContent(multipart);

          // Send the message
         Transport.send(message);

          System.out.println("Email sent successfully with attachment!");
         
      } catch (MessagingException e) {
          e.printStackTrace();
      }
	}
		
  public static void main(String[] args) {
  	SendEmailWithAttachment sEMA = new SendEmailWithAttachment();
  	sEMA.sendEmailWithMultiAttachement();
  	
  }


}
