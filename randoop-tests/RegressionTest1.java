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
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        boolean boolean5 = multiPartEmail0.isSSL();
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str7 = multiPartEmail6.getSmtpPort();
        multiPartEmail6.setSubType("mail.transport.protocol");
        java.lang.String str10 = multiPartEmail6.getHostName();
        javax.mail.internet.MimeMultipart mimeMultipart11 = null;
        multiPartEmail6.setContent(mimeMultipart11);
        multiPartEmail6.setSocketConnectionTimeout((int) (short) 1);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList15 = multiPartEmail6.getToAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email16 = multiPartEmail0.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "25" + "'", str7, "25");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(internetAddressList15);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.setSmtpPort(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot connect to a port number that is less than 1 ( 0 )");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNotNull(internetAddressList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "email.subject" + "'", str16, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail18);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "difxqybdvd" + "'", str22, "difxqybdvd");
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String[] strArray12 = new java.lang.String[] { "mail.smtp.starttls.enable", "bnepsrxccj", "mail.smtp.host", "koi8-r" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = htmlEmail7.addCc(strArray12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.starttls.enable''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        org.apache.commons.mail.Email email7 = htmlEmail3.setMsg("koi8-r");
        htmlEmail3.setSslSmtpPort("mail.smtp.password");
        org.apache.commons.mail.HtmlEmail htmlEmail11 = htmlEmail3.setHtmlMsg("kyynvwouof");
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail3.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(htmlEmail11);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email9 = multiPartEmail0.setMsg("hi!");
        org.apache.commons.mail.Email email11 = email9.setSendPartial(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = email11.setBounceAddress("mail.smtp.connectiontimeout");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to set the bounce address : mail.smtp.connectiontimeout");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertNotNull(email11);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        htmlEmail0.setSslSmtpPort("fryefwbswo");
        boolean boolean13 = htmlEmail0.isBoolHasAttachments();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList14 = htmlEmail0.getReplyToAddresses();
        org.apache.commons.mail.EmailAttachment emailAttachment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail16 = htmlEmail0.attach(emailAttachment15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid attachment supplied");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(internetAddressList14);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setTextMsg("receiver.email");
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
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = email7.getCcAddresses();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = email7.getHeaders();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMultipart mimeMultipart6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.addPart(mimeMultipart6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        boolean boolean30 = multiPartEmail0.isStartTLSRequired();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(internetAddressList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "email.subject" + "'", str16, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail18);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ywylpheive" + "'", str22, "ywylpheive");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(email29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        multiPartEmail0.setSubType("receiver.email");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = multiPartEmail0.send();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        int int6 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email8 = multiPartEmail0.setSubject("email.body");
        java.lang.String str9 = email8.getBounceAddress();
        org.apache.commons.mail.Email email11 = email8.setSSLCheckServerIdentity(false);
        javax.mail.Session session12 = null;
        // The following exception was thrown during execution in test generation
        try {
            email11.setMailSession(session12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no mail session supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(email11);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        boolean boolean8 = multiPartEmail0.isBoolHasAttachments();
        boolean boolean9 = multiPartEmail0.isBoolHasAttachments();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.Email email3 = htmlEmail0.setSendPartial(false);
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("text/html");
        boolean boolean6 = htmlEmail0.isSSLOnConnect();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        boolean boolean5 = multiPartEmail0.isSSL();
        multiPartEmail0.setSubType("mail.smtp.starttls.enable");
        org.apache.commons.mail.Email email10 = multiPartEmail0.addPart("mail.smtp.connectiontimeout", "text/html");
        boolean boolean11 = multiPartEmail0.isBoolHasAttachments();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMultipart mimeMultipart4 = null;
        email3.setContent(mimeMultipart4);
        org.apache.commons.mail.Email email7 = email3.setSSLCheckServerIdentity(true);
        javax.mail.internet.InternetAddress internetAddress8 = email3.getFromAddress();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = email3.addCc("dvgkmlqvsy", "ohornutcco");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``dvgkmlqvsy''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNull(internetAddress8);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        boolean boolean7 = multiPartEmail6.isSSLOnConnect();
        java.util.Date date8 = multiPartEmail6.getSentDate();
        java.lang.String str10 = multiPartEmail6.getHeader("tuaypqqvdv");
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail6.setCharset("mail.debug");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.debug");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 20 22:48:25 CET 2024");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        javax.activation.DataSource dataSource6 = null;
        java.lang.String str9 = htmlEmail5.embed(dataSource6, "mail.smtp.socketFactory.port", "mail.smtp.port");
        boolean boolean10 = htmlEmail5.isSSL();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email13 = htmlEmail5.addReplyTo("gycaxbrvob", "kyynvwouof");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``gycaxbrvob''");
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
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
            org.apache.commons.mail.Email email20 = email12.addCc("mail.smtp.socketFactory.class", "xyjrcvkbho", "receiver.name");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: receiver.name");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
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
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        multiPartEmail6.setPopBeforeSmtp(true, "25", "mail.smtp.connectiontimeout", "");
        org.apache.commons.mail.Email email13 = multiPartEmail6.setStartTLSEnabled(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList14 = multiPartEmail6.getReplyToAddresses();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNotNull(email13);
        org.junit.Assert.assertNotNull(internetAddressList14);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        boolean boolean2 = multiPartEmail0.isSSL();
        multiPartEmail0.setBoolHasAttachments(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList5 = multiPartEmail0.getReplyToAddresses();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail9 = multiPartEmail0.attach(uRL6, "zurhelnbqf", "gycaxbrvob");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(internetAddressList5);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList2 = htmlEmail0.getToAddresses();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = htmlEmail0.send();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(internetAddressList2);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(true);
        boolean boolean4 = multiPartEmail0.isStartTLSRequired();
        javax.mail.internet.MimeMultipart mimeMultipart5 = null;
        multiPartEmail0.setContent(mimeMultipart5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setSSLCheckServerIdentity(false);
        org.apache.commons.mail.Email email6 = email4.setSubject("content.type");
        email4.setContent((java.lang.Object) "ifguxugtww", "fppqoxuufr");
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        org.apache.commons.mail.Email email12 = htmlEmail0.setMsg("ifguxugtww");
        org.apache.commons.mail.HtmlEmail htmlEmail14 = htmlEmail0.setTextMsg("mail.smtp.timeout");
        boolean boolean15 = htmlEmail14.isSSL();
        org.apache.commons.mail.Email email17 = htmlEmail14.setMsg("mqerzxkmcj");
        java.lang.Class<?> wildcardClass18 = email17.getClass();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(email12);
        org.junit.Assert.assertNotNull(htmlEmail14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(email17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        int int5 = email2.getSocketConnectionTimeout();
        org.apache.commons.mail.Email email7 = email2.setSubject("smtp");
        email7.setSocketConnectionTimeout((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = email7.sendMimeMessage();
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
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        org.apache.commons.mail.Email email5 = multiPartEmail0.setSubject("mail.smtp.timeout");
        java.lang.String[] strArray11 = new java.lang.String[] { "oqpvcrbeiv", "mail.smtp.from", "lhaahuyawf", "attachments", "qogofcfzkc" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email12 = email5.addCc(strArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``oqpvcrbeiv''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:26 CET 2024");
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail0.setHtmlMsg("rtgnrijzld");
        javax.activation.DataSource dataSource13 = null;
        java.lang.String str16 = htmlEmail0.embed(dataSource13, "mail.smtp.socketFactory.port", "kyynvwouof");
        org.apache.commons.mail.MultiPartEmail multiPartEmail17 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str18 = multiPartEmail17.getSmtpPort();
        org.apache.commons.mail.Email email20 = multiPartEmail17.setSubject("25");
        multiPartEmail17.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email24 = multiPartEmail17.setSSLCheckServerIdentity(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList25 = email24.getCcAddresses();
        javax.mail.internet.MimeMultipart mimeMultipart26 = null;
        email24.setContent(mimeMultipart26);
        javax.mail.Authenticator authenticator28 = null;
        email24.setAuthenticator(authenticator28);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList30 = email24.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email31 = htmlEmail0.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList30);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(htmlEmail12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "kyynvwouof" + "'", str16, "kyynvwouof");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "25" + "'", str18, "25");
        org.junit.Assert.assertNotNull(email20);
        org.junit.Assert.assertNotNull(email24);
        org.junit.Assert.assertNotNull(internetAddressList25);
        org.junit.Assert.assertNotNull(internetAddressList30);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = htmlEmail5.addBcc("mail.transport.protocol", "lgbgqhtwcg");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.transport.protocol''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "klofriojxi" + "'", str3, "klofriojxi");
        org.junit.Assert.assertNotNull(htmlEmail5);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(dataSource6, "mail.transport.protocol", "mail.smtp.socketFactory.class", "mail.smtp.timeout");
        org.apache.commons.mail.Email email12 = multiPartEmail0.setStartTLSEnabled(false);
        multiPartEmail0.setSubType("mail.smtp.user");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email16 = multiPartEmail0.addCc("grcrosweoz");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``grcrosweoz''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(multiPartEmail10);
        org.junit.Assert.assertNotNull(email12);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        htmlEmail5.setSocketConnectionTimeout((int) (byte) 0);
        boolean boolean8 = htmlEmail5.isSSLOnConnect();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        multiPartEmail0.setSSL(false);
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail24 = multiPartEmail0.attach(uRL20, "zurhelnbqf", "", "uxiwmchloi");
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
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        javax.activation.DataSource dataSource9 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource9, "mail.debug");
        htmlEmail0.setHostName("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail14 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource15 = null;
        java.lang.String str17 = htmlEmail14.embed(dataSource15, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail19 = htmlEmail14.setHtmlMsg("attachments");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList20 = htmlEmail14.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email21 = htmlEmail0.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ekwoyirqmu" + "'", str11, "ekwoyirqmu");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "uwrhskomte" + "'", str17, "uwrhskomte");
        org.junit.Assert.assertNotNull(htmlEmail19);
        org.junit.Assert.assertNotNull(internetAddressList20);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(true);
        boolean boolean4 = multiPartEmail0.isStartTLSRequired();
        multiPartEmail0.setAuthentication("gycaxbrvob", "file.server");
        javax.mail.internet.MimeMultipart mimeMultipart8 = null;
        multiPartEmail0.setContent(mimeMultipart8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = multiPartEmail0.setBounceAddress("mail.smtp.starttls.enable");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Failed to set the bounce address : mail.smtp.starttls.enable");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail0.setHtmlMsg("rtgnrijzld");
        javax.activation.DataSource dataSource13 = null;
        java.lang.String str16 = htmlEmail0.embed(dataSource13, "mail.smtp.socketFactory.port", "kyynvwouof");
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
        org.junit.Assert.assertNotNull(htmlEmail12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "kyynvwouof" + "'", str16, "kyynvwouof");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("sender.name");
        org.apache.commons.mail.HtmlEmail htmlEmail9 = htmlEmail0.setTextMsg("mqerzxkmcj");
        boolean boolean10 = htmlEmail9.isSSL();
        java.lang.String[] strArray11 = new java.lang.String[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email12 = htmlEmail9.addBcc(strArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "envhfzqivl" + "'", str3, "envhfzqivl");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(htmlEmail9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email9 = multiPartEmail0.setMsg("hi!");
        org.apache.commons.mail.Email email11 = multiPartEmail0.setSendPartial(false);
        multiPartEmail0.addHeader("sender.email", "mail.smtp.connectiontimeout");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertNotNull(email11);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("sender.name");
        org.apache.commons.mail.HtmlEmail htmlEmail9 = htmlEmail0.setTextMsg("mqerzxkmcj");
        htmlEmail0.setSSL(true);
        htmlEmail0.setAuthentication("tgjiktqoqq", "aksjmhgbrt");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nuwiavonqt" + "'", str3, "nuwiavonqt");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(htmlEmail9);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        org.apache.commons.mail.Email email7 = htmlEmail3.setMsg("koi8-r");
        java.lang.String str8 = email7.getSslSmtpPort();
        email7.setSocketConnectionTimeout(60000);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "465" + "'", str8, "465");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.apache.commons.mail.Email email7 = multiPartEmail0.setSSLCheckServerIdentity(true);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = email7.getCcAddresses();
        javax.mail.internet.MimeMultipart mimeMultipart9 = null;
        email7.setContent(mimeMultipart9);
        javax.mail.Authenticator authenticator11 = null;
        email7.setAuthenticator(authenticator11);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList13 = email7.getCcAddresses();
        email7.setSslSmtpPort("");
        javax.mail.Session session16 = null;
        // The following exception was thrown during execution in test generation
        try {
            email7.setMailSession(session16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no mail session supplied");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(internetAddressList13);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        java.lang.String str6 = htmlEmail0.getSubType();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList7 = htmlEmail0.getBccAddresses();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(internetAddressList7);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("sender.name");
        org.apache.commons.mail.HtmlEmail htmlEmail9 = htmlEmail0.setTextMsg("mqerzxkmcj");
        org.apache.commons.mail.Email email11 = htmlEmail0.setMsg("fryefwbswo");
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = htmlEmail0.embed(file12, "oyeforvxhc");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "nqgzdeesnk" + "'", str3, "nqgzdeesnk");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(htmlEmail9);
        org.junit.Assert.assertNotNull(email11);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        email4.setSSL(true);
        org.apache.commons.mail.Email email8 = email4.setSSLOnConnect(false);
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        javax.activation.DataSource dataSource9 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource9, "mail.debug");
        htmlEmail0.setAuthentication("mail.smtp.starttls.enable", "465");
        org.apache.commons.mail.EmailAttachment emailAttachment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail16 = htmlEmail0.attach(emailAttachment15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid attachment supplied");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faqzamhmnt" + "'", str11, "faqzamhmnt");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(true);
        boolean boolean4 = multiPartEmail0.isStartTLSRequired();
        multiPartEmail0.setAuthentication("gycaxbrvob", "file.server");
        javax.mail.internet.MimeMultipart mimeMultipart8 = null;
        multiPartEmail0.setContent(mimeMultipart8);
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSubType();
        boolean boolean6 = multiPartEmail0.isSSLCheckServerIdentity();
        org.apache.commons.mail.Email email9 = multiPartEmail0.addPart("kqlfeqouie", "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(email9);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.Email email10 = htmlEmail0.setMsg("sender.name");
        htmlEmail0.setSubType("text/html");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(email10);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        multiPartEmail0.setContent(mimeMultipart7);
        org.apache.commons.mail.MultiPartEmail multiPartEmail9 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email11 = multiPartEmail9.setStartTLSRequired(false);
        org.apache.commons.mail.Email email13 = email11.setMsg("mail.smtp.port");
        int int14 = email11.getSocketConnectionTimeout();
        org.apache.commons.mail.Email email16 = email11.setSubject("smtp");
        multiPartEmail0.setContent((java.lang.Object) email11, "tbnfonnaom");
        org.apache.commons.mail.MultiPartEmail multiPartEmail19 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str20 = multiPartEmail19.getSmtpPort();
        javax.activation.DataSource dataSource21 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail25 = multiPartEmail19.attach(dataSource21, "smtp", "koi8-r", "receiver.email");
        java.lang.String str26 = multiPartEmail25.getBounceAddress();
        org.apache.commons.mail.MultiPartEmail multiPartEmail27 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email29 = multiPartEmail27.setStartTLSRequired(false);
        org.apache.commons.mail.Email email31 = email29.setSSLCheckServerIdentity(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList32 = email29.getBccAddresses();
        multiPartEmail25.setContent((java.lang.Object) internetAddressList32, "sender.email");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email35 = email11.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList32);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNotNull(email13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertNotNull(email16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "25" + "'", str20, "25");
        org.junit.Assert.assertNotNull(multiPartEmail25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(email29);
        org.junit.Assert.assertNotNull(email31);
        org.junit.Assert.assertNotNull(internetAddressList32);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        htmlEmail0.setSslSmtpPort("mail.transport.protocol");
        htmlEmail0.setSocketConnectionTimeout((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        javax.activation.DataSource dataSource11 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail15 = htmlEmail10.attach(dataSource11, "rkkshmjarl", "tbnfonnaom", "fryefwbswo");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = htmlEmail10.sendMimeMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MimeMessage has not been created yet");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        javax.activation.DataSource dataSource6 = null;
        java.lang.String str9 = htmlEmail5.embed(dataSource6, "mail.smtp.socketFactory.port", "mail.smtp.port");
        javax.activation.DataSource dataSource10 = null;
        java.lang.String str12 = htmlEmail5.embed(dataSource10, "mail.smtp.socketFactory.class");
        boolean boolean13 = htmlEmail5.isBoolHasAttachments();
        org.apache.commons.mail.HtmlEmail htmlEmail15 = htmlEmail5.setTextMsg("ixeiouuisj");
        javax.mail.internet.MimeMessage mimeMessage16 = htmlEmail5.getMimeMessage();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mail.smtp.port" + "'", str9, "mail.smtp.port");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ulmurffrom" + "'", str12, "ulmurffrom");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(htmlEmail15);
        org.junit.Assert.assertNull(mimeMessage16);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        javax.activation.DataSource dataSource8 = null;
        java.lang.String str11 = htmlEmail0.embed(dataSource8, "gjgimxsdbu", "");
        htmlEmail0.setSocketConnectionTimeout((int) '4');
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = htmlEmail0.embed(uRL14, "us-ascii");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail3.setHtmlMsg("mail.transport.protocol");
        java.lang.String str6 = htmlEmail5.getSubject();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
        htmlEmail0.addHeader("mail.smtp.auth", "rkkshmjarl");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "xbmvzuwasa" + "'", str11, "xbmvzuwasa");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "qqfbjpipab" + "'", str17, "qqfbjpipab");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        htmlEmail5.setSocketConnectionTimeout((int) (byte) 0);
        htmlEmail5.setDebug(true);
        java.lang.String str10 = htmlEmail5.getSmtpPort();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "25" + "'", str10, "25");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        javax.mail.internet.MimeMessage mimeMessage5 = multiPartEmail0.getMimeMessage();
        boolean boolean6 = multiPartEmail0.isStartTLSEnabled();
        boolean boolean7 = multiPartEmail0.isStartTLSRequired();
        multiPartEmail0.setSslSmtpPort("gjgimxsdbu");
        multiPartEmail0.setBoolHasAttachments(false);
        boolean boolean12 = multiPartEmail0.isSSLCheckServerIdentity();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(mimeMessage5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList11 = htmlEmail10.getCcAddresses();
        org.apache.commons.mail.Email email14 = htmlEmail10.addPart("flehnmowzg", "sorkvzscfn");
        htmlEmail10.setSocketConnectionTimeout((int) (short) 100);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(internetAddressList11);
        org.junit.Assert.assertNotNull(email14);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        org.apache.commons.mail.Email email7 = multiPartEmail0.setStartTLSRequired(true);
        org.apache.commons.mail.Email email9 = email7.setStartTLSEnabled(true);
        email7.setDebug(true);
        email7.setAuthentication("ulmurffrom", "mail.smtp.timeout");
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(email9);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        multiPartEmail0.setSocketConnectionTimeout(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = multiPartEmail0.addReplyTo("wjnddzldgb", "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``wjnddzldgb''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
        org.apache.commons.mail.Email email19 = htmlEmail0.setMsg("mail.smtp.connectiontimeout");
        boolean boolean20 = email19.isSSLCheckServerIdentity();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "wjkoasinsu" + "'", str11, "wjkoasinsu");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "qqfbjpipab" + "'", str17, "qqfbjpipab");
        org.junit.Assert.assertNotNull(email19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email2 = htmlEmail0.addTo("pnkmsgcxvu");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``pnkmsgcxvu''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        boolean boolean7 = multiPartEmail6.isSSLOnConnect();
        java.util.Date date8 = multiPartEmail6.getSentDate();
        java.lang.String str10 = multiPartEmail6.getHeader("tuaypqqvdv");
        boolean boolean11 = multiPartEmail6.isBoolHasAttachments();
        org.apache.commons.mail.MultiPartEmail multiPartEmail12 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str13 = multiPartEmail12.getSmtpPort();
        javax.activation.DataSource dataSource14 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail18 = multiPartEmail12.attach(dataSource14, "smtp", "koi8-r", "receiver.email");
        java.lang.String str19 = multiPartEmail18.getBounceAddress();
        org.apache.commons.mail.MultiPartEmail multiPartEmail20 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email22 = multiPartEmail20.setStartTLSRequired(false);
        org.apache.commons.mail.Email email24 = email22.setSSLCheckServerIdentity(false);
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList25 = email22.getBccAddresses();
        multiPartEmail18.setContent((java.lang.Object) internetAddressList25, "sender.email");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email28 = multiPartEmail6.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Sat Jan 20 22:48:26 CET 2024");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "25" + "'", str13, "25");
        org.junit.Assert.assertNotNull(multiPartEmail18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(email22);
        org.junit.Assert.assertNotNull(email24);
        org.junit.Assert.assertNotNull(internetAddressList25);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        org.apache.commons.mail.Email email9 = multiPartEmail0.setMsg("hi!");
        org.apache.commons.mail.Email email11 = multiPartEmail0.setMsg("wjnddzldgb");
        java.lang.String[] strArray17 = new java.lang.String[] { "pnkmsgcxvu", "xyjrcvkbho", "mail.smtp.timeout", "mail.smtp.password", "sender.email" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email18 = multiPartEmail0.addCc(strArray17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``pnkmsgcxvu''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        multiPartEmail0.setContent(mimeMultipart7);
        org.apache.commons.mail.MultiPartEmail multiPartEmail9 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email11 = multiPartEmail9.setStartTLSRequired(false);
        org.apache.commons.mail.Email email13 = email11.setMsg("mail.smtp.port");
        int int14 = email11.getSocketConnectionTimeout();
        org.apache.commons.mail.Email email16 = email11.setSubject("smtp");
        multiPartEmail0.setContent((java.lang.Object) email11, "tbnfonnaom");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email22 = multiPartEmail0.addBcc("fqnggaltbh", "mkyamucxcp", "rjjnrxtynw");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: rjjnrxtynw");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNotNull(email13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60000 + "'", int14 == 60000);
        org.junit.Assert.assertNotNull(email16);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        multiPartEmail0.setSubType("receiver.email");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email5 = multiPartEmail0.setFrom("kyynvwouof", "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``kyynvwouof''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMultipart mimeMultipart4 = null;
        email3.setContent(mimeMultipart4);
        email3.setAuthentication("mail.smtp.starttls.enable", "mail.smtp.socketFactory.class");
        boolean boolean9 = email3.isSSLCheckServerIdentity();
        java.lang.String str10 = email3.getHostName();
        // The following exception was thrown during execution in test generation
        try {
            email3.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        javax.activation.DataSource dataSource6 = null;
        java.lang.String str9 = htmlEmail5.embed(dataSource6, "mail.smtp.socketFactory.port", "mail.smtp.port");
        javax.activation.DataSource dataSource10 = null;
        java.lang.String str12 = htmlEmail5.embed(dataSource10, "mail.smtp.socketFactory.class");
        boolean boolean13 = htmlEmail5.isBoolHasAttachments();
        org.apache.commons.mail.HtmlEmail htmlEmail15 = htmlEmail5.setTextMsg("ixeiouuisj");
        boolean boolean16 = htmlEmail5.isStartTLSRequired();
        org.apache.commons.mail.Email email18 = htmlEmail5.setMsg("sender.name");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mail.smtp.port" + "'", str9, "mail.smtp.port");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "jnmabhoueq" + "'", str12, "jnmabhoueq");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(htmlEmail15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(email18);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        org.apache.commons.mail.Email email6 = simpleEmail0.setMsg("shwuzzbthr");
        simpleEmail0.setSslSmtpPort("mail.smtp.starttls.enable");
        java.lang.String str9 = simpleEmail0.getSubject();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList10 = simpleEmail0.getReplyToAddresses();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(internetAddressList10);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = htmlEmail0.attach(dataSource6, "mail.smtp.socketFactory.class", "qogofcfzkc", "ohornutcco");
        // The following exception was thrown during execution in test generation
        try {
            htmlEmail0.setMailSessionFromJNDI("email.subject");
            org.junit.Assert.fail("Expected exception of type javax.naming.NoInitialContextException; message: Need to specify class name in environment or system property, or in an application resource file: java.naming.factory.initial");
        } catch (javax.naming.NoInitialContextException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(multiPartEmail10);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail10.setTextMsg("sender.email");
        org.apache.commons.mail.Email email14 = htmlEmail12.setMsg("xbmvzuwasa");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email16 = htmlEmail12.setFrom("mail.smtp.socketFactory.fallback");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.socketFactory.fallback''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(htmlEmail12);
        org.junit.Assert.assertNotNull(email14);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        org.apache.commons.mail.MultiPartEmail multiPartEmail8 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str9 = multiPartEmail8.getSmtpPort();
        javax.activation.DataSource dataSource10 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail14 = multiPartEmail8.attach(dataSource10, "smtp", "koi8-r", "receiver.email");
        java.lang.String str15 = multiPartEmail14.getBounceAddress();
        org.apache.commons.mail.MultiPartEmail multiPartEmail16 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email18 = multiPartEmail16.setStartTLSRequired(false);
        java.util.Date date19 = multiPartEmail16.getSentDate();
        multiPartEmail14.setSentDate(date19);
        htmlEmail7.setSentDate(date19);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
        org.junit.Assert.assertNotNull(multiPartEmail14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(email18);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Sat Jan 20 22:48:27 CET 2024");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email29 = multiPartEmail0.addTo("tgjiktqoqq");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``tgjiktqoqq''");
        } catch (org.apache.commons.mail.EmailException e) {
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
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "xyggfxtaga" + "'", str22, "xyggfxtaga");
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        java.lang.String str11 = htmlEmail10.getBounceAddress();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setSocketConnectionTimeout(0);
        org.apache.commons.mail.Email email9 = multiPartEmail0.setSSLCheckServerIdentity(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(email9);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
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
            multiPartEmail15.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
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
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        multiPartEmail0.setSocketTimeout((int) (short) 1);
        org.junit.Assert.assertNotNull(internetAddressList1);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList2 = htmlEmail0.getToAddresses();
        int int3 = htmlEmail0.getSocketTimeout();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(internetAddressList2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setMsg("mail.smtp.password");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        org.apache.commons.mail.HtmlEmail htmlEmail5 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = htmlEmail5.getBccAddresses();
        javax.activation.DataSource dataSource7 = null;
        java.lang.String str10 = htmlEmail5.embed(dataSource7, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail5.setHtmlMsg("mail.smtp.auth");
        java.lang.String str13 = htmlEmail5.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail15 = htmlEmail5.setHtmlMsg("mail.smtp.socketFactory.fallback");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList16 = htmlEmail15.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email17 = multiPartEmail0.setReplyTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNotNull(internetAddressList6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "email.subject" + "'", str10, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(htmlEmail15);
        org.junit.Assert.assertNotNull(internetAddressList16);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
            org.apache.commons.mail.Email email15 = email10.addBcc("dvgkmlqvsy", "xuyualotri", "xyjrcvkbho");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: xyjrcvkbho");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
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
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail0.setHeaders(strMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Map.entrySet()\" because \"map\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = multiPartEmail6.getBccAddresses();
        boolean boolean9 = multiPartEmail6.isSendPartial();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        org.apache.commons.mail.Email email2 = simpleEmail0.setMsg("aksjmhgbrt");
        org.junit.Assert.assertNotNull(email2);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        email2.setSocketConnectionTimeout((int) (byte) 10);
        org.apache.commons.mail.MultiPartEmail multiPartEmail5 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str6 = multiPartEmail5.getSmtpPort();
        org.apache.commons.mail.Email email8 = multiPartEmail5.setSubject("25");
        java.lang.String str9 = multiPartEmail5.getHostName();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList10 = multiPartEmail5.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = email2.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25" + "'", str6, "25");
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(internetAddressList10);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        htmlEmail0.setBoolHasAttachments(false);
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        boolean boolean6 = htmlEmail5.isTLS();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("content.type");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        org.apache.commons.mail.Email email6 = simpleEmail0.setMsg("shwuzzbthr");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email10 = email6.addTo("receiver.email", "rkkshmjarl", "gycaxbrvob");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: gycaxbrvob");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setBoolHasAttachments(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.setStartTLSRequired(false);
        int int6 = multiPartEmail0.getSocketTimeout();
        multiPartEmail0.setSubType("receiver.name");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail12 = multiPartEmail0.attach(uRL9, "lgbgqhtwcg", "fryefwbswo");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.net.URL.openStream()\" because \"url\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
            htmlEmail12.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
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
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        multiPartEmail0.setContent(mimeMultipart7);
        multiPartEmail0.setPopBeforeSmtp(true, "zjkvequhsq", "nuwiavonqt", "fppqoxuufr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSubType();
        javax.mail.internet.InternetAddress internetAddress6 = multiPartEmail0.getFromAddress();
        boolean boolean7 = multiPartEmail0.isTLS();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(internetAddress6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        boolean boolean6 = multiPartEmail0.isBoolHasAttachments();
        org.apache.commons.mail.Email email8 = multiPartEmail0.setSSLOnConnect(true);
        multiPartEmail0.setBoolHasAttachments(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        java.lang.String str2 = multiPartEmail0.getSslSmtpPort();
        boolean boolean3 = multiPartEmail0.isSSLOnConnect();
        boolean boolean4 = multiPartEmail0.isSSLCheckServerIdentity();
        multiPartEmail0.addHeader("fppqoxuufr", "mail.smtp.password");
        multiPartEmail0.setSocketTimeout((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "465" + "'", str2, "465");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        org.apache.commons.mail.Email email10 = multiPartEmail6.addPart("content.type", "smtp");
        multiPartEmail6.setPopBeforeSmtp(true, "25", "email.body", "mail.debug");
        multiPartEmail6.setSmtpPort((int) (byte) 100);
        boolean boolean18 = multiPartEmail6.isSSLCheckServerIdentity();
        multiPartEmail6.setAuthentication("ifguxugtww", "qkghmybdmm");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = htmlEmail0.attach(dataSource6, "mail.smtp.socketFactory.class", "qogofcfzkc", "ohornutcco");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = multiPartEmail10.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email15 = multiPartEmail10.addCc("mail.smtp.timeout", "mail.smtp.socketFactory.port", "ixeiouuisj");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: ixeiouuisj");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(multiPartEmail10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail5.setSSLCheckServerIdentity(true);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = htmlEmail5.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = htmlEmail5.send();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rcwgklrout" + "'", str3, "rcwgklrout");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setSendPartial(true);
        multiPartEmail0.setHostName("receiver.name");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList5 = multiPartEmail0.getReplyToAddresses();
        javax.mail.internet.MimeMultipart mimeMultipart6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = multiPartEmail0.addPart(mimeMultipart6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.Multipart.getContentType()\" because \"mp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(internetAddressList5);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        org.apache.commons.mail.Email email15 = multiPartEmail6.setSendPartial(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Sat Jan 20 22:48:27 CET 2024");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(email15);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        // The following exception was thrown during execution in test generation
        try {
            multiPartEmail6.buildMimeMessage();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNotNull(email12);
        org.junit.Assert.assertNotNull(internetAddressList13);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setStartTLSEnabled(true);
        boolean boolean4 = multiPartEmail0.isStartTLSRequired();
        boolean boolean5 = multiPartEmail0.isSSLCheckServerIdentity();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email7 = multiPartEmail0.addTo("guftschruc");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``guftschruc''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        javax.activation.DataSource dataSource6 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail10 = multiPartEmail0.attach(dataSource6, "mail.transport.protocol", "mail.smtp.socketFactory.class", "mail.smtp.timeout");
        org.apache.commons.mail.Email email13 = multiPartEmail0.addPart("xyjrcvkbho", "zjkvequhsq");
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail15 = multiPartEmail0.attach(file14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(multiPartEmail10);
        org.junit.Assert.assertNotNull(email13);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email30 = email28.setFrom("gycaxbrvob");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``gycaxbrvob''");
        } catch (org.apache.commons.mail.EmailException e) {
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
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dlpsqxnslz" + "'", str20, "dlpsqxnslz");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(email28);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.Email email8 = htmlEmail0.setSSLOnConnect(false);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = htmlEmail0.embed(file9, "receiver.email");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ztyljouiyp" + "'", str3, "ztyljouiyp");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(internetAddressList6);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        org.apache.commons.mail.Email email12 = htmlEmail0.setMsg("ifguxugtww");
        org.apache.commons.mail.HtmlEmail htmlEmail14 = htmlEmail0.setTextMsg("mail.smtp.timeout");
        boolean boolean15 = htmlEmail14.isSSL();
        boolean boolean16 = htmlEmail14.isSSLOnConnect();
        java.io.File file17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = htmlEmail14.embed(file17, "dvgkmlqvsy");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(email12);
        org.junit.Assert.assertNotNull(htmlEmail14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        multiPartEmail0.setSocketConnectionTimeout((int) (byte) 0);
        boolean boolean8 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email10 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.MultiPartEmail multiPartEmail11 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str12 = multiPartEmail11.getSmtpPort();
        javax.activation.DataSource dataSource13 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail17 = multiPartEmail11.attach(dataSource13, "smtp", "koi8-r", "receiver.email");
        java.lang.String str18 = multiPartEmail17.getBounceAddress();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList19 = multiPartEmail17.getBccAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email20 = multiPartEmail0.setReplyTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "25" + "'", str12, "25");
        org.junit.Assert.assertNotNull(multiPartEmail17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(internetAddressList19);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = simpleEmail0.getToAddresses();
        simpleEmail0.setContent((java.lang.Object) (short) -1, "mail.smtp.port");
        boolean boolean5 = simpleEmail0.isSendPartial();
        org.apache.commons.mail.Email email7 = simpleEmail0.setMsg("mail.smtp.timeout");
        boolean boolean8 = email7.isSendPartial();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.Email email10 = htmlEmail0.setMsg("sender.name");
        htmlEmail0.setSubType("jnmabhoueq");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(email10);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email5 = multiPartEmail0.addPart("content.type", "koi8-r");
        org.apache.commons.mail.Email email7 = multiPartEmail0.setStartTLSRequired(true);
        org.apache.commons.mail.Email email9 = email7.setStartTLSEnabled(true);
        email7.setDebug(true);
        boolean boolean12 = email7.isSSLCheckServerIdentity();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(email9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        boolean boolean1 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.MultiPartEmail multiPartEmail2 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email4 = multiPartEmail2.setStartTLSRequired(false);
        java.util.Date date5 = multiPartEmail2.getSentDate();
        multiPartEmail0.setSentDate(date5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sat Jan 20 22:48:27 CET 2024");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        java.lang.String str6 = multiPartEmail0.getSmtpPort();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "25" + "'", str6, "25");
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.timeout");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "vnkltdztcj" + "'", str3, "vnkltdztcj");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(htmlEmail7);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        multiPartEmail0.setSocketConnectionTimeout((int) (byte) 0);
        boolean boolean8 = multiPartEmail0.isSendPartial();
        org.apache.commons.mail.Email email10 = multiPartEmail0.setStartTLSRequired(false);
        java.lang.String str11 = multiPartEmail0.getSubject();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25" + "'", str11, "25");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.mail.Authenticator authenticator2 = null;
        multiPartEmail0.setAuthenticator(authenticator2);
        boolean boolean4 = multiPartEmail0.isStartTLSEnabled();
        org.apache.commons.mail.EmailAttachment emailAttachment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(emailAttachment5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid attachment supplied");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        multiPartEmail0.setContent(mimeMultipart7);
        multiPartEmail0.setTLS(true);
        boolean boolean11 = multiPartEmail0.isBoolHasAttachments();
        java.lang.String[] strArray15 = new java.lang.String[] { "gjgimxsdbu", "smtp", "smtp" };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email16 = multiPartEmail0.addBcc(strArray15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``gjgimxsdbu''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        email4.setSSL(true);
        int int7 = email4.getSocketConnectionTimeout();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = email4.getToAddresses();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNotNull(internetAddressList8);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        javax.activation.DataSource dataSource6 = null;
        java.lang.String str9 = htmlEmail5.embed(dataSource6, "mail.smtp.socketFactory.port", "mail.smtp.port");
        javax.activation.DataSource dataSource10 = null;
        java.lang.String str12 = htmlEmail5.embed(dataSource10, "mail.smtp.socketFactory.class");
        boolean boolean13 = htmlEmail5.isBoolHasAttachments();
        org.apache.commons.mail.HtmlEmail htmlEmail15 = htmlEmail5.setTextMsg("ixeiouuisj");
        boolean boolean16 = htmlEmail5.isStartTLSRequired();
        org.apache.commons.mail.MultiPartEmail multiPartEmail17 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str18 = multiPartEmail17.getSmtpPort();
        org.apache.commons.mail.Email email20 = multiPartEmail17.setSubject("25");
        multiPartEmail17.setSocketTimeout((int) ' ');
        boolean boolean23 = multiPartEmail17.isStartTLSRequired();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = multiPartEmail17.getHeaders();
        // The following exception was thrown during execution in test generation
        try {
            javax.mail.internet.MimeMessage mimeMessage25 = htmlEmail5.thirdMessageCheck((org.apache.commons.mail.Email) multiPartEmail17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.mail.internet.MimeMessage.getSentDate()\" because \"email.message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mail.smtp.port" + "'", str9, "mail.smtp.port");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "yybsdpagfo" + "'", str12, "yybsdpagfo");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(htmlEmail15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "25" + "'", str18, "25");
        org.junit.Assert.assertNotNull(email20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.Email email8 = htmlEmail0.setSSLOnConnect(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email11 = email8.addBcc("mail.smtp.socketFactory.class", "us-ascii");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.socketFactory.class''");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ayljajzswg" + "'", str3, "ayljajzswg");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(internetAddressList6);
        org.junit.Assert.assertNotNull(email8);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        java.lang.String str6 = htmlEmail0.getSubType();
        org.apache.commons.mail.Email email8 = htmlEmail0.setMsg("oyeforvxhc");
        org.apache.commons.mail.HtmlEmail htmlEmail9 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList10 = htmlEmail9.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail9.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail14 = htmlEmail9.setTextMsg("mail.smtp.password");
        email8.setContent((java.lang.Object) htmlEmail9, "tbnfonnaom");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(email8);
        org.junit.Assert.assertNotNull(internetAddressList10);
        org.junit.Assert.assertNotNull(htmlEmail12);
        org.junit.Assert.assertNotNull(htmlEmail14);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("sender.name");
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = htmlEmail0.embed(file8, "mail.smtp.password");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getName()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tfvdbvjwcq" + "'", str3, "tfvdbvjwcq");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = multiPartEmail0.getToAddresses();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setMsg("mail.smtp.password");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = multiPartEmail0.getHeaders();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        javax.mail.internet.MimeMessage mimeMessage4 = multiPartEmail0.getMimeMessage();
        java.lang.String str5 = multiPartEmail0.getBounceAddress();
        boolean boolean6 = multiPartEmail0.isBoolHasAttachments();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail8 = multiPartEmail0.attach(file7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.getAbsolutePath()\" because \"file\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(mimeMessage4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        java.lang.String str1 = simpleEmail0.getSmtpPort();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        multiPartEmail0.setSubType("mail.smtp.connectiontimeout");
        int int7 = multiPartEmail0.getSocketTimeout();
        multiPartEmail0.setTLS(true);
        java.lang.String str10 = multiPartEmail0.getBounceAddress();
        multiPartEmail0.setBoolHasAttachments(true);
        javax.activation.DataSource dataSource13 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail17 = multiPartEmail0.attach(dataSource13, "fqnggaltbh", "xyjrcvkbho", "sender.name");
        boolean boolean18 = multiPartEmail17.isSSL();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60000 + "'", int7 == 60000);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(multiPartEmail17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        javax.activation.DataSource dataSource6 = null;
        java.lang.String str9 = htmlEmail5.embed(dataSource6, "mail.smtp.socketFactory.port", "mail.smtp.port");
        boolean boolean10 = htmlEmail5.isSSL();
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail5.setTextMsg("koi8-r");
        java.lang.String str13 = htmlEmail5.getSubject();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mail.smtp.port" + "'", str9, "mail.smtp.port");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(htmlEmail12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setHtmlMsg("mail.smtp.socketFactory.fallback");
        htmlEmail0.setSslSmtpPort("fryefwbswo");
        java.util.Date date13 = htmlEmail0.getSentDate();
        org.apache.commons.mail.HtmlEmail htmlEmail15 = htmlEmail0.setHtmlMsg("qogofcfzkc");
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Sat Jan 20 22:48:27 CET 2024");
        org.junit.Assert.assertNotNull(htmlEmail15);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("lgbgqhtwcg");
        java.lang.String str6 = htmlEmail5.getHostName();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        java.lang.String str7 = multiPartEmail6.getBounceAddress();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList8 = multiPartEmail6.getBccAddresses();
        org.apache.commons.mail.Email email10 = multiPartEmail6.setMsg("text/plain");
        java.lang.String str11 = multiPartEmail6.getSubject();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(email10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList2 = htmlEmail0.getToAddresses();
        javax.activation.DataSource dataSource3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.MultiPartEmail multiPartEmail6 = htmlEmail0.attach(dataSource3, "oyeforvxhc", "mail.smtp.from");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Invalid Datasource");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(internetAddressList2);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        javax.activation.DataSource dataSource1 = null;
        java.lang.String str3 = htmlEmail0.embed(dataSource1, "receiver.name");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setHtmlMsg("attachments");
        org.apache.commons.mail.Email email7 = htmlEmail0.setMsg("sender.name");
        org.apache.commons.mail.HtmlEmail htmlEmail9 = htmlEmail0.setTextMsg("mqerzxkmcj");
        org.apache.commons.mail.Email email11 = htmlEmail0.setMsg("fryefwbswo");
        org.apache.commons.mail.HtmlEmail htmlEmail13 = htmlEmail0.setHtmlMsg("lhaahuyawf");
        boolean boolean14 = htmlEmail13.isSSLCheckServerIdentity();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mmdtuabhke" + "'", str3, "mmdtuabhke");
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(htmlEmail9);
        org.junit.Assert.assertNotNull(email11);
        org.junit.Assert.assertNotNull(htmlEmail13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        java.lang.String str4 = multiPartEmail0.getHostName();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList5 = multiPartEmail0.getCcAddresses();
        org.apache.commons.mail.Email email7 = multiPartEmail0.setMsg("text/html");
        org.apache.commons.mail.HtmlEmail htmlEmail8 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList9 = htmlEmail8.getBccAddresses();
        javax.activation.DataSource dataSource10 = null;
        java.lang.String str13 = htmlEmail8.embed(dataSource10, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail15 = htmlEmail8.setHtmlMsg("mail.smtp.auth");
        java.lang.String str16 = htmlEmail8.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail18 = htmlEmail8.setHtmlMsg("mail.smtp.socketFactory.fallback");
        htmlEmail8.setSslSmtpPort("fryefwbswo");
        java.util.Date date21 = htmlEmail8.getSentDate();
        email7.setSentDate(date21);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(internetAddressList5);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "email.subject" + "'", str13, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(htmlEmail18);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Sat Jan 20 22:48:28 CET 2024");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        org.apache.commons.mail.Email email4 = email2.setMsg("mail.smtp.port");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email8 = email4.addTo("mail.transport.protocol", "hrywsbpbvi", "mmdtuabhke");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mmdtuabhke");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail3 = htmlEmail0.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail5 = htmlEmail0.setTextMsg("mail.smtp.password");
        javax.activation.DataSource dataSource6 = null;
        java.lang.String str9 = htmlEmail5.embed(dataSource6, "mail.smtp.socketFactory.port", "mail.smtp.port");
        boolean boolean10 = htmlEmail5.isSSL();
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail5.setTextMsg("koi8-r");
        org.apache.commons.mail.Email email14 = htmlEmail12.setMsg("cwuexecnmh");
        javax.activation.DataSource dataSource15 = null;
        java.lang.String str18 = htmlEmail12.embed(dataSource15, "us-ascii", "receiver.name");
        org.apache.commons.mail.Email email20 = htmlEmail12.setStartTLSEnabled(true);
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertNotNull(htmlEmail3);
        org.junit.Assert.assertNotNull(htmlEmail5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mail.smtp.port" + "'", str9, "mail.smtp.port");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(htmlEmail12);
        org.junit.Assert.assertNotNull(email14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "receiver.name" + "'", str18, "receiver.name");
        org.junit.Assert.assertNotNull(email20);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
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
        org.apache.commons.mail.MultiPartEmail multiPartEmail26 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str27 = multiPartEmail26.getSmtpPort();
        javax.activation.DataSource dataSource28 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail32 = multiPartEmail26.attach(dataSource28, "smtp", "koi8-r", "receiver.email");
        boolean boolean33 = multiPartEmail32.isSSLOnConnect();
        java.util.Date date34 = multiPartEmail32.getSentDate();
        email7.setSentDate(date34);
        int int36 = email7.getSocketTimeout();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList37 = email7.getCcAddresses();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email7);
        org.junit.Assert.assertNotNull(internetAddressList8);
        org.junit.Assert.assertNotNull(internetAddressList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "email.subject" + "'", str14, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail16);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "jqovygohbl" + "'", str20, "jqovygohbl");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "25" + "'", str27, "25");
        org.junit.Assert.assertNotNull(multiPartEmail32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Sat Jan 20 22:48:28 CET 2024");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(internetAddressList37);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.mail.HtmlEmail htmlEmail0 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList1 = htmlEmail0.getBccAddresses();
        javax.activation.DataSource dataSource2 = null;
        java.lang.String str5 = htmlEmail0.embed(dataSource2, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail7 = htmlEmail0.setHtmlMsg("mail.smtp.auth");
        java.lang.String str8 = htmlEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = htmlEmail0.setTextMsg("mail.smtp.port");
        org.apache.commons.mail.HtmlEmail htmlEmail12 = htmlEmail0.setHtmlMsg("rtgnrijzld");
        org.apache.commons.mail.HtmlEmail htmlEmail14 = htmlEmail0.setHtmlMsg("mqerzxkmcj");
        javax.mail.internet.MimeMessage mimeMessage15 = htmlEmail0.getMimeMessage();
        org.junit.Assert.assertNotNull(internetAddressList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "email.subject" + "'", str5, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(htmlEmail10);
        org.junit.Assert.assertNotNull(htmlEmail12);
        org.junit.Assert.assertNotNull(htmlEmail14);
        org.junit.Assert.assertNull(mimeMessage15);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        javax.activation.DataSource dataSource2 = null;
        org.apache.commons.mail.MultiPartEmail multiPartEmail6 = multiPartEmail0.attach(dataSource2, "smtp", "koi8-r", "receiver.email");
        javax.mail.internet.MimeMultipart mimeMultipart7 = null;
        multiPartEmail0.setContent(mimeMultipart7);
        java.lang.String str9 = multiPartEmail0.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail10 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList11 = htmlEmail10.getBccAddresses();
        javax.activation.DataSource dataSource12 = null;
        java.lang.String str15 = htmlEmail10.embed(dataSource12, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail17 = htmlEmail10.setHtmlMsg("mail.smtp.auth");
        java.lang.String str18 = htmlEmail10.getSubject();
        javax.activation.DataSource dataSource19 = null;
        java.lang.String str21 = htmlEmail10.embed(dataSource19, "mail.debug");
        htmlEmail10.setAuthentication("mail.smtp.starttls.enable", "465");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = htmlEmail10.getHeaders();
        multiPartEmail0.setHeaders(strMap25);
        org.apache.commons.mail.HtmlEmail htmlEmail27 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList28 = htmlEmail27.getBccAddresses();
        javax.activation.DataSource dataSource29 = null;
        java.lang.String str32 = htmlEmail27.embed(dataSource29, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail34 = htmlEmail27.setHtmlMsg("mail.smtp.auth");
        java.lang.String str35 = htmlEmail27.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail37 = htmlEmail27.setTextMsg("mail.smtp.port");
        multiPartEmail0.setContent((java.lang.Object) "mail.smtp.port", "fjnmntfewn");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(multiPartEmail6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(internetAddressList11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "email.subject" + "'", str15, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail17);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "owlqttpsri" + "'", str21, "owlqttpsri");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(internetAddressList28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "email.subject" + "'", str32, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(htmlEmail37);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        multiPartEmail0.setSocketConnectionTimeout((int) (byte) 0);
        boolean boolean8 = multiPartEmail0.isSendPartial();
        boolean boolean9 = multiPartEmail0.isStartTLSRequired();
        multiPartEmail0.setSslSmtpPort("465");
        java.lang.String str12 = multiPartEmail0.getSmtpPort();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "25" + "'", str12, "25");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        org.apache.commons.mail.Email email2 = multiPartEmail0.setStartTLSRequired(false);
        java.util.Date date3 = multiPartEmail0.getSentDate();
        java.lang.String str4 = multiPartEmail0.getSmtpPort();
        boolean boolean5 = multiPartEmail0.isStartTLSEnabled();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList6 = multiPartEmail0.getCcAddresses();
        java.util.Date date7 = multiPartEmail0.getSentDate();
        org.junit.Assert.assertNotNull(email2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Jan 20 22:48:28 CET 2024");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "25" + "'", str4, "25");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(internetAddressList6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Sat Jan 20 22:48:28 CET 2024");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        java.lang.String str5 = multiPartEmail0.getSubType();
        org.apache.commons.mail.HtmlEmail htmlEmail6 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList7 = htmlEmail6.getBccAddresses();
        javax.activation.DataSource dataSource8 = null;
        java.lang.String str11 = htmlEmail6.embed(dataSource8, "sender.email", "email.subject");
        org.apache.commons.mail.HtmlEmail htmlEmail13 = htmlEmail6.setHtmlMsg("mail.smtp.auth");
        java.lang.String str14 = htmlEmail6.getSubject();
        org.apache.commons.mail.HtmlEmail htmlEmail16 = htmlEmail6.setHtmlMsg("mail.smtp.socketFactory.fallback");
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList17 = htmlEmail16.getCcAddresses();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.mail.Email email18 = multiPartEmail0.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(internetAddressList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "email.subject" + "'", str11, "email.subject");
        org.junit.Assert.assertNotNull(htmlEmail13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(htmlEmail16);
        org.junit.Assert.assertNotNull(internetAddressList17);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setDebug(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25" + "'", str1, "25");
    }
}
