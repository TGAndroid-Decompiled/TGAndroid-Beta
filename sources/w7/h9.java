package w7;
public abstract class h9 {
    public static void a(ve.r rVar, ve.r rVar2, int i10) {
        if (rVar != null && rVar2 != null && rVar != rVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(rVar.f50825g);
            df.c cVar = (df.c) rVar2.f5879f;
            for (df.c cVar2 = (df.c) rVar.f5879f; cVar2 != cVar; cVar2 = (df.c) cVar2.f5879f) {
                sb2.append(((ve.r) cVar2).f50825g);
                cVar2.g();
            }
            rVar.f50825g = sb2.toString();
        }
    }

    public static void b(df.c cVar, df.c cVar2) {
        ve.r rVar = null;
        ve.r rVar2 = null;
        int i10 = 0;
        while (cVar != null) {
            if (cVar instanceof ve.r) {
                rVar2 = (ve.r) cVar;
                if (rVar == null) {
                    rVar = rVar2;
                }
                i10 = rVar2.f50825g.length() + i10;
            } else {
                a(rVar, rVar2, i10);
                rVar = null;
                rVar2 = null;
                i10 = 0;
            }
            if (cVar == cVar2) {
                break;
            }
            cVar = (df.c) cVar.f5879f;
        }
        a(rVar, rVar2, i10);
    }
}
