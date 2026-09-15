package y9;
public final class b implements ia.d {
    public static final b f46461a = new Object();
    public static final ia.c f46462b = ia.c.c("pid");
    public static final ia.c f46463c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46464f = ia.c.c("pss");
    public static final ia.c f46465g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46466i = ia.c.c("traceFile");
    public static final ia.c f46467j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46462b, b0Var.f46468a);
        eVar.a(f46463c, b0Var.f46469b);
        eVar.e(d, b0Var.f46470c);
        eVar.e(e, b0Var.d);
        eVar.f(f46464f, b0Var.e);
        eVar.f(f46465g, b0Var.f46471f);
        eVar.f(h, b0Var.f46472g);
        eVar.a(f46466i, b0Var.h);
        eVar.a(f46467j, b0Var.f46473i);
    }
}
