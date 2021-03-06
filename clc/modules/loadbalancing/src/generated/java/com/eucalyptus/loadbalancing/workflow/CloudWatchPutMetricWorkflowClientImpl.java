/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.eucalyptus.loadbalancing.workflow;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientBase;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

class CloudWatchPutMetricWorkflowClientImpl extends WorkflowClientBase implements CloudWatchPutMetricWorkflowClient {

    public CloudWatchPutMetricWorkflowClientImpl(WorkflowExecution workflowExecution, WorkflowType workflowType,  
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClient genericClient) {
        super(workflowExecution, workflowType, options, dataConverter, genericClient);
    }
    
    @Override
    public final Promise<Void> putCloudWatchMetric(String accountId, String loadbalancer) { 
        return putCloudWatchMetric(Promise.asPromise(accountId), Promise.asPromise(loadbalancer), (StartWorkflowOptions)null);
    }
    
    @Override
    public final Promise<Void> putCloudWatchMetric(String accountId, String loadbalancer, Promise<?>... waitFor) {
        return putCloudWatchMetric(Promise.asPromise(accountId), Promise.asPromise(loadbalancer), (StartWorkflowOptions)null, waitFor);
    }
    
    
    @Override
    
    public final Promise<Void> putCloudWatchMetric(String accountId, String loadbalancer, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        return putCloudWatchMetric(Promise.asPromise(accountId), Promise.asPromise(loadbalancer), optionsOverride, waitFor);
    }

    @Override
    public final Promise<Void> putCloudWatchMetric(Promise<String> accountId, Promise<String> loadbalancer) {
        return putCloudWatchMetric(accountId, loadbalancer, (StartWorkflowOptions)null);
    }

    @Override
    public final Promise<Void> putCloudWatchMetric(Promise<String> accountId, Promise<String> loadbalancer, Promise<?>... waitFor) {
        return putCloudWatchMetric(accountId, loadbalancer, (StartWorkflowOptions)null, waitFor);
    }

    @Override
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public final Promise<Void> putCloudWatchMetric(Promise<String> accountId, Promise<String> loadbalancer, StartWorkflowOptions optionsOverride, Promise<?>... waitFor) {
        Promise[] _input_ = new Promise[2];
        _input_[0] = accountId;
        _input_[1] = loadbalancer;
        return (Promise) startWorkflowExecution(_input_, optionsOverride, Void.class, waitFor);
    }
    	

}