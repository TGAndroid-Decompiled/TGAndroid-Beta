package pc;
public enum l1 extends a2 {
    public l1() {
        super("DoctypePublicIdentifier_singleQuoted", 57);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f41181m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\'') {
                v vVar = a2.f41127a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.d.append(d);
                        return;
                    }
                    kVar.l(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f41174c = vVar;
                    return;
                }
                kVar.m(this);
                fVar.getClass();
                kVar.j();
                kVar.f41174c = vVar;
                return;
            }
            kVar.f41174c = a2.f41151s0;
            return;
        }
        kVar.m(this);
        fVar.d.append((char) 65533);
    }
}
