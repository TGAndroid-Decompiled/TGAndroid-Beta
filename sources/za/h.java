package za;
public final class h implements ia.d {
    public static final h f49055a = new Object();
    public static final ia.c f49056b = ia.c.c("sessionId");
    public static final ia.c f49057c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f49058f = ia.c.c("dataCollectionStatus");
    public static final ia.c f49059g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49056b, l0Var.f49082a);
        eVar.a(f49057c, l0Var.f49083b);
        eVar.e(d, l0Var.f49084c);
        eVar.f(e, l0Var.d);
        eVar.a(f49058f, l0Var.e);
        eVar.a(f49059g, l0Var.f49085f);
    }
}
