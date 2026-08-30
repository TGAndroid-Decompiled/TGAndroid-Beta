package pc;
public enum d1 extends a2 {
    public d1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f41182n;
        char d = aVar.d();
        z0 z0Var = a2.f41137g0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f41127a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb = eVar.f41163c;
                        sb.append("--!");
                        sb.append(d);
                        kVar.f41174c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f41174c = vVar;
                    return;
                }
                kVar.i();
                kVar.f41174c = vVar;
                return;
            }
            eVar.f41163c.append("--!");
            kVar.f41174c = a2.f41138h0;
            return;
        }
        kVar.m(this);
        StringBuilder sb2 = eVar.f41163c;
        sb2.append("--!");
        sb2.append((char) 65533);
        kVar.f41174c = z0Var;
    }
}
