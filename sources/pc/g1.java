package pc;
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f41181m;
        if (aVar.o()) {
            fVar.f41164c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                v vVar = a2.f41127a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f41164c.append(d);
                            return;
                        }
                    } else {
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f41174c = vVar;
                        return;
                    }
                } else {
                    kVar.j();
                    kVar.f41174c = vVar;
                    return;
                }
            }
            kVar.f41174c = a2.f41144n0;
            return;
        }
        kVar.m(this);
        fVar.f41164c.append((char) 65533);
    }
}
