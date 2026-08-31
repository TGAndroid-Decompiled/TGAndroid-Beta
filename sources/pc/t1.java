package pc;
public enum t1 extends a2 {
    public t1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            v vVar = a2.f44290a;
            if (d != '>') {
                if (d != 65535) {
                    kVar.m(this);
                    kVar.f44340c = a2.f44325z0;
                    return;
                }
                kVar.l(this);
                kVar.f44348m.getClass();
                kVar.j();
                kVar.f44340c = vVar;
                return;
            }
            kVar.j();
            kVar.f44340c = vVar;
        }
    }
}
