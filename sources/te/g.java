package te;
public final class g {
    public final d f57710a;
    public final k f57711b = new k(0.0f);
    public final k f57712c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f57713e = new k(0.0f);
    public final k f57714f = new k(0.0f);
    public final k f57715g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f57710a = dVar;
    }

    public static void a(g gVar, int i7, boolean z10) {
        k kVar = gVar.f57712c;
        k kVar2 = gVar.f57711b;
        float f10 = 0.0f;
        if (z10) {
            kVar2.f57724c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f57724c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
