package y7;
public final class f extends a8.d {
    public final int f52139f;
    public final i h;

    public f(i iVar, int i10) {
        super(iVar);
        this.f52139f = i10;
        this.h = iVar;
    }

    @Override
    public final Object b(int i10) {
        switch (this.f52139f) {
            case 0:
                Object[] objArr = this.h.f52174c;
                objArr.getClass();
                return objArr[i10];
            case 1:
                return new h(this.h, i10);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i10];
        }
    }
}
