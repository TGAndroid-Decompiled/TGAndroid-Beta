package r0;

import android.view.WindowInsets;

public class z0 extends c1 {

    public final WindowInsets.Builder f46656c;

    public z0() {
        this.f46656c = android.support.v4.media.session.z.g();
    }

    @Override
    public m1 b() {
        a();
        m1 m1VarH = m1.h(null, this.f46656c.build());
        m1VarH.f46619a.q(this.f46571b);
        return m1VarH;
    }

    @Override
    public void d(i0.c cVar) {
        this.f46656c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override
    public void e(i0.c cVar) {
        this.f46656c.setStableInsets(cVar.d());
    }

    @Override
    public void f(i0.c cVar) {
        this.f46656c.setSystemGestureInsets(cVar.d());
    }

    @Override
    public void g(i0.c cVar) {
        this.f46656c.setSystemWindowInsets(cVar.d());
    }

    @Override
    public void h(i0.c cVar) {
        this.f46656c.setTappableElementInsets(cVar.d());
    }

    public z0(m1 m1Var) {
        WindowInsets.Builder builderG;
        super(m1Var);
        WindowInsets windowInsetsG = m1Var.g();
        if (windowInsetsG != null) {
            builderG = android.support.v4.media.session.z.h(windowInsetsG);
        } else {
            builderG = android.support.v4.media.session.z.g();
        }
        this.f46656c = builderG;
    }
}
