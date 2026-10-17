package z7;
public final class d8 implements ja.d {
    public static final d8 f50789a = new Object();
    public static final ja.c f50790b = new ja.c("inferenceCommonLogEvent", i0.a.o(r.c.n(w.class, new s(1))));
    public static final ja.c f50791c = new ja.c("imageInfo", i0.a.o(r.c.n(w.class, new s(2))));
    public static final ja.c d = new ja.c("subjectSegmenterOptions", i0.a.o(r.c.n(w.class, new s(3))));
    public static final ja.c e = new ja.c("subjectInfos", i0.a.o(r.c.n(w.class, new s(4))));
    public static final ja.c f50792f = new ja.c("qualityScores", i0.a.o(r.c.n(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ge geVar = (ge) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f50790b, geVar.f50829a);
        eVar.d(f50791c, geVar.f50830b);
        eVar.d(d, geVar.f50831c);
        eVar.d(e, geVar.d);
        eVar.d(f50792f, geVar.e);
    }
}
