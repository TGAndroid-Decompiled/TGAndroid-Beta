package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.hu0;
public final class v implements qg.u {
    public boolean f44572a;
    public final Bitmap f44573b;
    public final hu0 f44574c;

    public v(hu0 hu0Var, Bitmap bitmap) {
        this.f44574c = hu0Var;
        this.f44573b = bitmap;
    }

    @Override
    public final void a() {
        this.f44572a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        d0 d0Var = this.f44574c.W0;
        Matrix matrix = d0Var.getMatrix();
        canvas.save();
        canvas.translate(d0Var.getX(), d0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f44573b;
        canvas.scale(d0Var.getWidth() / bitmap.getWidth(), d0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f44572a;
    }

    @Override
    public final void d() {
        this.f44572a = false;
    }

    @Override
    public final View e() {
        return this.f44574c;
    }

    @Override
    public final FrameLayout f() {
        return this.f44574c.f44407e1;
    }

    @Override
    public final boolean g() {
        if (this.f44573b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        hu0 hu0Var = this.f44574c;
        hu0Var.x0(false);
        qg.s0 s0Var = hu0Var.V1;
        s0Var.h(i10, true);
        s0Var.g();
        hu0Var.setNewColor(i10);
        k0 k0Var = hu0Var.G1;
        k0Var.setSelectedColorIndex(s0Var.d());
        k0Var.getAdapter().l();
    }
}
