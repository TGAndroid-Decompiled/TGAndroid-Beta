package pc;
public enum i1 extends a2 {
    public i1() {
        super("AfterDoctypePublicKeyword", 54);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f44379m;
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '\"') {
                if (d != '\'') {
                    v vVar = a2.f44321a;
                    if (d != '>') {
                        if (d != 65535) {
                            kVar.m(this);
                            fVar.getClass();
                            kVar.f44371c = a2.f44356z0;
                            return;
                        }
                        kVar.l(this);
                        fVar.getClass();
                        kVar.j();
                        kVar.f44371c = vVar;
                        return;
                    }
                    kVar.m(this);
                    fVar.getClass();
                    kVar.j();
                    kVar.f44371c = vVar;
                    return;
                }
                kVar.m(this);
                kVar.f44371c = a2.f44344r0;
                return;
            }
            kVar.m(this);
            kVar.f44371c = a2.f44342q0;
            return;
        }
        kVar.f44371c = a2.f44341p0;
    }
}
