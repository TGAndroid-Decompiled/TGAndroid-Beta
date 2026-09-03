package qh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class h4 implements dg.y {
    public boolean f45401a;
    public final dg.e1 f45402b;
    public final e9 f45403c;

    public h4(e9 e9Var, dg.e1 e1Var) {
        this.f45403c = e9Var;
        this.f45402b = e1Var;
    }

    @Override
    public final void a() {
        this.f45401a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        r4 r4Var = this.f45403c.L0;
        Matrix matrix = r4Var.getMatrix();
        canvas.save();
        canvas.translate(r4Var.getX(), r4Var.getY());
        canvas.concat(matrix);
        r4Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f45401a;
    }

    @Override
    public final void d() {
        this.f45401a = false;
    }

    @Override
    public final View e() {
        return this.f45403c;
    }

    @Override
    public final FrameLayout f() {
        return this.f45403c.S0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        e9 e9Var = this.f45403c;
        e9Var.I0(false);
        dg.e1 e1Var = this.f45402b;
        e1Var.h(i10, true);
        e1Var.g();
        e9Var.setNewColor(i10);
        g4 g4Var = e9Var.f44958t1;
        g4Var.setSelectedColorIndex(e1Var.d());
        g4Var.getAdapter().l();
    }
}
