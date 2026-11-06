package x2;
public final class g1 implements h1 {
    public final int f58214a;

    public g1(int i7) {
        this.f58214a = i7;
    }

    @Override
    public final h1 a(int i7, int i10) {
        return new g1((this.f58214a - i10) + i7);
    }

    @Override
    public final int b() {
        if (this.f58214a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final h1 c(int i7) {
        return ((g1) i()).f(0, i7);
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
        if (i10 < this.f58214a) {
            return i10;
        }
        return -1;
    }

    @Override
    public final h1 f(int i7, int i10) {
        return new g1(this.f58214a + i10);
    }

    @Override
    public final int getLength() {
        return this.f58214a;
    }

    @Override
    public final int h() {
        int i7 = this.f58214a;
        if (i7 > 0) {
            return i7 - 1;
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
