package pc;
public enum s0 extends a2 {
    public s0() {
        super("AttributeValue_unquoted", 39);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.E0);
        if (h.length() > 0) {
            kVar.f41200i.l(h);
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '`') {
                    v vVar = a2.f41150a;
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
                                            kVar.f41197c = vVar;
                                            return;
                                        default:
                                            kVar.f41200i.k(d);
                                            return;
                                    }
                                }
                            } else {
                                int[] c3 = kVar.c('>', true);
                                if (c3 != null) {
                                    kVar.f41200i.m(c3);
                                    return;
                                } else {
                                    kVar.f41200i.k('&');
                                    return;
                                }
                            }
                        }
                    } else {
                        kVar.l(this);
                        kVar.f41197c = vVar;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f41200i.k(d);
                return;
            }
            kVar.f41197c = a2.T;
            return;
        }
        kVar.m(this);
        kVar.f41200i.k((char) 65533);
    }
}
