package z7;
public final class a extends e9.t {
    public final int f50803f;
    public final d h;

    public a(d dVar, int i10) {
        super(dVar);
        this.f50803f = i10;
        this.h = dVar;
    }

    @Override
    public final Object b(int i10) {
        switch (this.f50803f) {
            case 0:
                Object[] objArr = this.h.f50849c;
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
