package za;

import k2.p1;
public final class a implements ma.d {
    public static final a f60264a = new Object();
    public static final ma.c f60265b = new ma.c("projectNumber", p1.o(p1.n(pa.d.class, new pa.a(1))));
    public static final ma.c f60266c = new ma.c("messageId", p1.o(p1.n(pa.d.class, new pa.a(2))));
    public static final ma.c d = new ma.c("instanceId", p1.o(p1.n(pa.d.class, new pa.a(3))));
    public static final ma.c f60267e = new ma.c("messageType", p1.o(p1.n(pa.d.class, new pa.a(4))));
    public static final ma.c f60268f = new ma.c("sdkPlatform", p1.o(p1.n(pa.d.class, new pa.a(5))));
    public static final ma.c f60269g = new ma.c("packageName", p1.o(p1.n(pa.d.class, new pa.a(6))));
    public static final ma.c h = new ma.c("collapseKey", p1.o(p1.n(pa.d.class, new pa.a(7))));
    public static final ma.c f60270i = new ma.c("priority", p1.o(p1.n(pa.d.class, new pa.a(8))));
    public static final ma.c f60271j = new ma.c("ttl", p1.o(p1.n(pa.d.class, new pa.a(9))));
    public static final ma.c f60272k = new ma.c("topic", p1.o(p1.n(pa.d.class, new pa.a(10))));
    public static final ma.c f60273l = new ma.c("bulkId", p1.o(p1.n(pa.d.class, new pa.a(11))));
    public static final ma.c f60274m = new ma.c("event", p1.o(p1.n(pa.d.class, new pa.a(12))));
    public static final ma.c f60275n = new ma.c("analyticsLabel", p1.o(p1.n(pa.d.class, new pa.a(13))));
    public static final ma.c f60276o = new ma.c("campaignId", p1.o(p1.n(pa.d.class, new pa.a(14))));
    public static final ma.c f60277p = new ma.c("composerLabel", p1.o(p1.n(pa.d.class, new pa.a(15))));

    @Override
    public final void a(Object obj, Object obj2) {
        ab.d dVar = (ab.d) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.f(f60265b, dVar.f298a);
        eVar.a(f60266c, dVar.f299b);
        eVar.a(d, dVar.f300c);
        eVar.a(f60267e, dVar.d);
        eVar.a(f60268f, ab.c.ANDROID);
        eVar.a(f60269g, dVar.f301e);
        eVar.a(h, dVar.f302f);
        eVar.e(f60270i, dVar.f303g);
        eVar.e(f60271j, dVar.h);
        eVar.a(f60272k, dVar.f304i);
        eVar.f(f60273l, 0L);
        eVar.a(f60274m, ab.a.MESSAGE_DELIVERED);
        eVar.a(f60275n, dVar.f305j);
        eVar.f(f60276o, 0L);
        eVar.a(f60277p, dVar.f306k);
    }
}
