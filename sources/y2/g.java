package y2;
public final class g {
    public final int f49505a;
    public final int f49506b;
    public final int f49507c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f49505a = i10;
        this.f49506b = i11;
        this.f49507c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f49505a - this.f49506b <= 1) {
                return false;
            }
        } else if (this.f49507c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
