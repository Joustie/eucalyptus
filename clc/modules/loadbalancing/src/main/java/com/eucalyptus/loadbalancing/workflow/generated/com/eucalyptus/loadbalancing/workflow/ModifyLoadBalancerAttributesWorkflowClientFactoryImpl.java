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
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientFactoryBase;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClient;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

public class ModifyLoadBalancerAttributesWorkflowClientFactoryImpl extends WorkflowClientFactoryBase<ModifyLoadBalancerAttributesWorkflowClient> implements ModifyLoadBalancerAttributesWorkflowClientFactory {
    
    public ModifyLoadBalancerAttributesWorkflowClientFactoryImpl() {
        this(null, null, null);
    }

    public ModifyLoadBalancerAttributesWorkflowClientFactoryImpl(StartWorkflowOptions startWorkflowOptions) {
        this(startWorkflowOptions, null, null);
    }

    public ModifyLoadBalancerAttributesWorkflowClientFactoryImpl(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter) {
        this(startWorkflowOptions, dataConverter, null);
    }

    public ModifyLoadBalancerAttributesWorkflowClientFactoryImpl(StartWorkflowOptions startWorkflowOptions, DataConverter dataConverter,
            GenericWorkflowClient genericClient) {
        super(startWorkflowOptions, new com.amazonaws.services.simpleworkflow.flow.JsonDataConverter(), genericClient);
    }
    
    @Override
    protected ModifyLoadBalancerAttributesWorkflowClient createClientInstance(WorkflowExecution execution,
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClient genericClient) {
        WorkflowType workflowType = new WorkflowType();
        workflowType.setName("ModifyLoadBalancerAttributes");
        workflowType.setVersion("1.0");
        return new ModifyLoadBalancerAttributesWorkflowClientImpl(execution, workflowType, options, dataConverter, genericClient);
    }
   
}