package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.ov0;
public final class f0 extends ov0 {
    public final j0 f50268w0;

    public f0(j0 j0Var, Context context) {
        super(context, null);
        this.f50268w0 = j0Var;
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
        if (drawable instanceof dc0) {
            ((dc0) drawable).p();
        }
        j0 j0Var = this.f50268w0;
        j0Var.d.f10661a = j0Var.f50338c.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.L) {
            j0 j0Var = this.f50268w0;
            gh.a aVar = j0Var.d.f10661a;
            if (aVar instanceof gh.b) {
                ((gh.b) aVar).b(getWidth(), getHeight());
            }
            j0Var.d.v(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f50268w0.f50346y;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f50268w0.o();
    }
}
