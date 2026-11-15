package x2;

import a8.ja;
public final class v extends l2.a {
    public final e2.l1 h;
    public final int f59675i;
    public final int f59676j;
    public final int f59677k;

    public v(e2.l1 l1Var, int i7) {
        super(new f1(i7));
        boolean z10;
        this.h = l1Var;
        int h = l1Var.h();
        this.f59675i = h;
        this.f59676j = l1Var.o();
        this.f59677k = i7;
        if (h > 0) {
            if (i7 <= Integer.MAX_VALUE / h) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.o("LoopingMediaSource contains too many periods", z10);
        }
    }

    @Override
    public final int h() {
        return this.f59675i * this.f59677k;
    }

    @Override
    public final int o() {
        return this.f59676j * this.f59677k;
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
        return i7 / this.f59675i;
    }

    @Override
    public final int s(int i7) {
        return i7 / this.f59676j;
    }

    @Override
    public final Object t(int i7) {
        return Integer.valueOf(i7);
    }

    @Override
    public final int u(int i7) {
        return i7 * this.f59675i;
    }

    @Override
    public final int v(int i7) {
        return i7 * this.f59676j;
    }

    @Override
    public final e2.l1 x(int i7) {
        return this.h;
    }
}
