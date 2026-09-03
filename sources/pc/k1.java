package pc;
public enum k1 extends a2 {
    public k1() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f41204m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                v vVar = a2.f41150a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.d.append(d);
                        return;
                    }
                    kVar.l(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f41197c = vVar;
                    return;
                }
                kVar.m(this);
                fVar.getClass();
                kVar.j();
                kVar.f41197c = vVar;
                return;
            }
            kVar.f41197c = a2.f41174s0;
            return;
        }
        kVar.m(this);
        fVar.d.append((char) 65533);
    }
}
