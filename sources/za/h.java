package za;
public final class h implements ia.d {
    public static final h f49106a = new Object();
    public static final ia.c f49107b = ia.c.c("sessionId");
    public static final ia.c f49108c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f49109f = ia.c.c("dataCollectionStatus");
    public static final ia.c f49110g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49107b, j0Var.f49121a);
        eVar.a(f49108c, j0Var.f49122b);
        eVar.e(d, j0Var.f49123c);
        eVar.f(e, j0Var.d);
        eVar.a(f49109f, j0Var.e);
        eVar.a(f49110g, j0Var.f49124f);
    }
}
