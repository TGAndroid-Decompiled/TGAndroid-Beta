package xc;
public enum s1 extends a2 {
    public s1() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f53671m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\'') {
                v vVar = a2.f53616a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.e.append(d);
                        return;
                    }
                    kVar.l(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f53664c = vVar;
                    return;
                }
                kVar.m(this);
                fVar.getClass();
                kVar.j();
                kVar.f53664c = vVar;
                return;
            }
            kVar.f53664c = a2.B0;
            return;
        }
        kVar.m(this);
        fVar.e.append((char) 65533);
    }
}
