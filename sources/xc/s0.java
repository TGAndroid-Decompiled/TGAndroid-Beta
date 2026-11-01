package xc;
public enum s0 extends a2 {
    public s0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.H0);
        if (h.length() > 0) {
            kVar.f53667i.f(h);
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
                    v vVar = a2.f53616a;
                    if (d != 65535) {
                        if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                            if (d != '&') {
                                if (d != '\'') {
                                    switch (d) {
                                        case '<':
                                        case '=':
                                            break;
                                        case '>':
                                            kVar.k();
                                            kVar.f53664c = vVar;
                                            return;
                                        default:
                                            kVar.f53667i.e(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c10 = kVar.c('>', true);
                                if (c10 != null) {
                                    kVar.f53667i.g(c10);
                                    return;
                                } else {
                                    kVar.f53667i.e('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        kVar.l(this);
                        kVar.f53664c = vVar;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f53667i.e(d);
                return;
            }
            kVar.f53664c = a2.W;
            return;
        }
        kVar.m(this);
        kVar.f53667i.e((char) 65533);
    }
}
