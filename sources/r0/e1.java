package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f44799o;
    public i0.b f44800p;
    public i0.b f44801q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f44799o = null;
        this.f44800p = null;
        this.f44801q = null;
    }

    @Override
    public i0.b h() {
        if (this.f44800p == null) {
            this.f44800p = i0.b.c(this.f44791c.getMandatorySystemGestureInsets());
        }
        return this.f44800p;
    }

    @Override
    public i0.b j() {
        if (this.f44799o == null) {
            this.f44799o = i0.b.c(this.f44791c.getSystemGestureInsets());
        }
        return this.f44799o;
    }

    @Override
    public i0.b l() {
        if (this.f44801q == null) {
            this.f44801q = i0.b.c(this.f44791c.getTappableElementInsets());
        }
        return this.f44801q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f44791c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
