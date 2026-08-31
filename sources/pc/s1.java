package pc;
public enum s1 extends a2 {
    public s1() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f44348m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\'') {
                v vVar = a2.f44290a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.f44329e.append(d);
                        return;
                    }
                    kVar.l(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f44340c = vVar;
                    return;
                }
                kVar.m(this);
                fVar.getClass();
                kVar.j();
                kVar.f44340c = vVar;
                return;
            }
            kVar.f44340c = a2.f44324y0;
            return;
        }
        kVar.m(this);
        fVar.f44329e.append((char) 65533);
    }
}
