package y9;
public final class b implements ia.d {
    public static final b f49723a = new Object();
    public static final ia.c f49724b = ia.c.c("pid");
    public static final ia.c f49725c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c f49726e = ia.c.c("importance");
    public static final ia.c f49727f = ia.c.c("pss");
    public static final ia.c f49728g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f49729i = ia.c.c("traceFile");
    public static final ia.c f49730j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f49724b, b0Var.f49731a);
        eVar.a(f49725c, b0Var.f49732b);
        eVar.e(d, b0Var.f49733c);
        eVar.e(f49726e, b0Var.d);
        eVar.f(f49727f, b0Var.f49734e);
        eVar.f(f49728g, b0Var.f49735f);
        eVar.f(h, b0Var.f49736g);
        eVar.a(f49729i, b0Var.h);
        eVar.a(f49730j, b0Var.f49737i);
    }
}
