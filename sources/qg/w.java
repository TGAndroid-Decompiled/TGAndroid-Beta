package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.au0;
public final class w implements pg.u {
    public boolean f41987a;
    public final Bitmap f41988b;
    public final au0 f41989c;

    public w(au0 au0Var, Bitmap bitmap) {
        this.f41989c = au0Var;
        this.f41988b = bitmap;
    }

    @Override
    public final void a() {
        this.f41987a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        d0 d0Var = this.f41989c.W0;
        Matrix matrix = d0Var.getMatrix();
        canvas.save();
        canvas.translate(d0Var.getX(), d0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f41988b;
        canvas.scale(d0Var.getWidth() / bitmap.getWidth(), d0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f41987a;
    }

    @Override
    public final void d() {
        this.f41987a = false;
    }

    @Override
    public final View e() {
        return this.f41989c;
    }

    @Override
    public final FrameLayout f() {
        return this.f41989c.f41791e1;
    }

    @Override
    public final boolean g() {
        if (this.f41988b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        au0 au0Var = this.f41989c;
        au0Var.w0(false);
        pg.u0 u0Var = au0Var.V1;
        u0Var.h(i10, true);
        u0Var.g();
        au0Var.setNewColor(i10);
        k0 k0Var = au0Var.G1;
        k0Var.setSelectedColorIndex(u0Var.d());
        k0Var.getAdapter().l();
    }
}
