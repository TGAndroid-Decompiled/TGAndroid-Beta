package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.it0;
public final class u implements qg.u {
    public boolean f45652a;
    public final Bitmap f45653b;
    public final it0 f45654c;

    public u(it0 it0Var, Bitmap bitmap) {
        this.f45654c = it0Var;
        this.f45653b = bitmap;
    }

    @Override
    public final void a() {
        this.f45652a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        b0 b0Var = this.f45654c.W0;
        Matrix matrix = b0Var.getMatrix();
        canvas.save();
        canvas.translate(b0Var.getX(), b0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f45653b;
        canvas.scale(b0Var.getWidth() / bitmap.getWidth(), b0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f45652a;
    }

    @Override
    public final void d() {
        this.f45652a = false;
    }

    @Override
    public final View e() {
        return this.f45654c;
    }

    @Override
    public final FrameLayout f() {
        return this.f45654c.f45473e1;
    }

    @Override
    public final boolean g() {
        if (this.f45653b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        it0 it0Var = this.f45654c;
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
