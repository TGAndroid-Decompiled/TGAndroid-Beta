package pc;
public enum v1 extends a2 {
    public v1() {
        super("CdataSection", 66);
    }

    @Override
    public final void d(k kVar, a aVar) {
        String c3;
        StringBuilder sb = kVar.h;
        int p10 = aVar.p("]]>");
        String[] strArr = aVar.h;
        char[] cArr = aVar.f44284a;
        if (p10 != -1) {
            c3 = a.c(cArr, strArr, aVar.f44287e, p10);
            aVar.f44287e += p10;
        } else {
            aVar.b();
            int i10 = aVar.f44287e;
            c3 = a.c(cArr, strArr, i10, aVar.f44286c - i10);
            aVar.f44287e = aVar.f44286c;
        }
        sb.append(c3);
        if (!aVar.k("]]>") && !aVar.j()) {
            return;
        }
        String sb2 = sb.toString();
        ?? aVar2 = new n3.a(5, 1);
        aVar2.f44326c = sb2;
        kVar.h(aVar2);
        kVar.f44340c = a2.f44290a;
    }
}
