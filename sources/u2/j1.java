package u2;
public final class j1 implements k1 {
    public final int f47788a;

    public j1(int i10) {
        this.f47788a = i10;
    }

    @Override
    public final k1 a(int i10, int i11) {
        return new j1((this.f47788a - i11) + i10);
    }

    @Override
    public final int b() {
        if (this.f47788a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final k1 c(int i10) {
        return ((j1) i()).f(0, i10);
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
        if (i11 < this.f47788a) {
            return i11;
        }
        return -1;
    }

    @Override
    public final k1 f(int i10, int i11) {
        return new j1(this.f47788a + i11);
    }

    @Override
    public final int getLength() {
        return this.f47788a;
    }

    @Override
    public final int h() {
        int i10 = this.f47788a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override
    public final k1 i() {
        return new j1(0);
    }

    @Override
    public final k1 g() {
        return this;
    }
}
