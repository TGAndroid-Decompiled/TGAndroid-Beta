package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f54179o;
    public i0.b f54180p;
    public i0.b f54181q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f54179o = null;
        this.f54180p = null;
        this.f54181q = null;
    }

    @Override
    public i0.b h() {
        if (this.f54180p == null) {
            this.f54180p = i0.b.c(this.f54169c.getMandatorySystemGestureInsets());
        }
        return this.f54180p;
    }

    @Override
    public i0.b j() {
        if (this.f54179o == null) {
            this.f54179o = i0.b.c(this.f54169c.getSystemGestureInsets());
        }
        return this.f54179o;
    }

    @Override
    public i0.b l() {
        if (this.f54181q == null) {
            this.f54181q = i0.b.c(this.f54169c.getTappableElementInsets());
        }
        return this.f54181q;
    }

    @Override
    public k1 m(int i7, int i10, int i11, int i12) {
        return k1.h(null, this.f54169c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
