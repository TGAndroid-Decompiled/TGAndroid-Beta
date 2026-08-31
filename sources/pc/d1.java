package pc;
public enum d1 extends a2 {
    public d1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f44349n;
        char d = aVar.d();
        z0 z0Var = a2.f44301g0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f44290a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb = eVar.f44327c;
                        sb.append("--!");
                        sb.append(d);
                        kVar.f44340c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f44340c = vVar;
                    return;
                }
                kVar.i();
                kVar.f44340c = vVar;
                return;
            }
            eVar.f44327c.append("--!");
            kVar.f44340c = a2.f44302h0;
            return;
        }
        kVar.m(this);
        StringBuilder sb2 = eVar.f44327c;
        sb2.append("--!");
        sb2.append((char) 65533);
        kVar.f44340c = z0Var;
    }
}
