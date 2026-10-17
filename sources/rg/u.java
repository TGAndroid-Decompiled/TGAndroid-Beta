package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.it0;
public final class u implements qg.v {
    public boolean f45680a;
    public final Bitmap f45681b;
    public final it0 f45682c;

    public u(it0 it0Var, Bitmap bitmap) {
        this.f45682c = it0Var;
        this.f45681b = bitmap;
    }

    @Override
    public final void a() {
        this.f45680a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        b0 b0Var = this.f45682c.W0;
        Matrix matrix = b0Var.getMatrix();
        canvas.save();
        canvas.translate(b0Var.getX(), b0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f45681b;
        canvas.scale(b0Var.getWidth() / bitmap.getWidth(), b0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f45680a;
    }

    @Override
    public final void d() {
        this.f45680a = false;
    }

    @Override
    public final View e() {
        return this.f45682c;
    }

    @Override
    public final FrameLayout f() {
        return this.f45682c.f45499e1;
    }

    @Override
    public final boolean g() {
        if (this.f45681b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        it0 it0Var = this.f45682c;
        it0Var.x0(false);
        qg.u0 u0Var = it0Var.V1;
        u0Var.h(i10, true);
        u0Var.g();
        it0Var.setNewColor(i10);
        i0 i0Var = it0Var.G1;
        i0Var.setSelectedColorIndex(u0Var.d());
        i0Var.getAdapter().l();
    }
}
