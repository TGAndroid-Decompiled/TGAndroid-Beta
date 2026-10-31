package z7;
public final class x8 implements ja.d {
    public static final x8 f55151a = new Object();
    public static final ja.c f55152b = new ja.c("isForegroundConfidenceMaskEnabled", i0.a.o(sc.e.n(w.class, new s(1))));
    public static final ja.c f55153c = new ja.c("isForegroundBitmapEnabled", i0.a.o(sc.e.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("isMultipleSubjectsEnabled", i0.a.o(sc.e.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isSubjectConfidenceMaskEnabled", i0.a.o(sc.e.n(w.class, new s(4))));
    public static final ja.c f55154f = new ja.c("isSubjectBitmapEnabled", i0.a.o(sc.e.n(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f55152b, weVar.f55138a);
        eVar.d(f55153c, weVar.f55139b);
        eVar.d(d, weVar.f55140c);
        eVar.d(e, weVar.d);
        eVar.d(f55154f, weVar.e);
    }
}
