package xc;
public enum p0 extends a2 {
    public p0() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.F0);
        if (g10.length() > 0) {
            kVar.f53667i.f(g10);
        } else {
            kVar.f53667i.h = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != '\"') {
                if (d != '&') {
                    if (d != 65535) {
                        kVar.f53667i.e(d);
                        return;
                    }
                    kVar.l(this);
                    kVar.f53664c = a2.f53616a;
                    return;
                }
                int[] c10 = kVar.c('\"', true);
                if (c10 != null) {
                    kVar.f53667i.g(c10);
                    return;
                } else {
                    kVar.f53667i.e('&');
                    return;
                }
            }
            kVar.f53664c = a2.f53622d0;
            return;
        }
        kVar.m(this);
        kVar.f53667i.e((char) 65533);
    }
}
