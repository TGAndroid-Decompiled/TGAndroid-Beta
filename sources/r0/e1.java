package r0;

import android.view.WindowInsets;
public class e1 extends d1 {
    public i0.b f46746o;
    public i0.b f46747p;
    public i0.b f46748q;

    public e1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var, windowInsets);
        this.f46746o = null;
        this.f46747p = null;
        this.f46748q = null;
    }

    @Override
    public i0.b h() {
        if (this.f46747p == null) {
            this.f46747p = i0.b.c(this.f46736c.getMandatorySystemGestureInsets());
        }
        return this.f46747p;
    }

    @Override
    public i0.b j() {
        if (this.f46746o == null) {
            this.f46746o = i0.b.c(this.f46736c.getSystemGestureInsets());
        }
        return this.f46746o;
    }

    @Override
    public i0.b l() {
        if (this.f46748q == null) {
            this.f46748q = i0.b.c(this.f46736c.getTappableElementInsets());
        }
        return this.f46748q;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        return k1.h(null, this.f46736c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.b bVar) {
    }
}
