package com.example.mydtapp;

import com.datatorrent.api.Context.OperatorContext;
import com.datatorrent.common.util.BaseOperator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.datatorrent.api.DefaultInputPort;
import com.datatorrent.api.DefaultOutputPort;
public class CustomOperatorImpl extends BaseOperator 
{
	private static final Logger LOG = LoggerFactory.getLogger(CustomOperatorImpl.class);
	protected String row =new String();
	public final transient DefaultInputPort<Object> input = new DefaultInputPort<Object>()
			  {
		@Override
	    public void process(Object row)
	    {
			    output.emit(row.toString()+"Test");
	    }
	};

public final transient DefaultOutputPort<String> output = new DefaultOutputPort<>();

@Override
public void setup(OperatorContext context) {
	// TODO Auto-generated method stub
	super.setup(context);
}

@Override
public void beginWindow(long windowId) {
	// TODO Auto-generated method stub
	super.beginWindow(windowId);
}

@Override
public void endWindow() {
	// TODO Auto-generated method stub
	super.endWindow();
}

@Override
public void teardown() {
	// TODO Auto-generated method stub
	super.teardown();
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}


}
