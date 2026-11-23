package te;
public final class g {
    public final d f57679a;
    public final k f57680b = new k(0.0f);
    public final k f57681c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f57682e = new k(0.0f);
    public final k f57683f = new k(0.0f);
    public final k f57684g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f57679a = dVar;
    }

    public static void a(g gVar, int i7, boolean z10) {
        k kVar = gVar.f57681c;
        k kVar2 = gVar.f57680b;
        float f10 = 0.0f;
        if (z10) {
            kVar2.f57693c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f57693c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
