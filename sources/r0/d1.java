package r0;

import android.view.WindowInsets;
public class d1 extends c1 {
    public i0.c f46107o;
    public i0.c f46108p;
    public i0.c f46109q;

    public d1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var, windowInsets);
        this.f46107o = null;
        this.f46108p = null;
        this.f46109q = null;
    }

    @Override
    public i0.c h() {
        if (this.f46108p == null) {
            this.f46108p = i0.c.c(this.f46100c.getMandatorySystemGestureInsets());
        }
        return this.f46108p;
    }

    @Override
    public i0.c j() {
        if (this.f46107o == null) {
            this.f46107o = i0.c.c(this.f46100c.getSystemGestureInsets());
        }
        return this.f46107o;
    }

    @Override
    public i0.c l() {
        if (this.f46109q == null) {
            this.f46109q = i0.c.c(this.f46100c.getTappableElementInsets());
        }
        return this.f46109q;
    }

    @Override
    public j1 m(int i10, int i11, int i12, int i13) {
        return j1.h(null, this.f46100c.inset(i10, i11, i12, i13));
    }

    @Override
    public void s(i0.c cVar) {
    }
}
