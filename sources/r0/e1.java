package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f54178o;
    public i0.b f54179p;
    public i0.b f54180q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f54178o = null;
        this.f54179p = null;
        this.f54180q = null;
    }

    @Override
    public i0.b h() {
        if (this.f54179p == null) {
            this.f54179p = i0.b.c(this.f54168c.getMandatorySystemGestureInsets());
        }
        return this.f54179p;
    }

    @Override
    public i0.b j() {
        if (this.f54178o == null) {
            this.f54178o = i0.b.c(this.f54168c.getSystemGestureInsets());
        }
        return this.f54178o;
    }

    @Override
    public i0.b l() {
        if (this.f54180q == null) {
            this.f54180q = i0.b.c(this.f54168c.getTappableElementInsets());
        }
        return this.f54180q;
    }

    @Override
    public k1 m(int i7, int i10, int i11, int i12) {
        return k1.h(null, this.f54168c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
