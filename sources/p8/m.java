package p8;

public final class m extends i7.k {

    public final int f45557f;
    public final p h;

    public m(p pVar, int i10) {
        super(pVar);
        this.f45557f = i10;
        this.h = pVar;
    }

    @Override
    public final Object a(int i10) {
        switch (this.f45557f) {
            case 0:
                return this.h.i()[i10];
            case 1:
                return new o(this.h, i10);
            default:
                return this.h.j()[i10];
        }
    }
}
