package pc;
public enum g0 extends a2 {
    public g0() {
        super("CharacterReferenceInData", 1);
    }

    @Override
    public final void d(k kVar, a aVar) {
        int[] c3 = kVar.c(null, false);
        if (c3 == null) {
            kVar.f('&');
        } else {
            kVar.g(new String(c3, 0, c3.length));
        }
        kVar.f44371c = a2.f44321a;
    }
}
