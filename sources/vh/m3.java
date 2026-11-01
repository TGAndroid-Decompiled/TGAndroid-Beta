package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class m3 extends FrameLayout {
    public final int f51492a;
    public final s7 f51493b;

    public m3(s7 s7Var, Context context, int i10) {
        super(context);
        this.f51492a = i10;
        switch (i10) {
            case 1:
                this.f51493b = s7Var;
                super(context);
                return;
            default:
                this.f51493b = s7Var;
                setWillNotDraw(false);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f51492a) {
            case 1:
                if (this.f51493b.V1) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f51492a) {
            case 0:
                super.onDraw(canvas);
                s7 s7Var = this.f51493b;
                Paint paint = s7Var.f50961a1;
                jg.t1 t1Var = s7Var.U0;
                paint.setAlpha((int) ((1.0f - s7Var.f50964c1) * t1Var.getAlpha() * 20.0f));
                RectF rectF = org.telegram.messenger.i0.P;
                t1Var.b(rectF);
                y3 y3Var = s7Var.C0;
                int top = y3Var.getTop();
                float translationY = t1Var.getTranslationY() + y3Var.getTranslationY() + t1Var.getTop() + top;
                float f7 = rectF.left;
                jg.a2 a2Var = s7Var.V0;
                rectF.set(org.telegram.messenger.i0.T1(f7, a2Var.getLeft(), s7Var.f50964c1), org.telegram.messenger.i0.T1(rectF.top + translationY, a2Var.getTop() - a2Var.getTranslationY(), s7Var.f50964c1), org.telegram.messenger.i0.T1(rectF.right, a2Var.getRight(), s7Var.f50964c1), org.telegram.messenger.i0.T1(translationY + rectF.bottom, a2Var.getBottom() - a2Var.getTranslationY(), s7Var.f50964c1));
                float L = org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(s7Var.f50964c1, 32, 16));
                Paint paint2 = s7Var.f50962b1;
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * s7Var.f50964c1));
                canvas.drawRoundRect(rectF, L, L, paint2);
                paint2.setAlpha(alpha);
                canvas.drawRoundRect(rectF, L, L, paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f51492a) {
            case 0:
                if (motionEvent.getActionMasked() == 0) {
                    s7 s7Var = this.f51493b;
                    if (s7Var.f50966d1) {
                        s7Var.M0(false);
                        return true;
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return false;
        }
    }
}
