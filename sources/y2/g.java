package y2;
public final class g {
    public final int f49535a;
    public final int f49536b;
    public final int f49537c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f49535a = i10;
        this.f49536b = i11;
        this.f49537c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f49535a - this.f49536b <= 1) {
                return false;
            }
        } else if (this.f49537c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
