package y2;
public final class g {
    public final int f46607a;
    public final int f46608b;
    public final int f46609c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f46607a = i10;
        this.f46608b = i11;
        this.f46609c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f46607a - this.f46608b <= 1) {
                return false;
            }
        } else if (this.f46609c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
