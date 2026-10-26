package u2;

import a8.yb;
public final class w extends i2.a {
    public final b2.p1 h;
    public final int f49445i;
    public final int f49446j;
    public final int f49447k;

    public w(b2.p1 p1Var, int i10) {
        super(new h1(i10));
        boolean z10;
        this.h = p1Var;
        int h = p1Var.h();
        this.f49445i = h;
        this.f49446j = p1Var.o();
        this.f49447k = i10;
        if (h > 0) {
            if (i10 <= Integer.MAX_VALUE / h) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.o("LoopingMediaSource contains too many periods", z10);
        }
    }

    @Override
    public final int h() {
        return this.f49445i * this.f49447k;
    }

    @Override
    public final int o() {
        return this.f49446j * this.f49447k;
    }

    @Override
    public final int q(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    @Override
    public final int r(int i10) {
        return i10 / this.f49445i;
    }

    @Override
    public final int s(int i10) {
        return i10 / this.f49446j;
    }

    @Override
    public final Object t(int i10) {
        return Integer.valueOf(i10);
    }

    @Override
    public final int u(int i10) {
        return i10 * this.f49445i;
    }

    @Override
    public final int v(int i10) {
        return i10 * this.f49446j;
    }

    @Override
    public final b2.p1 x(int i10) {
        return this.h;
    }
}
