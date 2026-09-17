package z7;
public final class r4 implements ia.d {
    public static final r4 f51220a = new Object();
    public static final ia.c f51221b = new ia.c("imageFormat", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c f51222c = new ia.c("originalImageSize", i2.g.n(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", i2.g.n(w.f.k(w.class, new s(3))));
    public static final ia.c f51223e = new ia.c("isOdmlImage", i2.g.n(w.f.k(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51221b, raVar.f51228a);
        eVar.a(f51222c, raVar.f51229b);
        eVar.a(d, null);
        eVar.a(f51223e, null);
    }
}
