package y9;
public final class b implements ia.d {
    public static final b f46415a = new Object();
    public static final ia.c f46416b = ia.c.c("pid");
    public static final ia.c f46417c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46418f = ia.c.c("pss");
    public static final ia.c f46419g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46420i = ia.c.c("traceFile");
    public static final ia.c f46421j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46416b, b0Var.f46422a);
        eVar.a(f46417c, b0Var.f46423b);
        eVar.e(d, b0Var.f46424c);
        eVar.e(e, b0Var.d);
        eVar.f(f46418f, b0Var.e);
        eVar.f(f46419g, b0Var.f46425f);
        eVar.f(h, b0Var.f46426g);
        eVar.a(f46420i, b0Var.h);
        eVar.a(f46421j, b0Var.f46427i);
    }
}
