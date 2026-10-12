package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.yw0;
public final class h0 extends yw0 {
    public final l0 f51501w0;

    public h0(l0 l0Var, Context context) {
        super(context, null);
        this.f51501w0 = l0Var;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final void U(Drawable drawable) {
        if (drawable instanceof gd0) {
            ((gd0) drawable).p();
        }
        l0 l0Var = this.f51501w0;
        l0Var.d.f9940a = l0Var.f51560c.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.L) {
            l0 l0Var = this.f51501w0;
            fh.a aVar = l0Var.d.f9940a;
            if (aVar instanceof fh.b) {
                ((fh.b) aVar).c(getWidth(), getHeight());
            }
            l0Var.d.v(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f51501w0.f51568y;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f51501w0.q();
    }
}
