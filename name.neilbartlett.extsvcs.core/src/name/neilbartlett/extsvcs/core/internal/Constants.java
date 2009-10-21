package name.neilbartlett.extsvcs.core.internal;

public class Constants {
	public static final String PLUGIN_ID = "name.neilbartlett.extsvcs.core";
	public static final String EXT_INJECTED_FACTORIES = "injectedFactories";

	static final String ATTR_FACTORY_ID = "id";
	static final String ATTR_FACTORY_CLASS = "class";
	
	static final String ELEM_REFERENCE = "reference";
	static final String ATTR_REFERENCE_NAME = "name";
	static final String ATTR_REFERENCE_INTERFACE = "interface";
	static final String ATTR_REFERENCE_FILTER = "filter";
	static final String ATTR_REFERENCE_CARDINALITY = "cardinality";
	static final String ATTR_REFERENCE_BIND = "bind";
	static final String ATTR_REFERENCE_UNBIND = "unbind";
	
	static final String VAL_REFERENCE_CARDINALITY_SINGLE = "single";
	static final String VAL_REFERENCE_CARDINALITY_MULTIPLE = "multiple";
}
