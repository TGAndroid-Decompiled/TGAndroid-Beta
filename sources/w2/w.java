package w2;

import b8.zb;
public final class w extends k2.a {
    public final d2.n1 h;
    public final int f57241i;
    public final int f57242j;
    public final int f57243k;

    public w(d2.n1 n1Var, int i3) {
        super(new h1(i3));
        boolean z10;
        this.h = n1Var;
        int h = n1Var.h();
        this.f57241i = h;
        this.f57242j = n1Var.o();
        this.f57243k = i3;
        if (h > 0) {
            if (i3 <= Integer.MAX_VALUE / h) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.o("LoopingMediaSource contains too many periods", z10);
        }
    }

    @Override
    public final int h() {
        return this.f57241i * this.f57243k;
    }

    @Override
    public final int o() {
        return this.f57242j * this.f57243k;
    }

    @Override
    public final int q(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    @Override
    public final int r(int i3) {
        return i3 / this.f57241i;
    }

    @Override
    public final int s(int i3) {
        return i3 / this.f57242j;
    }

    @Override
    public final Object t(int i3) {
        return Integer.valueOf(i3);
    }

    @Override
    public final int u(int i3) {
        return i3 * this.f57241i;
    }

    @Override
    public final int v(int i3) {
        return i3 * this.f57242j;
    }

    @Override
    public final d2.n1 x(int i3) {
        return this.h;
    }
}
