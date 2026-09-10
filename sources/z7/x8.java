package z7;
public final class x8 implements ia.d {
    public static final x8 f47808a = new Object();
    public static final ia.c f47809b = new ia.c("isForegroundConfidenceMaskEnabled", hc.b.p(w.f.k(w.class, new s(1))));
    public static final ia.c f47810c = new ia.c("isForegroundBitmapEnabled", hc.b.p(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("isMultipleSubjectsEnabled", hc.b.p(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("isSubjectConfidenceMaskEnabled", hc.b.p(w.f.k(w.class, new s(4))));
    public static final ia.c f47811f = new ia.c("isSubjectBitmapEnabled", hc.b.p(w.f.k(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f47809b, veVar.f47770a);
        eVar.a(f47810c, veVar.f47771b);
        eVar.a(d, veVar.f47772c);
        eVar.a(e, veVar.d);
        eVar.a(f47811f, veVar.e);
    }
}
