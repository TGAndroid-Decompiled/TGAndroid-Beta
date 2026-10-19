package u2;
public final class h1 implements i1 {
    public final int f47312a;

    public h1(int i10) {
        this.f47312a = i10;
    }

    @Override
    public final i1 a(int i10, int i11) {
        return new h1((this.f47312a - i11) + i10);
    }

    @Override
    public final int b() {
        if (this.f47312a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final i1 c(int i10) {
        return ((h1) i()).f(0, i10);
    }

    @Override
    public final int d(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0) {
            return -1;
        }
        return i11;
    }

    @Override
    public final int e(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f47312a) {
            return i11;
        }
        return -1;
    }

    @Override
    public final i1 f(int i10, int i11) {
        return new h1(this.f47312a + i11);
    }

    @Override
    public final int getLength() {
        return this.f47312a;
    }

    @Override
    public final int h() {
        int i10 = this.f47312a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override
    public final i1 i() {
        return new h1(0);
    }

    @Override
    public final i1 g() {
        return this;
    }
}
