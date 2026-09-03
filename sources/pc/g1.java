package pc;
public enum g1 extends a2 {
    public g1() {
        super("DoctypeName", 52);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f44379m;
        if (aVar.o()) {
            fVar.f44359c.append(aVar.e());
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                v vVar = a2.f44321a;
                if (d != '>') {
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            fVar.f44359c.append(d);
                            return;
                        }
                    } else {
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f44371c = vVar;
                        return;
                    }
                } else {
                    kVar.j();
                    kVar.f44371c = vVar;
                    return;
                }
            }
            kVar.f44371c = a2.f44339n0;
            return;
        }
        kVar.m(this);
        fVar.f44359c.append((char) 65533);
    }
}
