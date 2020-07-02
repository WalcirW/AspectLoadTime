import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AccountAspect {

    @Pointcut("execute(* Account.*(..)")
    void accountCalls() {
    }

    @Around("accountCalls")
    void logMethodCalled() {
        System.out.println("Method was called...");
    }

}
