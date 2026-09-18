package z7;
public final class x8 implements ia.d {
    public static final x8 f48946a = new Object();
    public static final ia.c f48947b = new ia.c("isForegroundConfidenceMaskEnabled", hg.k0.m(t8.b.o(w.class, new s(1))));
    public static final ia.c f48948c = new ia.c("isForegroundBitmapEnabled", hg.k0.m(t8.b.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hg.k0.m(t8.b.o(w.class, new s(3))));
    public static final ia.c e = new ia.c("isSubjectConfidenceMaskEnabled", hg.k0.m(t8.b.o(w.class, new s(4))));
    public static final ia.c f48949f = new ia.c("isSubjectBitmapEnabled", hg.k0.m(t8.b.o(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48947b, veVar.f48908a);
        eVar.a(f48948c, veVar.f48909b);
        eVar.a(d, veVar.f48910c);
        eVar.a(e, veVar.d);
        eVar.a(f48949f, veVar.e);
    }
}
