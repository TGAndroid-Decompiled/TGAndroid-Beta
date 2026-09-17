package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.cu0;
public final class w implements pg.u {
    public boolean f41716a;
    public final Bitmap f41717b;
    public final cu0 f41718c;

    public w(cu0 cu0Var, Bitmap bitmap) {
        this.f41718c = cu0Var;
        this.f41717b = bitmap;
    }

    @Override
    public final void a() {
        this.f41716a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        e0 e0Var = this.f41718c.W0;
        Matrix matrix = e0Var.getMatrix();
        canvas.save();
        canvas.translate(e0Var.getX(), e0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f41717b;
        canvas.scale(e0Var.getWidth() / bitmap.getWidth(), e0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f41716a;
    }

    @Override
    public final void d() {
        this.f41716a = false;
    }

    @Override
    public final View e() {
        return this.f41718c;
    }

    @Override
    public final FrameLayout f() {
        return this.f41718c.f41544e1;
    }

    @Override
    public final boolean g() {
        if (this.f41717b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        cu0 cu0Var = this.f41718c;
        cu0Var.w0(false);
        pg.s0 s0Var = cu0Var.V1;
        s0Var.h(i10, true);
        s0Var.g();
        cu0Var.setNewColor(i10);
        l0 l0Var = cu0Var.G1;
        l0Var.setSelectedColorIndex(s0Var.d());
        l0Var.getAdapter().l();
    }
}
