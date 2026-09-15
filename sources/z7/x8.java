package z7;
public final class x8 implements ia.d {
    public static final x8 f48692a = new Object();
    public static final ia.c f48693b = new ia.c("isForegroundConfidenceMaskEnabled", hg.k0.o(w.f.k(w.class, new s(1))));
    public static final ia.c f48694c = new ia.c("isForegroundBitmapEnabled", hg.k0.o(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.k0.o(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("isSubjectConfidenceMaskEnabled", hg.k0.o(w.f.k(w.class, new s(4))));
    public static final ia.c f48695f = new ia.c("isSubjectBitmapEnabled", hg.k0.o(w.f.k(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48693b, veVar.f48654a);
        eVar.a(f48694c, veVar.f48655b);
        eVar.a(d, veVar.f48656c);
        eVar.a(e, veVar.d);
        eVar.a(f48695f, veVar.e);
    }
}
