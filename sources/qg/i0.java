package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vt0;
public final class i0 extends FrameLayout {
    public final vt0 f41695a;

    public i0(vt0 vt0Var, Context context) {
        super(context);
        this.f41695a = vt0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        vt0 vt0Var = this.f41695a;
        Paint paint = vt0Var.B1;
        o1 o1Var = vt0Var.f41827u1;
        paint.setAlpha((int) ((1.0f - vt0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        k0 k0Var = vt0Var.f41798c1;
        int top = k0Var.getTop();
        float translationY = o1Var.getTranslationY() + k0Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        t1 t1Var = vt0Var.f41828v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), vt0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), vt0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), vt0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), vt0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, vt0Var.D1));
        Paint paint2 = vt0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * vt0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            vt0 vt0Var = this.f41695a;
            if (vt0Var.E1) {
                vt0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
