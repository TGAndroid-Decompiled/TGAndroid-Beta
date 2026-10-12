package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.cu0;
public final class v implements pg.u {
    public boolean f46528a;
    public final Bitmap f46529b;
    public final cu0 f46530c;

    public v(cu0 cu0Var, Bitmap bitmap) {
        this.f46530c = cu0Var;
        this.f46529b = bitmap;
    }

    @Override
    public final void a() {
        this.f46528a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        c0 c0Var = this.f46530c.W0;
        Matrix matrix = c0Var.getMatrix();
        canvas.save();
        canvas.translate(c0Var.getX(), c0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f46529b;
        canvas.scale(c0Var.getWidth() / bitmap.getWidth(), c0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f46528a;
    }

    @Override
    public final void d() {
        this.f46528a = false;
    }

    @Override
    public final View e() {
        return this.f46530c;
    }

    @Override
    public final FrameLayout f() {
        return this.f46530c.f46312e1;
    }

    @Override
    public final boolean g() {
        if (this.f46529b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        cu0 cu0Var = this.f46530c;
        cu0Var.x0(false);
        pg.t0 t0Var = cu0Var.V1;
        t0Var.h(i10, true);
        t0Var.g();
        cu0Var.setNewColor(i10);
        j0 j0Var = cu0Var.G1;
        j0Var.setSelectedColorIndex(t0Var.d());
        j0Var.getAdapter().l();
    }
}
