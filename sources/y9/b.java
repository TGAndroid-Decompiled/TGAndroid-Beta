package y9;
public final class b implements ia.d {
    public static final b f46611a = new Object();
    public static final ia.c f46612b = ia.c.c("pid");
    public static final ia.c f46613c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46614f = ia.c.c("pss");
    public static final ia.c f46615g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46616i = ia.c.c("traceFile");
    public static final ia.c f46617j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46612b, b0Var.f46618a);
        eVar.a(f46613c, b0Var.f46619b);
        eVar.e(d, b0Var.f46620c);
        eVar.e(e, b0Var.d);
        eVar.f(f46614f, b0Var.e);
        eVar.f(f46615g, b0Var.f46621f);
        eVar.f(h, b0Var.f46622g);
        eVar.a(f46616i, b0Var.h);
        eVar.a(f46617j, b0Var.f46623i);
    }
}
