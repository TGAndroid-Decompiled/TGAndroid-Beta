package v7;
public abstract class u7 {
    public static final Object a(ge.s sVar, ge.s sVar2, td.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new be.v(th2, false);
        }
        ld.a aVar = ld.a.f16001a;
        if (vVar != aVar && (B = sVar.B(vVar)) != be.f0.e) {
            if (!(B instanceof be.v)) {
                return be.f0.u(B);
            }
            throw ((be.v) B).f4330a;
        }
        return aVar;
    }
}
