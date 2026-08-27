package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.ys0;

public final class j0 extends FrameLayout {

    public float f50469a;

    public float f50470b;

    public final ys0 f50471c;

    public j0(ys0 ys0Var, Context context) {
        super(context);
        this.f50471c = ys0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = ys0Var.D1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ViewGroup viewGroup;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        ys0 ys0Var = this.f50471c;
        yf.p1 p1Var = ys0Var.G1;
        Paint paint = ys0Var.E1;
        Paint paint2 = ys0Var.D1;
        Paint paint3 = ys0Var.F1;
        ViewGroup barView = ys0Var.getBarView();
        Rect rect = AndroidUtilities.rectTmp2;
        int left = barView.getLeft();
        i0 i0Var = ys0Var.C1;
        rect.set(AndroidUtilities.lerp(left, i0Var.getLeft(), ys0Var.J1), AndroidUtilities.lerp(barView.getTop(), i0Var.getTop(), ys0Var.J1), AndroidUtilities.lerp(barView.getRight(), i0Var.getRight(), ys0Var.J1), AndroidUtilities.lerp(barView.getBottom(), i0Var.getBottom(), ys0Var.J1));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), ys0Var.J1);
        if (ys0Var.Y1 != null) {
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            ys0Var.Y1.p(fLerp);
            ys0Var.Y1.setBounds(rect);
            ys0Var.Y1.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, fLerp, fLerp, ys0Var.K1);
        }
        if (barView.getChildCount() < 1 || ys0Var.J1 == 1.0f) {
            return;
        }
        canvas2.save();
        canvas2.translate(barView.getLeft(), barView.getTop());
        View childAt = barView.getChildAt(0);
        if (barView instanceof o1) {
            childAt = ((o1) barView).getColorClickableView();
        }
        if (childAt.getAlpha() != 0.0f) {
            canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
            paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - ys0Var.J1) * 255.0f));
            int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
            int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
            float x8 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
            float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
            int iD = p1Var.f50034a;
            int i10 = ys0Var.f50510d1;
            View view = childAt;
            if (i10 != -1) {
                if (i10 == 0) {
                    viewGroup = ys0Var.f50528p1;
                } else {
                    viewGroup = i10 == 2 ? ys0Var.f50529q1 : null;
                }
                View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                if (viewGroup instanceof o1) {
                    childAt2 = ((o1) viewGroup).getColorClickableView();
                }
                x8 = AndroidUtilities.lerp(x8, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), ys0Var.f50512e1);
                y10 = AndroidUtilities.lerp(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), ys0Var.f50512e1);
            }
            if (i0Var != null && i0Var.getChildCount() > 0) {
                View childAt3 = i0Var.getChildAt(0);
                x8 = AndroidUtilities.lerp(x8, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (i0Var.getX() - barView.getLeft()), ys0Var.J1);
                y10 = AndroidUtilities.lerp(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (i0Var.getY() - barView.getTop()), ys0Var.J1);
                iD = i0.b.d(ys0Var.J1, p1Var.f50034a, ys0Var.R1.b(0));
            }
            float f10 = x8;
            float f11 = y10;
            if (f10 != this.f50469a || f11 != this.f50470b) {
                this.f50469a = f10;
                this.f50470b = f11;
                paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }
            float fMin = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
            if (i0Var != null && i0Var.getChildCount() > 0) {
                View childAt4 = i0Var.getChildAt(0);
                fMin = AndroidUtilities.lerp(fMin, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), ys0Var.J1);
            }
            float f12 = fMin;
            rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
            canvas2 = canvas;
            canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
            paint.setColor(iD);
            paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
            paint3.setColor(iD);
            paint3.setAlpha((int) (view.getAlpha() * 255.0f));
            float fDp = f12 - AndroidUtilities.dp(3.0f);
            if (i0Var != null && i0Var.getSelectedColorIndex() != 0) {
                fDp = AndroidUtilities.lerp(f12 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f12, ys0Var.J1);
            }
            i1.x1(f10, f11, fDp, paint.getColor(), canvas2);
            if (i0Var != null && i0Var.getSelectedColorIndex() == 0) {
                paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * ys0Var.J1));
                canvas2.drawCircle(f10, f11, pa.b(1.0f, ys0Var.J1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f12), paint3);
            }
        }
        canvas2.restore();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        h0 h0Var = this.f50471c.Z0;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }
}
