package za;
public final class h implements ia.d {
    public static final h f49040a = new Object();
    public static final ia.c f49041b = ia.c.c("sessionId");
    public static final ia.c f49042c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f49043f = ia.c.c("dataCollectionStatus");
    public static final ia.c f49044g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49041b, j0Var.f49055a);
        eVar.a(f49042c, j0Var.f49056b);
        eVar.e(d, j0Var.f49057c);
        eVar.f(e, j0Var.d);
        eVar.a(f49043f, j0Var.e);
        eVar.a(f49044g, j0Var.f49058f);
    }
}
