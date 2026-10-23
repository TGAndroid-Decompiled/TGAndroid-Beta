package u2;

import v7.u6;
public final class x extends i2.a {
    public final b2.o1 h;
    public final int f47916i;
    public final int f47917j;
    public final int f47918k;

    public x(b2.o1 o1Var, int i10) {
        super(new j1(i10));
        boolean z10;
        this.h = o1Var;
        int h = o1Var.h();
        this.f47916i = h;
        this.f47917j = o1Var.o();
        this.f47918k = i10;
        if (h > 0) {
            if (i10 <= Integer.MAX_VALUE / h) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.o("LoopingMediaSource contains too many periods", z10);
        }
    }

    @Override
    public final int h() {
        return this.f47916i * this.f47918k;
    }

    @Override
    public final int o() {
        return this.f47917j * this.f47918k;
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
        return i10 / this.f47916i;
    }

    @Override
    public final int s(int i10) {
        return i10 / this.f47917j;
    }

    @Override
    public final Object t(int i10) {
        return Integer.valueOf(i10);
    }

    @Override
    public final int u(int i10) {
        return i10 * this.f47916i;
    }

    @Override
    public final int v(int i10) {
        return i10 * this.f47917j;
    }

    @Override
    public final b2.o1 x(int i10) {
        return this.h;
    }
}
