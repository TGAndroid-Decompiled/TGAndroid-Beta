package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.ow0;
public final class g0 extends ow0 {
    public final k0 f48874w0;

    public g0(k0 k0Var, Context context) {
        super(context, null);
        this.f48874w0 = k0Var;
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
        if (drawable instanceof cd0) {
            ((cd0) drawable).p();
        }
        k0 k0Var = this.f48874w0;
        k0Var.d.f10156a = k0Var.f48928c.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.L) {
            k0 k0Var = this.f48874w0;
            gh.a aVar = k0Var.d.f10156a;
            if (aVar instanceof gh.b) {
                ((gh.b) aVar).c(getWidth(), getHeight());
            }
            k0Var.d.v(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f48874w0.f48935y;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f48874w0.q();
    }
}
