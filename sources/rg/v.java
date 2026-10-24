package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.it0;
public final class v implements qg.v {
    public boolean f46093a;
    public final Bitmap f46094b;
    public final it0 f46095c;

    public v(it0 it0Var, Bitmap bitmap) {
        this.f46095c = it0Var;
        this.f46094b = bitmap;
    }

    @Override
    public final void a() {
        this.f46093a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        c0 c0Var = this.f46095c.W0;
        Matrix matrix = c0Var.getMatrix();
        canvas.save();
        canvas.translate(c0Var.getX(), c0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f46094b;
        canvas.scale(c0Var.getWidth() / bitmap.getWidth(), c0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f46093a;
    }

    @Override
    public final void d() {
        this.f46093a = false;
    }

    @Override
    public final View e() {
        return this.f46095c;
    }

    @Override
    public final FrameLayout f() {
        return this.f46095c.f45889e1;
    }

    @Override
    public final boolean g() {
        if (this.f46094b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        it0 it0Var = this.f46095c;
        it0Var.w0(false);
        qg.u0 u0Var = it0Var.V1;
        u0Var.h(i10, true);
        u0Var.g();
        it0Var.setNewColor(i10);
        j0 j0Var = it0Var.G1;
        j0Var.setSelectedColorIndex(u0Var.d());
        j0Var.getAdapter().l();
    }
}
