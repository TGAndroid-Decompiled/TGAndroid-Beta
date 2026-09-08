package y2;
public final class g {
    public final int f49534a;
    public final int f49535b;
    public final int f49536c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f49534a = i10;
        this.f49535b = i11;
        this.f49536c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f49534a - this.f49535b <= 1) {
                return false;
            }
        } else if (this.f49536c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
