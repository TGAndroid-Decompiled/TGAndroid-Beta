package pc;
public enum k1 extends a2 {
    public k1() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override
    public final void d(k kVar, a aVar) {
        f fVar = kVar.f44379m;
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                v vVar = a2.f44321a;
                if (d != '>') {
                    if (d != 65535) {
                        fVar.d.append(d);
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
            kVar.f44371c = a2.f44346s0;
            return;
        }
        kVar.m(this);
        fVar.d.append((char) 65533);
    }
}
