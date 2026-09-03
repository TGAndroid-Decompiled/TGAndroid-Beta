package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yh;
public final class x4 extends FrameLayout {
    public float f46312a;
    public float f46313b;
    public final dg.e1 f46314c;
    public final e9 d;

    public x4(e9 e9Var, Context context, dg.e1 e1Var) {
        super(context);
        this.d = e9Var;
        this.f46314c = e1Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = e9Var.f44960u1;
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
        e9 e9Var = this.d;
        dg.e2 e2Var = e9Var.f44966x1;
        Paint paint = e9Var.f44962v1;
        Paint paint2 = e9Var.f44960u1;
        Paint paint3 = e9Var.f44964w1;
        barView = e9Var.getBarView();
        RectF rectF = AndroidUtilities.rectTmp;
        int left = barView.getLeft();
        g4 g4Var = e9Var.f44958t1;
        rectF.set(AndroidUtilities.lerp(left, g4Var.getLeft(), e9Var.A1), AndroidUtilities.lerp(barView.getTop(), g4Var.getTop(), e9Var.A1), AndroidUtilities.lerp(barView.getRight(), g4Var.getRight(), e9Var.A1), AndroidUtilities.lerp(barView.getBottom(), g4Var.getBottom(), e9Var.A1));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), e9Var.A1);
        canvas2.drawRoundRect(rectF, lerp, lerp, e9Var.B1);
        if (barView.getChildCount() >= 1 && e9Var.A1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof eg.i2) {
                childAt = ((eg.i2) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - e9Var.A1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = e2Var.f4524a;
                int i11 = e9Var.W0;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = e9Var.f44935h1;
                    } else if (i11 == 2) {
                        viewGroup = e9Var.f44937i1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof eg.i2) {
                        childAt2 = ((eg.i2) viewGroup).getColorClickableView();
                    }
                    x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), e9Var.X0);
                    y10 = AndroidUtilities.lerp(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), e9Var.X0);
                }
                if (g4Var != null && g4Var.getChildCount() > 0) {
                    View childAt3 = g4Var.getChildAt(0);
                    x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (g4Var.getX() - barView.getLeft()), e9Var.A1);
                    y10 = AndroidUtilities.lerp(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (g4Var.getY() - barView.getTop()), e9Var.A1);
                    i10 = i0.a.d(e9Var.A1, e2Var.f4524a, this.f46314c.b(0));
                }
                float f10 = x10;
                float f11 = y10;
                if (f10 != this.f46312a || f11 != this.f46313b) {
                    this.f46312a = f10;
                    this.f46313b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (g4Var != null && g4Var.getChildCount() > 0) {
                    View childAt4 = g4Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), e9Var.A1);
                }
                float f12 = min;
                rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i10);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i10);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float dp = f12 - AndroidUtilities.dp(3.0f);
                if (g4Var != null && g4Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f12 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f12, e9Var.A1);
                }
                eg.c2.w1(f10, f11, dp, paint.getColor(), canvas2);
                if (g4Var != null && g4Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * e9Var.A1));
                    canvas2.drawCircle(f10, f11, yh.c(1.0f, e9Var.A1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f12), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        f4 f4Var = this.d.R0;
        if (f4Var != null) {
            f4Var.invalidate();
        }
    }
}
