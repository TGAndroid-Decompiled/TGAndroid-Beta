package sg;

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
import org.telegram.ui.pt0;
public final class k0 extends FrameLayout {
    public float f48324a;
    public float f48325b;
    public final pt0 f48326c;

    public k0(pt0 pt0Var, Context context) {
        super(context);
        this.f48326c = pt0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = pt0Var.f48389w1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        pt0 pt0Var = this.f48326c;
        rg.q1 q1Var = pt0Var.f48395z1;
        Paint paint = pt0Var.f48391x1;
        Paint paint2 = pt0Var.f48389w1;
        Paint paint3 = pt0Var.f48393y1;
        barView = pt0Var.getBarView();
        Rect rect = AndroidUtilities.rectTmp2;
        int left = barView.getLeft();
        j0 j0Var = pt0Var.f48387v1;
        rect.set(AndroidUtilities.lerp(left, j0Var.getLeft(), pt0Var.C1), AndroidUtilities.lerp(barView.getTop(), j0Var.getTop(), pt0Var.C1), AndroidUtilities.lerp(barView.getRight(), j0Var.getRight(), pt0Var.C1), AndroidUtilities.lerp(barView.getBottom(), j0Var.getBottom(), pt0Var.C1));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), pt0Var.C1);
        if (pt0Var.R1 != null) {
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            pt0Var.R1.x(lerp);
            pt0Var.R1.setBounds(rect);
            pt0Var.R1.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, lerp, lerp, pt0Var.D1);
        }
        if (barView.getChildCount() >= 1 && pt0Var.C1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof p1) {
                childAt = ((p1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - pt0Var.C1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x9 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = q1Var.f47560a;
                int i11 = pt0Var.W0;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = pt0Var.f48368i1;
                    } else if (i11 == 2) {
                        viewGroup = pt0Var.f48369j1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof p1) {
                        childAt2 = ((p1) viewGroup).getColorClickableView();
                    }
                    x9 = AndroidUtilities.lerp(x9, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), pt0Var.X0);
                    y3 = AndroidUtilities.lerp(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), pt0Var.X0);
                }
                if (j0Var != null && j0Var.getChildCount() > 0) {
                    View childAt3 = j0Var.getChildAt(0);
                    x9 = AndroidUtilities.lerp(x9, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (j0Var.getX() - barView.getLeft()), pt0Var.C1);
                    y3 = AndroidUtilities.lerp(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (j0Var.getY() - barView.getTop()), pt0Var.C1);
                    i10 = i0.a.f(pt0Var.C1, q1Var.f47560a, pt0Var.K1.b(0));
                }
                float f7 = x9;
                float f10 = y3;
                if (f7 != this.f48324a || f10 != this.f48325b) {
                    this.f48324a = f7;
                    this.f48325b = f10;
                    paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (j0Var != null && j0Var.getChildCount() > 0) {
                    View childAt4 = j0Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), pt0Var.C1);
                }
                float f11 = min;
                rectF.set(f7 - f11, f10 - f11, f7 + f11, f10 + f11);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i10);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i10);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float dp = f11 - AndroidUtilities.dp(3.0f);
                if (j0Var != null && j0Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, pt0Var.C1);
                }
                j1.D1(f7, f10, dp, paint.getColor(), canvas2);
                if (j0Var != null && j0Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * pt0Var.C1));
                    canvas2.drawCircle(f7, f10, ic.a.d(1.0f, pt0Var.C1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        i0 i0Var = this.f48326c.S0;
        if (i0Var != null) {
            i0Var.invalidate();
        }
    }
}
