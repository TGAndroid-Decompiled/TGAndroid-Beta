package te;
public final class g {
    public final d f57671a;
    public final k f57672b = new k(0.0f);
    public final k f57673c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f57674e = new k(0.0f);
    public final k f57675f = new k(0.0f);
    public final k f57676g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f57671a = dVar;
    }

    public static void a(g gVar, int i7, boolean z10) {
        k kVar = gVar.f57673c;
        k kVar2 = gVar.f57672b;
        float f10 = 0.0f;
        if (z10) {
            kVar2.f57685c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f57685c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
