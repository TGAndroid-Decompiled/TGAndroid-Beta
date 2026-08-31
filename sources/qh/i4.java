package qh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class i4 implements dg.y {
    public boolean f45419a;
    public final dg.e1 f45420b;
    public final f9 f45421c;

    public i4(f9 f9Var, dg.e1 e1Var) {
        this.f45421c = f9Var;
        this.f45420b = e1Var;
    }

    @Override
    public final void a() {
        this.f45419a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        s4 s4Var = this.f45421c.L0;
        Matrix matrix = s4Var.getMatrix();
        canvas.save();
        canvas.translate(s4Var.getX(), s4Var.getY());
        canvas.concat(matrix);
        s4Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f45419a;
    }

    @Override
    public final void d() {
        this.f45419a = false;
    }

    @Override
    public final View e() {
        return this.f45421c;
    }

    @Override
    public final FrameLayout f() {
        return this.f45421c.S0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        f9 f9Var = this.f45421c;
        f9Var.I0(false);
        dg.e1 e1Var = this.f45420b;
        e1Var.h(i10, true);
        e1Var.g();
        f9Var.setNewColor(i10);
        h4 h4Var = f9Var.f44981t1;
        h4Var.setSelectedColorIndex(e1Var.d());
        h4Var.getAdapter().l();
    }
}
