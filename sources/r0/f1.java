package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f41824o;
    public i0.b f41825p;
    public i0.b f41826q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f41824o = null;
        this.f41825p = null;
        this.f41826q = null;
    }

    @Override
    public i0.b h() {
        if (this.f41825p == null) {
            this.f41825p = i0.b.c(this.f41816c.getMandatorySystemGestureInsets());
        }
        return this.f41825p;
    }

    @Override
    public i0.b j() {
        if (this.f41824o == null) {
            this.f41824o = i0.b.c(this.f41816c.getSystemGestureInsets());
        }
        return this.f41824o;
    }

    @Override
    public i0.b l() {
        if (this.f41826q == null) {
            this.f41826q = i0.b.c(this.f41816c.getTappableElementInsets());
        }
        return this.f41826q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f41816c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
