package v7;
public abstract class c7 {
    public static void a(cf.s sVar, cf.s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(sVar.f4657g);
            cf.p pVar = (cf.p) sVar2.f4655f;
            for (cf.p pVar2 = (cf.p) sVar.f4655f; pVar2 != pVar; pVar2 = (cf.p) pVar2.f4655f) {
                sb2.append(((cf.s) pVar2).f4657g);
                pVar2.g();
            }
            sVar.f4657g = sb2.toString();
        }
    }

    public static void b(cf.p pVar, cf.p pVar2) {
        cf.s sVar = null;
        cf.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof cf.s) {
                sVar2 = (cf.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.f4657g.length() + i10;
            } else {
                a(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (cf.p) pVar.f4655f;
        }
        a(sVar, sVar2, i10);
    }
}
