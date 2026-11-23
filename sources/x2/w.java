package x2;

import a8.ma;
public final class w extends l2.a {
    public final e2.l1 h;
    public final int f60376i;
    public final int f60377j;
    public final int f60378k;

    public w(e2.l1 l1Var, int i7) {
        super(new h1(i7));
        boolean z10;
        this.h = l1Var;
        int h = l1Var.h();
        this.f60376i = h;
        this.f60377j = l1Var.o();
        this.f60378k = i7;
        if (h > 0) {
            if (i7 <= Integer.MAX_VALUE / h) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.o("LoopingMediaSource contains too many periods", z10);
        }
    }

    @Override
    public final int h() {
        return this.f60376i * this.f60378k;
    }

    @Override
    public final int o() {
        return this.f60377j * this.f60378k;
    }

    @Override
    public final int q(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    @Override
    public final int r(int i7) {
        return i7 / this.f60376i;
    }

    @Override
    public final int s(int i7) {
        return i7 / this.f60377j;
    }

    @Override
    public final Object t(int i7) {
        return Integer.valueOf(i7);
    }

    @Override
    public final int u(int i7) {
        return i7 * this.f60376i;
    }

    @Override
    public final int v(int i7) {
        return i7 * this.f60377j;
    }

    @Override
    public final e2.l1 x(int i7) {
        return this.h;
    }
}
