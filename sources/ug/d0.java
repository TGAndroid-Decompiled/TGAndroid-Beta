package ug;

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
import org.telegram.ui.Components.kw0;
import org.telegram.ui.lp0;
public final class d0 extends FrameLayout {
    public float f55928a;
    public float f55929b;
    public final lp0 f55930c;

    public d0(lp0 lp0Var, Context context) {
        super(context);
        this.f55930c = lp0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = lp0Var.f55986r1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ViewGroup barView;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        lp0 lp0Var = this.f55930c;
        tg.h1 h1Var = lp0Var.f55992u1;
        Paint paint = lp0Var.f55988s1;
        Paint paint2 = lp0Var.f55986r1;
        Paint paint3 = lp0Var.f55990t1;
        barView = lp0Var.getBarView();
        Rect rect = org.telegram.messenger.g0.Q;
        int left = barView.getLeft();
        c0 c0Var = lp0Var.f55984q1;
        rect.set(org.telegram.messenger.g0.W1(lp0Var.f55998x1, left, c0Var.getLeft()), org.telegram.messenger.g0.W1(lp0Var.f55998x1, barView.getTop(), c0Var.getTop()), org.telegram.messenger.g0.W1(lp0Var.f55998x1, barView.getRight(), c0Var.getRight()), org.telegram.messenger.g0.W1(lp0Var.f55998x1, barView.getBottom(), c0Var.getBottom()));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        float W1 = org.telegram.messenger.g0.W1(lp0Var.f55998x1, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        if (lp0Var.M1 != null) {
            rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            lp0Var.M1.r(W1);
            lp0Var.M1.setBounds(rect);
            lp0Var.M1.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, W1, W1, lp0Var.f56000y1);
        }
        if (barView.getChildCount() >= 1 && lp0Var.f55998x1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof d1) {
                childAt = ((d1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - lp0Var.f55998x1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y9 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i3 = h1Var.f55186a;
                int i10 = lp0Var.R0;
                View view = childAt;
                if (i10 != -1) {
                    if (i10 == 0) {
                        viewGroup = lp0Var.f55967d1;
                    } else if (i10 == 2) {
                        viewGroup = lp0Var.f55968e1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof d1) {
                        childAt2 = ((d1) viewGroup).getColorClickableView();
                    }
                    x10 = org.telegram.messenger.g0.T1(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), lp0Var.S0);
                    y9 = org.telegram.messenger.g0.T1(y9, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), lp0Var.S0);
                }
                if (c0Var != null && c0Var.getChildCount() > 0) {
                    View childAt3 = c0Var.getChildAt(0);
                    x10 = org.telegram.messenger.g0.T1(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (c0Var.getX() - barView.getLeft()), lp0Var.f55998x1);
                    y9 = org.telegram.messenger.g0.T1(y9, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (c0Var.getY() - barView.getTop()), lp0Var.f55998x1);
                    i3 = i0.a.f(lp0Var.f55998x1, h1Var.f55186a, lp0Var.F1.b(0));
                }
                float f10 = x10;
                float f11 = y9;
                if (f10 != this.f55928a || f11 != this.f55929b) {
                    this.f55928a = f10;
                    this.f55929b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - org.telegram.messenger.g0.L(0.5f);
                if (c0Var != null && c0Var.getChildCount() > 0) {
                    View childAt4 = c0Var.getChildAt(0);
                    min = org.telegram.messenger.g0.T1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f), lp0Var.f55998x1);
                }
                float f12 = min;
                rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i3);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i3);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float L = f12 - org.telegram.messenger.g0.L(3.0f);
                if (c0Var != null && c0Var.getSelectedColorIndex() != 0) {
                    L = org.telegram.messenger.g0.T1(f12 - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(2.0f) + f12, lp0Var.f55998x1);
                }
                x0.A1(f10, f11, L, paint.getColor(), canvas2);
                if (c0Var != null && c0Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * lp0Var.f55998x1));
                    canvas2.drawCircle(f10, f11, a1.g.D(1.0f, lp0Var.f55998x1, paint3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f), f12), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        kw0 kw0Var = this.f55930c.N0;
        if (kw0Var != null) {
            kw0Var.invalidate();
        }
    }
}
