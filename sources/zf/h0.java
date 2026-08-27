package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ys0;

public final class h0 extends FrameLayout {

    public final ys0 f50421a;

    public h0(ys0 ys0Var, Context context) {
        super(context);
        this.f50421a = ys0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ys0 ys0Var = this.f50421a;
        Paint paint = ys0Var.f50538x1;
        o1 o1Var = ys0Var.f50529q1;
        paint.setAlpha((int) ((1.0f - ys0Var.f50542z1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        j0 j0Var = ys0Var.Y0;
        float translationY = o1Var.getTranslationY() + j0Var.getTranslationY() + o1Var.getTop() + j0Var.getTop();
        float f10 = rectF.left;
        t1 t1Var = ys0Var.f50530r1;
        rectF.set(AndroidUtilities.lerp(f10, t1Var.getLeft(), ys0Var.f50542z1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), ys0Var.f50542z1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), ys0Var.f50542z1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), ys0Var.f50542z1));
        float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, ys0Var.f50542z1));
        Paint paint2 = ys0Var.f50540y1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * ys0Var.f50542z1));
        canvas.drawRoundRect(rectF, fDp, fDp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, fDp, fDp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ys0 ys0Var = this.f50421a;
            if (ys0Var.A1) {
                ys0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
