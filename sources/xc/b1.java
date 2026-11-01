package xc;
public enum b1 extends a2 {
    public b1() {
        super("CommentEnd", 48);
    }

    @Override
    public final void d(k kVar, a aVar) {
        e eVar = kVar.f53672n;
        char d = aVar.d();
        z0 z0Var = a2.f53629j0;
        if (d != 0) {
            if (d != '!') {
                if (d != '-') {
                    v vVar = a2.f53616a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            StringBuilder sb2 = eVar.f53652c;
                            sb2.append("--");
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
                kVar.m(this);
                eVar.f53652c.append('-');
                return;
            }
            kVar.m(this);
            kVar.f53664c = a2.m0;
            return;
        }
        kVar.m(this);
        StringBuilder sb3 = eVar.f53652c;
        sb3.append("--");
        sb3.append((char) 65533);
        kVar.f53664c = z0Var;
    }
}
