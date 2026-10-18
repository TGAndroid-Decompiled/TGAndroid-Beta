package v7;
public abstract class p7 {
    public static void a(df.s sVar, df.s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(sVar.f7989g);
            df.p pVar = (df.p) sVar2.f7987f;
            for (df.p pVar2 = (df.p) sVar.f7987f; pVar2 != pVar; pVar2 = (df.p) pVar2.f7987f) {
                sb2.append(((df.s) pVar2).f7989g);
                pVar2.g();
            }
            sVar.f7989g = sb2.toString();
        }
    }

    public static void b(df.p pVar, df.p pVar2) {
        df.s sVar = null;
        df.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof df.s) {
                sVar2 = (df.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.f7989g.length() + i10;
            } else {
                a(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (df.p) pVar.f7987f;
        }
        a(sVar, sVar2, i10);
    }
}
