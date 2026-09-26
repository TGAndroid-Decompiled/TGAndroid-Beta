package y9;
public final class b implements ia.d {
    public static final b f46740a = new Object();
    public static final ia.c f46741b = ia.c.c("pid");
    public static final ia.c f46742c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46743f = ia.c.c("pss");
    public static final ia.c f46744g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46745i = ia.c.c("traceFile");
    public static final ia.c f46746j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46741b, b0Var.f46747a);
        eVar.a(f46742c, b0Var.f46748b);
        eVar.e(d, b0Var.f46749c);
        eVar.e(e, b0Var.d);
        eVar.f(f46743f, b0Var.e);
        eVar.f(f46744g, b0Var.f46750f);
        eVar.f(h, b0Var.f46751g);
        eVar.a(f46745i, b0Var.h);
        eVar.a(f46746j, b0Var.f46752i);
    }
}
