package y9;
public final class b implements ia.d {
    public static final b f46763a = new Object();
    public static final ia.c f46764b = ia.c.c("pid");
    public static final ia.c f46765c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46766f = ia.c.c("pss");
    public static final ia.c f46767g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46768i = ia.c.c("traceFile");
    public static final ia.c f46769j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46764b, b0Var.f46770a);
        eVar.a(f46765c, b0Var.f46771b);
        eVar.e(d, b0Var.f46772c);
        eVar.e(e, b0Var.d);
        eVar.f(f46766f, b0Var.e);
        eVar.f(f46767g, b0Var.f46773f);
        eVar.f(h, b0Var.f46774g);
        eVar.a(f46768i, b0Var.h);
        eVar.a(f46769j, b0Var.f46775i);
    }
}
