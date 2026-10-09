package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f46748o;
    public i0.b f46749p;
    public i0.b f46750q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f46748o = null;
        this.f46749p = null;
        this.f46750q = null;
    }

    @Override
    public i0.b h() {
        if (this.f46749p == null) {
            this.f46749p = i0.b.c(this.f46738c.getMandatorySystemGestureInsets());
        }
        return this.f46749p;
    }

    @Override
    public i0.b j() {
        if (this.f46748o == null) {
            this.f46748o = i0.b.c(this.f46738c.getSystemGestureInsets());
        }
        return this.f46748o;
    }

    @Override
    public i0.b l() {
        if (this.f46750q == null) {
            this.f46750q = i0.b.c(this.f46738c.getTappableElementInsets());
        }
        return this.f46750q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f46738c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
