package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping
	public String hello() {
		return "<div align="center">
  <a href="https://github.com/victorsa-meli">
  <img height="180em" src="https://github-readme-stats.vercel.app/api?username=victorsa-meli&theme=dracula&show_icons=true&include_all_commits=true&count_private=true"/>
  <img height="180em" src="https://github-readme-stats.vercel.app/api/top-langs/?username=victorsa-meli&theme=dracula&layout=compact&langs_count=7"/>
</div>
<div style="display: inline_block"><br>
  <img align="center" alt="Js" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-plain.svg">
  <img align="center" alt="Ts" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/typescript/typescript-plain.svg">
  <img align="center" alt="Victor Sa React" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/react/react-original.svg">
  <img align="center" alt="HTML" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/html5/html5-original.svg">
  <img align="center" alt="CSS" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/css3/css3-original.svg">
  <img align="center" alt="Python" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/python/python-original.svg">
  <img align="center" alt="Csharp" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/csharp/csharp-original.svg">
  <img align="right" alt="pic" height="400" style="border-radius:50px;" src="https://media.discordapp.net/attachments/1027702778417660026/1027703351527342151/584e837f6a5ae41a83ddee3b.png?width=420&height=605">
</div>";
	}
}
