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

package org.apache.commons.mail.benchmarks;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

import java.util.concurrent.TimeUnit;

public class EmailBenchmark {

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Measurement(iterations = 10)
    @Warmup(iterations = 10, time = 1,   timeUnit = TimeUnit.SECONDS)
    @Threads(100)
    public void createAndConfigureEmail() throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.libero.it");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("esamedidario@libero.it", "Ciao1234."));
        email.setSSLOnConnect(true);
        email.setFrom("esamedidario@libero.it");
        email.setSubject("Testing the email");
        email.setMsg("Hello professor Di Nucci, you're my superstar");
        email.addTo("vivabrs@gmail.com");
        email.setDebug(true);
        email.send();
    }

    public static void main(String[] args) throws RunnerException, EmailException {
        Options opt = new OptionsBuilder()
                .include(EmailBenchmark.class.getSimpleName())
                .forks(3)
                .threads(100)
                .build();

        new Runner(opt).run();
    }


}