package pc;
public enum t1 extends a2 {
    public t1() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            v vVar = a2.f44321a;
            if (d != '>') {
                if (d != 65535) {
                    kVar.m(this);
                    kVar.f44371c = a2.f44356z0;
                    return;
                }
                kVar.l(this);
                kVar.f44379m.getClass();
                kVar.j();
                kVar.f44371c = vVar;
                return;
            }
            kVar.j();
            kVar.f44371c = vVar;
        }
    }
}
