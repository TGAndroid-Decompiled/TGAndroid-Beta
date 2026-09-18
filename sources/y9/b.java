package y9;
public final class b implements ia.d {
    public static final b f46716a = new Object();
    public static final ia.c f46717b = ia.c.c("pid");
    public static final ia.c f46718c = ia.c.c("processName");
    public static final ia.c d = ia.c.c("reasonCode");
    public static final ia.c e = ia.c.c("importance");
    public static final ia.c f46719f = ia.c.c("pss");
    public static final ia.c f46720g = ia.c.c("rss");
    public static final ia.c h = ia.c.c("timestamp");
    public static final ia.c f46721i = ia.c.c("traceFile");
    public static final ia.c f46722j = ia.c.c("buildIdMappingForArch");

    @Override
    public final void a(Object obj, Object obj2) {
        ia.e eVar = (ia.e) obj2;
        b0 b0Var = (b0) ((g1) obj);
        eVar.e(f46717b, b0Var.f46723a);
        eVar.a(f46718c, b0Var.f46724b);
        eVar.e(d, b0Var.f46725c);
        eVar.e(e, b0Var.d);
        eVar.f(f46719f, b0Var.e);
        eVar.f(f46720g, b0Var.f46726f);
        eVar.f(h, b0Var.f46727g);
        eVar.a(f46721i, b0Var.h);
        eVar.a(f46722j, b0Var.f46728i);
    }
}
