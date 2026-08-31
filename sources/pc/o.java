package pc;
public enum o extends a2 {
    public o() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(k kVar, a aVar) {
        kVar.g("</" + kVar.h.toString());
        aVar.q();
        kVar.f44340c = a2.f44294c;
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            String e6 = aVar.e();
            kVar.f44344i.n(e6);
            kVar.h.append(e6);
            return;
        }
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                if (d != '>') {
                    e(kVar, aVar);
                } else if (kVar.n()) {
                    kVar.k();
                    kVar.f44340c = a2.f44290a;
                } else {
                    e(kVar, aVar);
                }
            } else if (kVar.n()) {
                kVar.f44340c = a2.f44293b0;
            } else {
                e(kVar, aVar);
            }
        } else if (kVar.n()) {
            kVar.f44340c = a2.T;
        } else {
            e(kVar, aVar);
        }
    }
}
