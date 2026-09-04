package x7;
public final class g extends e9.t {
    public final int f49000f;
    public final j h;

    public g(j jVar, int i10) {
        super(jVar);
        this.f49000f = i10;
        this.h = jVar;
    }

    @Override
    public final Object b(int i10) {
        switch (this.f49000f) {
            case 0:
                Object[] objArr = this.h.f49046c;
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
