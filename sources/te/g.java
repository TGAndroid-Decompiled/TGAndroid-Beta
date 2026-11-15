package te;
public final class g {
    public final d f57095a;
    public final k f57096b = new k(0.0f);
    public final k f57097c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f57098e = new k(0.0f);
    public final k f57099f = new k(0.0f);
    public final k f57100g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f57095a = dVar;
    }

    public static void a(g gVar, int i7, boolean z10) {
        k kVar = gVar.f57097c;
        k kVar2 = gVar.f57096b;
        float f10 = 0.0f;
        if (z10) {
            kVar2.f57109c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f57109c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
