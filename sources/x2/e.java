package x2;
public final class e implements u9.d {
    public static final e f46660a = new Object();
    public static final u9.c f46661b = u9.c.c("eventTimeMs");
    public static final u9.c f46662c = u9.c.c("eventCode");
    public static final u9.c d = u9.c.c("eventUptimeMs");
    public static final u9.c e = u9.c.c("sourceExtension");
    public static final u9.c f46663f = u9.c.c("sourceExtensionJsonProto3");
    public static final u9.c f46664g = u9.c.c("timezoneOffsetSeconds");
    public static final u9.c h = u9.c.c("networkConnectionInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        u9.e eVar = (u9.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.b(f46661b, kVar.f46684a);
        eVar.e(f46662c, kVar.f46685b);
        eVar.b(d, kVar.f46686c);
        eVar.e(e, kVar.d);
        eVar.e(f46663f, kVar.e);
        eVar.b(f46664g, kVar.f46687f);
        eVar.e(h, kVar.f46688g);
    }
}
