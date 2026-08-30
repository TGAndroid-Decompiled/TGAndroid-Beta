package pc;
public enum t1 extends a2 {
    public t1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            v vVar = a2.f41127a;
            if (d != '>') {
                if (d != 65535) {
                    kVar.m(this);
                    kVar.f41174c = a2.f41161z0;
                    return;
                }
                kVar.l(this);
                kVar.f41181m.getClass();
                kVar.j();
                kVar.f41174c = vVar;
                return;
            }
            kVar.j();
            kVar.f41174c = vVar;
        }
    }
}
