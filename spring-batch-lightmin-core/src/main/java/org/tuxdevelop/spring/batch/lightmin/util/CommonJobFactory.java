package org.tuxdevelop.spring.batch.lightmin.util;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.JobFactory;

/**
 * @author Marcel Becker
 * @since 0.1
 * <p>
 * Implementation of the {@link org.springframework.batch.core.configuration.JobFactory}
 * to handle the registration of {@link org.springframework.batch.core.Job} instances within the application
 * context
 * </p>
 */
public class CommonJobFactory implements JobFactory {

    private final Job job;
    private final String jobName;

    /**
     * @param job     {@link org.springframework.batch.core.Job} to register
     * @param jobName name of the job to register
     */
    public CommonJobFactory(final Job job, final String jobName) {
        this.job = job;
        this.jobName = jobName;
    }

    @Override
    public Job createJob() {
        return job;
    }

    @Override
    public String getJobName() {
        return jobName;
    }
}
