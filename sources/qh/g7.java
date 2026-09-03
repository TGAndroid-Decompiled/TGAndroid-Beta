package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class g7 extends FrameLayout {
    public final Paint f45362a;
    public final org.telegram.ui.Components.z5 f45363b;
    public final org.telegram.ui.ActionBar.g6 f45364c;
    public final j7 d;

    public g7(j7 j7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = j7Var;
        this.f45364c = g6Var;
        this.f45362a = new Paint(1);
        this.f45363b = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, this.f45364c);
        Paint paint = this.f45362a;
        paint.setColor(v02);
        j7 j7Var = this.d;
        float max = Math.max(0.0f, j7Var.s());
        if (max < AndroidUtilities.statusBarHeight) {
            z4 = true;
        } else {
            z4 = false;
        }
        org.telegram.ui.Components.z5 z5Var = this.f45363b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, z5Var.e(z4));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) j7Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) j7Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - z5Var.f33763c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        j7Var.f45543n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.h3) j7Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.h3) j7Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        j7 j7Var = this.d;
        if (y10 < j7Var.s()) {
            j7Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
