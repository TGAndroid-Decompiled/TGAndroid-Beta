package qe;
public final class g {
    public final d f53854a;
    public final k f53855b = new k(0.0f);
    public final k f53856c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f53857e = new k(0.0f);
    public final k f53858f = new k(0.0f);
    public final k f53859g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f53854a = dVar;
    }

    public static void a(g gVar, int i3, boolean z10) {
        k kVar = gVar.f53856c;
        k kVar2 = gVar.f53855b;
        float f10 = 0.0f;
        if (z10) {
            kVar2.f53868c = i3;
            if (i3 > 0) {
                f10 = 1.0f;
            }
            kVar.f53868c = f10;
            return;
        }
        kVar2.d(i3);
        if (i3 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
