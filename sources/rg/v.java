package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.gu0;
public final class v implements qg.u {
    public boolean f44331a;
    public final Bitmap f44332b;
    public final gu0 f44333c;

    public v(gu0 gu0Var, Bitmap bitmap) {
        this.f44333c = gu0Var;
        this.f44332b = bitmap;
    }

    @Override
    public final void a() {
        this.f44331a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        d0 d0Var = this.f44333c.W0;
        Matrix matrix = d0Var.getMatrix();
        canvas.save();
        canvas.translate(d0Var.getX(), d0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f44332b;
        canvas.scale(d0Var.getWidth() / bitmap.getWidth(), d0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f44331a;
    }

    @Override
    public final void d() {
        this.f44331a = false;
    }

    @Override
    public final View e() {
        return this.f44333c;
    }

    @Override
    public final FrameLayout f() {
        return this.f44333c.f44166e1;
    }

    @Override
    public final boolean g() {
        if (this.f44332b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        gu0 gu0Var = this.f44333c;
        gu0Var.x0(false);
        qg.s0 s0Var = gu0Var.V1;
        s0Var.h(i10, true);
        s0Var.g();
        gu0Var.setNewColor(i10);
        k0 k0Var = gu0Var.G1;
        k0Var.setSelectedColorIndex(s0Var.d());
        k0Var.getAdapter().l();
    }
}
