package x2;

import a8.ia;
public final class w extends l2.a {
    public final e2.l1 h;
    public final int f58496i;
    public final int f58497j;
    public final int f58498k;

    public w(e2.l1 l1Var, int i7) {
        super(new g1(i7));
        boolean z9;
        this.h = l1Var;
        int h = l1Var.h();
        this.f58496i = h;
        this.f58497j = l1Var.o();
        this.f58498k = i7;
        if (h > 0) {
            if (i7 <= Integer.MAX_VALUE / h) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.o("LoopingMediaSource contains too many periods", z9);
        }
    }

    @Override
    public final int h() {
        return this.f58496i * this.f58498k;
    }

    @Override
    public final int o() {
        return this.f58497j * this.f58498k;
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
        return i7 / this.f58496i;
    }

    @Override
    public final int s(int i7) {
        return i7 / this.f58497j;
    }

    @Override
    public final Object t(int i7) {
        return Integer.valueOf(i7);
    }

    @Override
    public final int u(int i7) {
        return i7 * this.f58496i;
    }

    @Override
    public final int v(int i7) {
        return i7 * this.f58497j;
    }

    @Override
    public final e2.l1 x(int i7) {
        return this.h;
    }
}
