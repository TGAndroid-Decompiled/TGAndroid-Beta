package za;
public final class h implements ia.d {
    public static final h f49058a = new Object();
    public static final ia.c f49059b = ia.c.c("sessionId");
    public static final ia.c f49060c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f49061f = ia.c.c("dataCollectionStatus");
    public static final ia.c f49062g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49059b, l0Var.f49085a);
        eVar.a(f49060c, l0Var.f49086b);
        eVar.e(d, l0Var.f49087c);
        eVar.f(e, l0Var.d);
        eVar.a(f49061f, l0Var.e);
        eVar.a(f49062g, l0Var.f49088f);
    }
}
