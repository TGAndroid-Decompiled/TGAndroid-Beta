package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f41855o;
    public i0.b f41856p;
    public i0.b f41857q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f41855o = null;
        this.f41856p = null;
        this.f41857q = null;
    }

    @Override
    public i0.b h() {
        if (this.f41856p == null) {
            this.f41856p = i0.b.c(this.f41847c.getMandatorySystemGestureInsets());
        }
        return this.f41856p;
    }

    @Override
    public i0.b j() {
        if (this.f41855o == null) {
            this.f41855o = i0.b.c(this.f41847c.getSystemGestureInsets());
        }
        return this.f41855o;
    }

    @Override
    public i0.b l() {
        if (this.f41857q == null) {
            this.f41857q = i0.b.c(this.f41847c.getTappableElementInsets());
        }
        return this.f41857q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f41847c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
