<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${html_title}</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
        <@liferay.js file_name = "${javascript_folder}/jquery-2.1.1.js" />
		<@liferay.css file_name="${css_folder}/custom/bootstrap.min.css" />
		<@liferay.css file_name="${css_folder}/custom/font-awesome.min.css" />
		<@liferay.css file_name="${css_folder}/custom/jquery.bxslider.min.css" />
        <@liferay.css file_name="${css_folder}/custom/animate.css" />
        <@liferay.css file_name="${css_folder}/custom/stylesheet.css" />

		
		<@liferay.js file_name = "${javascript_folder}/bootstrap.min.js" />
		<@liferay.js file_name = "${javascript_folder}/jquery.bxslider.min.js" />
        <@liferay.js file_name = "${javascript_folder}/wow.min.js" />
		<@liferay.js file_name = "${javascript_folder}/font_awesome_new.js" />
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />

<div class="container-fluid position-relative main-wrapper" id="wrapper">
	<header id="banner" role="banner">
	
		
		
		
		<div id="custom-control-menu" class="col col-md-12">
			<#include "${full_templates_path}/navMenu.ftl" />
		</div>
	</header>

	<section id="content">
		<h2 class="hide-accessible sr-only" role="heading" aria-level="1">${the_title}</h2>

		<#if selectable>
			<@liferay_util["include"] page=content_include />
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			<@liferay_theme["wrap-portlet"] page="portlet.ftl">
				<@liferay_util["include"] page=content_include />
			</@>
		</#if>
	</section>

	<footer id="footer" role="contentinfo">
		<#include "${full_templates_path}/footer.ftl" />
	</footer>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

</body>

</html>