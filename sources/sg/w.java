package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.nt0;
public final class w implements rg.v {
    public boolean f48546a;
    public final Bitmap f48547b;
    public final nt0 f48548c;

    public w(nt0 nt0Var, Bitmap bitmap) {
        this.f48548c = nt0Var;
        this.f48547b = bitmap;
    }

    @Override
    public final void a() {
        this.f48546a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        d0 d0Var = this.f48548c.L0;
        Matrix matrix = d0Var.getMatrix();
        canvas.save();
        canvas.translate(d0Var.getX(), d0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f48547b;
        canvas.scale(d0Var.getWidth() / bitmap.getWidth(), d0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f48546a;
    }

    @Override
    public final void d() {
        this.f48546a = false;
    }

    @Override
    public final View e() {
        return this.f48548c;
    }

    @Override
    public final FrameLayout f() {
        return this.f48548c.T0;
    }

    @Override
    public final boolean g() {
        if (this.f48547b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        nt0 nt0Var = this.f48548c;
        nt0Var.v0(false);
        rg.s0 s0Var = nt0Var.K1;
        s0Var.h(i10, true);
        s0Var.g();
        nt0Var.setNewColor(i10);
        k0 k0Var = nt0Var.f48361v1;
        k0Var.setSelectedColorIndex(s0Var.d());
        k0Var.getAdapter().l();
    }
}
