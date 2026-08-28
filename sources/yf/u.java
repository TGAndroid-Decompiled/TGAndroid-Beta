package yf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.xs0;
public final class u implements xf.u {
    public boolean f50121a;
    public final Bitmap f50122b;
    public final xs0 f50123c;

    public u(xs0 xs0Var, Bitmap bitmap) {
        this.f50123c = xs0Var;
        this.f50122b = bitmap;
    }

    @Override
    public final void a() {
        this.f50121a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        b0 b0Var = this.f50123c.S0;
        Matrix matrix = b0Var.getMatrix();
        canvas.save();
        canvas.translate(b0Var.getX(), b0Var.getY());
        canvas.concat(matrix);
        Bitmap bitmap = this.f50122b;
        canvas.scale(b0Var.getWidth() / bitmap.getWidth(), b0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f50121a;
    }

    @Override
    public final void d() {
        this.f50121a = false;
    }

    @Override
    public final View e() {
        return this.f50123c;
    }

    @Override
    public final FrameLayout f() {
        return this.f50123c.f49927a1;
    }

    @Override
    public final boolean g() {
        if (this.f50122b != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i9) {
        xs0 xs0Var = this.f50123c;
        xs0Var.w0(false);
        xf.s0 s0Var = xs0Var.R1;
        s0Var.h(i9, true);
        s0Var.g();
        xs0Var.setNewColor(i9);
        i0 i0Var = xs0Var.C1;
        i0Var.setSelectedColorIndex(s0Var.d());
        i0Var.getAdapter().l();
    }
}
