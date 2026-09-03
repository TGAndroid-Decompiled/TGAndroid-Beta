package pc;
public enum a1 extends a2 {
    public a1() {
        super("CommentEndDash", 47);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f44380n;
        char d = aVar.d();
        z0 z0Var = a2.f44332g0;
        if (d != 0) {
            if (d != '-') {
                if (d != 65535) {
                    StringBuilder sb = eVar.f44358c;
                    sb.append('-');
                    sb.append(d);
                    kVar.f44371c = z0Var;
                    return;
                }
                kVar.l(this);
                kVar.i();
                kVar.f44371c = a2.f44321a;
                return;
            }
            kVar.f44371c = a2.f44334i0;
            return;
        }
        kVar.m(this);
        StringBuilder sb2 = eVar.f44358c;
        sb2.append('-');
        sb2.append((char) 65533);
        kVar.f44371c = z0Var;
    }
}
