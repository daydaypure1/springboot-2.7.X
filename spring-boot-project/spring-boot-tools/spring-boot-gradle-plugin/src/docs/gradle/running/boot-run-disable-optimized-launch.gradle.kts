import org.springframework.boot.gradle.tasks.run.BootRun

plugins {
	java
	id("org.springframework.boot") version "{gradle-project-version}"
}

// tag::launch[]
tasks.named<BootRun>("bootRun") {
	optimizedLaunch.set(false)
}
// end::launch[]

tasks.register("optimizedLaunch") {
	doLast {
		println(tasks.getByName<BootRun>("bootRun").optimizedLaunch.get())
	}
}
