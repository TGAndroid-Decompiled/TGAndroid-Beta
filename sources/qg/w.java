package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.au0;
public final class w implements pg.u {
    public boolean f42008a;
    public final Bitmap f42009b;
    public final au0 f42010c;

    public w(au0 au0Var, Bitmap bitmap) {
        this.f42010c = au0Var;
        this.f42009b = bitmap;
    }

    @Override
    public final void a() {
        this.f42008a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        d0 d0Var = this.f42010c.W0;
        Matrix matrix = d0Var.getMatrix();
        canvas.save();
        canvas.translate(d0Var.getX(), d0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f42009b;
        canvas.scale(d0Var.getWidth() / bitmap.getWidth(), d0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f42008a;
    }

    @Override
    public final void d() {
        this.f42008a = false;
    }

    @Override
    public final View e() {
        return this.f42010c;
    }

    @Override
    public final FrameLayout f() {
        return this.f42010c.f41812e1;
    }

    @Override
    public final boolean g() {
        if (this.f42009b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        au0 au0Var = this.f42010c;
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
