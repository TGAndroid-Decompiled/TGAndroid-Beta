package v2;

public final class e implements r9.d {

    public static final e f48690a = new e();

    public static final r9.c f48691b = r9.c.c("eventTimeMs");

    public static final r9.c f48692c = r9.c.c("eventCode");
    public static final r9.c d = r9.c.c("eventUptimeMs");

    public static final r9.c f48693e = r9.c.c("sourceExtension");

    public static final r9.c f48694f = r9.c.c("sourceExtensionJsonProto3");

    public static final r9.c f48695g = r9.c.c("timezoneOffsetSeconds");
    public static final r9.c h = r9.c.c("networkConnectionInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.c(f48691b, kVar.f48717a);
        eVar.a(f48692c, kVar.f48718b);
        eVar.c(d, kVar.f48719c);
        eVar.a(f48693e, kVar.d);
        eVar.a(f48694f, kVar.f48720e);
        eVar.c(f48695g, kVar.f48721f);
        eVar.a(h, kVar.f48722g);
    }
}
