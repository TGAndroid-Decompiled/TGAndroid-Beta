package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
public final class i7 extends FrameLayout {
    public final Paint f41786a;
    public final org.telegram.ui.Components.z5 f41787b;
    public final org.telegram.ui.ActionBar.f6 f41788c;
    public final l7 d;

    public i7(l7 l7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = l7Var;
        this.f41788c = f6Var;
        this.f41786a = new Paint(1);
        this.f41787b = new org.telegram.ui.Components.z5(this, 0L, 350L, mr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, this.f41788c);
        Paint paint = this.f41786a;
        paint.setColor(v02);
        l7 l7Var = this.d;
        float max = Math.max(0.0f, l7Var.s());
        if (max < AndroidUtilities.statusBarHeight) {
            z4 = true;
        } else {
            z4 = false;
        }
        org.telegram.ui.Components.z5 z5Var = this.f41787b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, z5Var.e(z4));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.g3) l7Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.g3) l7Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - z5Var.f31253c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        l7Var.f41974n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.g3) l7Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.g3) l7Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        l7 l7Var = this.d;
        if (y10 < l7Var.s()) {
            l7Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
