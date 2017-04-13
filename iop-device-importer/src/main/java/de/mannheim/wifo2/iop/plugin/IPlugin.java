package de.mannheim.wifo2.iop.plugin;

import de.mannheim.wifo2.iop.identifier.IPluginID;
import de.mannheim.wifo2.iop.util.i.IStart;
import de.mannheim.wifo2.iop.util.i.IStop;

public interface IPlugin extends IStart, IStop {
	public IPluginID getID();
}
