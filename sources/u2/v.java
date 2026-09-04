package u2;
public final class v extends i2.a {
    public final b2.k1 h;
    public final int f46828i;
    public final int f46829j;
    public final int f46830k;

    public v(b2.k1 k1Var, int i10) {
        super(new f1(i10));
        boolean z10;
        this.h = k1Var;
        int h = k1Var.h();
        this.f46828i = h;
        this.f46829j = k1Var.o();
        this.f46830k = i10;
        if (h > 0) {
            if (i10 <= Integer.MAX_VALUE / h) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.f("LoopingMediaSource contains too many periods", z10);
        }
    }

    @Override
    public final int h() {
        return this.f46828i * this.f46830k;
    }

    @Override
    public final int o() {
        return this.f46829j * this.f46830k;
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
        return i10 / this.f46828i;
    }

    @Override
    public final int s(int i10) {
        return i10 / this.f46829j;
    }

    @Override
    public final Object t(int i10) {
        return Integer.valueOf(i10);
    }

    @Override
    public final int u(int i10) {
        return i10 * this.f46828i;
    }

    @Override
    public final int v(int i10) {
        return i10 * this.f46829j;
    }

    @Override
    public final b2.k1 x(int i10) {
        return this.h;
    }
}
