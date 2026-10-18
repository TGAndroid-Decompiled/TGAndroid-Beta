package z7;
public final class r4 implements ja.d {
    public static final r4 f51192a = new Object();
    public static final ja.c f51193b = new ja.c("imageFormat", i2.d.o(r4.c.n(w.class, new s(1))));
    public static final ja.c f51194c = new ja.c("originalImageSize", i2.d.o(r4.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("compressedImageSize", i2.d.o(r4.c.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isOdmlImage", i2.d.o(r4.c.n(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        sa saVar = (sa) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f51193b, saVar.f51213a);
        eVar.d(f51194c, saVar.f51214b);
        eVar.d(d, null);
        eVar.d(e, null);
    }
}
