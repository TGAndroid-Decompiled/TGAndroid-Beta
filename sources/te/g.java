package te;
public final class g {
    public final d f57793a;
    public final k f57794b = new k(0.0f);
    public final k f57795c = new k(0.0f);
    public final k d = new k(0.0f);
    public final k f57796e = new k(0.0f);
    public final k f57797f = new k(0.0f);
    public final k f57798g = new k(0.0f);

    public g(h hVar, d dVar) {
        this.f57793a = dVar;
    }

    public static void a(g gVar, int i7, boolean z10) {
        k kVar = gVar.f57795c;
        k kVar2 = gVar.f57794b;
        float f10 = 0.0f;
        if (z10) {
            kVar2.f57807c = i7;
            if (i7 > 0) {
                f10 = 1.0f;
            }
            kVar.f57807c = f10;
            return;
        }
        kVar2.d(i7);
        if (i7 > 0) {
            f10 = 1.0f;
        }
        kVar.d(f10);
    }
}
