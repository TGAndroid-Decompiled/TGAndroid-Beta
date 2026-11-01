package xc;
public enum d1 extends a2 {
    public d1() {
        super("CommentEndBang", 49);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f53672n;
        char d = aVar.d();
        z0 z0Var = a2.f53629j0;
        if (d != 0) {
            if (d != '-') {
                v vVar = a2.f53616a;
                if (d != '>') {
                    if (d != 65535) {
                        StringBuilder sb2 = eVar.f53652c;
                        sb2.append("--!");
                        sb2.append(d);
                        kVar.f53664c = z0Var;
                        return;
                    }
                    kVar.l(this);
                    kVar.i();
                    kVar.f53664c = vVar;
                    return;
                }
                kVar.i();
                kVar.f53664c = vVar;
                return;
            }
            eVar.f53652c.append("--!");
            kVar.f53664c = a2.f53630k0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f53652c;
        sb3.append("--!");
        sb3.append((char) 65533);
        kVar.f53664c = z0Var;
    }
}
