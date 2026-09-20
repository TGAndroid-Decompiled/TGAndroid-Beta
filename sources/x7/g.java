package x7;
public final class g extends e9.t {
    public final int f45715f;
    public final j h;

    public g(j jVar, int i10) {
        super(jVar);
        this.f45715f = i10;
        this.h = jVar;
    }

    @Override
    public final Object b(int i10) {
        switch (this.f45715f) {
            case 0:
                Object[] objArr = this.h.f45759c;
                objArr.getClass();
                return objArr[i10];
            case 1:
                return new i(this.h, i10);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i10];
        }
    }
}
