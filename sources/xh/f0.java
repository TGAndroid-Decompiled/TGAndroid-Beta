package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.pv0;
public final class f0 extends pv0 {
    public final j0 f45795w0;

    public f0(j0 j0Var, Context context) {
        super(context, null);
        this.f45795w0 = j0Var;
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
        if (drawable instanceof bc0) {
            ((bc0) drawable).p();
        }
        j0 j0Var = this.f45795w0;
        j0Var.d.f9064a = j0Var.f45866c.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.L) {
            j0 j0Var = this.f45795w0;
            fh.a aVar = j0Var.d.f9064a;
            if (aVar instanceof fh.b) {
                ((fh.b) aVar).b(getWidth(), getHeight());
            }
            j0Var.d.y(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f45795w0.f45873y;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f45795w0.o();
    }
}
