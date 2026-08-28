package yf;

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
import org.telegram.ui.xs0;
public final class j0 extends FrameLayout {
    public float f49872a;
    public float f49873b;
    public final xs0 f49874c;

    public j0(xs0 xs0Var, Context context) {
        super(context);
        this.f49874c = xs0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = xs0Var.D1;
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
        xs0 xs0Var = this.f49874c;
        xf.q1 q1Var = xs0Var.G1;
        Paint paint = xs0Var.E1;
        Paint paint2 = xs0Var.D1;
        Paint paint3 = xs0Var.F1;
        barView = xs0Var.getBarView();
        Rect rect = AndroidUtilities.rectTmp2;
        int left = barView.getLeft();
        i0 i0Var = xs0Var.C1;
        rect.set(AndroidUtilities.lerp(left, i0Var.getLeft(), xs0Var.J1), AndroidUtilities.lerp(barView.getTop(), i0Var.getTop(), xs0Var.J1), AndroidUtilities.lerp(barView.getRight(), i0Var.getRight(), xs0Var.J1), AndroidUtilities.lerp(barView.getBottom(), i0Var.getBottom(), xs0Var.J1));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), xs0Var.J1);
        if (xs0Var.Y1 != null) {
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            xs0Var.Y1.p(lerp);
            xs0Var.Y1.setBounds(rect);
            xs0Var.Y1.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, lerp, lerp, xs0Var.K1);
        }
        if (barView.getChildCount() >= 1 && xs0Var.J1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof o1) {
                childAt = ((o1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - xs0Var.J1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i9 = q1Var.f49333a;
                int i10 = xs0Var.f49932d1;
                View view = childAt;
                if (i10 != -1) {
                    if (i10 == 0) {
                        viewGroup = xs0Var.f49950p1;
                    } else if (i10 == 2) {
                        viewGroup = xs0Var.f49951q1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof o1) {
                        childAt2 = ((o1) viewGroup).getColorClickableView();
                    }
                    x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), xs0Var.f49934e1);
                    y10 = AndroidUtilities.lerp(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), xs0Var.f49934e1);
                }
                if (i0Var != null && i0Var.getChildCount() > 0) {
                    View childAt3 = i0Var.getChildAt(0);
                    x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (i0Var.getX() - barView.getLeft()), xs0Var.J1);
                    y10 = AndroidUtilities.lerp(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (i0Var.getY() - barView.getTop()), xs0Var.J1);
                    i9 = i0.a.d(xs0Var.J1, q1Var.f49333a, xs0Var.R1.b(0));
                }
                float f10 = x10;
                float f11 = y10;
                if (f10 != this.f49872a || f11 != this.f49873b) {
                    this.f49872a = f10;
                    this.f49873b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (i0Var != null && i0Var.getChildCount() > 0) {
                    View childAt4 = i0Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), xs0Var.J1);
                }
                float f12 = min;
                rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i9);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i9);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float dp = f12 - AndroidUtilities.dp(3.0f);
                if (i0Var != null && i0Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f12 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f12, xs0Var.J1);
                }
                i1.x1(f10, f11, dp, paint.getColor(), canvas2);
                if (i0Var != null && i0Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * xs0Var.J1));
                    canvas2.drawCircle(f10, f11, j3.r0.C(1.0f, xs0Var.J1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f12), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        h0 h0Var = this.f49874c.Z0;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }
}
