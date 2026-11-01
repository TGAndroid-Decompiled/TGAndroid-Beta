package w7;
public abstract class x9 {
    public static final Object a(yd.s sVar, yd.s sVar2, ld.p pVar) {
        Object vVar;
        Object B;
        try {
            kotlin.jvm.internal.s.a(2, pVar);
            vVar = pVar.invoke(sVar2, sVar);
        } catch (Throwable th2) {
            vVar = new td.v(th2, false);
        }
        dd.a aVar = dd.a.f5864a;
        if (vVar != aVar && (B = sVar.B(vVar)) != td.e0.e) {
            if (!(B instanceof td.v)) {
                return td.e0.u(B);
            }
            throw ((td.v) B).f48682a;
        }
        return aVar;
    }
}
