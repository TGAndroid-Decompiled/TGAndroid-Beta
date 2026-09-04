package z7;
public final class x8 implements ia.d {
    public static final x8 f51324a = new Object();
    public static final ia.c f51325b = new ia.c("isForegroundConfidenceMaskEnabled", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c f51326c = new ia.c("isForegroundBitmapEnabled", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c f51327e = new ia.c("isSubjectConfidenceMaskEnabled", i2.g.n(w.f.k(w.class, new s(4))));
    public static final ia.c f51328f = new ia.c("isSubjectBitmapEnabled", i2.g.n(w.f.k(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51325b, veVar.f51283a);
        eVar.a(f51326c, veVar.f51284b);
        eVar.a(d, veVar.f51285c);
        eVar.a(f51327e, veVar.d);
        eVar.a(f51328f, veVar.f51286e);
    }
}
