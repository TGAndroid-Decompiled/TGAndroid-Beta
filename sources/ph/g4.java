package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g4 extends FrameLayout {
    public final h9 f41716a;

    public g4(h9 h9Var, Context context) {
        super(context);
        this.f41716a = h9Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        h9 h9Var = this.f41716a;
        Paint paint = h9Var.f41392o1;
        dg.k2 k2Var = h9Var.f41381i1;
        paint.setAlpha((int) ((1.0f - h9Var.f41396q1) * k2Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        k2Var.b(rectF);
        y4 y4Var = h9Var.Q0;
        int top = y4Var.getTop();
        float translationY = k2Var.getTranslationY() + y4Var.getTranslationY() + k2Var.getTop() + top;
        float f10 = rectF.left;
        dg.q2 q2Var = h9Var.f41383j1;
        rectF.set(AndroidUtilities.lerp(f10, q2Var.getLeft(), h9Var.f41396q1), AndroidUtilities.lerp(rectF.top + translationY, q2Var.getTop() - q2Var.getTranslationY(), h9Var.f41396q1), AndroidUtilities.lerp(rectF.right, q2Var.getRight(), h9Var.f41396q1), AndroidUtilities.lerp(translationY + rectF.bottom, q2Var.getBottom() - q2Var.getTranslationY(), h9Var.f41396q1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, h9Var.f41396q1));
        Paint paint2 = h9Var.f41394p1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * h9Var.f41396q1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            h9 h9Var = this.f41716a;
            if (h9Var.f41398r1) {
                h9Var.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
