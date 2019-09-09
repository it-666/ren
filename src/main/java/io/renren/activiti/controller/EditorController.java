package io.renren.activiti.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @author     ：邬志斌（www.wzbjsz.cn)
 * @date       ：Created in 2019 06 15
 */
@Controller
@Api(description = "在线绘制流程", produces = "application/json", consumes = "application/json")
@RequestMapping("/process")
@RequiresAuthentication
public class EditorController {

    @RequestMapping(path = "/editor/{modelId}", method = RequestMethod.GET)
    @ApiOperation(value = "跳转在线绘制")
    public String editor(@PathVariable("modelId") String modelId)
    {
        return "modeler";
    }
}
