package FreeMarker template error (DEBUG mode; use RETHROW in production!):
The following has evaluated to null or missing:
==> basePackage  [in template "src/main/java//client/UserClientFallbackFactory.java" at line 1, column 11]

----
Tip: If the failing expression is known to be legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${basePackage}  [in template "src/main/java//client/UserClientFallbackFactory.java" at line 1, column 9]
----

Java stack trace (for programmers):
----
freemarker.core.InvalidReferenceException: [... Exception message was already printed; see it above ...]
	at freemarker.core.InvalidReferenceException.getInstance(InvalidReferenceException.java:134)
	at freemarker.core.EvalUtil.coerceModelToTextualCommon(EvalUtil.java:451)
	at freemarker.core.EvalUtil.coerceModelToStringOrMarkup(EvalUtil.java:374)
	at freemarker.core.DollarVariable.calculateInterpolatedStringOrMarkup(DollarVariable.java:96)
	at freemarker.core.DollarVariable.accept(DollarVariable.java:59)
	at freemarker.core.Environment.visit(Environment.java:327)
	at freemarker.core.Environment.visit(Environment.java:333)
	at freemarker.core.Environment.process(Environment.java:306)
	at freemarker.template.Template.process(Template.java:386)
	at com.ctg.itrdc.devops.codegen.util.FreemarkUtils.stringTemplateProcess(FreemarkUtils.java:166)
	at com.ctg.itrdc.devops.codegen.impl.CodeGenServiceImpl.generateServiceFromTemplate(CodeGenServiceImpl.java:122)
	at com.ctg.itrdc.devops.scheduler.service.impl.CodeGenServiceImpl.genServiceCode(CodeGenServiceImpl.java:24)
	at com.ctg.itrdc.devops.scheduler.task.impl.GitHubServiceCreateTask.dealwithServiceBranch(GitHubServiceCreateTask.java:94)
	at com.ctg.itrdc.devops.scheduler.task.impl.GitHubServiceCreateTask.doInExecute(GitHubServiceCreateTask.java:87)
	at com.ctg.itrdc.devops.scheduler.task.impl.BaseTask.execute(BaseTask.java:106)
	at com.ctg.itrdc.devops.scheduler.task.impl.BaseTask.call(BaseTask.java:127)
	at com.ctg.itrdc.devops.scheduler.task.impl.BaseTask.call(BaseTask.java:28)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
