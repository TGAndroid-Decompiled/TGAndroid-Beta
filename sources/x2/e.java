package x2;
public final class e implements u9.d {
    public static final e f50252a = new Object();
    public static final u9.c f50253b = u9.c.c("eventTimeMs");
    public static final u9.c f50254c = u9.c.c("eventCode");
    public static final u9.c d = u9.c.c("eventUptimeMs");
    public static final u9.c f50255e = u9.c.c("sourceExtension");
    public static final u9.c f50256f = u9.c.c("sourceExtensionJsonProto3");
    public static final u9.c f50257g = u9.c.c("timezoneOffsetSeconds");
    public static final u9.c h = u9.c.c("networkConnectionInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.b(f50253b, kVar.f50279a);
        eVar.e(f50254c, kVar.f50280b);
        eVar.b(d, kVar.f50281c);
        eVar.e(f50255e, kVar.d);
        eVar.e(f50256f, kVar.f50282e);
        eVar.b(f50257g, kVar.f50283f);
        eVar.e(h, kVar.f50284g);
    }
}
