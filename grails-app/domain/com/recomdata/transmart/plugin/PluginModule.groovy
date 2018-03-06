package com.recomdata.transmart.plugin

class PluginModule {
	Boolean active
	PluginModuleCategory category
	String formLink
	String formPage
	Boolean hasForm
	String moduleName
	String name
	String params
	String version

	static belongsTo = [plugin: Plugin]

	static mapping = {
		table 'SEARCHAPP.PLUGIN_MODULE'
		id column: 'MODULE_SEQ', generator: 'sequence', params: [sequence: 'SEARCHAPP.PLUGIN_MODULE_SEQ']
		version false

		active type: 'yes_no'
		hasForm type: 'yes_no'
		plugin column: 'PLUGIN_SEQ'
		params lazy: true
	}

	static constraints = {
		formLink nullable: true
		formPage nullable: true
		moduleName unique: true
	}
}
