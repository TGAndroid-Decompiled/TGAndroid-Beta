package x2;
public final class f implements u9.d {
    public static final f f50258a = new Object();
    public static final u9.c f50259b = u9.c.c("requestTimeMs");
    public static final u9.c f50260c = u9.c.c("requestUptimeMs");
    public static final u9.c d = u9.c.c("clientInfo");
    public static final u9.c f50261e = u9.c.c("logSource");
    public static final u9.c f50262f = u9.c.c("logSourceName");
    public static final u9.c f50263g = u9.c.c("logEvent");
    public static final u9.c h = u9.c.c("qosTier");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.b(f50259b, lVar.f50285a);
        eVar.b(f50260c, lVar.f50286b);
        eVar.e(d, lVar.f50287c);
        eVar.e(f50261e, lVar.d);
        eVar.e(f50262f, lVar.f50288e);
        eVar.e(f50263g, lVar.f50289f);
        eVar.e(h, w.f50299a);
    }
}
