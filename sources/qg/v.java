package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.bu0;
public final class v implements pg.u {
    public boolean f46583a;
    public final Bitmap f46584b;
    public final bu0 f46585c;

    public v(bu0 bu0Var, Bitmap bitmap) {
        this.f46585c = bu0Var;
        this.f46584b = bitmap;
    }

    @Override
    public final void a() {
        this.f46583a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        c0 c0Var = this.f46585c.W0;
        Matrix matrix = c0Var.getMatrix();
        canvas.save();
        canvas.translate(c0Var.getX(), c0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f46584b;
        canvas.scale(c0Var.getWidth() / bitmap.getWidth(), c0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f46583a;
    }

    @Override
    public final void d() {
        this.f46583a = false;
    }

    @Override
    public final View e() {
        return this.f46585c;
    }

    @Override
    public final FrameLayout f() {
        return this.f46585c.f46367e1;
    }

    @Override
    public final boolean g() {
        if (this.f46584b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        bu0 bu0Var = this.f46585c;
        bu0Var.x0(false);
        pg.u0 u0Var = bu0Var.V1;
        u0Var.h(i10, true);
        u0Var.g();
        bu0Var.setNewColor(i10);
        j0 j0Var = bu0Var.G1;
        j0Var.setSelectedColorIndex(u0Var.d());
        j0Var.getAdapter().l();
    }
}
