package pc;
public enum q1 extends a2 {
    public q1() {
        super("BeforeDoctypeSystemIdentifier", 61);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f41181m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f41127a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.f41174c = a2.f41161z0;
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
                kVar.f41174c = a2.f41158x0;
                return;
            }
            kVar.f41174c = a2.f41156w0;
        }
    }
}
