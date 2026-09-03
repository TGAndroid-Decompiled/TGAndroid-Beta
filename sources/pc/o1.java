package pc;
public enum o1 extends a2 {
    public o1() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 59);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f41204m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f41150a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.f41197c = a2.f41184z0;
                            return;
                        }
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f41197c = vVar;
                        return;
                    }
                    kVar.j();
                    kVar.f41197c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.f41197c = a2.f41181x0;
                return;
            }
            kVar.m(this);
            kVar.f41197c = a2.f41179w0;
        }
    }
}
