package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f46971o;
    public i0.b f46972p;
    public i0.b f46973q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f46971o = null;
        this.f46972p = null;
        this.f46973q = null;
    }

    @Override
    public i0.b h() {
        if (this.f46972p == null) {
            this.f46972p = i0.b.c(this.f46961c.getMandatorySystemGestureInsets());
        }
        return this.f46972p;
    }

    @Override
    public i0.b j() {
        if (this.f46971o == null) {
            this.f46971o = i0.b.c(this.f46961c.getSystemGestureInsets());
        }
        return this.f46971o;
    }

    @Override
    public i0.b l() {
        if (this.f46973q == null) {
            this.f46973q = i0.b.c(this.f46961c.getTappableElementInsets());
        }
        return this.f46973q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f46961c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
