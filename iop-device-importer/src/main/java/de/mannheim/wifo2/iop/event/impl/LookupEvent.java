package de.mannheim.wifo2.iop.event.impl;

import de.mannheim.wifo2.iop.event.Event;
import de.mannheim.wifo2.iop.event.IEvent;
import de.mannheim.wifo2.iop.event.i.ILookupEvent;
import de.mannheim.wifo2.iop.identifier.IComponentID;
import de.mannheim.wifo2.iop.identifier.IEndpointID;
import de.mannheim.wifo2.iop.plugin.function.matching.IMatchRequest;

public class LookupEvent extends Event 
		implements ILookupEvent  {
	private static final long serialVersionUID = -4508050191072213899L;

	private IEndpointID mTarget;
	private IEndpointID mSource;
	private IMatchRequest mRequest;
	
	public LookupEvent(IComponentID sourceID, 
			Integer id, IEndpointID sourceDevice, IEndpointID targetDevice, 
			IMatchRequest request) {
		super(IEvent.EVENT_LOOKUP, id, sourceID);
		
		mSource = sourceDevice;
		mTarget = targetDevice;
		mRequest = request;
	}
	
	@Override
	public IEndpointID getSourceID()  {
		return mSource;
	}

	@Override
	public IEndpointID getTargetID()  {
		return mTarget;
	}
	
	@Override
	public IMatchRequest getRequest()  {
		return mRequest;
	}
	
	@Override
	public String toString()  {
		StringBuffer sb = new StringBuffer();
		sb.append("Event(");
		sb.append(getType() + ", ");
		sb.append(mSource + ", ");
		sb.append(mTarget + ", ");
		sb.append(mRequest);
		sb.append(")");
		
		return sb.toString();
	}
}
