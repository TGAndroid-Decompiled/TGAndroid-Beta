package pc;
public enum q0 extends a2 {
    public q0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.B0);
        if (g10.length() > 0) {
            kVar.f44344i.k(g10);
        } else {
            kVar.f44344i.f44333n = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        kVar.f44344i.j(d);
                        return;
                    } else {
                        kVar.f44340c = a2.f44291a0;
                        return;
                    }
                }
                int[] c3 = kVar.c('\'', true);
                if (c3 != null) {
                    kVar.f44344i.m(c3);
                    return;
                } else {
                    kVar.f44344i.j('&');
                    return;
                }
            }
            kVar.l(this);
            kVar.f44340c = a2.f44290a;
            return;
        }
        kVar.m(this);
        kVar.f44344i.j((char) 65533);
    }
}
