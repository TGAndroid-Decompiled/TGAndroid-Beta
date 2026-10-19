package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.gt0;
public final class u implements qg.v {
    public boolean f45652a;
    public final Bitmap f45653b;
    public final gt0 f45654c;

    public u(gt0 gt0Var, Bitmap bitmap) {
        this.f45654c = gt0Var;
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
        return this.f45654c.f45470e1;
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
        gt0 gt0Var = this.f45654c;
        gt0Var.x0(false);
        qg.v0 v0Var = gt0Var.V1;
        v0Var.h(i10, true);
        v0Var.g();
        gt0Var.setNewColor(i10);
        i0 i0Var = gt0Var.G1;
        i0Var.setSelectedColorIndex(v0Var.d());
        i0Var.getAdapter().l();
    }
}
