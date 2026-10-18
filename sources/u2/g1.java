package u2;
public final class g1 implements h1 {
    public final int f47353a;

    public g1(int i10) {
        this.f47353a = i10;
    }

    @Override
    public final h1 a(int i10, int i11) {
        return new g1((this.f47353a - i11) + i10);
    }

    @Override
    public final int b() {
        if (this.f47353a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final h1 c(int i10) {
        return ((g1) i()).f(0, i10);
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
        if (i11 < this.f47353a) {
            return i11;
        }
        return -1;
    }

    @Override
    public final h1 f(int i10, int i11) {
        return new g1(this.f47353a + i11);
    }

    @Override
    public final int getLength() {
        return this.f47353a;
    }

    @Override
    public final int h() {
        int i10 = this.f47353a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override
    public final h1 i() {
        return new g1(0);
    }

    @Override
    public final h1 g() {
        return this;
    }
}
