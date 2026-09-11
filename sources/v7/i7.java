package v7;
public abstract class i7 {
    public static final Object a(ee.s sVar, ee.s sVar2, rd.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new zd.v(th2, false);
        }
        jd.a aVar = jd.a.f13614a;
        if (vVar != aVar && (B = sVar.B(vVar)) != zd.e0.f51538e) {
            if (!(B instanceof zd.v)) {
                return zd.e0.u(B);
            }
            throw ((zd.v) B).f51607a;
        }
        return aVar;
    }
}
