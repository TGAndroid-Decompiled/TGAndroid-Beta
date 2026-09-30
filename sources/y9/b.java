package y9;
public final class b implements ia.d {
    public static final b f46742a = new Object();
    public static final ia.c f46743b = ia.c.c("pid");
    public static final ia.c f46744c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46745f = ia.c.c("pss");
    public static final ia.c f46746g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46747i = ia.c.c("traceFile");
    public static final ia.c f46748j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46743b, b0Var.f46749a);
        eVar.a(f46744c, b0Var.f46750b);
        eVar.e(d, b0Var.f46751c);
        eVar.e(e, b0Var.d);
        eVar.f(f46745f, b0Var.e);
        eVar.f(f46746g, b0Var.f46752f);
        eVar.f(h, b0Var.f46753g);
        eVar.a(f46747i, b0Var.h);
        eVar.a(f46748j, b0Var.f46754i);
    }
}
