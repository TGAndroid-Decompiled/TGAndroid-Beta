package tg;

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
import org.telegram.ui.Components.x01;
import org.telegram.ui.wp0;
public final class f0 extends FrameLayout {
    public float f57812a;
    public float f57813b;
    public final wp0 f57814c;

    public f0(wp0 wp0Var, Context context) {
        super(context);
        this.f57814c = wp0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = wp0Var.f57895r1;
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
        wp0 wp0Var = this.f57814c;
        sg.h1 h1Var = wp0Var.f57901u1;
        Paint paint = wp0Var.f57897s1;
        Paint paint2 = wp0Var.f57895r1;
        Paint paint3 = wp0Var.f57899t1;
        barView = wp0Var.getBarView();
        Rect rect = org.telegram.messenger.g0.Q;
        int left = barView.getLeft();
        e0 e0Var = wp0Var.f57893q1;
        rect.set(org.telegram.messenger.g0.W1(wp0Var.f57907x1, left, e0Var.getLeft()), org.telegram.messenger.g0.W1(wp0Var.f57907x1, barView.getTop(), e0Var.getTop()), org.telegram.messenger.g0.W1(wp0Var.f57907x1, barView.getRight(), e0Var.getRight()), org.telegram.messenger.g0.W1(wp0Var.f57907x1, barView.getBottom(), e0Var.getBottom()));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        float W1 = org.telegram.messenger.g0.W1(wp0Var.f57907x1, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        if (wp0Var.M1 != null) {
            rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            wp0Var.M1.r(W1);
            wp0Var.M1.setBounds(rect);
            wp0Var.M1.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, W1, W1, wp0Var.f57909y1);
        }
        if (barView.getChildCount() >= 1 && wp0Var.f57907x1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof f1) {
                childAt = ((f1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - wp0Var.f57907x1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i7 = h1Var.f57228a;
                int i10 = wp0Var.R0;
                View view = childAt;
                if (i10 != -1) {
                    if (i10 == 0) {
                        viewGroup = wp0Var.f57876d1;
                    } else if (i10 == 2) {
                        viewGroup = wp0Var.f57877e1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof f1) {
                        childAt2 = ((f1) viewGroup).getColorClickableView();
                    }
                    x10 = org.telegram.messenger.g0.T1(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), wp0Var.S0);
                    y10 = org.telegram.messenger.g0.T1(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), wp0Var.S0);
                }
                if (e0Var != null && e0Var.getChildCount() > 0) {
                    View childAt3 = e0Var.getChildAt(0);
                    x10 = org.telegram.messenger.g0.T1(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (e0Var.getX() - barView.getLeft()), wp0Var.f57907x1);
                    y10 = org.telegram.messenger.g0.T1(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (e0Var.getY() - barView.getTop()), wp0Var.f57907x1);
                    i7 = i0.a.f(wp0Var.f57907x1, h1Var.f57228a, wp0Var.F1.b(0));
                }
                float f10 = x10;
                float f11 = y10;
                if (f10 != this.f57812a || f11 != this.f57813b) {
                    this.f57812a = f10;
                    this.f57813b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - org.telegram.messenger.g0.L(0.5f);
                if (e0Var != null && e0Var.getChildCount() > 0) {
                    View childAt4 = e0Var.getChildAt(0);
                    min = org.telegram.messenger.g0.T1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f), wp0Var.f57907x1);
                }
                float f12 = min;
                rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
                canvas2 = canvas;
                canvas2.drawArc(rectF, 0.0f, 360.0f, false, paint2);
                paint.setColor(i7);
                paint.setAlpha((int) (view.getAlpha() * paint.getAlpha()));
                paint3.setColor(i7);
                paint3.setAlpha((int) (view.getAlpha() * 255.0f));
                float L = f12 - org.telegram.messenger.g0.L(3.0f);
                if (e0Var != null && e0Var.getSelectedColorIndex() != 0) {
                    L = org.telegram.messenger.g0.T1(f12 - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(2.0f) + f12, wp0Var.f57907x1);
                }
                z0.A1(f10, f11, L, paint.getColor(), canvas2);
                if (e0Var != null && e0Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * wp0Var.f57907x1));
                    canvas2.drawCircle(f10, f11, com.google.android.gms.internal.vision.e2.t(1.0f, wp0Var.f57907x1, paint3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f), f12), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        x01 x01Var = this.f57814c.N0;
        if (x01Var != null) {
            x01Var.invalidate();
        }
    }
}
