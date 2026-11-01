package xc;
public enum o1 extends a2 {
    public o1() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 59);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f53671m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f53616a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.f53664c = a2.C0;
                            return;
                        }
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f53664c = vVar;
                        return;
                    }
                    kVar.j();
                    kVar.f53664c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.f53664c = a2.A0;
                return;
            }
            kVar.m(this);
            kVar.f53664c = a2.f53650z0;
        }
    }
}
