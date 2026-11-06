package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f54085o;
    public i0.b f54086p;
    public i0.b f54087q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f54085o = null;
        this.f54086p = null;
        this.f54087q = null;
    }

    @Override
    public i0.b h() {
        if (this.f54086p == null) {
            this.f54086p = i0.b.c(this.f54075c.getMandatorySystemGestureInsets());
        }
        return this.f54086p;
    }

    @Override
    public i0.b j() {
        if (this.f54085o == null) {
            this.f54085o = i0.b.c(this.f54075c.getSystemGestureInsets());
        }
        return this.f54085o;
    }

    @Override
    public i0.b l() {
        if (this.f54087q == null) {
            this.f54087q = i0.b.c(this.f54075c.getTappableElementInsets());
        }
        return this.f54087q;
    }

    @Override
    public k1 m(int i7, int i10, int i11, int i12) {
        return k1.h(null, this.f54075c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
