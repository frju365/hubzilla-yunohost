[b]Project Code To-Do List[/b]

We need much more than this, but here are areas where developers can help. Please edit this page when items are finished. Another place for developers to start is with the issues list.

[li]Documentation - see Red Documentation Project To-Do List[/li]
[li]Include TOS link in registration/verification email[/li]
[li](done) forum widget with unread counts (requires the DB schema changes from v3/hubzilla to be viable)[/li]
[li]Create bug tracker module[/li]
[li]translation plugins - moses or apertium[/li]
[li]plugins - provide 'disable' which is softer than 'uninstall' for those plugins which create additional DB tables[/li]
[li]Infinite scroll improvements (i.e. embedded page links) see http://scrollsample.appspot.com/items [/li]
[li]Finish the anti-spam bayesian engine[/li]
[li]implement an email permission denied bounce message from the sys channel[/li]
[li]provide a way for xchans with a certain network type to upgrade (unknown to rss, rss to statusnet, friendica-over-diaspora to friendica, for instance) based on new knowledge and/or redmatrix ability[/li]
[li](done - HZ) If DAV folders exist, add an option to the Settings page to set a default folder for attachment uploads.[/li] 
[li]Integrate the &quot;open site&quot; list with the register page[/li]
[li]implement oembed provider interface[/li]
[li]refactor the oembed client interface so that we can safely sandbox remote content[/li]
[li]Many modern social apps now have both a profile photo and a "cover photo". Add support for this. [/li]
[li]Write more webpage layouts[/li]
[li]Write more webpage widgets[/li]
[li]restricted access OAuth clients[/li]
[li](Advanced) create a UI for building Comanche pages[/li]
[li](less advanced) create a way to preview Comanche results on a preview page while editing on another page[/li]
[li](done - HZ) Extend WebDAV to provide desktop access to photo albums[/li]
[li]External post connectors - create standard interface[/li]
[li]External post connectors, add popular services[/li]
[li](in progress Habeas Codice) service classes - provide a pluggable subscription payment gateway for premium accounts[/li]
[li](in progress Habeas Codice) service classes - account overview page showing resources consumed by channel. With special consideration this page can also be accessed at a meta level by the site admin to drill down on problematic accounts/channels.[/li]
[li]Events module - fix permissions on events, and provide JS translation support for the calendar overview (done); integrate with calDAV[/li]
[li]Uploads - integrate #^[url=https://github.com/blueimp/jQuery-File-Upload]https://github.com/blueimp/jQuery-File-Upload[/url][/li]
[li]Import/export - include events, things, etc.[/li]
[li]API extensions, for Twitter API - search, friending, threading. For Red API, lots of stuff[/li]
[li]OAuth permission extensions[/li]
[li]Import channel from Diaspora/Friendica (Diaspora partially done)[/li]
[li]MediaGoblin photo "crosspost" connector[/li]
[li]Create management page/UI for extensible profile fields[/li]
[li]Create interface to include/exclude and re-order standard profile fields[/li]
[li]Provide a mechanism to share page design elements in posts (just like apps) (done)[/li]
[li]App taxonomy[/li]
[li]Customisable App collection pages[/li]
[li]replace the tinymce visual editor and/or make the visual editor pluggable and responsive to different output formats. We probably want library/bbedit for bbcode. This needs a fair bit of work to catch up with our &quot;enhanced bbcode&quot;, but start with images, links, bold and highlight and work from there.[/li]
[li]Photos module - turn photos into normal conversations and fix tagging[/li]
[li]Create mobile clients for the top platforms - which involves extending the API so that we can do stuff far beyond the current crop of Twitter/Statusnet clients. Ditto for mobile themes. We can probably use something like the Friendica Android app as a base to start from.[/li]
[li](in progress Habeas Codice) Implement owned and exchangeable &quot;things&quot;.[/li]
[li]Family Account creation - using service classes (an account holder can create a certain number of sub-accounts which are all tied to their subscription - if the subscription lapses they all go away).[/li]
[li]Put mod_admin under Comanche[/li]

In many cases some of the work has already been started and code exists so that you needn't start from scratch. Please contact one of the developer channels like Channel One (one@zothub.com) before embarking and we can tell you what we already have and provide some insights on how we envision these features fitting together.

Return to the [url=[baseurl]/help/main]Main documentation page[/url]