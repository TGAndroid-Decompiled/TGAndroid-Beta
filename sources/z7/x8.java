package z7;
public final class x8 implements ja.d {
    public static final x8 f55169a = new Object();
    public static final ja.c f55170b = new ja.c("isForegroundConfidenceMaskEnabled", i0.a.o(sc.e.n(w.class, new s(1))));
    public static final ja.c f55171c = new ja.c("isForegroundBitmapEnabled", i0.a.o(sc.e.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("isMultipleSubjectsEnabled", i0.a.o(sc.e.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isSubjectConfidenceMaskEnabled", i0.a.o(sc.e.n(w.class, new s(4))));
    public static final ja.c f55172f = new ja.c("isSubjectBitmapEnabled", i0.a.o(sc.e.n(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f55170b, weVar.f55156a);
        eVar.d(f55171c, weVar.f55157b);
        eVar.d(d, weVar.f55158c);
        eVar.d(e, weVar.d);
        eVar.d(f55172f, weVar.e);
    }
}
