package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.rt0;
public final class e0 extends rt0 {
    public final i0 f60198f0;

    public e0(i0 i0Var, Context context) {
        super(context, null);
        this.f60198f0 = i0Var;
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
        if (drawable instanceof qa0) {
            ((qa0) drawable).p();
        }
        i0 i0Var = this.f60198f0;
        i0Var.f60266k1.f54486a = i0Var.f60265j1.c(drawable);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.L) {
            i0 i0Var = this.f60198f0;
            ri.a aVar = i0Var.f60266k1.f54486a;
            if (aVar instanceof ri.b) {
                ((ri.b) aVar).b(getWidth(), getHeight());
            }
            i0Var.f60266k1.e(canvas, 0.0f, 0.0f, getWidth(), getHeight());
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final Drawable getNewDrawable() {
        Drawable drawable = this.f60198f0.f60274u1;
        if (drawable != null) {
            return drawable;
        }
        return super.getNewDrawable();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f60198f0.I0();
    }
}
