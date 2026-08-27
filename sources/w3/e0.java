package w3;

public final class e0 {

    public final String f49050a;

    public final int f49051b;

    public final int f49052c;
    public int d;

    public String f49053e;

    public e0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public final void a() {
        int i10 = this.d;
        this.d = i10 == Integer.MIN_VALUE ? this.f49051b : i10 + this.f49052c;
        this.f49053e = this.f49050a + this.d;
    }

    public final void b() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public e0(int i10, int i11, int i12) {
        this.f49050a = i10 != Integer.MIN_VALUE ? s3.c.d(i10, "/") : "";
        this.f49051b = i11;
        this.f49052c = i12;
        this.d = Integer.MIN_VALUE;
        this.f49053e = "";
    }
}
