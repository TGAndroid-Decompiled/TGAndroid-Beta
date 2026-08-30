package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public final class j7 extends FrameLayout {
    public final Paint f41784a;
    public final org.telegram.ui.Components.z5 f41785b;
    public final org.telegram.ui.ActionBar.f6 f41786c;
    public final m7 d;

    public j7(m7 m7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = m7Var;
        this.f41786c = f6Var;
        this.f41784a = new Paint(1);
        this.f41785b = new org.telegram.ui.Components.z5(this, 0L, 350L, nr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, this.f41786c);
        Paint paint = this.f41784a;
        paint.setColor(v02);
        m7 m7Var = this.d;
        float max = Math.max(0.0f, m7Var.s());
        if (max < AndroidUtilities.statusBarHeight) {
            z4 = true;
        } else {
            z4 = false;
        }
        org.telegram.ui.Components.z5 z5Var = this.f41785b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, z5Var.e(z4));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.g3) m7Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) m7Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - z5Var.f31241c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        m7Var.f41967n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.g3) m7Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.g3) m7Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        m7 m7Var = this.d;
        if (y10 < m7Var.s()) {
            m7Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
