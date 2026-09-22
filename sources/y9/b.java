package y9;
public final class b implements ia.d {
    public static final b f46457a = new Object();
    public static final ia.c f46458b = ia.c.c("pid");
    public static final ia.c f46459c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46460f = ia.c.c("pss");
    public static final ia.c f46461g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46462i = ia.c.c("traceFile");
    public static final ia.c f46463j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46458b, b0Var.f46464a);
        eVar.a(f46459c, b0Var.f46465b);
        eVar.e(d, b0Var.f46466c);
        eVar.e(e, b0Var.d);
        eVar.f(f46460f, b0Var.e);
        eVar.f(f46461g, b0Var.f46467f);
        eVar.f(h, b0Var.f46468g);
        eVar.a(f46462i, b0Var.h);
        eVar.a(f46463j, b0Var.f46469i);
    }
}
