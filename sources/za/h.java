package za;
public final class h implements ia.d {
    public static final h f48728a = new Object();
    public static final ia.c f48729b = ia.c.c("sessionId");
    public static final ia.c f48730c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f48731f = ia.c.c("dataCollectionStatus");
    public static final ia.c f48732g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48729b, l0Var.f48755a);
        eVar.a(f48730c, l0Var.f48756b);
        eVar.e(d, l0Var.f48757c);
        eVar.f(e, l0Var.d);
        eVar.a(f48731f, l0Var.e);
        eVar.a(f48732g, l0Var.f48758f);
    }
}
