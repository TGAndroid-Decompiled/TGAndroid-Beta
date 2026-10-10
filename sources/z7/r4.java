package z7;
public final class r4 implements ia.d {
    public static final r4 f54068a = new Object();
    public static final ia.c f54069b = new ia.c("imageFormat", hg.c.m(sc.v.o(w.class, new s(1))));
    public static final ia.c f54070c = new ia.c("originalImageSize", hg.c.m(sc.v.o(w.class, new s(2))));
    public static final ia.c d = new ia.c("compressedImageSize", hg.c.m(sc.v.o(w.class, new s(3))));
    public static final ia.c f54071e = new ia.c("isOdmlImage", hg.c.m(sc.v.o(w.class, new s(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        ra raVar = (ra) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f54069b, raVar.f54076a);
        eVar.a(f54070c, raVar.f54077b);
        eVar.a(d, null);
        eVar.a(f54071e, null);
    }
}
