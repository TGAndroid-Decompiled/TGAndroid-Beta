package r0;

import android.view.WindowInsets;
public class f1 extends e1 {
    public i0.b f42113o;
    public i0.b f42114p;
    public i0.b f42115q;

    public f1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var, windowInsets);
        this.f42113o = null;
        this.f42114p = null;
        this.f42115q = null;
    }

    @Override
    public i0.b h() {
        if (this.f42114p == null) {
            this.f42114p = i0.b.c(this.f42105c.getMandatorySystemGestureInsets());
        }
        return this.f42114p;
    }

    @Override
    public i0.b j() {
        if (this.f42113o == null) {
            this.f42113o = i0.b.c(this.f42105c.getSystemGestureInsets());
        }
        return this.f42113o;
    }

    @Override
    public i0.b l() {
        if (this.f42115q == null) {
            this.f42115q = i0.b.c(this.f42105c.getTappableElementInsets());
        }
        return this.f42115q;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        return l1.h(null, this.f42105c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
