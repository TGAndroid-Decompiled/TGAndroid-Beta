package y9;
public final class b implements ia.d {
    public static final b f50590a = new Object();
    public static final ia.c f50591b = ia.c.c("pid");
    public static final ia.c f50592c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c f50593e = ia.c.c("importance");
    public static final ia.c f50594f = ia.c.c("pss");
    public static final ia.c f50595g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f50596i = ia.c.c("traceFile");
    public static final ia.c f50597j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f50591b, b0Var.f50598a);
        eVar.a(f50592c, b0Var.f50599b);
        eVar.e(d, b0Var.f50600c);
        eVar.e(f50593e, b0Var.d);
        eVar.f(f50594f, b0Var.f50601e);
        eVar.f(f50595g, b0Var.f50602f);
        eVar.f(h, b0Var.f50603g);
        eVar.a(f50596i, b0Var.h);
        eVar.a(f50597j, b0Var.f50604i);
    }
}
