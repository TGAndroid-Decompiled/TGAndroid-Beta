package x2;
public final class f implements u9.d {
    public static final f f46734a = new Object();
    public static final u9.c f46735b = u9.c.c("requestTimeMs");
    public static final u9.c f46736c = u9.c.c("requestUptimeMs");
    public static final u9.c d = u9.c.c("clientInfo");
    public static final u9.c e = u9.c.c("logSource");
    public static final u9.c f46737f = u9.c.c("logSourceName");
    public static final u9.c f46738g = u9.c.c("logEvent");
    public static final u9.c h = u9.c.c("qosTier");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.b(f46735b, lVar.f46758a);
        eVar.b(f46736c, lVar.f46759b);
        eVar.e(d, lVar.f46760c);
        eVar.e(e, lVar.d);
        eVar.e(f46737f, lVar.e);
        eVar.e(f46738g, lVar.f46761f);
        eVar.e(h, w.f46771a);
    }
}
