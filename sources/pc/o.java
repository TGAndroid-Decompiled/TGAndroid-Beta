package pc;
public enum o extends a2 {
    public o() {
        super("RCDATAEndTagName", 12);
    }

    public static void e(k kVar, a aVar) {
        kVar.g("</" + kVar.h.toString());
        aVar.q();
        kVar.f41174c = a2.f41131c;
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            String e = aVar.e();
            kVar.f41177i.o(e);
            kVar.h.append(e);
            return;
        }
        char d = aVar.d();
        if (d != '\t' && d != '\n' && d != '\f' && d != '\r' && d != ' ') {
            if (d != '/') {
                if (d != '>') {
                    e(kVar, aVar);
                } else if (kVar.n()) {
                    kVar.k();
                    kVar.f41174c = a2.f41127a;
                } else {
                    e(kVar, aVar);
                }
            } else if (kVar.n()) {
                kVar.f41174c = a2.f41130b0;
            } else {
                e(kVar, aVar);
            }
        } else if (kVar.n()) {
            kVar.f41174c = a2.T;
        } else {
            e(kVar, aVar);
        }
    }
}
