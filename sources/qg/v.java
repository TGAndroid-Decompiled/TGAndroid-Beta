package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.au0;
public final class v implements pg.u {
    public boolean f46659a;
    public final Bitmap f46660b;
    public final au0 f46661c;

    public v(au0 au0Var, Bitmap bitmap) {
        this.f46661c = au0Var;
        this.f46660b = bitmap;
    }

    @Override
    public final void a() {
        this.f46659a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        c0 c0Var = this.f46661c.W0;
        Matrix matrix = c0Var.getMatrix();
        canvas.save();
        canvas.translate(c0Var.getX(), c0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f46660b;
        canvas.scale(c0Var.getWidth() / bitmap.getWidth(), c0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f46659a;
    }

    @Override
    public final void d() {
        this.f46659a = false;
    }

    @Override
    public final View e() {
        return this.f46661c;
    }

    @Override
    public final FrameLayout f() {
        return this.f46661c.f46462e1;
    }

    @Override
    public final boolean g() {
        if (this.f46660b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        au0 au0Var = this.f46661c;
        au0Var.x0(false);
        pg.u0 u0Var = au0Var.V1;
        u0Var.h(i10, true);
        u0Var.g();
        au0Var.setNewColor(i10);
        j0 j0Var = au0Var.G1;
        j0Var.setSelectedColorIndex(u0Var.d());
        j0Var.getAdapter().l();
    }
}
