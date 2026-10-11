package za;
public final class h implements ia.d {
    public static final h f54320a = new Object();
    public static final ia.c f54321b = ia.c.c("sessionId");
    public static final ia.c f54322c = ia.c.c("firstSessionId");
    public static final ia.c d = ia.c.c("sessionIndex");
    public static final ia.c f54323e = ia.c.c("eventTimestampUs");
    public static final ia.c f54324f = ia.c.c("dataCollectionStatus");
    public static final ia.c f54325g = ia.c.c("firebaseInstallationId");

    @Override
    public final void a(Object obj, Object obj2) {
        k0 k0Var = (k0) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54321b, k0Var.f54345a);
        eVar.a(f54322c, k0Var.f54346b);
        eVar.e(d, k0Var.f54347c);
        eVar.f(f54323e, k0Var.d);
        eVar.a(f54324f, k0Var.f54348e);
        eVar.a(f54325g, k0Var.f54349f);
    }
}
