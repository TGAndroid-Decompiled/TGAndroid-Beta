package y2;
public final class g {
    public final int f46586a;
    public final int f46587b;
    public final int f46588c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f46586a = i10;
        this.f46587b = i11;
        this.f46588c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f46586a - this.f46587b <= 1) {
                return false;
            }
        } else if (this.f46588c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
