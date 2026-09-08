package y9;
public final class b implements ia.d {
    public static final b f49722a = new Object();
    public static final ia.c f49723b = ia.c.c("pid");
    public static final ia.c f49724c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c f49725e = ia.c.c("importance");
    public static final ia.c f49726f = ia.c.c("pss");
    public static final ia.c f49727g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f49728i = ia.c.c("traceFile");
    public static final ia.c f49729j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f49723b, b0Var.f49730a);
        eVar.a(f49724c, b0Var.f49731b);
        eVar.e(d, b0Var.f49732c);
        eVar.e(f49725e, b0Var.d);
        eVar.f(f49726f, b0Var.f49733e);
        eVar.f(f49727g, b0Var.f49734f);
        eVar.f(h, b0Var.f49735g);
        eVar.a(f49728i, b0Var.h);
        eVar.a(f49729j, b0Var.f49736i);
    }
}
