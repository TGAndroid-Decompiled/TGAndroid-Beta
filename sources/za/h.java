package za;
public final class h implements ia.d {
    public static final h f49056a = new Object();
    public static final ia.c f49057b = ia.c.c("sessionId");
    public static final ia.c f49058c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f49059f = ia.c.c("dataCollectionStatus");
    public static final ia.c f49060g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49057b, l0Var.f49083a);
        eVar.a(f49058c, l0Var.f49084b);
        eVar.e(d, l0Var.f49085c);
        eVar.f(e, l0Var.d);
        eVar.a(f49059f, l0Var.e);
        eVar.a(f49060g, l0Var.f49086f);
    }
}
