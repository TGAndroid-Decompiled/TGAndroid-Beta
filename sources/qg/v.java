package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.vt0;
public final class v implements pg.u {
    public boolean f45376a;
    public final Bitmap f45377b;
    public final vt0 f45378c;

    public v(vt0 vt0Var, Bitmap bitmap) {
        this.f45378c = vt0Var;
        this.f45377b = bitmap;
    }

    @Override
    public final void a() {
        this.f45376a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        c0 c0Var = this.f45378c.W0;
        Matrix matrix = c0Var.getMatrix();
        canvas.save();
        canvas.translate(c0Var.getX(), c0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f45377b;
        canvas.scale(c0Var.getWidth() / bitmap.getWidth(), c0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f45376a;
    }

    @Override
    public final void d() {
        this.f45376a = false;
    }

    @Override
    public final View e() {
        return this.f45378c;
    }

    @Override
    public final FrameLayout f() {
        return this.f45378c.f45177e1;
    }

    @Override
    public final boolean g() {
        if (this.f45377b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        vt0 vt0Var = this.f45378c;
        vt0Var.x0(false);
        pg.u0 u0Var = vt0Var.V1;
        u0Var.h(i10, true);
        u0Var.g();
        vt0Var.setNewColor(i10);
        j0 j0Var = vt0Var.G1;
        j0Var.setSelectedColorIndex(u0Var.d());
        j0Var.getAdapter().l();
    }
}
