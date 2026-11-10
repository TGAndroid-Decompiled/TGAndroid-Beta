package x2;
public final class f1 implements g1 {
    public final int f58346a;

    public f1(int i7) {
        this.f58346a = i7;
    }

    @Override
    public final g1 a(int i7, int i10) {
        return new f1((this.f58346a - i10) + i7);
    }

    @Override
    public final int b() {
        if (this.f58346a > 0) {
            return 0;
        }
        return -1;
    }

    @Override
    public final g1 c(int i7) {
        return ((f1) i()).f(0, i7);
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
        if (i10 < this.f58346a) {
            return i10;
        }
        return -1;
    }

    @Override
    public final g1 f(int i7, int i10) {
        return new f1(this.f58346a + i10);
    }

    @Override
    public final int getLength() {
        return this.f58346a;
    }

    @Override
    public final int h() {
        int i7 = this.f58346a;
        if (i7 > 0) {
            return i7 - 1;
        }
        return -1;
    }

    @Override
    public final g1 i() {
        return new f1(0);
    }

    @Override
    public final g1 g() {
        return this;
    }
}
