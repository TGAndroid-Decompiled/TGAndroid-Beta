package x2;
public final class f implements u9.d {
    public static final f f50294a = new Object();
    public static final u9.c f50295b = u9.c.c("requestTimeMs");
    public static final u9.c f50296c = u9.c.c("requestUptimeMs");
    public static final u9.c d = u9.c.c("clientInfo");
    public static final u9.c f50297e = u9.c.c("logSource");
    public static final u9.c f50298f = u9.c.c("logSourceName");
    public static final u9.c f50299g = u9.c.c("logEvent");
    public static final u9.c h = u9.c.c("qosTier");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.b(f50295b, lVar.f50321a);
        eVar.b(f50296c, lVar.f50322b);
        eVar.e(d, lVar.f50323c);
        eVar.e(f50297e, lVar.d);
        eVar.e(f50298f, lVar.f50324e);
        eVar.e(f50299g, lVar.f50325f);
        eVar.e(h, w.f50335a);
    }
}
