package pc;
public enum q0 extends a2 {
    public q0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.B0);
        if (g10.length() > 0) {
            kVar.f41177i.l(g10);
        } else {
            kVar.f41177i.f41167n = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        kVar.f41177i.k(d);
                        return;
                    } else {
                        kVar.f41174c = a2.f41128a0;
                        return;
                    }
                }
                int[] c3 = kVar.c('\'', true);
                if (c3 != null) {
                    kVar.f41177i.n(c3);
                    return;
                } else {
                    kVar.f41177i.k('&');
                    return;
                }
            }
            kVar.l(this);
            kVar.f41174c = a2.f41127a;
            return;
        }
        kVar.m(this);
        kVar.f41177i.k((char) 65533);
    }
}
