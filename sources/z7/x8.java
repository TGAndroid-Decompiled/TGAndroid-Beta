package z7;
public final class x8 implements ia.d {
    public static final x8 f51325a = new Object();
    public static final ia.c f51326b = new ia.c("isForegroundConfidenceMaskEnabled", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c f51327c = new ia.c("isForegroundBitmapEnabled", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c f51328e = new ia.c("isSubjectConfidenceMaskEnabled", i2.g.n(w.f.k(w.class, new s(4))));
    public static final ia.c f51329f = new ia.c("isSubjectBitmapEnabled", i2.g.n(w.f.k(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51326b, veVar.f51284a);
        eVar.a(f51327c, veVar.f51285b);
        eVar.a(d, veVar.f51286c);
        eVar.a(f51328e, veVar.d);
        eVar.a(f51329f, veVar.f51287e);
    }
}
