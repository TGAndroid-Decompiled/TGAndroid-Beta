package z7;
public final class f extends b8.d {
    public final int f59859f;
    public final i h;

    public f(i iVar, int i3) {
        super(iVar);
        this.f59859f = i3;
        this.h = iVar;
    }

    @Override
    public final Object b(int i3) {
        switch (this.f59859f) {
            case 0:
                Object[] objArr = this.h.f59907c;
                objArr.getClass();
                return objArr[i3];
            case 1:
                return new h(this.h, i3);
            default:
                Object[] objArr2 = this.h.d;
                objArr2.getClass();
                return objArr2[i3];
        }
    }
}
