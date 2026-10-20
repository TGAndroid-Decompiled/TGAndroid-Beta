package u2;
public final class i1 implements j1 {
    public final int f47334a;

    public i1(int i10) {
        this.f47334a = i10;
    }

    @Override
    public final j1 a(int i10, int i11) {
        return new i1((this.f47334a - i11) + i10);
    }

    @Override
    public final int b() {
        if (this.f47334a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final j1 c(int i10) {
        return ((i1) i()).f(0, i10);
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
        if (i11 < this.f47334a) {
            return i11;
        }
        return -1;
    }

    @Override
    public final j1 f(int i10, int i11) {
        return new i1(this.f47334a + i11);
    }

    @Override
    public final int getLength() {
        return this.f47334a;
    }

    @Override
    public final int h() {
        int i10 = this.f47334a;
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    @Override
    public final j1 i() {
        return new i1(0);
    }

    @Override
    public final j1 g() {
        return this;
    }
}
