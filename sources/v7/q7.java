package v7;
public abstract class q7 {
    public static final Object a(fe.s sVar, fe.s sVar2, sd.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new ae.v(th2, false);
        }
        kd.a aVar = kd.a.f14783a;
        if (vVar != aVar && (B = sVar.B(vVar)) != ae.g0.f453e) {
            if (!(B instanceof ae.v)) {
                return ae.g0.u(B);
            }
            throw ((ae.v) B).f509a;
        }
        return aVar;
    }
}
