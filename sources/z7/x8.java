package z7;
public final class x8 implements ja.d {
    public static final x8 f51719a = new Object();
    public static final ja.c f51720b = new ja.c("isForegroundConfidenceMaskEnabled", i2.o1.p(si.o0.n(w.class, new s(1))));
    public static final ja.c f51721c = new ja.c("isForegroundBitmapEnabled", i2.o1.p(si.o0.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("isMultipleSubjectsEnabled", i2.o1.p(si.o0.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isSubjectConfidenceMaskEnabled", i2.o1.p(si.o0.n(w.class, new s(4))));
    public static final ja.c f51722f = new ja.c("isSubjectBitmapEnabled", i2.o1.p(si.o0.n(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f51720b, veVar.f51681a);
        eVar.d(f51721c, veVar.f51682b);
        eVar.d(d, veVar.f51683c);
        eVar.d(e, veVar.d);
        eVar.d(f51722f, veVar.e);
    }
}
