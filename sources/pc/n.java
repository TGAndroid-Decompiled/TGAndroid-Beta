package pc;
public enum n extends a2 {
    public n() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.d(false);
            j jVar = kVar.f44375i;
            char i10 = aVar.i();
            jVar.getClass();
            jVar.n(String.valueOf(i10));
            kVar.h.append(aVar.i());
            kVar.a(a2.f44350w);
            return;
        }
        kVar.g("</");
        kVar.f44371c = a2.f44325c;
    }
}
