package v2;

public final class f implements r9.d {

    public static final f f48696a = new f();

    public static final r9.c f48697b = r9.c.c("requestTimeMs");

    public static final r9.c f48698c = r9.c.c("requestUptimeMs");
    public static final r9.c d = r9.c.c("clientInfo");

    public static final r9.c f48699e = r9.c.c("logSource");

    public static final r9.c f48700f = r9.c.c("logSourceName");

    public static final r9.c f48701g = r9.c.c("logEvent");
    public static final r9.c h = r9.c.c("qosTier");

    @Override
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.c(f48697b, lVar.f48723a);
        eVar.c(f48698c, lVar.f48724b);
        eVar.a(d, lVar.f48725c);
        eVar.a(f48699e, lVar.d);
        eVar.a(f48700f, lVar.f48726e);
        eVar.a(f48701g, lVar.f48727f);
        eVar.a(h, w.f48737a);
    }
}
