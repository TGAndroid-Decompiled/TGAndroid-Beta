package pc;
public enum q0 extends a2 {
    public q0() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String g10 = aVar.g(a2.B0);
        if (g10.length() > 0) {
            kVar.f44375i.k(g10);
        } else {
            kVar.f44375i.f44364n = true;
        }
        char d = aVar.d();
        if (d != 0) {
            if (d != 65535) {
                if (d != '&') {
                    if (d != '\'') {
                        kVar.f44375i.j(d);
                        return;
                    } else {
                        kVar.f44371c = a2.f44322a0;
                        return;
                    }
                }
                int[] c3 = kVar.c('\'', true);
                if (c3 != null) {
                    kVar.f44375i.m(c3);
                    return;
                } else {
                    kVar.f44375i.j('&');
                    return;
                }
            }
            kVar.l(this);
            kVar.f44371c = a2.f44321a;
            return;
        }
        kVar.m(this);
        kVar.f44375i.j((char) 65533);
    }
}
