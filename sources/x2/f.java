package x2;
public final class f implements u9.d {
    public static final f f50257a = new Object();
    public static final u9.c f50258b = u9.c.c("requestTimeMs");
    public static final u9.c f50259c = u9.c.c("requestUptimeMs");
    public static final u9.c d = u9.c.c("clientInfo");
    public static final u9.c f50260e = u9.c.c("logSource");
    public static final u9.c f50261f = u9.c.c("logSourceName");
    public static final u9.c f50262g = u9.c.c("logEvent");
    public static final u9.c h = u9.c.c("qosTier");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.b(f50258b, lVar.f50284a);
        eVar.b(f50259c, lVar.f50285b);
        eVar.e(d, lVar.f50286c);
        eVar.e(f50260e, lVar.d);
        eVar.e(f50261f, lVar.f50287e);
        eVar.e(f50262g, lVar.f50288f);
        eVar.e(h, w.f50298a);
    }
}
