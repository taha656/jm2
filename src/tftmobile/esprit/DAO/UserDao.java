///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package tftmobile.esprit.DAO;
//
//import java.io.DataInputStream;
//import java.io.IOException;
//import javax.microedition.io.Connector;
//import javax.microedition.io.HttpConnection;
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.parsers.SAXParser;
//import javax.xml.parsers.SAXParserFactory;
//import org.xml.sax.SAXException;
//import tftmobile.esprit.entity.user;
//
///**
// *
// * @author Mariem R
// */
//public class UserDao {
//     HttpConnection ht;
//    DataInputStream data;
//     user[] people;
//     user p;
//    
//     public user SelectById(int i){
//      
//          try {
//            //setCommandListener(this);
//            //addCommand(cmdRefresh);
//            JoueurHandler sel = new JoueurHandler();
//            // get a parser object
//            SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
//            // get an InputStream from somewhere (could be HttpConnection, for example)
//            HttpConnection hc = (HttpConnection) Connector.open("http://localhost/fttj2me/SelectById.php?id_user="+i);//people.xml est un exemple
//            DataInputStream dis = new DataInputStream(hc.openDataInputStream());
//            parser.parse(dis, sel);
//            // display the result
//            people= sel.getPeople();
//            p=people[0];
////admin = ScoreHandler.getAdministrateurs();
//            /*if (people.length > 0) {
//                for (int i = 0; i < people.length; i++) {
//                    append(people[i].getNom_user()+" "+people[i].getPrenom_user(), null);
//                }
//            }*/
//        } catch (ParserConfigurationException ex) {
//            ex.printStackTrace();
//        } catch (SAXException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    return p;
//    
//     }
//
//}
    

