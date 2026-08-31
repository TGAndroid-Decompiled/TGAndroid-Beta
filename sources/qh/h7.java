package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class h7 extends FrameLayout {
    public final Paint f45381a;
    public final org.telegram.ui.Components.z5 f45382b;
    public final org.telegram.ui.ActionBar.g6 f45383c;
    public final k7 d;

    public h7(k7 k7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = k7Var;
        this.f45383c = g6Var;
        this.f45381a = new Paint(1);
        this.f45382b = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        int i13;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, this.f45383c);
        Paint paint = this.f45381a;
        paint.setColor(v02);
        k7 k7Var = this.d;
        float max = Math.max(0.0f, k7Var.s());
        if (max < AndroidUtilities.statusBarHeight) {
            z4 = true;
        } else {
            z4 = false;
        }
        org.telegram.ui.Components.z5 z5Var = this.f45382b;
        float lerp = AndroidUtilities.lerp(max, 0.0f, z5Var.e(z4));
        RectF rectF = AndroidUtilities.rectTmp;
        i10 = ((org.telegram.ui.ActionBar.h3) k7Var).backgroundPaddingLeft;
        int width = getWidth();
        i11 = ((org.telegram.ui.ActionBar.h3) k7Var).backgroundPaddingLeft;
        rectF.set(i10, lerp, width - i11, AndroidUtilities.dp(14.0f) + getHeight());
        float dp = (1.0f - z5Var.f33725c) * AndroidUtilities.dp(14.0f);
        canvas.drawRoundRect(rectF, dp, dp, paint);
        k7Var.f45596n.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, AndroidUtilities.dp(14.0f) + lerp));
        canvas.save();
        i12 = ((org.telegram.ui.ActionBar.h3) k7Var).backgroundPaddingLeft;
        int dp2 = AndroidUtilities.dp(14.0f) + AndroidUtilities.statusBarHeight;
        int width2 = getWidth();
        i13 = ((org.telegram.ui.ActionBar.h3) k7Var).backgroundPaddingLeft;
        canvas.clipRect(i12, dp2, width2 - i13, getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float y10 = motionEvent.getY();
        k7 k7Var = this.d;
        if (y10 < k7Var.s()) {
            k7Var.dismiss();
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
