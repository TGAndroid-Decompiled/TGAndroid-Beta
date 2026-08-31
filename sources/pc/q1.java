package pc;
public enum q1 extends a2 {
    public q1() {
        super("BeforeDoctypeSystemIdentifier", 61);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f44348m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f44290a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.f44340c = a2.f44325z0;
                            return;
                        }
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f44340c = vVar;
                        return;
                    }
                    kVar.m(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f44340c = vVar;
                    return;
                }
                kVar.f44340c = a2.f44322x0;
                return;
            }
            kVar.f44340c = a2.f44320w0;
        }
    }
}
