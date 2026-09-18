package y9;
public final class b implements ia.d {
    public static final b f46489a = new Object();
    public static final ia.c f46490b = ia.c.c("pid");
    public static final ia.c f46491c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46492f = ia.c.c("pss");
    public static final ia.c f46493g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46494i = ia.c.c("traceFile");
    public static final ia.c f46495j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46490b, b0Var.f46496a);
        eVar.a(f46491c, b0Var.f46497b);
        eVar.e(d, b0Var.f46498c);
        eVar.e(e, b0Var.d);
        eVar.f(f46492f, b0Var.e);
        eVar.f(f46493g, b0Var.f46499f);
        eVar.f(h, b0Var.f46500g);
        eVar.a(f46494i, b0Var.h);
        eVar.a(f46495j, b0Var.f46501i);
    }
}
