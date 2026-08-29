package q8;
public final class m extends j7.k {
    public final int f46464f;
    public final p h;

    public m(p pVar, int i10) {
        super(pVar);
        this.f46464f = i10;
        this.h = pVar;
    }

    @Override
    public final Object a(int i10) {
        switch (this.f46464f) {
            case 0:
                return this.h.i()[i10];
            case 1:
                return new o(this.h, i10);
            default:
                return this.h.j()[i10];
        }
    }
}
