package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gr;
public final class z5 extends FrameLayout {
    public final Paint f52252a;
    public final org.telegram.ui.Components.t5 f52253b;
    public final org.telegram.ui.ActionBar.p6 f52254c;
    public final c6 d;

    public z5(c6 c6Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.d = c6Var;
        this.f52254c = p6Var;
        this.f52252a = new Paint(1);
        this.f52253b = new org.telegram.ui.Components.t5(this, 0L, 350L, gr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.f52254c);
        Paint paint = this.f52252a;
        paint.setColor(w02);
        c6 c6Var = this.d;
        float max = Math.max(0.0f, c6Var.I0());
        if (max < org.telegram.messenger.i0.f16020m) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.Components.t5 t5Var = this.f52253b;
        float T1 = org.telegram.messenger.i0.T1(max, 0.0f, t5Var.d(z10));
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(c6Var.f21615t0, T1, getWidth() - c6Var.f21615t0, org.telegram.messenger.i0.L(14.0f) + getHeight());
        float L = (1.0f - t5Var.f30445c) * org.telegram.messenger.i0.L(14.0f);
        canvas.drawRoundRect(rectF, L, L, paint);
        c6Var.f51038n1.setTranslationY(Math.max(org.telegram.messenger.i0.L(8.0f) + org.telegram.messenger.i0.f16020m, org.telegram.messenger.i0.L(14.0f) + T1));
        canvas.save();
        canvas.clipRect(c6Var.f21615t0, org.telegram.messenger.i0.L(14.0f) + org.telegram.messenger.i0.f16020m, getWidth() - c6Var.f21615t0, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        c6 c6Var = this.d;
        if (y3 < c6Var.I0()) {
            c6Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
