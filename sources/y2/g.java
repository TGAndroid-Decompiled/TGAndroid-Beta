package y2;
public final class g {
    public final int f46238a;
    public final int f46239b;
    public final int f46240c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f46238a = i10;
        this.f46239b = i11;
        this.f46240c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f46238a - this.f46239b <= 1) {
                return false;
            }
        } else if (this.f46240c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
