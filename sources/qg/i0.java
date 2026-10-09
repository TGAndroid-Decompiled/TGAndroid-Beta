package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bu0;
public final class i0 extends FrameLayout {
    public final bu0 f46273a;

    public i0(bu0 bu0Var, Context context) {
        super(context);
        this.f46273a = bu0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        bu0 bu0Var = this.f46273a;
        Paint paint = bu0Var.B1;
        o1 o1Var = bu0Var.f46392u1;
        paint.setAlpha((int) ((1.0f - bu0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        k0 k0Var = bu0Var.f46363c1;
        int top = k0Var.getTop();
        float translationY = o1Var.getTranslationY() + k0Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        t1 t1Var = bu0Var.f46393v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), bu0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), bu0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), bu0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), bu0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, bu0Var.D1));
        Paint paint2 = bu0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * bu0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            bu0 bu0Var = this.f46273a;
            if (bu0Var.E1) {
                bu0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
