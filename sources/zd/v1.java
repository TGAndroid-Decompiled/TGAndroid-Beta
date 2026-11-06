package zd;
public abstract class v1 {
    public static final ThreadLocal f59999a = new ThreadLocal();

    public static t0 a() {
        ThreadLocal threadLocal = f59999a;
        t0 t0Var = (t0) threadLocal.get();
        if (t0Var == null) {
            i iVar = new i(Thread.currentThread());
            threadLocal.set(iVar);
            return iVar;
        }
        return t0Var;
    }
}
