package y3;
public final class d0 {
    public final String f50258a;
    public final int f50259b;
    public final int f50260c;
    public int d;
    public String f50261e;

    public d0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.d;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.f50259b;
        } else {
            i10 = i11 + this.f50260c;
        }
        this.d = i10;
        this.f50261e = this.f50258a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public d0(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = u3.c.d(i10, "/");
        }
        this.f50258a = str;
        this.f50259b = i11;
        this.f50260c = i12;
        this.d = Integer.MIN_VALUE;
        this.f50261e = "";
    }
}
