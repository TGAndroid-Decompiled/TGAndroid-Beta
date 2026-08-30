package pc;
public enum f1 extends a2 {
    public f1() {
        super("BeforeDoctypeName", 51);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f41181m;
        boolean o10 = aVar.o();
        g1 g1Var = a2.m0;
        if (o10) {
            fVar.h();
            kVar.f41174c = g1Var;
            return;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != 65535) {
                    if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                        fVar.h();
                        fVar.f41164c.append(d);
                        kVar.f41174c = g1Var;
                        return;
                    }
                    return;
                }
                kVar.l(this);
                fVar.h();
                fVar.getClass();
                kVar.j();
                kVar.f41174c = a2.f41127a;
                return;
            }
            return;
        }
        kVar.m(this);
        fVar.h();
        fVar.f41164c.append((char) 65533);
        kVar.f41174c = g1Var;
    }
}
