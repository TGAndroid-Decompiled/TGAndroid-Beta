package z7;
public final class x8 implements ja.d {
    public static final x8 f51239a = new Object();
    public static final ja.c f51240b = new ja.c("isForegroundConfidenceMaskEnabled", i2.e.o(r4.c.n(w.class, new s(1))));
    public static final ja.c f51241c = new ja.c("isForegroundBitmapEnabled", i2.e.o(r4.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("isMultipleSubjectsEnabled", i2.e.o(r4.c.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isSubjectConfidenceMaskEnabled", i2.e.o(r4.c.n(w.class, new s(4))));
    public static final ja.c f51242f = new ja.c("isSubjectBitmapEnabled", i2.e.o(r4.c.n(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f51240b, weVar.f51226a);
        eVar.d(f51241c, weVar.f51227b);
        eVar.d(d, weVar.f51228c);
        eVar.d(e, weVar.d);
        eVar.d(f51242f, weVar.e);
    }
}
