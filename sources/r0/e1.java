package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f54086o;
    public i0.b f54087p;
    public i0.b f54088q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f54086o = null;
        this.f54087p = null;
        this.f54088q = null;
    }

    @Override
    public i0.b h() {
        if (this.f54087p == null) {
            this.f54087p = i0.b.c(this.f54076c.getMandatorySystemGestureInsets());
        }
        return this.f54087p;
    }

    @Override
    public i0.b j() {
        if (this.f54086o == null) {
            this.f54086o = i0.b.c(this.f54076c.getSystemGestureInsets());
        }
        return this.f54086o;
    }

    @Override
    public i0.b l() {
        if (this.f54088q == null) {
            this.f54088q = i0.b.c(this.f54076c.getTappableElementInsets());
        }
        return this.f54088q;
    }

    @Override
    public k1 m(int i7, int i10, int i11, int i12) {
        return k1.h(null, this.f54076c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
