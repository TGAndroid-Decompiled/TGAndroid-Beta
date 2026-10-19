package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.wc0;
public final class e0 extends kw0 {
    public final i0 f50217w0;

    public e0(i0 i0Var, Context context) {
        super(context, null);
        this.f50217w0 = i0Var;
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
        if (drawable instanceof wc0) {
            ((wc0) drawable).p();
        }
        i0 i0Var = this.f50217w0;
        i0Var.d.f11065a = i0Var.f50287c.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.L) {
            i0 i0Var = this.f50217w0;
            gh.a aVar = i0Var.d.f11065a;
            if (aVar instanceof gh.b) {
                ((gh.b) aVar).c(getWidth(), getHeight());
            }
            i0Var.d.y(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f50217w0.f50294y;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f50217w0.p();
    }
}
