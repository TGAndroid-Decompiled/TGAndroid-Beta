package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xs0;
public final class h0 extends FrameLayout {
    public final xs0 f49827a;

    public h0(xs0 xs0Var, Context context) {
        super(context);
        this.f49827a = xs0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        xs0 xs0Var = this.f49827a;
        Paint paint = xs0Var.f49960x1;
        o1 o1Var = xs0Var.f49951q1;
        paint.setAlpha((int) ((1.0f - xs0Var.f49964z1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        j0 j0Var = xs0Var.Y0;
        int top = j0Var.getTop();
        float translationY = o1Var.getTranslationY() + j0Var.getTranslationY() + o1Var.getTop() + top;
        float f10 = rectF.left;
        t1 t1Var = xs0Var.f49952r1;
        rectF.set(AndroidUtilities.lerp(f10, t1Var.getLeft(), xs0Var.f49964z1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), xs0Var.f49964z1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), xs0Var.f49964z1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), xs0Var.f49964z1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, xs0Var.f49964z1));
        Paint paint2 = xs0Var.f49962y1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * xs0Var.f49964z1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            xs0 xs0Var = this.f49827a;
            if (xs0Var.A1) {
                xs0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
