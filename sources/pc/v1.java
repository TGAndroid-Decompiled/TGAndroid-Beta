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
        char[] cArr = aVar.f41122a;
        if (p10 != -1) {
            c3 = a.c(cArr, strArr, aVar.e, p10);
            aVar.e += p10;
        } else {
            aVar.b();
            int i10 = aVar.e;
            c3 = a.c(cArr, strArr, i10, aVar.f41124c - i10);
            aVar.e = aVar.f41124c;
        }
        sb.append(c3);
        if (!aVar.k("]]>") && !aVar.j()) {
            return;
        }
        String sb2 = sb.toString();
        ?? aVar2 = new n3.a(5, 1);
        aVar2.f41162c = sb2;
        kVar.h(aVar2);
        kVar.f41174c = a2.f41127a;
    }
}
