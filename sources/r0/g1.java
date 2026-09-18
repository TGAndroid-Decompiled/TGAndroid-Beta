package r0;

import android.view.WindowInsets;
public class g1 extends f1 {
    public i0.b f42083o;
    public i0.b f42084p;
    public i0.b f42085q;

    public g1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f42083o = null;
        this.f42084p = null;
        this.f42085q = null;
    }

    @Override
    public i0.b h() {
        if (this.f42084p == null) {
            this.f42084p = i0.b.c(this.f42074c.getMandatorySystemGestureInsets());
        }
        return this.f42084p;
    }

    @Override
    public i0.b j() {
        if (this.f42083o == null) {
            this.f42083o = i0.b.c(this.f42074c.getSystemGestureInsets());
        }
        return this.f42083o;
    }

    @Override
    public i0.b l() {
        if (this.f42085q == null) {
            this.f42085q = i0.b.c(this.f42074c.getTappableElementInsets());
        }
        return this.f42085q;
    }

    @Override
    public m1 m(int i10, int i11, int i12, int i13) {
        return m1.h(null, this.f42074c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
