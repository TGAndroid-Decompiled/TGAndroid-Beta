package za;
public final class h implements ia.d {
    public static final h f49102a = new Object();
    public static final ia.c f49103b = ia.c.c("sessionId");
    public static final ia.c f49104c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c e = ia.c.c("eventTimestampUs");
    public static final ia.c f49105f = ia.c.c("dataCollectionStatus");
    public static final ia.c f49106g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49103b, j0Var.f49117a);
        eVar.a(f49104c, j0Var.f49118b);
        eVar.e(d, j0Var.f49119c);
        eVar.f(e, j0Var.d);
        eVar.a(f49105f, j0Var.e);
        eVar.a(f49106g, j0Var.f49120f);
    }
}
