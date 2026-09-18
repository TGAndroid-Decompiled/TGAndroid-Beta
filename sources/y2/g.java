package y2;
public final class g {
    public final int f46539a;
    public final int f46540b;
    public final int f46541c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f46539a = i10;
        this.f46540b = i11;
        this.f46541c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f46539a - this.f46540b <= 1) {
                return false;
            }
        } else if (this.f46541c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
