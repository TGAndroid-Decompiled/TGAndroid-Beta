package z7;
public final class r4 implements ia.d {
    public static final r4 f47709a = new Object();
    public static final ia.c f47710b = new ia.c("imageFormat", hc.b.p(w.f.k(w.class, new s(1))));
    public static final ia.c f47711c = new ia.c("originalImageSize", hc.b.p(w.f.k(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hc.b.p(w.f.k(w.class, new s(3))));
    public static final ia.c e = new ia.c("isOdmlImage", hc.b.p(w.f.k(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f47710b, raVar.f47716a);
        eVar.a(f47711c, raVar.f47717b);
        eVar.a(d, null);
        eVar.a(e, null);
    }
}
