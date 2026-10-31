package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.uu0;
public final class g0 extends uu0 {
    public final k0 f45057f0;

    public g0(k0 k0Var, Context context) {
        super(context, null);
        this.f45057f0 = k0Var;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final void T(Drawable drawable) {
        if (drawable instanceof jb0) {
            ((jb0) drawable).p();
        }
        k0 k0Var = this.f45057f0;
        k0Var.f45146k1.f7724a = k0Var.f45145j1.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.L) {
            k0 k0Var = this.f45057f0;
            hi.a aVar = k0Var.f45146k1.f7724a;
            if (aVar instanceof hi.b) {
                ((hi.b) aVar).b(getWidth(), getHeight());
            }
            k0Var.f45146k1.e(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f45057f0.f45155u1;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f45057f0.I0();
    }
}
