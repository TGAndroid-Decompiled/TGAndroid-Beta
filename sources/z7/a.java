package z7;
public final class a extends e9.v {
    public final int f49334f;
    public final d h;

    public a(d dVar, int i10) {
        super(dVar);
        this.f49334f = i10;
        this.h = dVar;
    }

    @Override
    public final Object b(int i10) {
        switch (this.f49334f) {
            case 0:
                Object[] objArr = this.h.f49377c;
                objArr.getClass();
                return objArr[i10];
            case 1:
                return new c(this.h, i10);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i10];
        }
    }
}
