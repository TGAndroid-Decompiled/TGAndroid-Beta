package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.tt0;
public final class w implements pg.u {
    public boolean f41646a;
    public final Bitmap f41647b;
    public final tt0 f41648c;

    public w(tt0 tt0Var, Bitmap bitmap) {
        this.f41648c = tt0Var;
        this.f41647b = bitmap;
    }

    @Override
    public final void a() {
        this.f41646a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        e0 e0Var = this.f41648c.W0;
        Matrix matrix = e0Var.getMatrix();
        canvas.save();
        canvas.translate(e0Var.getX(), e0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f41647b;
        canvas.scale(e0Var.getWidth() / bitmap.getWidth(), e0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f41646a;
    }

    @Override
    public final void d() {
        this.f41646a = false;
    }

    @Override
    public final View e() {
        return this.f41648c;
    }

    @Override
    public final FrameLayout f() {
        return this.f41648c.f41474e1;
    }

    @Override
    public final boolean g() {
        if (this.f41647b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        tt0 tt0Var = this.f41648c;
        tt0Var.x0(false);
        pg.t0 t0Var = tt0Var.V1;
        t0Var.h(i10, true);
        t0Var.g();
        tt0Var.setNewColor(i10);
        l0 l0Var = tt0Var.G1;
        l0Var.setSelectedColorIndex(t0Var.d());
        l0Var.getAdapter().l();
    }
}
