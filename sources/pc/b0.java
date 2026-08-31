package pc;
public enum b0 extends a2 {
    public b0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.e();
            kVar.h.append(aVar.i());
            kVar.g("<" + aVar.i());
            kVar.a(a2.N);
        } else if (aVar.m('/')) {
            kVar.e();
            kVar.a(a2.L);
        } else {
            kVar.f('<');
            kVar.f44340c = a2.H;
        }
    }
}
