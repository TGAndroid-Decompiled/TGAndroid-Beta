package z7;
public final class r4 implements ja.d {
    public static final r4 f49765a = new Object();
    public static final ja.c f49766b = new ja.c("imageFormat", i2.d.o(t8.b.n(w.class, new s(1))));
    public static final ja.c f49767c = new ja.c("originalImageSize", i2.d.o(t8.b.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("compressedImageSize", i2.d.o(t8.b.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("isOdmlImage", i2.d.o(t8.b.n(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f49766b, raVar.f49772a);
        eVar.d(f49767c, raVar.f49773b);
        eVar.d(d, null);
        eVar.d(e, null);
    }
}
