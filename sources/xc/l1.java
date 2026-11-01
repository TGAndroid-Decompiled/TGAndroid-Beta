package xc;
public enum l1 extends a2 {
    public l1() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
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
                        fVar.d.append(d);
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
            kVar.f53664c = a2.f53643v0;
            return;
        }
        kVar.m(this);
        fVar.d.append((char) 65533);
    }
}
