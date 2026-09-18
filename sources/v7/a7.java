package v7;
public abstract class a7 {
    public static void a(bf.s sVar, bf.s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(sVar.f3556g);
            bf.p pVar = (bf.p) sVar2.f3554f;
            for (bf.p pVar2 = (bf.p) sVar.f3554f; pVar2 != pVar; pVar2 = (bf.p) pVar2.f3554f) {
                sb2.append(((bf.s) pVar2).f3556g);
                pVar2.g();
            }
            sVar.f3556g = sb2.toString();
        }
    }

    public static void b(bf.p pVar, bf.p pVar2) {
        bf.s sVar = null;
        bf.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof bf.s) {
                sVar2 = (bf.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.f3556g.length() + i10;
            } else {
                a(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (bf.p) pVar.f3554f;
        }
        a(sVar, sVar2, i10);
    }
}
