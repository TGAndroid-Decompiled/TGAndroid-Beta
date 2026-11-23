package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f56356o;
    public i0.b f56357p;
    public i0.b f56358q;

    public e1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f56356o = null;
        this.f56357p = null;
        this.f56358q = null;
    }

    @Override
    public i0.b h() {
        if (this.f56357p == null) {
            this.f56357p = i0.b.c(this.f56346c.getMandatorySystemGestureInsets());
        }
        return this.f56357p;
    }

    @Override
    public i0.b j() {
        if (this.f56356o == null) {
            this.f56356o = i0.b.c(this.f56346c.getSystemGestureInsets());
        }
        return this.f56356o;
    }

    @Override
    public i0.b l() {
        if (this.f56358q == null) {
            this.f56358q = i0.b.c(this.f56346c.getTappableElementInsets());
        }
        return this.f56358q;
    }

    @Override
    public l1 m(int i7, int i10, int i11, int i12) {
        return l1.h(null, this.f56346c.inset(i7, i10, i11, i12));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
