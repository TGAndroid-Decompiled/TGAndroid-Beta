package za;
public final class h implements ia.d {
    public static final h f49164a = new Object();
    public static final ia.c f49165b = ia.c.c("sessionId");
    public static final ia.c f49166c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f49167f = ia.c.c("dataCollectionStatus");
    public static final ia.c f49168g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49165b, l0Var.f49191a);
        eVar.a(f49166c, l0Var.f49192b);
        eVar.e(d, l0Var.f49193c);
        eVar.f(e, l0Var.d);
        eVar.a(f49167f, l0Var.e);
        eVar.a(f49168g, l0Var.f49194f);
    }
}
