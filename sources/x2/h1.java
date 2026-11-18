package x2;
public final class h1 implements i1 {
    public final int f60106a;

    public h1(int i7) {
        this.f60106a = i7;
    }

    @Override
    public final i1 a(int i7, int i10) {
        return new h1((this.f60106a - i10) + i7);
    }

    @Override
    public final int b() {
        if (this.f60106a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final i1 c(int i7) {
        return ((h1) i()).f(0, i7);
    }

    @Override
    public final int d(int i7) {
        int i10 = i7 - 1;
        if (i10 < 0) {
            return -1;
        }
        return i10;
    }

    @Override
    public final int e(int i7) {
        int i10 = i7 + 1;
        if (i10 < this.f60106a) {
            return i10;
        }
        return -1;
    }

    @Override
    public final i1 f(int i7, int i10) {
        return new h1(this.f60106a + i10);
    }

    @Override
    public final int getLength() {
        return this.f60106a;
    }

    @Override
    public final int h() {
        int i7 = this.f60106a;
        if (i7 > 0) {
            return i7 - 1;
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
