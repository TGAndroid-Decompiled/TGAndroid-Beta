package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f42099o;
    public i0.b f42100p;
    public i0.b f42101q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42099o = null;
        this.f42100p = null;
        this.f42101q = null;
    }

    @Override
    public i0.b h() {
        if (this.f42100p == null) {
            this.f42100p = i0.b.c(this.f42091c.getMandatorySystemGestureInsets());
        }
        return this.f42100p;
    }

    @Override
    public i0.b j() {
        if (this.f42099o == null) {
            this.f42099o = i0.b.c(this.f42091c.getSystemGestureInsets());
        }
        return this.f42099o;
    }

    @Override
    public i0.b l() {
        if (this.f42101q == null) {
            this.f42101q = i0.b.c(this.f42091c.getTappableElementInsets());
        }
        return this.f42101q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f42091c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
