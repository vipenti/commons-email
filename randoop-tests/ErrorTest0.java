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
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        multiPartEmail0.setSubType("mail.transport.protocol");
        org.apache.commons.mail.MultiPartEmail multiPartEmail4 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str5 = multiPartEmail4.getSmtpPort();
        multiPartEmail4.setAuthentication("mail.smtp.socketFactory.fallback", "receiver.email");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.mail.internet.MimeMessage mimeMessage9 = multiPartEmail0.thirdMessageCheck((org.apache.commons.mail.Email) multiPartEmail4);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.commons.mail.MultiPartEmail multiPartEmail0 = new org.apache.commons.mail.MultiPartEmail();
        java.lang.String str1 = multiPartEmail0.getSmtpPort();
        org.apache.commons.mail.Email email3 = multiPartEmail0.setSubject("25");
        multiPartEmail0.setSubType("mail.smtp.auth");
        org.apache.commons.mail.HtmlEmail htmlEmail6 = new org.apache.commons.mail.HtmlEmail();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList7 = htmlEmail6.getBccAddresses();
        org.apache.commons.mail.HtmlEmail htmlEmail9 = htmlEmail6.setTextMsg("iso-8859-1");
        org.apache.commons.mail.HtmlEmail htmlEmail11 = htmlEmail6.setTextMsg("lgbgqhtwcg");
        htmlEmail11.setSocketConnectionTimeout((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        javax.mail.internet.MimeMessage mimeMessage14 = multiPartEmail0.thirdMessageCheck((org.apache.commons.mail.Email) htmlEmail11);
    }
}

