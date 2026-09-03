package ph;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.widget.FrameLayout;
public final class i4 implements cg.y {
    public boolean f41780a;
    public final cg.f1 f41781b;
    public final h9 f41782c;

    public i4(h9 h9Var, cg.f1 f1Var) {
        this.f41782c = h9Var;
        this.f41781b = f1Var;
    }

    @Override
    public final void a() {
        this.f41780a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        s4 s4Var = this.f41782c.L0;
        Matrix matrix = s4Var.getMatrix();
        canvas.save();
        canvas.translate(s4Var.getX(), s4Var.getY());
        canvas.concat(matrix);
        s4Var.getWidth();
        throw null;
    }

    @Override
    public final boolean c() {
        return this.f41780a;
    }

    @Override
    public final void d() {
        this.f41780a = false;
    }

    @Override
    public final View e() {
        return this.f41782c;
    }

    @Override
    public final FrameLayout f() {
        return this.f41782c.S0;
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void h(int i10) {
        h9 h9Var = this.f41782c;
        h9Var.I0(false);
        cg.f1 f1Var = this.f41781b;
        f1Var.h(i10, true);
        f1Var.g();
        h9Var.setNewColor(i10);
        h4 h4Var = h9Var.f41402t1;
        h4Var.setSelectedColorIndex(f1Var.d());
        h4Var.getAdapter().l();
    }
}
