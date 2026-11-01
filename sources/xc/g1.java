package xc;
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f53671m;
        if (aVar.o()) {
            fVar.f53653c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                v vVar = a2.f53616a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f53653c.append(d);
                            return;
                        }
                    } else {
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f53664c = vVar;
                        return;
                    }
                } else {
                    kVar.j();
                    kVar.f53664c = vVar;
                    return;
                }
            }
            kVar.f53664c = a2.f53636q0;
            return;
        }
        kVar.m(this);
        fVar.f53653c.append((char) 65533);
    }
}
