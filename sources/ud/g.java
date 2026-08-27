package ud;

public final class g {

    public final d f48510a;

    public final k f48511b = new k(0.0f);

    public final k f48512c = new k(0.0f);
    public final k d = new k(0.0f);

    public final k f48513e = new k(0.0f);

    public final k f48514f = new k(0.0f);

    public final k f48515g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f48510a = dVar;
    }

    public static void a(g gVar, int i10, boolean z10) {
        k kVar = gVar.f48512c;
        k kVar2 = gVar.f48511b;
        if (z10) {
            kVar2.f48524c = i10;
            kVar.f48524c = i10 > 0 ? 1.0f : 0.0f;
        } else {
            kVar2.d(i10);
            kVar.d(i10 > 0 ? 1.0f : 0.0f);
        }
    }
}
