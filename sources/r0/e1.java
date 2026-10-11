package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f46838o;
    public i0.b f46839p;
    public i0.b f46840q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f46838o = null;
        this.f46839p = null;
        this.f46840q = null;
    }

    @Override
    public i0.b h() {
        if (this.f46839p == null) {
            this.f46839p = i0.b.c(this.f46828c.getMandatorySystemGestureInsets());
        }
        return this.f46839p;
    }

    @Override
    public i0.b j() {
        if (this.f46838o == null) {
            this.f46838o = i0.b.c(this.f46828c.getSystemGestureInsets());
        }
        return this.f46838o;
    }

    @Override
    public i0.b l() {
        if (this.f46840q == null) {
            this.f46840q = i0.b.c(this.f46828c.getTappableElementInsets());
        }
        return this.f46840q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f46828c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
