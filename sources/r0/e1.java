package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f46872o;
    public i0.b f46873p;
    public i0.b f46874q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f46872o = null;
        this.f46873p = null;
        this.f46874q = null;
    }

    @Override
    public i0.b h() {
        if (this.f46873p == null) {
            this.f46873p = i0.b.c(this.f46862c.getMandatorySystemGestureInsets());
        }
        return this.f46873p;
    }

    @Override
    public i0.b j() {
        if (this.f46872o == null) {
            this.f46872o = i0.b.c(this.f46862c.getSystemGestureInsets());
        }
        return this.f46872o;
    }

    @Override
    public i0.b l() {
        if (this.f46874q == null) {
            this.f46874q = i0.b.c(this.f46862c.getTappableElementInsets());
        }
        return this.f46874q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f46862c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
