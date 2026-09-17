package y9;
public final class b implements ia.d {
    public static final b f46484a = new Object();
    public static final ia.c f46485b = ia.c.c("pid");
    public static final ia.c f46486c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46487f = ia.c.c("pss");
    public static final ia.c f46488g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46489i = ia.c.c("traceFile");
    public static final ia.c f46490j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46485b, b0Var.f46491a);
        eVar.a(f46486c, b0Var.f46492b);
        eVar.e(d, b0Var.f46493c);
        eVar.e(e, b0Var.d);
        eVar.f(f46487f, b0Var.e);
        eVar.f(f46488g, b0Var.f46494f);
        eVar.f(h, b0Var.f46495g);
        eVar.a(f46489i, b0Var.h);
        eVar.a(f46490j, b0Var.f46496i);
    }
}
