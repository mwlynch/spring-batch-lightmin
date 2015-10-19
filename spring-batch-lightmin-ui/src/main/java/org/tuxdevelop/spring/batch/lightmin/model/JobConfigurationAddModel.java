package org.tuxdevelop.spring.batch.lightmin.model;

import lombok.Data;
import org.tuxdevelop.spring.batch.lightmin.admin.domain.JobIncrementer;
import org.tuxdevelop.spring.batch.lightmin.admin.domain.JobSchedulerType;
import org.tuxdevelop.spring.batch.lightmin.admin.domain.SchedulerStatus;
import org.tuxdevelop.spring.batch.lightmin.admin.domain.TaskExecutorType;

/**
 * @author Marcel Becker
 * @since 0.1
 */
@Data
public class JobConfigurationAddModel {

	private Long jobConfigurationId;
	private String jobName;
	private JobSchedulerType jobSchedulerType;
	private String cronExpression;
	private Long fixedDelay;
	private Long initialDelay;
	private TaskExecutorType taskExecutorType;
	private String jobParameters;
	private SchedulerStatus schedulerStatus;
	private JobIncrementer jobIncrementer;
}
