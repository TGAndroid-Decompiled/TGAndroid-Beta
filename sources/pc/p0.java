package pc;
public enum p0 extends a2 {
    public p0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.C0);
        if (g10.length() > 0) {
            kVar.f41200i.l(g10);
        } else {
            kVar.f41200i.f41190n = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        kVar.f41200i.k(d);
                        return;
                    }
                    kVar.l(this);
                    kVar.f41197c = a2.f41150a;
                    return;
                }
                int[] c3 = kVar.c('\"', true);
                if (c3 != null) {
                    kVar.f41200i.m(c3);
                    return;
                } else {
                    kVar.f41200i.k('&');
                    return;
                }
            }
            kVar.f41197c = a2.f41151a0;
            return;
        }
        kVar.m(this);
        kVar.f41200i.k((char) 65533);
    }
}
