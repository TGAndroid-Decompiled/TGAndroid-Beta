package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.lc0;
public final class g0 extends aw0 {
    public final k0 f44097w0;

    public g0(k0 k0Var, Context context) {
        super(context, null);
        this.f44097w0 = k0Var;
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
        if (drawable instanceof lc0) {
            ((lc0) drawable).p();
        }
        k0 k0Var = this.f44097w0;
        k0Var.d.f7525a = k0Var.f44163c.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.L) {
            k0 k0Var = this.f44097w0;
            eh.a aVar = k0Var.d.f7525a;
            if (aVar instanceof eh.b) {
                ((eh.b) aVar).c(getWidth(), getHeight());
            }
            k0Var.d.u(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f44097w0.f44170y;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f44097w0.o();
    }
}
