package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.st0;
public final class w implements pg.u {
    public boolean f42076a;
    public final Bitmap f42077b;
    public final st0 f42078c;

    public w(st0 st0Var, Bitmap bitmap) {
        this.f42078c = st0Var;
        this.f42077b = bitmap;
    }

    @Override
    public final void a() {
        this.f42076a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        d0 d0Var = this.f42078c.W0;
        Matrix matrix = d0Var.getMatrix();
        canvas.save();
        canvas.translate(d0Var.getX(), d0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f42077b;
        canvas.scale(d0Var.getWidth() / bitmap.getWidth(), d0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f42076a;
    }

    @Override
    public final void d() {
        this.f42076a = false;
    }

    @Override
    public final View e() {
        return this.f42078c;
    }

    @Override
    public final FrameLayout f() {
        return this.f42078c.f41878e1;
    }

    @Override
    public final boolean g() {
        if (this.f42077b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        st0 st0Var = this.f42078c;
        st0Var.w0(false);
        pg.u0 u0Var = st0Var.V1;
        u0Var.h(i10, true);
        u0Var.g();
        st0Var.setNewColor(i10);
        k0 k0Var = st0Var.G1;
        k0Var.setSelectedColorIndex(u0Var.d());
        k0Var.getAdapter().l();
    }
}
