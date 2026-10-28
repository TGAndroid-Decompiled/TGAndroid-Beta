package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.ww0;
public final class e0 extends ww0 {
    public final i0 f53018l0;

    public e0(i0 i0Var, Context context) {
        super(context, null);
        this.f53018l0 = i0Var;
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
        if (drawable instanceof vc0) {
            ((vc0) drawable).p();
        }
        i0 i0Var = this.f53018l0;
        i0Var.d.f12844a = i0Var.f53096c.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.L) {
            i0 i0Var = this.f53018l0;
            hh.a aVar = i0Var.d.f12844a;
            if (aVar instanceof hh.b) {
                ((hh.b) aVar).b(getWidth(), getHeight());
            }
            i0Var.d.w(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f53018l0.f53103y;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f53018l0.q();
    }
}
