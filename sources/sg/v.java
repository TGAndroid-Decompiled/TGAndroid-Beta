package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.pt0;
public final class v implements rg.v {
    public boolean f48571a;
    public final Bitmap f48572b;
    public final pt0 f48573c;

    public v(pt0 pt0Var, Bitmap bitmap) {
        this.f48573c = pt0Var;
        this.f48572b = bitmap;
    }

    @Override
    public final void a() {
        this.f48571a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        c0 c0Var = this.f48573c.L0;
        Matrix matrix = c0Var.getMatrix();
        canvas.save();
        canvas.translate(c0Var.getX(), c0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f48572b;
        canvas.scale(c0Var.getWidth() / bitmap.getWidth(), c0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f48571a;
    }

    @Override
    public final void d() {
        this.f48571a = false;
    }

    @Override
    public final View e() {
        return this.f48573c;
    }

    @Override
    public final FrameLayout f() {
        return this.f48573c.T0;
    }

    @Override
    public final boolean g() {
        if (this.f48572b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        pt0 pt0Var = this.f48573c;
        pt0Var.v0(false);
        rg.s0 s0Var = pt0Var.K1;
        s0Var.h(i10, true);
        s0Var.g();
        pt0Var.setNewColor(i10);
        j0 j0Var = pt0Var.f48387v1;
        j0Var.setSelectedColorIndex(s0Var.d());
        j0Var.getAdapter().l();
    }
}
