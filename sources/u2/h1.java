package u2;
public final class h1 implements i1 {
    public final int f42330a;

    public h1(int i10) {
        this.f42330a = i10;
    }

    @Override
    public final i1 a(int i10, int i11) {
        return new h1((this.f42330a - i11) + i10);
    }

    @Override
    public final int b() {
        if (this.f42330a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final int c(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0) {
            return -1;
        }
        return i11;
    }

    @Override
    public final int d(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f42330a) {
            return i11;
        }
        return -1;
    }

    @Override
    public final i1 e(int i10, int i11) {
        return new h1(this.f42330a + i11);
    }

    @Override
    public final int g() {
        int i10 = this.f42330a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override
    public final int getLength() {
        return this.f42330a;
    }

    @Override
    public final i1 h() {
        return new h1(0);
    }

    @Override
    public final i1 f() {
        return this;
    }
}
