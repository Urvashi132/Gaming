<footer>
	<section class="footer">
	<div class="container pt-4 pb-2">
		<div class="row mb-3">
			<div class="col-lg-3 col-md-6 col-12 text-center text-md-left wow fadeInDown">
				<div class="pr-3">
					<img src="/documents/${themeDisplay.getScopeGroupId()}/0/logo_footer.png" class="img-fluid">
					<ul class="list-unstyled mt-3">
						<li class="line_he_32"><i class="fas fa-envelope-open-text fa-fw text-light">
						</i>info@adjecti.com</li>
						<li class="line_he_32"><i class="fas fa-mobile-alt fa-fw"></i> +91 120 408 9940/455 5964</li>
						<li>
							<#assign preferencesMap = {"displayDepth": "1", "portletSetupPortletDecoratorId": "barebone"} />
							<@liferay.navigation_menu default_preferences=freeMarkerPortletPreferences.getPreferences(preferencesMap) instance_id="social_media"/>
						</li>
					</ul>
				</div>
			</div>

			<div class="col-lg-9">
				<#assign preferencesMap = {"displayDepth": "1", "portletSetupPortletDecoratorId": "barebone"} />
				<@liferay.navigation_menu default_preferences=freeMarkerPortletPreferences.getPreferences(preferencesMap) instance_id="footer_navigation"/>
			</div>
		</div>
		
		
		<div class="copyright wow fadeInUp">
			<div class="mb-2">Copyright © 2022 Adjecti Solutions Private Limited. &nbsp; All rights reserved.</div>
		
			<span id="siteseal">
				<script src="https://seal.godaddy.com/getSeal?sealID=cmsriQJkRmzwu3lPqhGxAmvvksxpI2jfFqEB4QHSWd1cYDVt3IL6gAB4WNWF" type="text/javascript" async=""></script>
				
			</span>
		
			<ul class="list-unstyled d-flex">
				<li><a href="terms-and-conditions.html" target="_blank"><i class="fas fa-gavel fa-fw"></i> Terms of Use</a></li>
				<li><a href="#">&nbsp; | &nbsp;</a></li>
				<li><a href="privacy-policy.html" target="_blank"><i class="fas fa-user-secret fa-fw"></i> Privacy Policy</a></li>
			</ul>
		</div>
	</div>
</section>
</footer>