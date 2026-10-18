package z7;
public final class x8 implements ja.d {
    public static final x8 f51279a = new Object();
    public static final ja.c f51280b = new ja.c("isForegroundConfidenceMaskEnabled", i2.d.o(r4.c.n(w.class, new s(1))));
    public static final ja.c f51281c = new ja.c("isForegroundBitmapEnabled", i2.d.o(r4.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("isMultipleSubjectsEnabled", i2.d.o(r4.c.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isSubjectConfidenceMaskEnabled", i2.d.o(r4.c.n(w.class, new s(4))));
    public static final ja.c f51282f = new ja.c("isSubjectBitmapEnabled", i2.d.o(r4.c.n(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        we weVar = (we) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f51280b, weVar.f51266a);
        eVar.d(f51281c, weVar.f51267b);
        eVar.d(d, weVar.f51268c);
        eVar.d(e, weVar.d);
        eVar.d(f51282f, weVar.e);
    }
}
