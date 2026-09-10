package pg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.zt0;
public final class v implements og.v {
    public boolean f40318a;
    public final Bitmap f40319b;
    public final zt0 f40320c;

    public v(zt0 zt0Var, Bitmap bitmap) {
        this.f40320c = zt0Var;
        this.f40319b = bitmap;
    }

    @Override
    public final void a() {
        this.f40318a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        c0 c0Var = this.f40320c.W0;
        Matrix matrix = c0Var.getMatrix();
        canvas.save();
        canvas.translate(c0Var.getX(), c0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f40319b;
        canvas.scale(c0Var.getWidth() / bitmap.getWidth(), c0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f40318a;
    }

    @Override
    public final void d() {
        this.f40318a = false;
    }

    @Override
    public final View e() {
        return this.f40320c;
    }

    @Override
    public final FrameLayout f() {
        return this.f40320c.f40130e1;
    }

    @Override
    public final boolean g() {
        if (this.f40319b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10) {
        zt0 zt0Var = this.f40320c;
        zt0Var.w0(false);
        og.x0 x0Var = zt0Var.V1;
        x0Var.h(i10, true);
        x0Var.g();
        zt0Var.setNewColor(i10);
        j0 j0Var = zt0Var.G1;
        j0Var.setSelectedColorIndex(x0Var.d());
        j0Var.getAdapter().l();
    }
}
