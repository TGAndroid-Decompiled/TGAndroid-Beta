package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.zt0;
public final class w implements qg.u {
    public boolean f45563a;
    public final Bitmap f45564b;
    public final zt0 f45565c;

    public w(zt0 zt0Var, Bitmap bitmap) {
        this.f45565c = zt0Var;
        this.f45564b = bitmap;
    }

    @Override
    public final void a() {
        this.f45563a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        e0 e0Var = this.f45565c.W0;
        Matrix matrix = e0Var.getMatrix();
        canvas.save();
        canvas.translate(e0Var.getX(), e0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f45564b;
        canvas.scale(e0Var.getWidth() / bitmap.getWidth(), e0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f45563a;
    }

    @Override
    public final void d() {
        this.f45563a = false;
    }

    @Override
    public final View e() {
        return this.f45565c;
    }

    @Override
    public final FrameLayout f() {
        return this.f45565c.f45373e1;
    }

    @Override
    public final boolean g() {
        if (this.f45564b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        zt0 zt0Var = this.f45565c;
        zt0Var.w0(false);
        qg.s0 s0Var = zt0Var.V1;
        s0Var.h(i10, true);
        s0Var.g();
        zt0Var.setNewColor(i10);
        l0 l0Var = zt0Var.G1;
        l0Var.setSelectedColorIndex(s0Var.d());
        l0Var.getAdapter().l();
    }
}
