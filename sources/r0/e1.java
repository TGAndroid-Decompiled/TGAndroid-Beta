package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f46963o;
    public i0.b f46964p;
    public i0.b f46965q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f46963o = null;
        this.f46964p = null;
        this.f46965q = null;
    }

    @Override
    public i0.b h() {
        if (this.f46964p == null) {
            this.f46964p = i0.b.c(this.f46953c.getMandatorySystemGestureInsets());
        }
        return this.f46964p;
    }

    @Override
    public i0.b j() {
        if (this.f46963o == null) {
            this.f46963o = i0.b.c(this.f46953c.getSystemGestureInsets());
        }
        return this.f46963o;
    }

    @Override
    public i0.b l() {
        if (this.f46965q == null) {
            this.f46965q = i0.b.c(this.f46953c.getTappableElementInsets());
        }
        return this.f46965q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f46953c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
