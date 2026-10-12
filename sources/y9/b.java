package y9;
public final class b implements ia.d {
    public static final b f52103a = new Object();
    public static final ia.c f52104b = ia.c.c("pid");
    public static final ia.c f52105c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c f52106e = ia.c.c("importance");
    public static final ia.c f52107f = ia.c.c("pss");
    public static final ia.c f52108g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f52109i = ia.c.c("traceFile");
    public static final ia.c f52110j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f52104b, b0Var.f52111a);
        eVar.a(f52105c, b0Var.f52112b);
        eVar.e(d, b0Var.f52113c);
        eVar.e(f52106e, b0Var.d);
        eVar.f(f52107f, b0Var.f52114e);
        eVar.f(f52108g, b0Var.f52115f);
        eVar.f(h, b0Var.f52116g);
        eVar.a(f52109i, b0Var.h);
        eVar.a(f52110j, b0Var.f52117i);
    }
}
