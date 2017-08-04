/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.eucalyptus.portal.workflow;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternalBase;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClientExternal;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

class ResourceUsageEventWorkflowClientExternalImpl extends WorkflowClientExternalBase implements ResourceUsageEventWorkflowClientExternal {

    public ResourceUsageEventWorkflowClientExternalImpl(WorkflowExecution workflowExecution, WorkflowType workflowType, 
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClientExternal genericClient) {
        super(workflowExecution, workflowType, options, dataConverter, genericClient);
    }

    @Override
    public void fireEvents() { 
        fireEvents(null);
    }

    @Override
    public void fireEvents(StartWorkflowOptions startOptionsOverride) {
    
        Object[] _arguments_ = new Object[0]; 
        dynamicWorkflowClient.startWorkflowExecution(_arguments_, startOptionsOverride);
    }


    @Override
    public com.eucalyptus.portal.workflow.BillingWorkflowState getState()  {
        com.eucalyptus.portal.workflow.BillingWorkflowState _state_ = null;
        try {
            _state_ = dynamicWorkflowClient.getWorkflowExecutionState(com.eucalyptus.portal.workflow.BillingWorkflowState.class);
        } catch (Throwable _failure_) {
            if (_failure_ instanceof RuntimeException) {
                throw (RuntimeException) _failure_;
            } else if (_failure_ instanceof Error) {
                throw (Error) _failure_;
            } else {
                throw new RuntimeException("Unknown exception.", _failure_);
            }
        }

        return _state_;
    }
}