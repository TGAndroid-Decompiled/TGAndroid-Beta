package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f46792o;
    public i0.b f46793p;
    public i0.b f46794q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f46792o = null;
        this.f46793p = null;
        this.f46794q = null;
    }

    @Override
    public i0.b h() {
        if (this.f46793p == null) {
            this.f46793p = i0.b.c(this.f46782c.getMandatorySystemGestureInsets());
        }
        return this.f46793p;
    }

    @Override
    public i0.b j() {
        if (this.f46792o == null) {
            this.f46792o = i0.b.c(this.f46782c.getSystemGestureInsets());
        }
        return this.f46792o;
    }

    @Override
    public i0.b l() {
        if (this.f46794q == null) {
            this.f46794q = i0.b.c(this.f46782c.getTappableElementInsets());
        }
        return this.f46794q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f46782c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
