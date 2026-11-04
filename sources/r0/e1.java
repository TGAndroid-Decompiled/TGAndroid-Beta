package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f54003o;
    public i0.b f54004p;
    public i0.b f54005q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f54003o = null;
        this.f54004p = null;
        this.f54005q = null;
    }

    @Override
    public i0.b h() {
        if (this.f54004p == null) {
            this.f54004p = i0.b.c(this.f53993c.getMandatorySystemGestureInsets());
        }
        return this.f54004p;
    }

    @Override
    public i0.b j() {
        if (this.f54003o == null) {
            this.f54003o = i0.b.c(this.f53993c.getSystemGestureInsets());
        }
        return this.f54003o;
    }

    @Override
    public i0.b l() {
        if (this.f54005q == null) {
            this.f54005q = i0.b.c(this.f53993c.getTappableElementInsets());
        }
        return this.f54005q;
    }

    @Override
    public k1 m(int i3, int i10, int i11, int i12) {
        return k1.h(null, this.f53993c.inset(i3, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
