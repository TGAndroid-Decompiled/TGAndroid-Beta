package x7;
public final class g extends e9.t {
    public final int f50771f;
    public final j h;

    public g(j jVar, int i10) {
        super(jVar);
        this.f50771f = i10;
        this.h = jVar;
    }

    @Override
    public final Object b(int i10) {
        switch (this.f50771f) {
            case 0:
                Object[] objArr = this.h.f50815c;
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
