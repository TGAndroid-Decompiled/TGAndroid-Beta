package z7;
public final class y8 implements ja.d {
    public static final y8 f51271a = new Object();
    public static final ja.c f51272b = new ja.c("isForegroundConfidenceMaskEnabled", i0.a.o(r.c.n(w.class, new s(1))));
    public static final ja.c f51273c = new ja.c("isForegroundBitmapEnabled", i0.a.o(r.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("isMultipleSubjectsEnabled", i0.a.o(r.c.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isSubjectConfidenceMaskEnabled", i0.a.o(r.c.n(w.class, new s(4))));
    public static final ja.c f51274f = new ja.c("isSubjectBitmapEnabled", i0.a.o(r.c.n(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        xe xeVar = (xe) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f51272b, xeVar.f51253a);
        eVar.d(f51273c, xeVar.f51254b);
        eVar.d(d, xeVar.f51255c);
        eVar.d(e, xeVar.d);
        eVar.d(f51274f, xeVar.e);
    }
}
