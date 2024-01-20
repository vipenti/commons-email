/* Licensed to the Apache Software Foundation (ASF) under one or more
        contributor license agreements.  See the NOTICE file distributed with
        this work for additional information regarding copyright ownership.
        The ASF licenses this file to You under the Apache License, Version 2.0
        (the "License"); you may not use this file except in compliance with
        the License.  You may obtain a copy of the License at

             http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
 */

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email2 = multiPartEmail0.addCc("25");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``25''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_SOCKET_FACTORY_FALLBACK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.socketFactory.fallback" + "'", str0, "mail.smtp.socketFactory.fallback");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        java.util.Collection<javax.mail.internet.InternetAddress> internetAddressCollection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email3 = multiPartEmail0.setTo(internetAddressCollection2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_TRANSPORT_PROTOCOL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.transport.protocol" + "'", str0, "mail.transport.protocol");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str0 = org.apache.commons.mail.Email.TEXT_HTML;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text/html" + "'", str0, "text/html");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email2 = multiPartEmail0.addCc("mail.smtp.socketFactory.fallback");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.socketFactory.fallback''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        java.lang.String str2 = multiPartEmail0.getSslSmtpPort();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email5 = multiPartEmail0.addReplyTo("", "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Illegal address in string ``''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "465" + "'", str2, "465");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.mail.internet.InternetAddress[] internetAddressArray2 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList3 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList3, internetAddressArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email5 = multiPartEmail0.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(internetAddressArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = email3.addTo("25", "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``25''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = multiPartEmail0.sendMimeMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MimeMessage has not been created yet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = org.apache.commons.mail.Email.CONTENT_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "content.type" + "'", str0, "content.type");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setMailSessionFromJNDI("25");
            org.junit.Assert.fail("Expected exception of type javax.naming.NoInitialContextException; message: Need to specify class name in environment or system property, or in an application resource file: java.naming.factory.initial");
        } catch (javax.naming.NoInitialContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_PASSWORD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.password" + "'", str0, "mail.smtp.password");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_AUTH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.auth" + "'", str0, "mail.smtp.auth");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = multiPartEmail0.send();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email4 = email2.addBcc("text/html");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/html''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str0 = org.apache.commons.mail.Email.KOI8_R;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "koi8-r" + "'", str0, "koi8-r");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_CONNECTIONTIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.connectiontimeout" + "'", str0, "mail.smtp.connectiontimeout");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email2 = multiPartEmail0.addReplyTo("mail.smtp.auth");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.auth''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_PORT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.port" + "'", str0, "mail.smtp.port");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        java.lang.String str2 = multiPartEmail0.getSslSmtpPort();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email5 = multiPartEmail0.addTo("hi!", "mail.smtp.socketFactory.fallback");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``hi!''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "465" + "'", str2, "465");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = multiPartEmail0.addTo("465");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``465''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str0 = org.apache.commons.mail.Email.SENDER_EMAIL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sender.email" + "'", str0, "sender.email");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.Session session2 = multiPartEmail0.getMailSession();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str0 = org.apache.commons.mail.Email.ISO_8859_1;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "iso-8859-1" + "'", str0, "iso-8859-1");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email2 = multiPartEmail0.setBounceAddress("mail.smtp.connectiontimeout");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to set the bounce address : mail.smtp.connectiontimeout");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str0 = org.apache.commons.mail.Email.SMTP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "smtp" + "'", str0, "smtp");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        javax.mail.internet.MimeMultipart mimeMultipart4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email5 = multiPartEmail0.addPart(mimeMultipart4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:10 CET 2024");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str0 = org.apache.commons.mail.Email.RECEIVER_EMAIL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "receiver.email" + "'", str0, "receiver.email");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        javax.mail.Session session1 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setMailSession(session1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no mail session supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        java.lang.String str4 = multiPartEmail0.getSmtpPort();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail0.addReplyTo("mail.smtp.port", "receiver.email", "mail.smtp.connectiontimeout");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.smtp.connectiontimeout");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:10 CET 2024");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25" + "'", str4, "25");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        javax.mail.internet.InternetAddress[] internetAddressArray6 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList7 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList7, internetAddressArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail0.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(internetAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str0 = org.apache.commons.mail.Email.FILE_SERVER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "file.server" + "'", str0, "file.server");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMultipart mimeMultipart4 = null;
        email3.setContent(mimeMultipart4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = email3.send();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        java.lang.String[] strArray5 = new java.lang.String[] { "mail.smtp.port" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = multiPartEmail0.addTo(strArray5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.port''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_TRANSPORT_TLS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.starttls.enable" + "'", str0, "mail.smtp.starttls.enable");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int int0 = org.apache.commons.mail.HtmlEmail.CID_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email3 = multiPartEmail0.addTo(strArray2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.addBcc("file.server", "sender.email", "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``file.server''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:10 CET 2024");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        multiPartEmail0.setAuthentication("", "");
        java.lang.Class<?> wildcardClass9 = multiPartEmail0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        multiPartEmail0.setAuthentication("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = multiPartEmail0.addBcc("iso-8859-1", "receiver.email");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``iso-8859-1''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.InternetAddress[] internetAddressArray4 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList5 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList5, internetAddressArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(internetAddressArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = multiPartEmail0.addCc("file.server", "", "text/html");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``file.server''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail7 = multiPartEmail0.attach(uRL4, "mail.smtp.connectiontimeout", "content.type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.mail.Authenticator authenticator2 = null;
        multiPartEmail0.setAuthenticator(authenticator2);
        org.apache.commons.mail.MultiPartEmail multiPartEmail4 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList5 = multiPartEmail4.getToAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = multiPartEmail0.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(internetAddressList5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email4 = simpleEmail0.addTo("mail.smtp.port", "465", "text/html");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: text/html");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str0 = org.apache.commons.mail.Email.TEXT_PLAIN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "text/plain" + "'", str0, "text/plain");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setSSLCheckServerIdentity(false);
        java.lang.String[] strArray7 = new java.lang.String[] { "file.server", "receiver.email" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = email4.addTo(strArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``file.server''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail0.addBcc(strArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setSSLCheckServerIdentity(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = email2.addTo("text/html");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/html''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str0 = org.apache.commons.mail.Email.RECEIVER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "receiver.name" + "'", str0, "receiver.name");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = email3.addBcc("mail.transport.protocol", "smtp", "file.server");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: file.server");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.Class<?> wildcardClass7 = multiPartEmail6.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setHeaders(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.entrySet()\" because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        java.lang.String[] strArray4 = new java.lang.String[] { "text/html", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email5 = multiPartEmail0.addCc(strArray4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/html''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        org.apache.commons.mail.Email email8 = multiPartEmail0.setMsg("mail.smtp.auth");
        // The following exception was thrown during execution in test generation
        try {
            email8.setMailSessionFromJNDI("smtp");
            org.junit.Assert.fail("Expected exception of type javax.naming.NoInitialContextException; message: Need to specify class name in environment or system property, or in an application resource file: java.naming.factory.initial");
        } catch (javax.naming.NoInitialContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str0 = org.apache.commons.mail.Email.EMAIL_SUBJECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "email.subject" + "'", str0, "email.subject");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_SOCKET_FACTORY_PORT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.socketFactory.port" + "'", str0, "mail.smtp.socketFactory.port");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        multiPartEmail0.setAuthentication("", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = multiPartEmail0.setFrom("mail.smtp.port", "content.type");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.port''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        java.net.URL uRL2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail5 = multiPartEmail0.attach(uRL2, "mail.smtp.socketFactory.port", "file.server");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        email2.setSocketConnectionTimeout((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = email2.addCc("mail.smtp.port", "mail.smtp.starttls.enable");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.port''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail6.addBcc("text/html");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/html''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        javax.activation.DataSource dataSource6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail9 = multiPartEmail0.attach(dataSource6, "mail.transport.protocol", "mail.smtp.port");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid Datasource");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setSSLCheckServerIdentity(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = email2.addReplyTo("koi8-r", "mail.smtp.port", "iso-8859-1");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``koi8-r''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        java.lang.String str4 = multiPartEmail0.getSmtpPort();
        boolean boolean5 = multiPartEmail0.isStartTLSEnabled();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail0.addBcc("sender.email", "mail.smtp.socketFactory.fallback", "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``sender.email''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:11 CET 2024");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25" + "'", str4, "25");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        org.apache.commons.mail.MultiPartEmail multiPartEmail5 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str6 = multiPartEmail5.getSmtpPort();
        org.apache.commons.mail.Email email8 = multiPartEmail5.setSubject("25");
        java.lang.String str9 = multiPartEmail5.getHostName();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList10 = multiPartEmail5.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = multiPartEmail0.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25" + "'", str6, "25");
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(internetAddressList10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail0.addPart(mimeMultipart7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        java.lang.Class<?> wildcardClass4 = email3.getClass();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        boolean boolean6 = multiPartEmail0.isTLS();
        javax.activation.DataSource dataSource7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(dataSource7, "mail.smtp.connectiontimeout", "mail.smtp.password");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid Datasource");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSubType();
        javax.mail.internet.InternetAddress internetAddress6 = multiPartEmail0.getFromAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail0.addReplyTo("sender.email");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``sender.email''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(internetAddress6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = htmlEmail0.embed(dataSource1, "", "smtp");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: name cannot be null or empty");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.addHeader("mail.smtp.connectiontimeout", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value can not be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail0.addReplyTo("mail.transport.protocol", "text/html");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.transport.protocol''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str0 = org.apache.commons.mail.Email.ATTACHMENTS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "attachments" + "'", str0, "attachments");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setSSLCheckServerIdentity(false);
        email2.addHeader("mail.transport.protocol", "file.server");
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str0 = org.apache.commons.mail.Email.EMAIL_BODY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "email.body" + "'", str0, "email.body");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email4 = email2.setBounceAddress("receiver.email");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to set the bounce address : receiver.email");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        org.apache.commons.mail.MultiPartEmail multiPartEmail11 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email13 = multiPartEmail11.setStartTLSRequired(false);
        org.apache.commons.mail.Email email15 = multiPartEmail11.setStartTLSRequired(false);
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.internet.MimeMessage mimeMessage16 = email10.thirdMessageCheck((org.apache.commons.mail.Email) multiPartEmail11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.internet.MimeMessage.getSentDate()\" because \"email.message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(email13);
        org.junit.Assert.assertNotNull(email15);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail2 = htmlEmail0.attach(file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        multiPartEmail0.setTLS(true);
        javax.activation.DataSource dataSource10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail13 = multiPartEmail0.attach(dataSource10, "mail.smtp.socketFactory.fallback", "text/plain");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid Datasource");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_USER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.user" + "'", str0, "mail.smtp.user");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_HOST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.host" + "'", str0, "mail.smtp.host");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setAuthentication("text/html", "text/plain");
        org.junit.Assert.assertNotNull(internetAddressList1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        org.apache.commons.mail.MultiPartEmail multiPartEmail5 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str6 = multiPartEmail5.getSmtpPort();
        multiPartEmail5.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str10 = multiPartEmail5.getSslSmtpPort();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList11 = multiPartEmail5.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email12 = multiPartEmail0.setReplyTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25" + "'", str6, "25");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "465" + "'", str10, "465");
        org.junit.Assert.assertNotNull(internetAddressList11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail5.setSSLCheckServerIdentity(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = htmlEmail5.sendMimeMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MimeMessage has not been created yet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ikzvcdzegr" + "'", str3, "ikzvcdzegr");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        int int6 = multiPartEmail0.getSocketTimeout();
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String str0 = org.apache.commons.mail.Email.US_ASCII;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "us-ascii" + "'", str0, "us-ascii");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        boolean boolean11 = email10.isSendPartial();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = email10.addCc("", "mail.transport.protocol", "koi8-r");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Illegal address in string ``''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        javax.mail.internet.InternetAddress[] internetAddressArray8 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList9 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList9, internetAddressArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = htmlEmail7.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNotNull(internetAddressArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_DEBUG;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.debug" + "'", str0, "mail.debug");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        boolean boolean7 = multiPartEmail6.isSSLOnConnect();
        java.lang.String[] strArray9 = new java.lang.String[] { "attachments" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = multiPartEmail6.addBcc(strArray9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``attachments''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.mail.Authenticator authenticator2 = null;
        multiPartEmail0.setAuthenticator(authenticator2);
        multiPartEmail0.addHeader("mail.smtp.starttls.enable", "file.server");
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.addHeader("25", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: value can not be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_SOCKET_FACTORY_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.socketFactory.class" + "'", str0, "mail.smtp.socketFactory.class");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = multiPartEmail0.addReplyTo("mail.smtp.socketFactory.port");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.socketFactory.port''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.setMailSessionFromJNDI("mail.smtp.password");
            org.junit.Assert.fail("Expected exception of type javax.naming.NoInitialContextException; message: Need to specify class name in environment or system property, or in an application resource file: java.naming.factory.initial");
        } catch (javax.naming.NoInitialContextException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        boolean boolean11 = email10.isSendPartial();
        javax.mail.Session session12 = null;
        // The following exception was thrown during execution in test generation
        try {
            email10.setMailSession(session12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no mail session supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMultipart mimeMultipart4 = null;
        email3.setContent(mimeMultipart4);
        org.apache.commons.mail.Email email7 = email3.setSSLCheckServerIdentity(true);
        java.lang.String[] strArray12 = new java.lang.String[] { "iso-8859-1", "smtp", "25", "koi8-r" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = email7.addCc(strArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``iso-8859-1''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        java.lang.String str4 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSocketConnectionTimeout((-1));
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setMailSessionFromJNDI("mail.smtp.starttls.enable");
            org.junit.Assert.fail("Expected exception of type javax.naming.NoInitialContextException; message: Need to specify class name in environment or system property, or in an application resource file: java.naming.factory.initial");
        } catch (javax.naming.NoInitialContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:13 CET 2024");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25" + "'", str4, "25");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = simpleEmail0.setMsg("text/plain");
        org.apache.commons.mail.MultiPartEmail multiPartEmail4 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email6 = multiPartEmail4.setStartTLSRequired(false);
        org.apache.commons.mail.Email email8 = email6.setSSLCheckServerIdentity(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList9 = email6.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = email3.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertNotNull(internetAddressList9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.MultiPartEmail multiPartEmail8 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email10 = multiPartEmail8.setStartTLSRequired(false);
        java.util.Date date11 = multiPartEmail8.getSentDate();
        multiPartEmail6.setSentDate(date11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email14 = multiPartEmail6.setBounceAddress("mail.smtp.socketFactory.fallback");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to set the bounce address : mail.smtp.socketFactory.fallback");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 20 22:48:13 CET 2024");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail7.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.addCc("koi8-r", "mail.smtp.auth");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``koi8-r''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(mimeMessage4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String str0 = org.apache.commons.mail.Email.SENDER_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sender.name" + "'", str0, "sender.name");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.mail.Authenticator authenticator2 = null;
        multiPartEmail0.setAuthenticator(authenticator2);
        multiPartEmail0.addHeader("mail.smtp.starttls.enable", "file.server");
        boolean boolean7 = multiPartEmail0.isSSLOnConnect();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.setFrom("", "text/html", "iso-8859-1");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Illegal address in string ``''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        boolean boolean11 = multiPartEmail6.isStartTLSRequired();
        java.lang.String[] strArray16 = new java.lang.String[] { "email.body", "content.type", "receiver.name", "vkrxuaxgay" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email17 = multiPartEmail6.addCc(strArray16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``email.body''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSslSmtpPort();
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str7 = multiPartEmail6.getSmtpPort();
        multiPartEmail6.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str11 = multiPartEmail6.getSslSmtpPort();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = multiPartEmail6.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = multiPartEmail0.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "465" + "'", str5, "465");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "25" + "'", str7, "25");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "465" + "'", str11, "465");
        org.junit.Assert.assertNotNull(internetAddressList12);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = multiPartEmail0.addBcc("sender.name", "fjnmntfewn");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``sender.name''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:13 CET 2024");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        java.lang.String str2 = multiPartEmail0.getSslSmtpPort();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = multiPartEmail0.addBcc("mail.smtp.socketFactory.class", "text/plain", "mail.smtp.auth");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.smtp.auth");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "465" + "'", str2, "465");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.Session session6 = multiPartEmail0.getMailSession();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        boolean boolean6 = multiPartEmail0.isTLS();
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail0.addPart(mimeMultipart7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList5 = multiPartEmail0.getCcAddresses();
        org.apache.commons.mail.Email email7 = multiPartEmail0.setMsg("text/html");
        email7.setContent((java.lang.Object) 100.0f, "mail.smtp.host");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email14 = email7.addTo("mail.smtp.socketFactory.port", "mail.smtp.auth", "smtp");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: smtp");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(internetAddressList5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        javax.mail.internet.MimeMultipart mimeMultipart4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email5 = htmlEmail3.addPart(mimeMultipart4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setSSLCheckServerIdentity(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = email4.addCc("us-ascii");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``us-ascii''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSubType();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(uRL6, "mail.smtp.socketFactory.class", "text/plain", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        boolean boolean11 = email10.isSendPartial();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = email10.send();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.timeout" + "'", str0, "mail.smtp.timeout");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setMsg("mail.smtp.password");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.addHeader("", "email.body");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: name can not be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        java.lang.String[] strArray3 = new java.lang.String[] { "text/html" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email4 = multiPartEmail0.addBcc(strArray3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/html''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMultipart mimeMultipart4 = null;
        email3.setContent(mimeMultipart4);
        org.apache.commons.mail.Email email7 = email3.setSSLCheckServerIdentity(true);
        // The following exception was thrown during execution in test generation
        try {
            email7.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        multiPartEmail0.setAuthentication("", "");
        java.lang.String str9 = multiPartEmail0.getSubType();
        multiPartEmail0.setDebug(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = multiPartEmail0.setFrom("text/html", "mail.smtp.connectiontimeout", "text/plain");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: text/plain");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        boolean boolean6 = multiPartEmail0.isTLS();
        javax.mail.internet.InternetAddress internetAddress7 = multiPartEmail0.getFromAddress();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(internetAddress7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email4 = multiPartEmail0.addBcc("text/plain", "mqerzxkmcj");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/plain''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_FROM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mail.smtp.from" + "'", str0, "mail.smtp.from");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        boolean boolean11 = email10.isSendPartial();
        org.apache.commons.mail.MultiPartEmail multiPartEmail12 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str13 = multiPartEmail12.getSmtpPort();
        org.apache.commons.mail.Email email15 = multiPartEmail12.setSubject("25");
        java.lang.String str16 = multiPartEmail12.getHostName();
        multiPartEmail12.setSubType("mail.smtp.connectiontimeout");
        int int19 = multiPartEmail12.getSocketTimeout();
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.internet.MimeMessage mimeMessage20 = email10.thirdMessageCheck((org.apache.commons.mail.Email) multiPartEmail12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.internet.MimeMessage.getSentDate()\" because \"email.message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "25" + "'", str13, "25");
        org.junit.Assert.assertNotNull(email15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60000 + "'", int19 == 60000);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        boolean boolean6 = multiPartEmail0.isStartTLSEnabled();
        javax.mail.Session session7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setMailSession(session7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no mail session supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        org.apache.commons.mail.Email email7 = multiPartEmail0.setMsg("mail.smtp.starttls.enable");
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setMsg("mail.smtp.password");
        boolean boolean4 = email3.isSendPartial();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        multiPartEmail6.setPopBeforeSmtp(true, "25", "mail.smtp.connectiontimeout", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email14 = multiPartEmail6.addBcc("sender.name", "465");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``sender.name''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = email2.setFrom("receiver.name", "fjnmntfewn");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``receiver.name''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        int int4 = email3.getSocketConnectionTimeout();
        java.lang.String str5 = email3.getSslSmtpPort();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60000 + "'", int4 == 60000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "465" + "'", str5, "465");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email4 = multiPartEmail0.addTo("qqfbjpipab");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``qqfbjpipab''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        boolean boolean5 = multiPartEmail0.isSSL();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail0.addReplyTo("iso-8859-1", "file.server");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``iso-8859-1''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        java.lang.String str2 = multiPartEmail0.getSslSmtpPort();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList3 = multiPartEmail0.getReplyToAddresses();
        javax.mail.internet.InternetAddress[] internetAddressArray4 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList5 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList5, internetAddressArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "465" + "'", str2, "465");
        org.junit.Assert.assertNotNull(internetAddressList3);
        org.junit.Assert.assertNotNull(internetAddressArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        java.lang.String str2 = multiPartEmail0.getSslSmtpPort();
        boolean boolean3 = multiPartEmail0.isSendPartial();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "465" + "'", str2, "465");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        org.apache.commons.mail.Email email8 = multiPartEmail0.setMsg("mail.smtp.auth");
        email8.setSSL(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = email8.addReplyTo("mail.smtp.host", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.host''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.addBcc("mqerzxkmcj", "mail.smtp.password");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mqerzxkmcj''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(mimeMessage4);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        boolean boolean7 = multiPartEmail0.isStartTLSEnabled();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        // The following exception was thrown during execution in test generation
        try {
            email7.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = htmlEmail0.embed(file2, "mqerzxkmcj");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.MultiPartEmail multiPartEmail8 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email10 = multiPartEmail8.setStartTLSRequired(false);
        java.util.Date date11 = multiPartEmail8.getSentDate();
        multiPartEmail6.setSentDate(date11);
        boolean boolean13 = multiPartEmail6.isSSL();
        org.apache.commons.mail.Email email16 = multiPartEmail6.addPart("mail.smtp.connectiontimeout", "receiver.email");
        java.lang.String str17 = multiPartEmail6.getSubType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 20 22:48:15 CET 2024");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(email16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        javax.activation.DataSource dataSource9 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource9, "mail.debug");
        htmlEmail0.setAuthentication("mail.smtp.starttls.enable", "465");
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = htmlEmail0.embed(file15, "gjgimxsdbu");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "bjtfwlpetd" + "'", str11, "bjtfwlpetd");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        int int2 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email4 = multiPartEmail0.setSSLCheckServerIdentity(true);
        java.lang.String[] strArray6 = new java.lang.String[] { "sender.email" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.addTo(strArray6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``sender.email''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setMsg("mail.smtp.password");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = multiPartEmail0.addCc("sender.email", "465");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``sender.email''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = multiPartEmail0.send();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = multiPartEmail0.setStartTLSRequired(false);
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList7 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.MultiPartEmail multiPartEmail8 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str9 = multiPartEmail8.getSmtpPort();
        org.apache.commons.mail.Email email11 = multiPartEmail8.setSubject("25");
        java.lang.String str12 = multiPartEmail8.getHostName();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList13 = multiPartEmail8.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email14 = multiPartEmail0.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(internetAddressList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(internetAddressList13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList5 = multiPartEmail0.getCcAddresses();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail9 = multiPartEmail0.attach(uRL6, "vkrxuaxgay", "mail.smtp.host");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(internetAddressList5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        multiPartEmail0.setTLS(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email12 = multiPartEmail0.addReplyTo("attachments", "sender.email");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``attachments''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        java.lang.String[] strArray8 = new java.lang.String[] { "text/html", "vkrxuaxgay", "fryefwbswo" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = simpleEmail0.addCc(strArray8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/html''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(dataSource6, "mail.transport.protocol", "mail.smtp.socketFactory.class", "mail.smtp.timeout");
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail10.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(multiPartEmail10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = email2.addBcc("465", "content.type");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``465''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = email7.getCcAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail9 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList10 = htmlEmail9.getBccAddresses();
        javax.activation.DataSource dataSource11 = null;
        java.lang.String str14 = htmlEmail9.embed(dataSource11, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail16 = htmlEmail9.setHtmlMsg("mail.smtp.auth");
        java.lang.String str17 = htmlEmail9.getSubject();
        javax.activation.DataSource dataSource18 = null;
        java.lang.String str20 = htmlEmail9.embed(dataSource18, "mail.debug");
        htmlEmail9.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = htmlEmail9.getHeaders();
        email7.setHeaders(strMap24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email29 = email7.addReplyTo("us-ascii", "email.body", "mail.smtp.starttls.enable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.smtp.starttls.enable");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(internetAddressList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "email.subject" + "'", str14, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail16);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "jazanazddw" + "'", str20, "jazanazddw");
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail3.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        multiPartEmail0.setContent(mimeMultipart7);
        multiPartEmail0.setTLS(true);
        boolean boolean11 = multiPartEmail0.isStartTLSRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = multiPartEmail0.addTo("mail.smtp.timeout");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.timeout''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        boolean boolean6 = multiPartEmail0.isStartTLSEnabled();
        boolean boolean7 = multiPartEmail0.isStartTLSRequired();
        org.apache.commons.mail.Email email9 = multiPartEmail0.setStartTLSRequired(false);
        java.lang.Class<?> wildcardClass10 = email9.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail5.setSSLCheckServerIdentity(true);
        java.lang.String[] strArray13 = new java.lang.String[] { "koi8-r", "mail.smtp.host", "vkrxuaxgay", "mqerzxkmcj", "receiver.email" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email14 = email7.addTo(strArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``koi8-r''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "kzqgnxydze" + "'", str3, "kzqgnxydze");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        javax.activation.DataSource dataSource9 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource9, "mail.debug");
        htmlEmail0.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = htmlEmail0.getHeaders();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = htmlEmail0.embed(uRL16, "text/html");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "pqtbcuenfb" + "'", str11, "pqtbcuenfb");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setSendPartial(true);
        boolean boolean3 = email2.isTLS();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setMsg("mail.smtp.password");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getSslSmtpPort();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "465" + "'", str5, "465");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.lang.String str3 = email2.getSmtpPort();
        org.apache.commons.mail.MultiPartEmail multiPartEmail4 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str5 = multiPartEmail4.getSmtpPort();
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail4.attach(dataSource6, "smtp", "koi8-r", "receiver.email");
        java.lang.String str11 = multiPartEmail10.getBounceAddress();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = multiPartEmail10.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = email2.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25" + "'", str3, "25");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "25" + "'", str5, "25");
        org.junit.Assert.assertNotNull(multiPartEmail10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(internetAddressList12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        multiPartEmail0.setTLS(true);
        java.lang.String str10 = multiPartEmail0.getBounceAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = multiPartEmail0.addReplyTo("mail.smtp.timeout", "text/plain");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.timeout''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMultipart mimeMultipart4 = null;
        email3.setContent(mimeMultipart4);
        org.apache.commons.mail.Email email7 = email3.setSSLCheckServerIdentity(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = email3.addCc("mqerzxkmcj", "email.body", "sender.email");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: sender.email");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.setMailSessionFromJNDI("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: JNDI name missing");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        boolean boolean5 = multiPartEmail0.isSSL();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.addCc("text/plain");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/plain''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMultipart mimeMultipart4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = multiPartEmail0.addPart(mimeMultipart4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = htmlEmail0.embed("attachments", "smtp");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid URL");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = htmlEmail10.embed(file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList5 = multiPartEmail0.getCcAddresses();
        org.apache.commons.mail.Email email7 = multiPartEmail0.setMsg("text/html");
        email7.setContent((java.lang.Object) 100.0f, "mail.smtp.host");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = email7.addBcc("mail.smtp.socketFactory.fallback", "blxsqlqqvw");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.socketFactory.fallback''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(internetAddressList5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = simpleEmail0.setMsg("text/plain");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = email3.addCc("iso-8859-1", "mail.smtp.socketFactory.port", "koi8-r");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``iso-8859-1''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        java.lang.String str3 = simpleEmail0.getHeader("gjgimxsdbu");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        multiPartEmail6.setPopBeforeSmtp(true, "25", "mail.smtp.connectiontimeout", "");
        org.apache.commons.mail.Email email13 = multiPartEmail6.setStartTLSEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email17 = multiPartEmail6.addReplyTo("attachments", "mail.smtp.starttls.enable", "mail.smtp.port");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.smtp.port");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNotNull(email13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email9 = multiPartEmail0.setMsg("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email12 = email9.addReplyTo("mail.smtp.socketFactory.port", "blxsqlqqvw");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.socketFactory.port''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(email9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = htmlEmail10.sendMimeMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MimeMessage has not been created yet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        java.lang.String str5 = email4.getSmtpPort();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "25" + "'", str5, "25");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setSSLCheckServerIdentity(false);
        org.apache.commons.mail.Email email6 = email4.setSubject("content.type");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList7 = email6.getBccAddresses();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNotNull(internetAddressList7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        javax.activation.DataSource dataSource6 = null;
        java.lang.String str9 = htmlEmail5.embed(dataSource6, "mail.smtp.socketFactory.port", "mail.smtp.port");
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = htmlEmail5.embed(file10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mail.smtp.port" + "'", str9, "mail.smtp.port");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        java.lang.String str7 = multiPartEmail0.getHeader("mail.smtp.socketFactory.fallback");
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail11 = multiPartEmail0.attach(uRL8, "lgbgqhtwcg", "mail.smtp.socketFactory.port");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        java.lang.String str4 = multiPartEmail0.getHostName();
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        org.apache.commons.mail.MultiPartEmail multiPartEmail7 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email9 = multiPartEmail7.setStartTLSRequired(false);
        org.apache.commons.mail.Email email11 = email9.setMsg("mail.smtp.port");
        email11.setSSL(true);
        multiPartEmail0.setContent((java.lang.Object) true, "blxsqlqqvw");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertNotNull(email11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        org.apache.commons.mail.Email email8 = multiPartEmail0.setMsg("mail.smtp.auth");
        javax.activation.DataSource dataSource9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail12 = multiPartEmail0.attach(dataSource9, "465", "25");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid Datasource");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        javax.mail.internet.MimeMultipart mimeMultipart4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = htmlEmail0.addPart(mimeMultipart4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        boolean boolean2 = multiPartEmail0.isSSL();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email4 = multiPartEmail0.addBcc("iso-8859-1");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``iso-8859-1''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setBoolHasAttachments(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email7 = email5.setStartTLSEnabled(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail5.setSSLCheckServerIdentity(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = htmlEmail5.embed("iso-8859-1", "fjnmntfewn");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid URL");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "pqebpvjkij" + "'", str3, "pqebpvjkij");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setCharset("ifguxugtww");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: ifguxugtww");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setSSLCheckServerIdentity(false);
        org.apache.commons.mail.Email email6 = email4.setSubject("content.type");
        javax.mail.internet.InternetAddress internetAddress7 = email4.getFromAddress();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNull(internetAddress7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        boolean boolean6 = multiPartEmail0.isStartTLSEnabled();
        boolean boolean7 = multiPartEmail0.isStartTLSRequired();
        multiPartEmail0.setSslSmtpPort("gjgimxsdbu");
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email12 = multiPartEmail10.setStartTLSRequired(false);
        email12.setSocketConnectionTimeout((int) (byte) 10);
        multiPartEmail0.setContent((java.lang.Object) email12, "mail.smtp.socketFactory.port");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = multiPartEmail0.sendMimeMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MimeMessage has not been created yet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(email12);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail2 = multiPartEmail0.attach(file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        multiPartEmail6.setPopBeforeSmtp(true, "25", "mail.smtp.connectiontimeout", "");
        org.apache.commons.mail.Email email13 = multiPartEmail6.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email15 = email13.setSendPartial(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email19 = email15.addReplyTo("mail.smtp.host", "sender.name", "vkrxuaxgay");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: vkrxuaxgay");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNotNull(email13);
        org.junit.Assert.assertNotNull(email15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setCharset("mail.smtp.starttls.enable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.smtp.starttls.enable");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        email4.setSSL(true);
        // The following exception was thrown during execution in test generation
        try {
            email4.setMailSessionFromJNDI("qqfbjpipab");
            org.junit.Assert.fail("Expected exception of type javax.naming.NoInitialContextException; message: Need to specify class name in environment or system property, or in an application resource file: java.naming.factory.initial");
        } catch (javax.naming.NoInitialContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        boolean boolean6 = multiPartEmail0.isStartTLSRequired();
        javax.mail.Session session7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setMailSession(session7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no mail session supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = multiPartEmail0.send();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(dataSource6, "mail.transport.protocol", "mail.smtp.socketFactory.class", "mail.smtp.timeout");
        org.apache.commons.mail.Email email12 = multiPartEmail0.setStartTLSEnabled(false);
        javax.mail.internet.MimeMultipart mimeMultipart13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = multiPartEmail0.addPart(mimeMultipart13, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(multiPartEmail10);
        org.junit.Assert.assertNotNull(email12);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        int int5 = email2.getSocketConnectionTimeout();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = email2.getBccAddresses();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(internetAddressList6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = htmlEmail0.embed(uRL4, "mail.transport.protocol");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ooksqhcugp" + "'", str3, "ooksqhcugp");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        javax.mail.Authenticator authenticator5 = null;
        email4.setAuthenticator(authenticator5);
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setBoolHasAttachments(false);
        boolean boolean4 = multiPartEmail0.isSSLCheckServerIdentity();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.MultiPartEmail multiPartEmail8 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email10 = multiPartEmail8.setStartTLSRequired(false);
        java.util.Date date11 = multiPartEmail8.getSentDate();
        multiPartEmail6.setSentDate(date11);
        boolean boolean13 = multiPartEmail6.isSSL();
        boolean boolean14 = multiPartEmail6.isTLS();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 20 22:48:17 CET 2024");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail6.addPart(mimeMultipart7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = htmlEmail0.addReplyTo("koi8-r");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``koi8-r''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(dataSource6, "mail.transport.protocol", "mail.smtp.socketFactory.class", "mail.smtp.timeout");
        boolean boolean11 = multiPartEmail0.isStartTLSEnabled();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(multiPartEmail10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        boolean boolean6 = multiPartEmail0.isStartTLSRequired();
        java.lang.String[] strArray13 = new java.lang.String[] { "iso-8859-1", "25", "mail.debug", "mail.smtp.socketFactory.fallback", "file.server", "mail.smtp.starttls.enable" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email14 = multiPartEmail0.addBcc(strArray13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``iso-8859-1''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setSocketTimeout(0);
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(true);
        boolean boolean4 = multiPartEmail0.isStartTLSRequired();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setSSLOnConnect(true);
        boolean boolean7 = email6.isStartTLSEnabled();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        int int6 = multiPartEmail0.getSocketTimeout();
        javax.mail.Authenticator authenticator7 = null;
        multiPartEmail0.setAuthenticator(authenticator7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        javax.activation.DataSource dataSource4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail7 = multiPartEmail0.attach(dataSource4, "sender.name", "mail.smtp.user");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid Datasource");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:17 CET 2024");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = htmlEmail3.addCc("mail.smtp.socketFactory.class", "", "iso-8859-1");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.socketFactory.class''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        java.lang.String str6 = htmlEmail0.getSubType();
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = email7.getCcAddresses();
        boolean boolean9 = email7.isStartTLSRequired();
        java.lang.Class<?> wildcardClass10 = email7.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        boolean boolean7 = multiPartEmail6.isSSLOnConnect();
        multiPartEmail6.setBoolHasAttachments(false);
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail6.setCharset("465");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: 465");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSslSmtpPort();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = multiPartEmail0.getBccAddresses();
        multiPartEmail0.setHostName("koi8-r");
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setCharset("gycaxbrvob");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: gycaxbrvob");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "465" + "'", str5, "465");
        org.junit.Assert.assertNotNull(internetAddressList6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        multiPartEmail0.setSubType("sender.name");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        java.lang.String[] strArray14 = new java.lang.String[] { "receiver.email", "sender.name", "mail.smtp.socketFactory.port", "content.type", "mqerzxkmcj" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = htmlEmail0.addTo(strArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``receiver.email''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        java.lang.String str2 = multiPartEmail0.getSslSmtpPort();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList3 = multiPartEmail0.getReplyToAddresses();
        org.apache.commons.mail.MultiPartEmail multiPartEmail4 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean5 = multiPartEmail4.isSendPartial();
        java.lang.String str6 = multiPartEmail4.getSslSmtpPort();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList7 = multiPartEmail4.getReplyToAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail0.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "465" + "'", str2, "465");
        org.junit.Assert.assertNotNull(internetAddressList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "465" + "'", str6, "465");
        org.junit.Assert.assertNotNull(internetAddressList7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail5.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        multiPartEmail0.setSocketConnectionTimeout((int) (byte) 0);
        boolean boolean8 = multiPartEmail0.isSendPartial();
        boolean boolean9 = multiPartEmail0.isStartTLSRequired();
        boolean boolean10 = multiPartEmail0.isSSL();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = multiPartEmail0.setStartTLSRequired(false);
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail0.addPart(mimeMultipart7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        org.apache.commons.mail.Email email7 = htmlEmail3.setMsg("koi8-r");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = email7.sendMimeMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MimeMessage has not been created yet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        boolean boolean5 = email4.isStartTLSEnabled();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        javax.activation.DataSource dataSource9 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource9, "mail.debug");
        htmlEmail0.setAuthentication("mail.smtp.starttls.enable", "465");
        htmlEmail0.setSSL(false);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "vylsuwshun" + "'", str11, "vylsuwshun");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail10.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail12 = htmlEmail0.attach(uRL8, "iso-8859-1", "mail.smtp.connectiontimeout", "email.subject");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        javax.activation.DataSource dataSource11 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail15 = htmlEmail0.attach(dataSource11, "gycaxbrvob", "qqfbjpipab", "hi!");
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = htmlEmail0.embed(file16, "sender.name");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(multiPartEmail15);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setMsg("mail.smtp.password");
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str7 = multiPartEmail6.getSmtpPort();
        javax.activation.DataSource dataSource8 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail12 = multiPartEmail6.attach(dataSource8, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart13 = null;
        multiPartEmail6.setContent(mimeMultipart13);
        javax.mail.internet.MimeMessage mimeMessage15 = multiPartEmail6.getMimeMessage();
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.internet.MimeMessage mimeMessage16 = multiPartEmail0.thirdMessageCheck((org.apache.commons.mail.Email) multiPartEmail6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.internet.MimeMessage.getSentDate()\" because \"email.message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "25" + "'", str7, "25");
        org.junit.Assert.assertNotNull(multiPartEmail12);
        org.junit.Assert.assertNull(mimeMessage15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        javax.activation.DataSource dataSource8 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail12 = multiPartEmail0.attach(dataSource8, "gjgimxsdbu", "mkyamucxcp", "mail.smtp.connectiontimeout");
        multiPartEmail12.setPopBeforeSmtp(false, "mail.debug", "mail.smtp.from", "smtp");
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail19 = multiPartEmail12.attach(file18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(multiPartEmail12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        org.apache.commons.mail.Email email7 = multiPartEmail0.addPart("mail.smtp.starttls.enable", "mail.smtp.starttls.enable");
        multiPartEmail0.setPopBeforeSmtp(false, "", "file.server", "qqfbjpipab");
        org.apache.commons.mail.EmailAttachment emailAttachment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail14 = multiPartEmail0.attach(emailAttachment13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid attachment supplied");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        javax.mail.internet.InternetAddress internetAddress11 = htmlEmail10.getFromAddress();
        javax.activation.DataSource dataSource12 = null;
        java.lang.String str14 = htmlEmail10.embed(dataSource12, "mail.smtp.socketFactory.class");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNull(internetAddress11);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ohornutcco" + "'", str14, "ohornutcco");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail0.setFrom("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``hi!''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.MultiPartEmail multiPartEmail8 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email10 = multiPartEmail8.setStartTLSRequired(false);
        java.util.Date date11 = multiPartEmail8.getSentDate();
        multiPartEmail6.setSentDate(date11);
        boolean boolean13 = multiPartEmail6.isSSL();
        org.apache.commons.mail.Email email16 = multiPartEmail6.addPart("mail.smtp.connectiontimeout", "receiver.email");
        org.apache.commons.mail.MultiPartEmail multiPartEmail17 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email19 = multiPartEmail17.setStartTLSRequired(false);
        org.apache.commons.mail.Email email21 = multiPartEmail17.setStartTLSRequired(false);
        javax.mail.internet.MimeMultipart mimeMultipart22 = null;
        multiPartEmail17.setContent(mimeMultipart22);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList24 = multiPartEmail17.getToAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email25 = multiPartEmail6.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 20 22:48:18 CET 2024");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(email16);
        org.junit.Assert.assertNotNull(email19);
        org.junit.Assert.assertNotNull(email21);
        org.junit.Assert.assertNotNull(internetAddressList24);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        javax.activation.DataSource dataSource9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = htmlEmail0.embed(dataSource9, "sender.email");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.equals(Object)\" because \"dataSource\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        multiPartEmail0.setSocketConnectionTimeout((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = multiPartEmail0.addBcc("mail.smtp.socketFactory.port", "ohornutcco");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.socketFactory.port''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(dataSource6, "mail.transport.protocol", "mail.smtp.socketFactory.class", "mail.smtp.timeout");
        multiPartEmail10.setSslSmtpPort("ifguxugtww");
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(multiPartEmail10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        javax.activation.DataSource dataSource11 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail15 = htmlEmail0.attach(dataSource11, "gycaxbrvob", "qqfbjpipab", "hi!");
        org.apache.commons.mail.Email email17 = htmlEmail0.setMsg("lgbgqhtwcg");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(multiPartEmail15);
        org.junit.Assert.assertNotNull(email17);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        int int5 = email2.getSocketConnectionTimeout();
        org.apache.commons.mail.Email email7 = email2.setSubject("smtp");
        org.apache.commons.mail.MultiPartEmail multiPartEmail8 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str9 = multiPartEmail8.getSmtpPort();
        javax.activation.DataSource dataSource10 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail14 = multiPartEmail8.attach(dataSource10, "smtp", "koi8-r", "receiver.email");
        java.lang.String str15 = multiPartEmail14.getBounceAddress();
        org.apache.commons.mail.MultiPartEmail multiPartEmail16 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email18 = multiPartEmail16.setStartTLSRequired(false);
        org.apache.commons.mail.Email email20 = email18.setSSLCheckServerIdentity(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList21 = email18.getBccAddresses();
        multiPartEmail14.setContent((java.lang.Object) internetAddressList21, "sender.email");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email24 = email7.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
        org.junit.Assert.assertNotNull(multiPartEmail14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(email18);
        org.junit.Assert.assertNotNull(email20);
        org.junit.Assert.assertNotNull(internetAddressList21);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.HtmlEmail htmlEmail6 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource7 = null;
        java.lang.String str9 = htmlEmail6.embed(dataSource7, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail11 = htmlEmail6.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email13 = htmlEmail11.setSSLCheckServerIdentity(true);
        org.apache.commons.mail.Email email15 = htmlEmail11.setMsg("mail.smtp.connectiontimeout");
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.internet.MimeMessage mimeMessage16 = multiPartEmail0.thirdMessageCheck(email15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.internet.MimeMessage.getSentDate()\" because \"email.message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ayxnwievth" + "'", str9, "ayxnwievth");
        org.junit.Assert.assertNotNull(htmlEmail11);
        org.junit.Assert.assertNotNull(email13);
        org.junit.Assert.assertNotNull(email15);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("fryefwbswo");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setHeaders(strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.entrySet()\" because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        java.lang.String str2 = multiPartEmail0.getSslSmtpPort();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email4 = multiPartEmail0.addCc("mail.smtp.user");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.user''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "465" + "'", str2, "465");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setMsg("mail.smtp.password");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.activation.DataSource dataSource5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail8 = multiPartEmail0.attach(dataSource5, "fryefwbswo", "text/html");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid Datasource");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.Email email10 = htmlEmail0.setMsg("sender.name");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList11 = email10.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            email10.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(internetAddressList11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail7 = multiPartEmail0.attach(uRL4, "qqfbjpipab", "sender.email");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email9 = multiPartEmail0.setMsg("hi!");
        org.apache.commons.mail.Email email11 = email9.setSendPartial(true);
        boolean boolean12 = email9.isSendPartial();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        org.apache.commons.mail.Email email7 = htmlEmail3.setMsg("koi8-r");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.HtmlEmail htmlEmail9 = htmlEmail3.setTextMsg("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: HTML_INVALID_MESSAGE");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        javax.activation.DataSource dataSource8 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail12 = multiPartEmail0.attach(dataSource8, "gjgimxsdbu", "mkyamucxcp", "mail.smtp.connectiontimeout");
        org.apache.commons.mail.MultiPartEmail multiPartEmail13 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str14 = multiPartEmail13.getSmtpPort();
        org.apache.commons.mail.Email email16 = multiPartEmail13.setSubject("25");
        java.lang.String str17 = multiPartEmail13.getHostName();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList18 = multiPartEmail13.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email19 = multiPartEmail0.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(multiPartEmail12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "25" + "'", str14, "25");
        org.junit.Assert.assertNotNull(email16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(internetAddressList18);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = htmlEmail5.embed(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        javax.activation.DataSource dataSource9 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource9, "mail.debug");
        htmlEmail0.setHostName("iso-8859-1");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = htmlEmail0.setFrom("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Illegal address in string ``''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "bvifhqqgpc" + "'", str11, "bvifhqqgpc");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("sender.name");
        javax.activation.DataSource dataSource8 = null;
        java.lang.String str10 = htmlEmail0.embed(dataSource8, "vylsuwshun");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email14 = htmlEmail0.addBcc("hi!", "465", "receiver.email");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: receiver.email");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "qwbpughbcd" + "'", str3, "qwbpughbcd");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "qrtyitomuq" + "'", str10, "qrtyitomuq");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.Email email8 = htmlEmail0.setSSLOnConnect(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = email8.addBcc("receiver.email");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``receiver.email''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jxfeqgwwzz" + "'", str3, "jxfeqgwwzz");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(internetAddressList6);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(true);
        boolean boolean4 = multiPartEmail0.isStartTLSRequired();
        int int5 = multiPartEmail0.getSocketConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setSendPartial(true);
        org.apache.commons.mail.SimpleEmail simpleEmail3 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList4 = simpleEmail3.getToAddresses();
        multiPartEmail0.setContent((java.lang.Object) simpleEmail3, "text/html");
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setMailSessionFromJNDI("lgbgqhtwcg");
            org.junit.Assert.fail("Expected exception of type javax.naming.NoInitialContextException; message: Need to specify class name in environment or system property, or in an application resource file: java.naming.factory.initial");
        } catch (javax.naming.NoInitialContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(internetAddressList4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        org.apache.commons.mail.Email email2 = htmlEmail0.setMsg("shwuzzbthr");
        int int3 = email2.getSocketConnectionTimeout();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        boolean boolean11 = email10.isSendPartial();
        email10.setSmtpPort((int) (short) 1);
        java.lang.String str15 = email10.getHeader("mail.smtp.timeout");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = htmlEmail10.embed(uRL11, "gycaxbrvob");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        multiPartEmail0.setAuthentication("", "");
        java.lang.String str9 = multiPartEmail0.getSubType();
        multiPartEmail0.setDebug(false);
        javax.mail.Session session12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setMailSession(session12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no mail session supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        javax.activation.DataSource dataSource11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail14 = htmlEmail0.attach(dataSource11, "465", "receiver.email");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid Datasource");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        java.lang.String str4 = multiPartEmail0.getHostName();
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        org.apache.commons.mail.MultiPartEmail multiPartEmail7 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str8 = multiPartEmail7.getSmtpPort();
        org.apache.commons.mail.Email email10 = multiPartEmail7.setSubject("25");
        java.lang.String str11 = multiPartEmail7.getHostName();
        multiPartEmail7.setSubType("mail.smtp.connectiontimeout");
        int int14 = multiPartEmail7.getSocketTimeout();
        org.apache.commons.mail.Email email16 = multiPartEmail7.setMsg("hi!");
        org.apache.commons.mail.Email email18 = email16.setSendPartial(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList19 = email16.getBccAddresses();
        org.apache.commons.mail.Email email21 = email16.setSSLOnConnect(true);
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.internet.MimeMessage mimeMessage22 = multiPartEmail0.thirdMessageCheck(email16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.internet.MimeMessage.getSentDate()\" because \"email.message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25" + "'", str8, "25");
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertNotNull(email16);
        org.junit.Assert.assertNotNull(email18);
        org.junit.Assert.assertNotNull(internetAddressList19);
        org.junit.Assert.assertNotNull(email21);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        org.apache.commons.mail.Email email6 = simpleEmail0.setMsg("shwuzzbthr");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = simpleEmail0.setFrom("mail.smtp.user", "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.user''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        java.lang.String[] strArray7 = new java.lang.String[] { "fjnmntfewn" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = htmlEmail0.addCc(strArray7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``fjnmntfewn''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        javax.mail.internet.MimeMultipart mimeMultipart2 = null;
        simpleEmail0.setContent(mimeMultipart2);
        org.junit.Assert.assertNotNull(internetAddressList1);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSslSmtpPort();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = multiPartEmail0.getBccAddresses();
        multiPartEmail0.setHostName("koi8-r");
        org.apache.commons.mail.Email email10 = multiPartEmail0.setSubject("mail.smtp.timeout");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "465" + "'", str5, "465");
        org.junit.Assert.assertNotNull(internetAddressList6);
        org.junit.Assert.assertNotNull(email10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(true);
        boolean boolean4 = multiPartEmail0.isStartTLSRequired();
        boolean boolean5 = multiPartEmail0.isSSLCheckServerIdentity();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail0.addTo("smtp", "iso-8859-1", "gjgimxsdbu");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: gjgimxsdbu");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        boolean boolean6 = multiPartEmail0.isStartTLSEnabled();
        boolean boolean7 = multiPartEmail0.isStartTLSRequired();
        multiPartEmail0.setSslSmtpPort("gjgimxsdbu");
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email12 = multiPartEmail10.setStartTLSRequired(false);
        email12.setSocketConnectionTimeout((int) (byte) 10);
        multiPartEmail0.setContent((java.lang.Object) email12, "mail.smtp.socketFactory.port");
        javax.mail.internet.MimeMessage mimeMessage17 = multiPartEmail0.getMimeMessage();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail22 = multiPartEmail0.attach(uRL18, "vylsuwshun", "koi8-r", "fjnmntfewn");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(email12);
        org.junit.Assert.assertNull(mimeMessage17);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        org.apache.commons.mail.Email email6 = simpleEmail0.setMsg("shwuzzbthr");
        javax.mail.internet.MimeMessage mimeMessage7 = email6.getMimeMessage();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNull(mimeMessage7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail5.setSSLCheckServerIdentity(true);
        javax.mail.internet.MimeMultipart mimeMultipart8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = htmlEmail5.addPart(mimeMultipart8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eijoaaqftx" + "'", str3, "eijoaaqftx");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = multiPartEmail0.setStartTLSRequired(false);
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        java.lang.String str7 = multiPartEmail0.getSubject();
        java.lang.Class<?> wildcardClass8 = multiPartEmail0.getClass();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        org.apache.commons.mail.Email email7 = multiPartEmail0.addPart("mail.smtp.starttls.enable", "mail.smtp.starttls.enable");
        multiPartEmail0.setPopBeforeSmtp(false, "", "file.server", "qqfbjpipab");
        java.lang.String[] strArray14 = new java.lang.String[] { "fryefwbswo" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = multiPartEmail0.addBcc(strArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``fryefwbswo''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        int int2 = multiPartEmail0.getSocketTimeout();
        javax.mail.internet.MimeMultipart mimeMultipart3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email5 = multiPartEmail0.addPart(mimeMultipart3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("fryefwbswo");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail0.addPart(mimeMultipart7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = multiPartEmail0.setStartTLSRequired(false);
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList7 = multiPartEmail0.getBccAddresses();
        multiPartEmail0.setPopBeforeSmtp(true, "mqerzxkmcj", "text/html", "attachments");
        int int13 = multiPartEmail0.getSocketTimeout();
        javax.mail.internet.MimeMultipart mimeMultipart14 = null;
        multiPartEmail0.setContent(mimeMultipart14);
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(internetAddressList7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = multiPartEmail0.setStartTLSRequired(false);
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList7 = multiPartEmail0.getBccAddresses();
        multiPartEmail0.setPopBeforeSmtp(true, "mqerzxkmcj", "text/html", "attachments");
        int int13 = multiPartEmail0.getSocketTimeout();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email17 = multiPartEmail0.setFrom("mail.smtp.password", "mail.smtp.auth", "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.password''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(internetAddressList7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        multiPartEmail0.setContent(mimeMultipart7);
        javax.mail.internet.MimeMessage mimeMessage9 = multiPartEmail0.getMimeMessage();
        javax.activation.DataSource dataSource10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail13 = multiPartEmail0.attach(dataSource10, "text/plain", "mail.smtp.socketFactory.fallback");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid Datasource");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(mimeMessage9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        multiPartEmail0.setSocketConnectionTimeout(0);
        int int9 = multiPartEmail0.getSocketConnectionTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        multiPartEmail0.setSocketConnectionTimeout((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        javax.activation.DataSource dataSource11 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail15 = htmlEmail0.attach(dataSource11, "gycaxbrvob", "qqfbjpipab", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email17 = multiPartEmail15.addCc("text/plain");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/plain''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(multiPartEmail15);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        java.lang.String str12 = htmlEmail0.getHeader("qqfbjpipab");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(dataSource6, "mail.transport.protocol", "mail.smtp.socketFactory.class", "mail.smtp.timeout");
        org.apache.commons.mail.Email email12 = multiPartEmail0.setStartTLSEnabled(false);
        javax.mail.internet.MimeMessage mimeMessage13 = multiPartEmail0.getMimeMessage();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(multiPartEmail10);
        org.junit.Assert.assertNotNull(email12);
        org.junit.Assert.assertNull(mimeMessage13);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        boolean boolean2 = multiPartEmail0.isSSL();
        multiPartEmail0.setBoolHasAttachments(false);
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("flehnmowzg");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = multiPartEmail0.sendMimeMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MimeMessage has not been created yet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSslSmtpPort();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = multiPartEmail0.getBccAddresses();
        org.apache.commons.mail.EmailAttachment emailAttachment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail8 = multiPartEmail0.attach(emailAttachment7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid attachment supplied");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "465" + "'", str5, "465");
        org.junit.Assert.assertNotNull(internetAddressList6);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setMsg("smtp");
        java.lang.Class<?> wildcardClass8 = multiPartEmail0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        boolean boolean6 = multiPartEmail0.isStartTLSEnabled();
        boolean boolean7 = multiPartEmail0.isStartTLSRequired();
        multiPartEmail0.setSslSmtpPort("gjgimxsdbu");
        javax.activation.DataSource dataSource10 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail14 = multiPartEmail0.attach(dataSource10, "mail.smtp.starttls.enable", "mail.smtp.timeout", "vkrxuaxgay");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email16 = multiPartEmail0.addReplyTo("oyeforvxhc");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``oyeforvxhc''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(multiPartEmail14);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        multiPartEmail0.setContent(mimeMultipart7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = multiPartEmail0.setFrom("vkrxuaxgay");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``vkrxuaxgay''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email9 = multiPartEmail0.setMsg("hi!");
        org.apache.commons.mail.Email email11 = email9.setSendPartial(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = email9.getBccAddresses();
        boolean boolean13 = email9.isSSL();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNotNull(internetAddressList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setBoolHasAttachments(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = email5.getBccAddresses();
        org.apache.commons.mail.MultiPartEmail multiPartEmail7 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str8 = multiPartEmail7.getSmtpPort();
        org.apache.commons.mail.Email email10 = multiPartEmail7.setSubject("25");
        java.lang.String str11 = multiPartEmail7.getHostName();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = multiPartEmail7.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = email5.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(internetAddressList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25" + "'", str8, "25");
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(internetAddressList12);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        htmlEmail0.setSslSmtpPort("mail.transport.protocol");
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail4 = htmlEmail0.attach(file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        boolean boolean2 = multiPartEmail0.isSSL();
        multiPartEmail0.setBoolHasAttachments(false);
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("flehnmowzg");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = multiPartEmail0.setFrom("mail.smtp.host", "mail.smtp.user", "email.body");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: email.body");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail6.addCc("465");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``465''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        javax.activation.DataSource dataSource8 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource8, "gjgimxsdbu", "");
        htmlEmail0.setTLS(false);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        int int5 = email2.getSocketConnectionTimeout();
        email2.setSSL(false);
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(true);
        boolean boolean4 = multiPartEmail0.isStartTLSRequired();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setSSLOnConnect(true);
        int int7 = email6.getSocketConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        org.apache.commons.mail.Email email12 = email10.setMsg("receiver.name");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email14 = email10.addTo("shwuzzbthr");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``shwuzzbthr''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(email12);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("sender.name");
        javax.activation.DataSource dataSource8 = null;
        java.lang.String str10 = htmlEmail0.embed(dataSource8, "vylsuwshun");
        java.lang.String str11 = htmlEmail0.getSubType();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "umxzssczsc" + "'", str3, "umxzssczsc");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tqmdwrwtja" + "'", str10, "tqmdwrwtja");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        int int2 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email4 = multiPartEmail0.setSSLCheckServerIdentity(true);
        boolean boolean5 = email4.isSSL();
        org.apache.commons.mail.HtmlEmail htmlEmail6 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList7 = htmlEmail6.getBccAddresses();
        javax.activation.DataSource dataSource8 = null;
        java.lang.String str11 = htmlEmail6.embed(dataSource8, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail13 = htmlEmail6.setHtmlMsg("mail.smtp.auth");
        java.lang.String str14 = htmlEmail6.getSubject();
        javax.activation.DataSource dataSource15 = null;
        java.lang.String str17 = htmlEmail6.embed(dataSource15, "mail.debug");
        htmlEmail6.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = htmlEmail6.getHeaders();
        email4.setHeaders(strMap21);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(internetAddressList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "email.subject" + "'", str11, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail13);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "rjktqagyob" + "'", str17, "rjktqagyob");
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = multiPartEmail0.send();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail5.setHtmlMsg("lhaahuyawf");
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail7.setMailSessionFromJNDI("mqerzxkmcj");
            org.junit.Assert.fail("Expected exception of type javax.naming.NoInitialContextException; message: Need to specify class name in environment or system property, or in an application resource file: java.naming.factory.initial");
        } catch (javax.naming.NoInitialContextException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "lkkkoldert" + "'", str3, "lkkkoldert");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(htmlEmail7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = htmlEmail0.embed(uRL11, "mail.smtp.port");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        org.apache.commons.mail.Email email6 = simpleEmail0.setMsg("shwuzzbthr");
        org.apache.commons.mail.MultiPartEmail multiPartEmail7 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str8 = multiPartEmail7.getSmtpPort();
        multiPartEmail7.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str12 = multiPartEmail7.getSslSmtpPort();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList13 = multiPartEmail7.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email14 = email6.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25" + "'", str8, "25");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "465" + "'", str12, "465");
        org.junit.Assert.assertNotNull(internetAddressList13);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        boolean boolean11 = email10.isSendPartial();
        email10.setSmtpPort((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email16 = email10.addBcc("vkrxuaxgay", "oyeforvxhc");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``vkrxuaxgay''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email9 = multiPartEmail0.setMsg("hi!");
        org.apache.commons.mail.Email email11 = email9.setSendPartial(true);
        boolean boolean12 = email9.isSSLOnConnect();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail5.setTextMsg("ohornutcco");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = htmlEmail5.addReplyTo("mail.smtp.socketFactory.port");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.socketFactory.port''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(htmlEmail7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        htmlEmail0.setAuthentication("mail.smtp.connectiontimeout", "mail.smtp.timeout");
        java.lang.String str11 = htmlEmail0.getSmtpPort();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25" + "'", str11, "25");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        boolean boolean11 = multiPartEmail6.isStartTLSRequired();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email14 = multiPartEmail6.setFrom("email.body", "mqerzxkmcj");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``email.body''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        org.apache.commons.mail.Email email12 = email10.setMsg("receiver.name");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email16 = email12.addTo("mail.smtp.connectiontimeout", "lgbgqhtwcg", "text/html");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: text/html");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(email12);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        boolean boolean5 = multiPartEmail0.isSSL();
        multiPartEmail0.setSubType("mail.smtp.starttls.enable");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = multiPartEmail0.addBcc("mail.smtp.host", "mail.smtp.socketFactory.fallback");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.host''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        email4.setSSL(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = email4.setFrom("attachments", "mqerzxkmcj");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``attachments''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email9 = multiPartEmail0.setMsg("hi!");
        org.apache.commons.mail.Email email11 = email9.setSendPartial(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = email9.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            email9.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNotNull(internetAddressList12);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        boolean boolean5 = multiPartEmail0.isSSL();
        multiPartEmail0.setSubType("mail.smtp.starttls.enable");
        org.apache.commons.mail.Email email10 = multiPartEmail0.addPart("mail.smtp.connectiontimeout", "text/html");
        org.apache.commons.mail.SimpleEmail simpleEmail11 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = simpleEmail11.getToAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = multiPartEmail0.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(internetAddressList12);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        java.lang.String str4 = multiPartEmail0.getHostName();
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail0.addReplyTo("mail.smtp.port", "rtgnrijzld");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.port''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        java.lang.String str7 = multiPartEmail0.getHeader("mail.smtp.socketFactory.fallback");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = multiPartEmail0.getCcAddresses();
        multiPartEmail0.setSubType("oyeforvxhc");
        org.apache.commons.mail.HtmlEmail htmlEmail11 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = htmlEmail11.getBccAddresses();
        javax.activation.DataSource dataSource13 = null;
        java.lang.String str16 = htmlEmail11.embed(dataSource13, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail18 = htmlEmail11.setHtmlMsg("mail.smtp.auth");
        java.lang.String str19 = htmlEmail11.getSubject();
        javax.activation.DataSource dataSource20 = null;
        java.lang.String str22 = htmlEmail11.embed(dataSource20, "mail.debug");
        htmlEmail11.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = htmlEmail11.getHeaders();
        multiPartEmail0.setHeaders(strMap26);
        org.apache.commons.mail.Email email29 = multiPartEmail0.setStartTLSEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email33 = email29.addReplyTo("content.type", "mail.smtp.socketFactory.port", "rjktqagyob");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: rjktqagyob");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(internetAddressList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "email.subject" + "'", str16, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail18);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "rgxrsoutpt" + "'", str22, "rgxrsoutpt");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(email29);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        multiPartEmail0.setContent(mimeMultipart7);
        multiPartEmail0.setSubType("file.server");
        org.apache.commons.mail.EmailAttachment emailAttachment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail12 = multiPartEmail0.attach(emailAttachment11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid attachment supplied");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        boolean boolean2 = multiPartEmail0.isSSL();
        multiPartEmail0.setBoolHasAttachments(false);
        multiPartEmail0.setPopBeforeSmtp(false, "mail.smtp.port", "mail.smtp.connectiontimeout", "qqfbjpipab");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = multiPartEmail0.addTo("email.subject");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``email.subject''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(dataSource6, "mail.transport.protocol", "mail.smtp.socketFactory.class", "mail.smtp.timeout");
        org.apache.commons.mail.Email email12 = multiPartEmail0.setStartTLSEnabled(false);
        javax.mail.internet.MimeMultipart mimeMultipart13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email14 = multiPartEmail0.addPart(mimeMultipart13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(multiPartEmail10);
        org.junit.Assert.assertNotNull(email12);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.MultiPartEmail multiPartEmail8 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email10 = multiPartEmail8.setStartTLSRequired(false);
        org.apache.commons.mail.Email email12 = email10.setSSLCheckServerIdentity(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList13 = email10.getBccAddresses();
        multiPartEmail6.setContent((java.lang.Object) internetAddressList13, "sender.email");
        java.lang.String str16 = multiPartEmail6.getSmtpPort();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(email12);
        org.junit.Assert.assertNotNull(internetAddressList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "25" + "'", str16, "25");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        org.apache.commons.mail.Email email7 = multiPartEmail0.setStartTLSRequired(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = email7.addReplyTo("", "email.subject");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Illegal address in string ``''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        int int6 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email8 = multiPartEmail0.setSubject("email.body");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = multiPartEmail0.addCc("oqpvcrbeiv", "pnkmsgcxvu");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``oqpvcrbeiv''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        javax.activation.DataSource dataSource9 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource9, "mail.debug");
        htmlEmail0.setHostName("iso-8859-1");
        javax.mail.Authenticator authenticator14 = null;
        htmlEmail0.setAuthenticator(authenticator14);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "rjjnrxtynw" + "'", str11, "rjjnrxtynw");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("sender.name");
        org.apache.commons.mail.HtmlEmail htmlEmail9 = htmlEmail0.setTextMsg("mqerzxkmcj");
        htmlEmail0.setSSL(false);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tuaypqqvdv" + "'", str3, "tuaypqqvdv");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(htmlEmail9);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        javax.activation.DataSource dataSource6 = null;
        java.lang.String str9 = htmlEmail5.embed(dataSource6, "mail.smtp.socketFactory.port", "mail.smtp.port");
        boolean boolean10 = htmlEmail5.isSSL();
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail5.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mail.smtp.port" + "'", str9, "mail.smtp.port");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = htmlEmail5.embed(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        org.apache.commons.mail.Email email7 = htmlEmail3.setMsg("koi8-r");
        htmlEmail3.setSslSmtpPort("mail.smtp.password");
        htmlEmail3.setDebug(true);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = multiPartEmail0.setStartTLSRequired(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = email4.sendMimeMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MimeMessage has not been created yet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        javax.activation.DataSource dataSource2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "", "dvgkmlqvsy", "mail.smtp.socketFactory.port");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.activation.DataSource.getName()\" because \"ds\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.mail.Authenticator authenticator2 = null;
        multiPartEmail0.setAuthenticator(authenticator2);
        boolean boolean4 = multiPartEmail0.isStartTLSEnabled();
        boolean boolean5 = multiPartEmail0.isStartTLSEnabled();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        javax.activation.DataSource dataSource9 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource9, "mail.debug");
        htmlEmail0.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = htmlEmail0.getHeaders();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = htmlEmail0.embed(uRL16, "gjgimxsdbu");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "oluzwdbesg" + "'", str11, "oluzwdbesg");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        java.lang.String str7 = multiPartEmail0.getHeader("mail.smtp.socketFactory.fallback");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = multiPartEmail0.getCcAddresses();
        multiPartEmail0.setSubType("oyeforvxhc");
        org.apache.commons.mail.HtmlEmail htmlEmail11 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = htmlEmail11.getBccAddresses();
        javax.activation.DataSource dataSource13 = null;
        java.lang.String str16 = htmlEmail11.embed(dataSource13, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail18 = htmlEmail11.setHtmlMsg("mail.smtp.auth");
        java.lang.String str19 = htmlEmail11.getSubject();
        javax.activation.DataSource dataSource20 = null;
        java.lang.String str22 = htmlEmail11.embed(dataSource20, "mail.debug");
        htmlEmail11.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = htmlEmail11.getHeaders();
        multiPartEmail0.setHeaders(strMap26);
        java.lang.String str29 = multiPartEmail0.getHeader("us-ascii");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(internetAddressList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "email.subject" + "'", str16, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail18);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "xyjrcvkbho" + "'", str22, "xyjrcvkbho");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        java.lang.String str4 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSocketConnectionTimeout((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail0.addBcc("kyynvwouof");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``kyynvwouof''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:21 CET 2024");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25" + "'", str4, "25");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        org.apache.commons.mail.Email email9 = multiPartEmail0.setSSLCheckServerIdentity(true);
        javax.mail.internet.InternetAddress internetAddress10 = email9.getFromAddress();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertNull(internetAddress10);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        javax.activation.DataSource dataSource6 = null;
        java.lang.String str9 = htmlEmail5.embed(dataSource6, "mail.smtp.socketFactory.port", "mail.smtp.port");
        boolean boolean10 = htmlEmail5.isSSL();
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail5.setTextMsg("koi8-r");
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = htmlEmail5.embed(file13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mail.smtp.port" + "'", str9, "mail.smtp.port");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(htmlEmail12);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setMsg("mail.smtp.password");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        multiPartEmail0.updateContentType("gjgimxsdbu");
        javax.mail.internet.MimeMessage mimeMessage7 = multiPartEmail0.getMimeMessage();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage7);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        java.net.URL uRL2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = htmlEmail0.embed(uRL2, "ixeiouuisj");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("sender.name");
        org.apache.commons.mail.HtmlEmail htmlEmail9 = htmlEmail0.setTextMsg("mqerzxkmcj");
        javax.mail.Session session10 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail9.setMailSession(session10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no mail session supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jhvikncqfo" + "'", str3, "jhvikncqfo");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(htmlEmail9);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = email7.getCcAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail9 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList10 = htmlEmail9.getBccAddresses();
        javax.activation.DataSource dataSource11 = null;
        java.lang.String str14 = htmlEmail9.embed(dataSource11, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail16 = htmlEmail9.setHtmlMsg("mail.smtp.auth");
        java.lang.String str17 = htmlEmail9.getSubject();
        javax.activation.DataSource dataSource18 = null;
        java.lang.String str20 = htmlEmail9.embed(dataSource18, "mail.debug");
        htmlEmail9.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = htmlEmail9.getHeaders();
        email7.setHeaders(strMap24);
        boolean boolean26 = email7.isStartTLSRequired();
        org.apache.commons.mail.Email email28 = email7.setStartTLSRequired(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(internetAddressList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "email.subject" + "'", str14, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail16);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "cwuexecnmh" + "'", str20, "cwuexecnmh");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(email28);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail0.setHtmlMsg("ohornutcco");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = htmlEmail12.embed("gjgimxsdbu", "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid URL");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(htmlEmail12);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str7 = multiPartEmail6.getSmtpPort();
        multiPartEmail6.setSubType("mail.transport.protocol");
        java.lang.String str10 = multiPartEmail6.getHostName();
        javax.mail.internet.MimeMultipart mimeMultipart11 = null;
        multiPartEmail6.setContent(mimeMultipart11);
        org.apache.commons.mail.MultiPartEmail multiPartEmail13 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str14 = multiPartEmail13.getSmtpPort();
        org.apache.commons.mail.Email email16 = multiPartEmail13.setSubject("25");
        multiPartEmail13.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email20 = multiPartEmail13.setSSLCheckServerIdentity(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList21 = email20.getCcAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail22 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList23 = htmlEmail22.getBccAddresses();
        javax.activation.DataSource dataSource24 = null;
        java.lang.String str27 = htmlEmail22.embed(dataSource24, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail29 = htmlEmail22.setHtmlMsg("mail.smtp.auth");
        java.lang.String str30 = htmlEmail22.getSubject();
        javax.activation.DataSource dataSource31 = null;
        java.lang.String str33 = htmlEmail22.embed(dataSource31, "mail.debug");
        htmlEmail22.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap37 = htmlEmail22.getHeaders();
        email20.setHeaders(strMap37);
        multiPartEmail6.setHeaders(strMap37);
        htmlEmail0.setHeaders(strMap37);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fppqoxuufr" + "'", str3, "fppqoxuufr");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "25" + "'", str7, "25");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "25" + "'", str14, "25");
        org.junit.Assert.assertNotNull(email16);
        org.junit.Assert.assertNotNull(email20);
        org.junit.Assert.assertNotNull(internetAddressList21);
        org.junit.Assert.assertNotNull(internetAddressList23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "email.subject" + "'", str27, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail29);
        org.junit.Assert.assertNull(str30);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "muvcyszemz" + "'", str33, "muvcyszemz");
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        javax.mail.internet.InternetAddress[] internetAddressArray6 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList7 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList7, internetAddressArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = htmlEmail3.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(internetAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        email2.setAuthentication("mail.smtp.connectiontimeout", "");
        org.apache.commons.mail.HtmlEmail htmlEmail8 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList9 = htmlEmail8.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = email2.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(internetAddressList9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        javax.activation.DataSource dataSource9 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource9, "mail.debug");
        htmlEmail0.setAuthentication("mail.smtp.starttls.enable", "465");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail19 = htmlEmail0.attach(uRL15, "qqfbjpipab", "koi8-r", "mkyamucxcp");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "riycqqccgu" + "'", str11, "riycqqccgu");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        email7.setDebug(true);
        java.lang.String str11 = email7.getHeader("umxzssczsc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        int int2 = multiPartEmail0.getSocketTimeout();
        javax.mail.internet.MimeMultipart mimeMultipart3 = null;
        multiPartEmail0.setContent(mimeMultipart3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.addReplyTo("gycaxbrvob", "us-ascii");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``gycaxbrvob''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60000 + "'", int2 == 60000);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        java.lang.String str7 = multiPartEmail0.getHeader("mail.smtp.socketFactory.fallback");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = multiPartEmail0.getCcAddresses();
        multiPartEmail0.setSubType("oyeforvxhc");
        org.apache.commons.mail.HtmlEmail htmlEmail11 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = htmlEmail11.getBccAddresses();
        javax.activation.DataSource dataSource13 = null;
        java.lang.String str16 = htmlEmail11.embed(dataSource13, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail18 = htmlEmail11.setHtmlMsg("mail.smtp.auth");
        java.lang.String str19 = htmlEmail11.getSubject();
        javax.activation.DataSource dataSource20 = null;
        java.lang.String str22 = htmlEmail11.embed(dataSource20, "mail.debug");
        htmlEmail11.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = htmlEmail11.getHeaders();
        multiPartEmail0.setHeaders(strMap26);
        org.apache.commons.mail.Email email29 = multiPartEmail0.setStartTLSEnabled(true);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(internetAddressList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "email.subject" + "'", str16, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail18);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "wjnddzldgb" + "'", str22, "wjnddzldgb");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(email29);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("sender.name");
        org.apache.commons.mail.HtmlEmail htmlEmail9 = htmlEmail0.setTextMsg("mqerzxkmcj");
        org.apache.commons.mail.Email email11 = htmlEmail0.setMsg("fryefwbswo");
        org.apache.commons.mail.HtmlEmail htmlEmail13 = htmlEmail0.setHtmlMsg("lhaahuyawf");
        htmlEmail13.setSubType("mail.smtp.password");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tbnfonnaom" + "'", str3, "tbnfonnaom");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(htmlEmail9);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNotNull(htmlEmail13);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        org.apache.commons.mail.Email email2 = htmlEmail0.setMsg("shwuzzbthr");
        org.apache.commons.mail.Email email4 = htmlEmail0.setMsg("gjgimxsdbu");
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        boolean boolean7 = multiPartEmail6.isSSLOnConnect();
        java.util.Date date8 = multiPartEmail6.getSentDate();
        java.lang.String str10 = multiPartEmail6.getHeader("tuaypqqvdv");
        multiPartEmail6.setDebug(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 20 22:48:22 CET 2024");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        boolean boolean6 = multiPartEmail0.isStartTLSEnabled();
        boolean boolean7 = multiPartEmail0.isStartTLSRequired();
        multiPartEmail0.setSslSmtpPort("gjgimxsdbu");
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email12 = multiPartEmail10.setStartTLSRequired(false);
        email12.setSocketConnectionTimeout((int) (byte) 10);
        multiPartEmail0.setContent((java.lang.Object) email12, "mail.smtp.socketFactory.port");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email19 = multiPartEmail0.addCc("fryefwbswo", "vylsuwshun");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``fryefwbswo''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(email12);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        org.apache.commons.mail.Email email7 = htmlEmail3.setMsg("koi8-r");
        htmlEmail3.setSslSmtpPort("mail.smtp.password");
        htmlEmail3.setBoolHasAttachments(false);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        org.apache.commons.mail.Email email5 = multiPartEmail0.setSubject("mail.smtp.timeout");
        javax.mail.internet.InternetAddress[] internetAddressArray6 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList7 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList7, internetAddressArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = email5.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:22 CET 2024");
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(internetAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        org.apache.commons.mail.Email email7 = multiPartEmail0.setStartTLSRequired(true);
        javax.mail.internet.InternetAddress[] internetAddressArray8 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList9 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList9, internetAddressArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = multiPartEmail0.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        java.lang.String str4 = multiPartEmail0.getHostName();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setSSLOnConnect(false);
        int int7 = multiPartEmail0.getSocketTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setMsg("smtp");
        javax.activation.DataSource dataSource8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail11 = multiPartEmail0.attach(dataSource8, "pnkmsgcxvu", "xuyualotri");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid Datasource");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.MultiPartEmail multiPartEmail8 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email10 = multiPartEmail8.setStartTLSRequired(false);
        java.util.Date date11 = multiPartEmail8.getSentDate();
        multiPartEmail6.setSentDate(date11);
        boolean boolean13 = multiPartEmail6.isSSL();
        javax.mail.internet.MimeMessage mimeMessage14 = multiPartEmail6.getMimeMessage();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 20 22:48:22 CET 2024");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(mimeMessage14);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = email3.addBcc("ogsczkhkqu", "pnkmsgcxvu");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``ogsczkhkqu''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail0.addCc("umxzssczsc");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``umxzssczsc''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        java.lang.String str7 = multiPartEmail0.getHeader("text/html");
        java.lang.String[] strArray14 = new java.lang.String[] { "text/plain", "oqpvcrbeiv", "rtgnrijzld", "rjjnrxtynw", "dvgkmlqvsy", "xuyualotri" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = multiPartEmail0.addCc(strArray14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/plain''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        boolean boolean2 = multiPartEmail0.isSendPartial();
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.Session session3 = multiPartEmail0.getMailSession();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        multiPartEmail6.setPopBeforeSmtp(true, "25", "mail.smtp.connectiontimeout", "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = multiPartEmail6.addReplyTo("ogsczkhkqu");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``ogsczkhkqu''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("fryefwbswo");
        // The following exception was thrown during execution in test generation
        try {
            email6.setMailSessionFromJNDI("gjgimxsdbu");
            org.junit.Assert.fail("Expected exception of type javax.naming.NoInitialContextException; message: Need to specify class name in environment or system property, or in an application resource file: java.naming.factory.initial");
        } catch (javax.naming.NoInitialContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setCharset("content.type");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: content.type");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.addTo("koi8-r", "mail.smtp.socketFactory.class");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``koi8-r''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        boolean boolean7 = multiPartEmail6.isSSLOnConnect();
        java.util.Date date8 = multiPartEmail6.getSentDate();
        java.lang.String str10 = multiPartEmail6.getHeader("tuaypqqvdv");
        boolean boolean11 = multiPartEmail6.isBoolHasAttachments();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = multiPartEmail6.getToAddresses();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 20 22:48:22 CET 2024");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(internetAddressList12);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = multiPartEmail0.setStartTLSRequired(false);
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        org.apache.commons.mail.Email email8 = multiPartEmail0.setSSLOnConnect(false);
        boolean boolean9 = email8.isSendPartial();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        java.lang.String str7 = multiPartEmail0.getHeader("text/html");
        java.lang.String str8 = multiPartEmail0.getSubType();
        multiPartEmail0.setPopBeforeSmtp(true, "mail.smtp.starttls.enable", "fxscpinwtz", "text/plain");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email17 = multiPartEmail0.addReplyTo("qqfbjpipab", "", "mkyamucxcp");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``qqfbjpipab''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setSSLCheckServerIdentity(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList5 = email2.getBccAddresses();
        boolean boolean6 = email2.isSSL();
        boolean boolean7 = email2.isStartTLSEnabled();
        email2.setSSL(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = email2.addTo("mail.smtp.socketFactory.class", "mail.smtp.socketFactory.class", "tuaypqqvdv");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: tuaypqqvdv");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(internetAddressList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        int int5 = email2.getSocketConnectionTimeout();
        email2.addHeader("sender.email", "sender.name");
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        boolean boolean4 = multiPartEmail0.isBoolHasAttachments();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("mail.smtp.connectiontimeout");
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:22 CET 2024");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        multiPartEmail6.setPopBeforeSmtp(true, "25", "mail.smtp.connectiontimeout", "");
        org.apache.commons.mail.Email email13 = multiPartEmail6.setStartTLSEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = multiPartEmail6.setBounceAddress("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to set the bounce address : hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNotNull(email13);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.Email email10 = htmlEmail0.setSSLOnConnect(true);
        boolean boolean11 = htmlEmail0.isStartTLSRequired();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("fryefwbswo");
        java.lang.Class<?> wildcardClass7 = multiPartEmail0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail10.setTextMsg("sender.email");
        htmlEmail10.setHostName("mail.smtp.socketFactory.class");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(htmlEmail12);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = multiPartEmail0.setStartTLSRequired(false);
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        org.apache.commons.mail.MultiPartEmail multiPartEmail7 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str8 = multiPartEmail7.getSmtpPort();
        multiPartEmail7.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str12 = multiPartEmail7.getSubType();
        boolean boolean13 = multiPartEmail7.isSSLCheckServerIdentity();
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.internet.MimeMessage mimeMessage14 = multiPartEmail0.thirdMessageCheck((org.apache.commons.mail.Email) multiPartEmail7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.internet.MimeMessage.getSentDate()\" because \"email.message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25" + "'", str8, "25");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        htmlEmail0.setSslSmtpPort("mail.transport.protocol");
        htmlEmail0.setSocketConnectionTimeout((int) '#');
        htmlEmail0.setAuthentication("receiver.email", "text/plain");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        java.lang.String str6 = htmlEmail0.getSubType();
        org.apache.commons.mail.Email email8 = htmlEmail0.setMsg("oyeforvxhc");
        // The following exception was thrown during execution in test generation
        try {
            email8.setMailSessionFromJNDI("guftschruc");
            org.junit.Assert.fail("Expected exception of type javax.naming.NoInitialContextException; message: Need to specify class name in environment or system property, or in an application resource file: java.naming.factory.initial");
        } catch (javax.naming.NoInitialContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email9 = multiPartEmail0.setMsg("hi!");
        org.apache.commons.mail.Email email11 = email9.setSendPartial(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = email9.getBccAddresses();
        org.apache.commons.mail.Email email14 = email9.setSSLOnConnect(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = email9.send();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNotNull(internetAddressList12);
        org.junit.Assert.assertNotNull(email14);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        boolean boolean8 = email7.isSSLOnConnect();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        org.apache.commons.mail.Email email12 = htmlEmail0.setMsg("ifguxugtww");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = htmlEmail0.embed(uRL13, "sender.email");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.toExternalForm()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(email12);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        boolean boolean6 = multiPartEmail0.isBoolHasAttachments();
        org.apache.commons.mail.Email email8 = multiPartEmail0.setSSLOnConnect(true);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        multiPartEmail0.setTLS(true);
        java.lang.String str10 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setBoolHasAttachments(true);
        org.apache.commons.mail.MultiPartEmail multiPartEmail13 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email15 = multiPartEmail13.setStartTLSRequired(false);
        java.util.Date date16 = multiPartEmail13.getSentDate();
        java.lang.String str17 = multiPartEmail13.getSmtpPort();
        boolean boolean18 = multiPartEmail13.isStartTLSEnabled();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList19 = multiPartEmail13.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email20 = multiPartEmail0.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(email15);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Sat Jan 20 22:48:22 CET 2024");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "25" + "'", str17, "25");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(internetAddressList19);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setSendPartial(true);
        multiPartEmail0.setHostName("receiver.name");
        java.lang.String str6 = multiPartEmail0.getHeader("");
        boolean boolean7 = multiPartEmail0.isTLS();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setBoolHasAttachments(false);
        multiPartEmail0.setPopBeforeSmtp(false, "ifguxugtww", "oqpvcrbeiv", "465");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        javax.mail.Session session6 = null;
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail5.setMailSession(session6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no mail session supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        boolean boolean7 = multiPartEmail6.isSSLOnConnect();
        java.util.Date date8 = multiPartEmail6.getSentDate();
        org.apache.commons.mail.MultiPartEmail multiPartEmail9 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str10 = multiPartEmail9.getSmtpPort();
        org.apache.commons.mail.Email email12 = multiPartEmail9.setSubject("25");
        java.lang.String str13 = multiPartEmail9.getHostName();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList14 = multiPartEmail9.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = multiPartEmail6.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 20 22:48:23 CET 2024");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "25" + "'", str10, "25");
        org.junit.Assert.assertNotNull(email12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(internetAddressList14);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.Email email3 = htmlEmail0.setSendPartial(false);
        org.apache.commons.mail.Email email5 = htmlEmail0.setMsg("mail.smtp.socketFactory.class");
        email5.setSocketConnectionTimeout((int) (byte) 10);
        org.apache.commons.mail.MultiPartEmail multiPartEmail8 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str9 = multiPartEmail8.getSmtpPort();
        org.apache.commons.mail.Email email11 = multiPartEmail8.setSubject("25");
        java.lang.String str12 = multiPartEmail8.getHostName();
        multiPartEmail8.setSubType("mail.smtp.connectiontimeout");
        org.apache.commons.mail.Email email16 = multiPartEmail8.setMsg("mail.smtp.auth");
        org.apache.commons.mail.MultiPartEmail multiPartEmail17 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email19 = multiPartEmail17.setStartTLSRequired(false);
        org.apache.commons.mail.Email email21 = email19.setSSLCheckServerIdentity(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList22 = email19.getBccAddresses();
        java.util.Date date23 = email19.getSentDate();
        email16.setSentDate(date23);
        email5.setSentDate(date23);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(email16);
        org.junit.Assert.assertNotNull(email19);
        org.junit.Assert.assertNotNull(email21);
        org.junit.Assert.assertNotNull(internetAddressList22);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Sat Jan 20 22:48:23 CET 2024");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        java.lang.String str7 = multiPartEmail0.getHeader("mail.smtp.socketFactory.fallback");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = multiPartEmail0.getCcAddresses();
        multiPartEmail0.setSubType("oyeforvxhc");
        org.apache.commons.mail.HtmlEmail htmlEmail11 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = htmlEmail11.getBccAddresses();
        javax.activation.DataSource dataSource13 = null;
        java.lang.String str16 = htmlEmail11.embed(dataSource13, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail18 = htmlEmail11.setHtmlMsg("mail.smtp.auth");
        java.lang.String str19 = htmlEmail11.getSubject();
        javax.activation.DataSource dataSource20 = null;
        java.lang.String str22 = htmlEmail11.embed(dataSource20, "mail.debug");
        htmlEmail11.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = htmlEmail11.getHeaders();
        multiPartEmail0.setHeaders(strMap26);
        org.apache.commons.mail.Email email29 = multiPartEmail0.setStartTLSEnabled(false);
        java.lang.String str31 = email29.getHeader("receiver.email");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(internetAddressList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "email.subject" + "'", str16, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail18);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zurhelnbqf" + "'", str22, "zurhelnbqf");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(email29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        org.apache.commons.mail.Email email7 = multiPartEmail0.addPart("mail.smtp.starttls.enable", "mail.smtp.starttls.enable");
        multiPartEmail0.setPopBeforeSmtp(false, "", "file.server", "qqfbjpipab");
        javax.activation.DataSource dataSource13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail16 = multiPartEmail0.attach(dataSource13, "us-ascii", "tbnfonnaom");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid Datasource");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        org.apache.commons.mail.Email email12 = htmlEmail0.setMsg("ifguxugtww");
        org.apache.commons.mail.MultiPartEmail multiPartEmail13 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str14 = multiPartEmail13.getSmtpPort();
        javax.activation.DataSource dataSource15 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail19 = multiPartEmail13.attach(dataSource15, "smtp", "koi8-r", "receiver.email");
        java.lang.String str20 = multiPartEmail19.getBounceAddress();
        org.apache.commons.mail.MultiPartEmail multiPartEmail21 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email23 = multiPartEmail21.setStartTLSRequired(false);
        org.apache.commons.mail.Email email25 = email23.setSSLCheckServerIdentity(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList26 = email23.getBccAddresses();
        multiPartEmail19.setContent((java.lang.Object) internetAddressList26, "sender.email");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email29 = htmlEmail0.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(email12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "25" + "'", str14, "25");
        org.junit.Assert.assertNotNull(multiPartEmail19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(email23);
        org.junit.Assert.assertNotNull(email25);
        org.junit.Assert.assertNotNull(internetAddressList26);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail0.setHtmlMsg("ohornutcco");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email16 = htmlEmail12.setFrom("cwuexecnmh", "lgbgqhtwcg", "mail.smtp.host");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.smtp.host");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(htmlEmail12);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        htmlEmail0.setSubType("us-ascii");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        org.apache.commons.mail.Email email6 = simpleEmail0.setMsg("shwuzzbthr");
        simpleEmail0.setSocketTimeout((int) '4');
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = simpleEmail0.setMsg("text/plain");
        simpleEmail0.addHeader("fxscpinwtz", "sender.name");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = simpleEmail0.addBcc("mail.smtp.starttls.enable");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.starttls.enable''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        javax.activation.DataSource dataSource6 = null;
        java.lang.String str9 = htmlEmail5.embed(dataSource6, "mail.smtp.socketFactory.port", "mail.smtp.port");
        boolean boolean10 = htmlEmail5.isSSL();
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail5.setTextMsg("koi8-r");
        org.apache.commons.mail.Email email14 = htmlEmail12.setMsg("cwuexecnmh");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email16 = email14.addTo("attachments");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``attachments''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mail.smtp.port" + "'", str9, "mail.smtp.port");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(htmlEmail12);
        org.junit.Assert.assertNotNull(email14);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        java.lang.String str4 = multiPartEmail0.getHostName();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setSSLOnConnect(false);
        multiPartEmail0.setBoolHasAttachments(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(dataSource6, "mail.transport.protocol", "mail.smtp.socketFactory.class", "mail.smtp.timeout");
        org.apache.commons.mail.Email email12 = multiPartEmail0.setStartTLSEnabled(false);
        multiPartEmail0.setSubType("mail.smtp.user");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email18 = multiPartEmail0.setFrom("ifguxugtww", "koi8-r", "sorkvzscfn");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: sorkvzscfn");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(multiPartEmail10);
        org.junit.Assert.assertNotNull(email12);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        org.apache.commons.mail.Email email6 = simpleEmail0.setMsg("shwuzzbthr");
        org.apache.commons.mail.Email email8 = simpleEmail0.setMsg("hi!");
        org.apache.commons.mail.MultiPartEmail multiPartEmail9 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList10 = multiPartEmail9.getToAddresses();
        org.apache.commons.mail.Email email12 = multiPartEmail9.setStartTLSEnabled(false);
        java.lang.String str13 = email12.getSslSmtpPort();
        email8.setContent((java.lang.Object) email12, "blxsqlqqvw");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertNotNull(internetAddressList10);
        org.junit.Assert.assertNotNull(email12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "465" + "'", str13, "465");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        boolean boolean4 = multiPartEmail0.isBoolHasAttachments();
        java.lang.String str5 = multiPartEmail0.getSubType();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:23 CET 2024");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        org.apache.commons.mail.Email email9 = multiPartEmail0.setSSLCheckServerIdentity(true);
        boolean boolean10 = multiPartEmail0.isStartTLSEnabled();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        boolean boolean7 = multiPartEmail6.isSSLOnConnect();
        java.util.Date date8 = multiPartEmail6.getSentDate();
        java.lang.String str10 = multiPartEmail6.getHeader("tuaypqqvdv");
        boolean boolean11 = multiPartEmail6.isBoolHasAttachments();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = multiPartEmail6.getHeaders();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 20 22:48:23 CET 2024");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = multiPartEmail0.setStartTLSRequired(false);
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        org.apache.commons.mail.Email email8 = multiPartEmail0.setSSLOnConnect(false);
        int int9 = email8.getSocketTimeout();
        email8.setSocketConnectionTimeout((int) (short) -1);
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.EmailAttachment emailAttachment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail5 = htmlEmail0.attach(emailAttachment4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid attachment supplied");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "txvxdlgdjr" + "'", str3, "txvxdlgdjr");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        org.apache.commons.mail.Email email7 = multiPartEmail0.setStartTLSRequired(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = multiPartEmail0.send();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail0.setHtmlMsg("ohornutcco");
        boolean boolean13 = htmlEmail12.isBoolHasAttachments();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(htmlEmail12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setSSLCheckServerIdentity(false);
        org.apache.commons.mail.Email email6 = email4.setSubject("content.type");
        email4.setSSL(true);
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        multiPartEmail0.setContent(mimeMultipart7);
        java.lang.String str9 = multiPartEmail0.getSubject();
        org.apache.commons.mail.Email email11 = multiPartEmail0.setStartTLSEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = multiPartEmail0.addCc("file.server");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``file.server''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(email11);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        javax.activation.DataSource dataSource9 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource9, "mail.debug");
        htmlEmail0.setHostName("iso-8859-1");
        javax.activation.DataSource dataSource14 = null;
        java.lang.String str17 = htmlEmail0.embed(dataSource14, "dvgkmlqvsy", "qqfbjpipab");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = htmlEmail0.embed("rtgnrijzld", "email.subject");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid URL");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fgdyfljojb" + "'", str11, "fgdyfljojb");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "qqfbjpipab" + "'", str17, "qqfbjpipab");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        int int5 = email2.getSocketConnectionTimeout();
        org.apache.commons.mail.Email email7 = email2.setSubject("smtp");
        email2.setSSL(false);
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email7 = email5.setSSLCheckServerIdentity(false);
        org.apache.commons.mail.Email email9 = email5.setSubject("mkyamucxcp");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(email9);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = htmlEmail0.addTo(strArray6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        boolean boolean6 = multiPartEmail0.isStartTLSRequired();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = multiPartEmail0.getHeaders();
        java.lang.String[] strArray11 = new java.lang.String[] { "mqerzxkmcj", "mail.smtp.connectiontimeout", "zurhelnbqf" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email12 = multiPartEmail0.addTo(strArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mqerzxkmcj''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = htmlEmail5.addTo("qqfbjpipab", "receiver.name", "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = multiPartEmail0.setStartTLSRequired(false);
        java.lang.String str5 = multiPartEmail0.getSubType();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail0.addCc("tuaypqqvdv", "sksfbscwih", "oyeforvxhc");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: oyeforvxhc");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        org.apache.commons.mail.Email email12 = htmlEmail0.setMsg("ifguxugtww");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList13 = htmlEmail0.getToAddresses();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(email12);
        org.junit.Assert.assertNotNull(internetAddressList13);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = htmlEmail5.setFrom("qkghmybdmm", "cwuexecnmh", "ixeiouuisj");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: ixeiouuisj");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        email7.setSocketConnectionTimeout((int) ' ');
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList11 = multiPartEmail10.getToAddresses();
        org.apache.commons.mail.Email email13 = multiPartEmail10.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email15 = multiPartEmail10.setStartTLSRequired(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList16 = email15.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email17 = email7.setReplyTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressList11);
        org.junit.Assert.assertNotNull(email13);
        org.junit.Assert.assertNotNull(email15);
        org.junit.Assert.assertNotNull(internetAddressList16);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail5.setSSLCheckServerIdentity(true);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = htmlEmail5.getHeaders();
        int int9 = htmlEmail5.getSocketTimeout();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hrywsbpbvi" + "'", str3, "hrywsbpbvi");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        boolean boolean6 = multiPartEmail0.isStartTLSEnabled();
        boolean boolean7 = multiPartEmail0.isStartTLSRequired();
        multiPartEmail0.setSslSmtpPort("gjgimxsdbu");
        javax.activation.DataSource dataSource10 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail14 = multiPartEmail0.attach(dataSource10, "mail.smtp.starttls.enable", "mail.smtp.timeout", "vkrxuaxgay");
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail14.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(multiPartEmail14);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSubType();
        boolean boolean6 = multiPartEmail0.isSSLCheckServerIdentity();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail0.addReplyTo("file.server");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``file.server''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail10.setTextMsg("sender.email");
        htmlEmail10.setSmtpPort((int) '4');
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(htmlEmail12);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = htmlEmail0.getBccAddresses();
        htmlEmail0.updateContentType("mqerzxkmcj");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ohmucffjoz" + "'", str3, "ohmucffjoz");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(internetAddressList6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email5 = htmlEmail0.addReplyTo("umxzssczsc", "blxsqlqqvw", "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``umxzssczsc''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        multiPartEmail0.setContent(mimeMultipart7);
        multiPartEmail0.setSubType("file.server");
        multiPartEmail0.setAuthentication("vkrxuaxgay", "file.server");
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setSocketConnectionTimeout(0);
        boolean boolean8 = multiPartEmail0.isTLS();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        boolean boolean6 = multiPartEmail0.isBoolHasAttachments();
        org.apache.commons.mail.Email email8 = multiPartEmail0.setSSLOnConnect(true);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail12 = multiPartEmail0.attach(uRL9, "rtgnrijzld", "xuyualotri");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail0.setHtmlMsg("rtgnrijzld");
        boolean boolean13 = htmlEmail12.isBoolHasAttachments();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(htmlEmail12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        boolean boolean4 = multiPartEmail0.isBoolHasAttachments();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("mail.smtp.connectiontimeout");
        boolean boolean7 = email6.isSSL();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:23 CET 2024");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        multiPartEmail0.setSubType("mail.smtp.port");
        boolean boolean8 = multiPartEmail0.isTLS();
        org.apache.commons.mail.Email email10 = multiPartEmail0.setStartTLSRequired(false);
        multiPartEmail0.setTLS(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(email10);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSslSmtpPort();
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSendPartial(true);
        javax.mail.internet.InternetAddress[] internetAddressArray8 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList9 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList9, internetAddressArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = email7.setReplyTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "465" + "'", str5, "465");
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail5.setTextMsg("ohornutcco");
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = htmlEmail7.embed(file8, "rjjnrxtynw");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(htmlEmail7);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        // The following exception was thrown during execution in test generation
        try {
            simpleEmail0.setCharset("mail.smtp.connectiontimeout");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.smtp.connectiontimeout");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.Email email3 = htmlEmail0.setSendPartial(false);
        org.apache.commons.mail.Email email5 = email3.setSendPartial(true);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        boolean boolean6 = multiPartEmail0.isStartTLSEnabled();
        boolean boolean7 = multiPartEmail0.isStartTLSRequired();
        multiPartEmail0.setSslSmtpPort("gjgimxsdbu");
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email12 = multiPartEmail10.setStartTLSRequired(false);
        email12.setSocketConnectionTimeout((int) (byte) 10);
        multiPartEmail0.setContent((java.lang.Object) email12, "mail.smtp.socketFactory.port");
        javax.mail.internet.MimeMessage mimeMessage17 = multiPartEmail0.getMimeMessage();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail21 = multiPartEmail0.attach(uRL18, "muvcyszemz", "grcrosweoz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(email12);
        org.junit.Assert.assertNull(mimeMessage17);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSslSmtpPort();
        java.lang.String str6 = multiPartEmail0.getBounceAddress();
        org.apache.commons.mail.Email email8 = multiPartEmail0.setMsg("mail.smtp.host");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email12 = multiPartEmail0.addCc("", "sender.name", "qkghmybdmm");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Illegal address in string ``''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "465" + "'", str5, "465");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        multiPartEmail0.setSocketConnectionTimeout((int) (byte) 0);
        boolean boolean8 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email10 = multiPartEmail0.setStartTLSRequired(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email12 = email10.addCc("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Illegal address in string ``''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(email10);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        boolean boolean2 = multiPartEmail0.isSendPartial();
        java.lang.String str3 = multiPartEmail0.getSslSmtpPort();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "465" + "'", str3, "465");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        int int5 = simpleEmail0.getSocketTimeout();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        javax.activation.DataSource dataSource4 = null;
        java.lang.String str7 = htmlEmail0.embed(dataSource4, "rtgnrijzld", "qqfbjpipab");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bnepsrxccj" + "'", str3, "bnepsrxccj");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "qqfbjpipab" + "'", str7, "qqfbjpipab");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        org.apache.commons.mail.Email email6 = simpleEmail0.setMsg("shwuzzbthr");
        int int7 = email6.getSocketConnectionTimeout();
        org.apache.commons.mail.MultiPartEmail multiPartEmail8 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str9 = multiPartEmail8.getSmtpPort();
        multiPartEmail8.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str13 = multiPartEmail8.getSslSmtpPort();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList14 = multiPartEmail8.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = email6.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "465" + "'", str13, "465");
        org.junit.Assert.assertNotNull(internetAddressList14);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        org.apache.commons.mail.Email email5 = multiPartEmail0.setSubject("mail.smtp.timeout");
        multiPartEmail0.setSslSmtpPort("wjnddzldgb");
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:24 CET 2024");
        org.junit.Assert.assertNotNull(email5);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList5 = multiPartEmail0.getCcAddresses();
        org.apache.commons.mail.Email email7 = multiPartEmail0.setMsg("text/html");
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail9 = multiPartEmail0.attach(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(internetAddressList5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(true);
        boolean boolean4 = multiPartEmail0.isStartTLSRequired();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("file.server");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        org.apache.commons.mail.MultiPartEmail multiPartEmail7 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str8 = multiPartEmail7.getSmtpPort();
        multiPartEmail7.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str12 = multiPartEmail7.getSubType();
        boolean boolean13 = multiPartEmail7.isSSLCheckServerIdentity();
        multiPartEmail7.setSslSmtpPort("ogsczkhkqu");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList16 = multiPartEmail7.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email17 = multiPartEmail0.setReplyTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "25" + "'", str8, "25");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(internetAddressList16);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        java.lang.String[] strArray12 = new java.lang.String[] { "sender.name", "iso-8859-1", "oyeforvxhc", "xuyualotri", "email.body", "cwuexecnmh" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = multiPartEmail0.addTo(strArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``sender.name''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setSendPartial(true);
        multiPartEmail0.setHostName("receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = htmlEmail5.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(internetAddressList6);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        boolean boolean2 = multiPartEmail0.isSSL();
        multiPartEmail0.setBoolHasAttachments(false);
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("flehnmowzg");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = email6.addReplyTo("ohornutcco", "tqmdwrwtja", "tuaypqqvdv");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: tuaypqqvdv");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        org.apache.commons.mail.Email email6 = simpleEmail0.setMsg("shwuzzbthr");
        org.apache.commons.mail.Email email8 = simpleEmail0.setMsg("gycaxbrvob");
        boolean boolean9 = email8.isStartTLSEnabled();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        org.apache.commons.mail.Email email12 = email10.setMsg("receiver.name");
        email12.setSSL(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(email12);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = htmlEmail0.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.setCharset("mail.smtp.from");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.smtp.from");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "lbhgklhdfr" + "'", str3, "lbhgklhdfr");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(internetAddressList6);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = email2.addReplyTo("file.server", "tgjiktqoqq", "lgbgqhtwcg");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: lgbgqhtwcg");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(dataSource6, "mail.transport.protocol", "mail.smtp.socketFactory.class", "mail.smtp.timeout");
        org.apache.commons.mail.Email email12 = multiPartEmail0.setStartTLSEnabled(false);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail17 = multiPartEmail0.attach(uRL13, "rjktqagyob", "zjkvequhsq", "mail.smtp.starttls.enable");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(multiPartEmail10);
        org.junit.Assert.assertNotNull(email12);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        multiPartEmail0.setTLS(true);
        org.apache.commons.mail.Email email11 = multiPartEmail0.setSSLOnConnect(true);
        java.lang.String str13 = email11.getHeader("fqnggaltbh");
        email11.addHeader("vkrxuaxgay", "fjnmntfewn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = email5.getBccAddresses();
        email5.setSocketConnectionTimeout((-1));
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(internetAddressList6);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        org.apache.commons.mail.Email email6 = simpleEmail0.setMsg("shwuzzbthr");
        org.apache.commons.mail.Email email8 = simpleEmail0.setMsg("hi!");
        boolean boolean9 = email8.isSSLOnConnect();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setSSLCheckServerIdentity(false);
        org.apache.commons.mail.Email email6 = email4.setSubject("content.type");
        boolean boolean7 = email6.isSSL();
        boolean boolean8 = email6.isStartTLSEnabled();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = simpleEmail0.setMsg("mail.smtp.port");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = email7.getCcAddresses();
        javax.mail.internet.MimeMultipart mimeMultipart9 = null;
        email7.setContent(mimeMultipart9);
        java.lang.String[] strArray15 = new java.lang.String[] { "mail.smtp.host", "rkkshmjarl", "mail.smtp.port", "mail.smtp.password" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email16 = email7.addCc(strArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.host''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSslSmtpPort();
        boolean boolean6 = multiPartEmail0.isSSLOnConnect();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "465" + "'", str5, "465");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail10.setTextMsg("sender.email");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = htmlEmail10.addBcc("rjjnrxtynw", "lhaahuyawf");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``rjjnrxtynw''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(htmlEmail12);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        org.apache.commons.mail.Email email6 = simpleEmail0.setMsg("shwuzzbthr");
        org.apache.commons.mail.Email email8 = simpleEmail0.setMsg("gycaxbrvob");
        java.lang.String str9 = email8.getSmtpPort();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        multiPartEmail6.setPopBeforeSmtp(true, "25", "email.body", "mail.debug");
        org.apache.commons.mail.Email email17 = multiPartEmail6.setSSLOnConnect(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(email17);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = email7.getCcAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail9 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList10 = htmlEmail9.getBccAddresses();
        javax.activation.DataSource dataSource11 = null;
        java.lang.String str14 = htmlEmail9.embed(dataSource11, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail16 = htmlEmail9.setHtmlMsg("mail.smtp.auth");
        java.lang.String str17 = htmlEmail9.getSubject();
        javax.activation.DataSource dataSource18 = null;
        java.lang.String str20 = htmlEmail9.embed(dataSource18, "mail.debug");
        htmlEmail9.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = htmlEmail9.getHeaders();
        email7.setHeaders(strMap24);
        boolean boolean26 = email7.isStartTLSRequired();
        org.apache.commons.mail.Email email28 = email7.setMsg("rjjnrxtynw");
        org.apache.commons.mail.Email email30 = email7.setSSLOnConnect(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(internetAddressList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "email.subject" + "'", str14, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail16);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "putmpdhhtf" + "'", str20, "putmpdhhtf");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(email28);
        org.junit.Assert.assertNotNull(email30);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("sender.name");
        boolean boolean8 = email7.isStartTLSRequired();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aksjmhgbrt" + "'", str3, "aksjmhgbrt");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        multiPartEmail0.setSocketConnectionTimeout((int) (byte) 0);
        boolean boolean8 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email10 = multiPartEmail0.setStartTLSRequired(false);
        javax.mail.internet.MimeMultipart mimeMultipart11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = multiPartEmail0.addPart(mimeMultipart11, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(email10);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.Email email10 = htmlEmail0.setMsg("sender.name");
        org.apache.commons.mail.MultiPartEmail multiPartEmail11 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str12 = multiPartEmail11.getSmtpPort();
        javax.activation.DataSource dataSource13 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail17 = multiPartEmail11.attach(dataSource13, "smtp", "koi8-r", "receiver.email");
        boolean boolean18 = multiPartEmail17.isSSLOnConnect();
        java.util.Date date19 = multiPartEmail17.getSentDate();
        email10.setSentDate(date19);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "25" + "'", str12, "25");
        org.junit.Assert.assertNotNull(multiPartEmail17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 20 22:48:24 CET 2024");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.Email email3 = htmlEmail0.setSendPartial(false);
        org.apache.commons.mail.Email email5 = htmlEmail0.setMsg("mail.smtp.socketFactory.class");
        htmlEmail0.setBoolHasAttachments(false);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.mail.Authenticator authenticator2 = null;
        multiPartEmail0.setAuthenticator(authenticator2);
        multiPartEmail0.addHeader("mail.smtp.starttls.enable", "file.server");
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail8 = multiPartEmail0.attach(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        java.lang.String str4 = multiPartEmail0.getHostName();
        javax.mail.internet.InternetAddress internetAddress5 = multiPartEmail0.getFromAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail0.addTo("us-ascii", "mail.smtp.starttls.enable", "sender.email");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: sender.email");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(internetAddress5);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        multiPartEmail0.setAuthentication("mail.smtp.password", "465");
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setCharset("rtgnrijzld");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: rtgnrijzld");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(true);
        boolean boolean4 = multiPartEmail0.isStartTLSRequired();
        multiPartEmail0.setAuthentication("gycaxbrvob", "file.server");
        multiPartEmail0.setBoolHasAttachments(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email12 = multiPartEmail0.setFrom("kyynvwouof", "gycaxbrvob");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``kyynvwouof''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        boolean boolean2 = multiPartEmail0.isSSL();
        multiPartEmail0.setBoolHasAttachments(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email6 = multiPartEmail0.addTo("rkkshmjarl");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``rkkshmjarl''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        multiPartEmail0.setTLS(true);
        boolean boolean10 = multiPartEmail0.isSSLCheckServerIdentity();
        org.apache.commons.mail.MultiPartEmail multiPartEmail11 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str12 = multiPartEmail11.getSmtpPort();
        javax.activation.DataSource dataSource13 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail17 = multiPartEmail11.attach(dataSource13, "smtp", "koi8-r", "receiver.email");
        java.lang.String str18 = multiPartEmail17.getBounceAddress();
        org.apache.commons.mail.Email email21 = multiPartEmail17.addPart("content.type", "smtp");
        org.apache.commons.mail.Email email23 = email21.setMsg("receiver.name");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList24 = email21.getReplyToAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email25 = multiPartEmail0.setReplyTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "25" + "'", str12, "25");
        org.junit.Assert.assertNotNull(multiPartEmail17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(email21);
        org.junit.Assert.assertNotNull(email23);
        org.junit.Assert.assertNotNull(internetAddressList24);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail5.setHtmlMsg("lhaahuyawf");
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.Session session8 = htmlEmail7.getMailSession();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ulwhghpeuw" + "'", str3, "ulwhghpeuw");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(htmlEmail7);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        int int5 = email2.getSocketConnectionTimeout();
        org.apache.commons.mail.Email email7 = email2.setSubject("smtp");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = email7.sendMimeMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MimeMessage has not been created yet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        boolean boolean2 = multiPartEmail0.isSSL();
        multiPartEmail0.setBoolHasAttachments(false);
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("flehnmowzg");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList7 = email6.getToAddresses();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNotNull(internetAddressList7);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = htmlEmail0.embed(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setSocketConnectionTimeout(0);
        multiPartEmail0.setPopBeforeSmtp(false, "cwuexecnmh", "text/html", "tuaypqqvdv");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        javax.activation.DataSource dataSource8 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail12 = multiPartEmail0.attach(dataSource8, "gjgimxsdbu", "mkyamucxcp", "mail.smtp.connectiontimeout");
        multiPartEmail12.setPopBeforeSmtp(true, "tbnfonnaom", "tbnfonnaom", "mail.smtp.auth");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(multiPartEmail12);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        org.apache.commons.mail.Email email7 = htmlEmail3.setMsg("koi8-r");
        java.lang.String str8 = email7.getSslSmtpPort();
        org.apache.commons.mail.Email email10 = email7.setSubject("oqpvcrbeiv");
        boolean boolean11 = email10.isSSLOnConnect();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "465" + "'", str8, "465");
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setBoolHasAttachments(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        int int6 = multiPartEmail0.getSocketTimeout();
        boolean boolean7 = multiPartEmail0.isSSL();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        boolean boolean6 = multiPartEmail0.isStartTLSEnabled();
        int int7 = multiPartEmail0.getSocketTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        multiPartEmail0.setSubType("mail.smtp.port");
        boolean boolean8 = multiPartEmail0.isTLS();
        org.apache.commons.mail.Email email10 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = multiPartEmail0.getHeaders();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        org.apache.commons.mail.Email email2 = htmlEmail0.setMsg("shwuzzbthr");
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        org.apache.commons.mail.Email email6 = multiPartEmail0.setSSLOnConnect(true);
        int int7 = email6.getSocketTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        multiPartEmail0.setSubType("mail.smtp.port");
        boolean boolean8 = multiPartEmail0.isTLS();
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.Session session9 = multiPartEmail0.getMailSession();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        boolean boolean5 = multiPartEmail0.isSSL();
        multiPartEmail0.setSslSmtpPort("mkyamucxcp");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setSocketTimeout(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = multiPartEmail0.setFrom("", "umxzssczsc");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Illegal address in string ``''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        multiPartEmail0.setSocketConnectionTimeout((int) (byte) 0);
        java.lang.String str8 = multiPartEmail0.getSslSmtpPort();
        boolean boolean9 = multiPartEmail0.isSSL();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "465" + "'", str8, "465");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        int int5 = email2.getSocketConnectionTimeout();
        org.apache.commons.mail.Email email7 = email2.setSubject("smtp");
        email7.setSocketConnectionTimeout((int) (byte) -1);
        boolean boolean10 = email7.isSSLCheckServerIdentity();
        org.apache.commons.mail.MultiPartEmail multiPartEmail11 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str12 = multiPartEmail11.getSmtpPort();
        javax.activation.DataSource dataSource13 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail17 = multiPartEmail11.attach(dataSource13, "smtp", "koi8-r", "receiver.email");
        java.lang.String str18 = multiPartEmail17.getBounceAddress();
        org.apache.commons.mail.Email email21 = multiPartEmail17.addPart("content.type", "smtp");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList22 = email21.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email23 = email7.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60000 + "'", int5 == 60000);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "25" + "'", str12, "25");
        org.junit.Assert.assertNotNull(multiPartEmail17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(email21);
        org.junit.Assert.assertNotNull(internetAddressList22);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = email7.getCcAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail9 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList10 = htmlEmail9.getBccAddresses();
        javax.activation.DataSource dataSource11 = null;
        java.lang.String str14 = htmlEmail9.embed(dataSource11, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail16 = htmlEmail9.setHtmlMsg("mail.smtp.auth");
        java.lang.String str17 = htmlEmail9.getSubject();
        javax.activation.DataSource dataSource18 = null;
        java.lang.String str20 = htmlEmail9.embed(dataSource18, "mail.debug");
        htmlEmail9.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = htmlEmail9.getHeaders();
        email7.setHeaders(strMap24);
        boolean boolean26 = email7.isStartTLSRequired();
        org.apache.commons.mail.Email email28 = email7.setMsg("rjjnrxtynw");
        email7.setSmtpPort((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(internetAddressList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "email.subject" + "'", str14, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail16);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "lwzmtzdfyd" + "'", str20, "lwzmtzdfyd");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(email28);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        org.apache.commons.mail.MultiPartEmail multiPartEmail5 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str6 = multiPartEmail5.getBounceAddress();
        multiPartEmail5.setBoolHasAttachments(false);
        org.apache.commons.mail.Email email10 = multiPartEmail5.setStartTLSRequired(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList11 = email10.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email12 = email2.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(internetAddressList11);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.updateContentType("mkyamucxcp");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email9 = multiPartEmail0.addTo("ixeiouuisj");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``ixeiouuisj''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        org.apache.commons.mail.Email email8 = multiPartEmail0.setMsg("mail.smtp.auth");
        multiPartEmail0.setSslSmtpPort("file.server");
        multiPartEmail0.setBoolHasAttachments(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.Email email10 = htmlEmail0.setMsg("sender.name");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = email10.addCc("wjnddzldgb", "hrywsbpbvi");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``wjnddzldgb''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(email10);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setSendPartial(true);
        org.apache.commons.mail.SimpleEmail simpleEmail3 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList4 = simpleEmail3.getToAddresses();
        multiPartEmail0.setContent((java.lang.Object) simpleEmail3, "text/html");
        java.lang.String str7 = multiPartEmail0.getHostName();
        multiPartEmail0.setHostName("text/html");
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str11 = multiPartEmail10.getSmtpPort();
        multiPartEmail10.setSubType("mail.transport.protocol");
        multiPartEmail0.setContent((java.lang.Object) multiPartEmail10, "tuaypqqvdv");
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(internetAddressList4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25" + "'", str11, "25");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = email5.getReplyToAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = email5.addCc("fjnmntfewn");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``fjnmntfewn''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(internetAddressList6);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        htmlEmail0.setAuthentication("mail.smtp.connectiontimeout", "mail.smtp.timeout");
        org.apache.commons.mail.HtmlEmail htmlEmail11 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList12 = htmlEmail11.getBccAddresses();
        javax.activation.DataSource dataSource13 = null;
        java.lang.String str16 = htmlEmail11.embed(dataSource13, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail18 = htmlEmail11.setHtmlMsg("mail.smtp.auth");
        java.lang.String str19 = htmlEmail11.getSubject();
        javax.activation.DataSource dataSource20 = null;
        java.lang.String str22 = htmlEmail11.embed(dataSource20, "mail.debug");
        htmlEmail11.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = htmlEmail11.getHeaders();
        htmlEmail0.setHeaders(strMap26);
        java.io.File file28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail29 = htmlEmail0.attach(file28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNotNull(internetAddressList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "email.subject" + "'", str16, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail18);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "doiaxukrgw" + "'", str22, "doiaxukrgw");
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        org.apache.commons.mail.Email email8 = multiPartEmail0.setMsg("mail.smtp.auth");
        org.apache.commons.mail.MultiPartEmail multiPartEmail9 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email11 = multiPartEmail9.setStartTLSRequired(false);
        org.apache.commons.mail.Email email13 = email11.setSSLCheckServerIdentity(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList14 = email11.getBccAddresses();
        java.util.Date date15 = email11.getSentDate();
        email8.setSentDate(date15);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "mqerzxkmcj" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email20 = email8.addCc(strArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Illegal address in string ``''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNotNull(email13);
        org.junit.Assert.assertNotNull(internetAddressList14);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Sat Jan 20 22:48:25 CET 2024");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        org.apache.commons.mail.Email email6 = multiPartEmail0.setMsg("fryefwbswo");
        email6.setDebug(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        multiPartEmail0.addHeader("xyjrcvkbho", "rjktqagyob");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}
