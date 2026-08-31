package pc;
public enum f1 extends a2 {
    public f1() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f44348m;
        boolean o10 = aVar.o();
        g1 g1Var = a2.m0;
        if (o10) {
            fVar.g();
            kVar.f44340c = g1Var;
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        fVar.g();
                        fVar.f44328c.append(d);
                        kVar.f44340c = g1Var;
                        return;
                    }
                    return;
                }
                kVar.l(this);
                fVar.g();
                fVar.getClass();
                kVar.j();
                kVar.f44340c = a2.f44290a;
                return;
            }
            return;
        }
        kVar.m(this);
        fVar.g();
        fVar.f44328c.append((char) 65533);
        kVar.f44340c = g1Var;
    }
}
