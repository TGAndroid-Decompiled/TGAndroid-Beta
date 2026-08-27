package zf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ys0;

public final class u implements yf.u {

    public boolean f50716a;

    public final Bitmap f50717b;

    public final ys0 f50718c;

    public u(ys0 ys0Var, Bitmap bitmap) {
        this.f50718c = ys0Var;
        this.f50717b = bitmap;
    }

    @Override
    public final void a() {
        this.f50716a = true;
    }

    @Override
    public final void b(Canvas canvas) {
        b0 b0Var = this.f50718c.S0;
        Matrix matrix = b0Var.getMatrix();
        canvas.save();
        canvas.translate(b0Var.getX(), b0Var.getY());
        canvas.concat(matrix);
        float width = b0Var.getWidth();
        Bitmap bitmap = this.f50717b;
        canvas.scale(width / bitmap.getWidth(), b0Var.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    @Override
    public final boolean c() {
        return this.f50716a;
    }

    @Override
    public final void d() {
        this.f50716a = false;
    }

    @Override
    public final View e() {
        return this.f50718c;
    }

    @Override
    public final FrameLayout f() {
        return this.f50718c.f50505a1;
    }

    @Override
    public final boolean g() {
        return this.f50717b != null;
    }

    @Override
    public final void h(int i10) {
        ys0 ys0Var = this.f50718c;
        ys0Var.w0(false);
        yf.r0 r0Var = ys0Var.R1;
        r0Var.h(i10, true);
        r0Var.g();
        ys0Var.setNewColor(i10);
        i0 i0Var = ys0Var.C1;
        i0Var.setSelectedColorIndex(r0Var.d());
        i0Var.getAdapter().l();
    }
}
