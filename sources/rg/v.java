package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.jt0;
public final class v implements qg.v {
    public boolean f46094a;
    public final Bitmap f46095b;
    public final jt0 f46096c;

    public v(jt0 jt0Var, Bitmap bitmap) {
        this.f46096c = jt0Var;
        this.f46095b = bitmap;
    }

    @Override
    public final void a() {
        this.f46094a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        c0 c0Var = this.f46096c.W0;
        Matrix matrix = c0Var.getMatrix();
        canvas.save();
        canvas.translate(c0Var.getX(), c0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f46095b;
        canvas.scale(c0Var.getWidth() / bitmap.getWidth(), c0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f46094a;
    }

    @Override
    public final void d() {
        this.f46094a = false;
    }

    @Override
    public final View e() {
        return this.f46096c;
    }

    @Override
    public final FrameLayout f() {
        return this.f46096c.f45890e1;
    }

    @Override
    public final boolean g() {
        if (this.f46095b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        jt0 jt0Var = this.f46096c;
        jt0Var.w0(false);
        qg.u0 u0Var = jt0Var.V1;
        u0Var.h(i10, true);
        u0Var.g();
        jt0Var.setNewColor(i10);
        j0 j0Var = jt0Var.G1;
        j0Var.setSelectedColorIndex(u0Var.d());
        j0Var.getAdapter().l();
    }
}
