package y9;
public final class b implements ia.d {
    public static final b f52095a = new Object();
    public static final ia.c f52096b = ia.c.c("pid");
    public static final ia.c f52097c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c f52098e = ia.c.c("importance");
    public static final ia.c f52099f = ia.c.c("pss");
    public static final ia.c f52100g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f52101i = ia.c.c("traceFile");
    public static final ia.c f52102j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f52096b, b0Var.f52103a);
        eVar.a(f52097c, b0Var.f52104b);
        eVar.e(d, b0Var.f52105c);
        eVar.e(f52098e, b0Var.d);
        eVar.f(f52099f, b0Var.f52106e);
        eVar.f(f52100g, b0Var.f52107f);
        eVar.f(h, b0Var.f52108g);
        eVar.a(f52101i, b0Var.h);
        eVar.a(f52102j, b0Var.f52109i);
    }
}
