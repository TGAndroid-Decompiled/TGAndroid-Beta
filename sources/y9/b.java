package y9;
public final class b implements ia.d {
    public static final b f46741a = new Object();
    public static final ia.c f46742b = ia.c.c("pid");
    public static final ia.c f46743c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46744f = ia.c.c("pss");
    public static final ia.c f46745g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46746i = ia.c.c("traceFile");
    public static final ia.c f46747j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46742b, b0Var.f46748a);
        eVar.a(f46743c, b0Var.f46749b);
        eVar.e(d, b0Var.f46750c);
        eVar.e(e, b0Var.d);
        eVar.f(f46744f, b0Var.e);
        eVar.f(f46745g, b0Var.f46751f);
        eVar.f(h, b0Var.f46752g);
        eVar.a(f46746i, b0Var.h);
        eVar.a(f46747j, b0Var.f46753i);
    }
}
