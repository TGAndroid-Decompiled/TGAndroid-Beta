package y9;
public final class b implements ia.d {
    public static final b f49694a = new Object();
    public static final ia.c f49695b = ia.c.c("pid");
    public static final ia.c f49696c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c f49697e = ia.c.c("importance");
    public static final ia.c f49698f = ia.c.c("pss");
    public static final ia.c f49699g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f49700i = ia.c.c("traceFile");
    public static final ia.c f49701j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f49695b, b0Var.f49702a);
        eVar.a(f49696c, b0Var.f49703b);
        eVar.e(d, b0Var.f49704c);
        eVar.e(f49697e, b0Var.d);
        eVar.f(f49698f, b0Var.f49705e);
        eVar.f(f49699g, b0Var.f49706f);
        eVar.f(h, b0Var.f49707g);
        eVar.a(f49700i, b0Var.h);
        eVar.a(f49701j, b0Var.f49708i);
    }
}
