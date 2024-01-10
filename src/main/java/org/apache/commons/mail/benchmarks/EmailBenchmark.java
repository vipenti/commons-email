package org.apache.commons.mail.benchmarks;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.openjdk.jmh.annotations.Benchmark;

public class EmailBenchmark {

    //SimpleEmail email = new SimpleEmail();

    @Benchmark
//    @BenchmarkMode(Mode.)
    public void ciao() {

    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(EmailBenchmark.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }

}
