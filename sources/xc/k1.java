package xc;
public enum k1 extends a2 {
    public k1() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f53653m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                v vVar = a2.f53598a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.d.append(d);
                        return;
                    }
                    kVar.l(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f53646c = vVar;
                    return;
                }
                kVar.m(this);
                fVar.getClass();
                kVar.j();
                kVar.f53646c = vVar;
                return;
            }
            kVar.f53646c = a2.f53625v0;
            return;
        }
        kVar.m(this);
        fVar.d.append((char) 65533);
    }
}
