package y9;
public final class b implements ia.d {
    public static final b f46729a = new Object();
    public static final ia.c f46730b = ia.c.c("pid");
    public static final ia.c f46731c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46732f = ia.c.c("pss");
    public static final ia.c f46733g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46734i = ia.c.c("traceFile");
    public static final ia.c f46735j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46730b, b0Var.f46736a);
        eVar.a(f46731c, b0Var.f46737b);
        eVar.e(d, b0Var.f46738c);
        eVar.e(e, b0Var.d);
        eVar.f(f46732f, b0Var.e);
        eVar.f(f46733g, b0Var.f46739f);
        eVar.f(h, b0Var.f46740g);
        eVar.a(f46734i, b0Var.h);
        eVar.a(f46735j, b0Var.f46741i);
    }
}
