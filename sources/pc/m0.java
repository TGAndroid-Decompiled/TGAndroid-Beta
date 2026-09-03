package pc;
public enum m0 extends a2 {
    public m0() {
        super("AttributeName", 34);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.D0);
        j jVar = kVar.f44375i;
        String str = jVar.f44362e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.f44362e = h;
        char d = aVar.d();
        if (d != 0) {
            if (d != ' ') {
                if (d != '\"' && d != '\'') {
                    if (d != '/') {
                        v vVar = a2.f44321a;
                        if (d != 65535) {
                            if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                                switch (d) {
                                    case '<':
                                        break;
                                    case '=':
                                        kVar.f44371c = a2.W;
                                        return;
                                    case '>':
                                        kVar.k();
                                        kVar.f44371c = vVar;
                                        return;
                                    default:
                                        kVar.f44375i.i(d);
                                        return;
                                }
                            }
                        } else {
                            kVar.l(this);
                            kVar.f44371c = vVar;
                            return;
                        }
                    } else {
                        kVar.f44371c = a2.f44324b0;
                        return;
                    }
                }
                kVar.m(this);
                kVar.f44375i.i(d);
                return;
            }
            kVar.f44371c = a2.V;
            return;
        }
        kVar.m(this);
        kVar.f44375i.i((char) 65533);
    }
}
