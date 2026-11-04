package w2;
public final class h1 implements i1 {
    public final int f57099a;

    public h1(int i3) {
        this.f57099a = i3;
    }

    @Override
    public final i1 a(int i3, int i10) {
        return new h1((this.f57099a - i10) + i3);
    }

    @Override
    public final int b() {
        if (this.f57099a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final i1 c(int i3) {
        return ((h1) i()).f(0, i3);
    }

    @Override
    public final int d(int i3) {
        int i10 = i3 - 1;
        if (i10 < 0) {
            return -1;
        }
        return i10;
    }

    @Override
    public final int e(int i3) {
        int i10 = i3 + 1;
        if (i10 < this.f57099a) {
            return i10;
        }
        return -1;
    }

    @Override
    public final i1 f(int i3, int i10) {
        return new h1(this.f57099a + i10);
    }

    @Override
    public final int getLength() {
        return this.f57099a;
    }

    @Override
    public final int h() {
        int i3 = this.f57099a;
        if (i3 > 0) {
            return i3 - 1;
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
