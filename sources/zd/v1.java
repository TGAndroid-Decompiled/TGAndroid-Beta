package zd;
public abstract class v1 {
    public static final ThreadLocal f61896a = new ThreadLocal();

    public static t0 a() {
        ThreadLocal threadLocal = f61896a;
        t0 t0Var = (t0) threadLocal.get();
        if (t0Var == null) {
            i iVar = new i(Thread.currentThread());
            threadLocal.set(iVar);
            return iVar;
        }
        return t0Var;
    }
}
