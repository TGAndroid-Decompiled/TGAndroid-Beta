package pc;
public enum x extends a2 {
    public x() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.m('-')) {
            kVar.f('-');
            kVar.a(a2.J);
            return;
        }
        kVar.f44371c = a2.f44330f;
    }
}
