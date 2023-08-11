<nav class="navbar navbar-expand-lg navbar-light px-0">
	<a class="${logo_css_class} navbar-brand logo-width" href="${site_default_url}" >
		<img src="${site_logo}" alt="${logo_description}" />
	</a>
	
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	
	<div class="collapse navbar-collapse" id="navbarText">
		<ul class="navbar-nav ml-auto">
			<#assign preferencesMap = {"displayDepth": "1", "portletSetupPortletDecoratorId": "barebone"} />
			<@liferay.navigation_menu default_preferences=freeMarkerPortletPreferences.getPreferences(preferencesMap) instance_id="top_navigation"/>
		</ul>
	</div>
</nav>