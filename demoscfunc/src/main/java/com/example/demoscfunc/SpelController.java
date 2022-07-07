package com.example.demoscfunc;

import com.example.demoscfunc.pojo.Foo;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @Author minmin
 *
 * 测试
 */
@RestController
public class SpelController {
    //直接获取到用户输入的参数，然后直接通过Spel表达式解析器解析执行。
    //参数代码是创建ProcessBuilder类来生成本地进程
    //http://127.0.0.1:8666/spel?input=new java.lang.ProcessBuilder("/System/Applications/Calculator.app/Contents/MacOS/Calculator").start()
    //也可以采用T() 调用一个类的静态方法，它将返回一个 Class Object，然后再调用相应的方法或属性，也是可以实现相同的功能。
    @RequestMapping("/spel")
    @ResponseBody
    public String spel(String input){
        Foo foo= new Foo();
        StandardEvaluationContext context = new StandardEvaluationContext(foo);
        context.setVariable("foo",foo);
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression(input);
        return Objects.requireNonNull(expression.getValue(context)).toString();
    }

}
