package xc;
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f53653m;
        if (aVar.o()) {
            fVar.f53635c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                v vVar = a2.f53598a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f53635c.append(d);
                            return;
                        }
                    } else {
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f53646c = vVar;
                        return;
                    }
                } else {
                    kVar.j();
                    kVar.f53646c = vVar;
                    return;
                }
            }
            kVar.f53646c = a2.f53618q0;
            return;
        }
        kVar.m(this);
        fVar.f53635c.append((char) 65533);
    }
}
