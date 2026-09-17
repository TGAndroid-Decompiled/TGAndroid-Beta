package y2;
public final class g {
    public final int f49506a;
    public final int f49507b;
    public final int f49508c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f49506a = i10;
        this.f49507b = i11;
        this.f49508c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f49506a - this.f49507b <= 1) {
                return false;
            }
        } else if (this.f49508c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
