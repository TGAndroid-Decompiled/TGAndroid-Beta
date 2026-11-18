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
import org.telegram.ui.Components.w01;
import org.telegram.ui.vp0;
public final class e0 extends FrameLayout {
    public float f57787a;
    public float f57788b;
    public final vp0 f57789c;

    public e0(vp0 vp0Var, Context context) {
        super(context);
        this.f57789c = vp0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = vp0Var.f57872r1;
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
        vp0 vp0Var = this.f57789c;
        sg.h1 h1Var = vp0Var.f57878u1;
        Paint paint = vp0Var.f57874s1;
        Paint paint2 = vp0Var.f57872r1;
        Paint paint3 = vp0Var.f57876t1;
        barView = vp0Var.getBarView();
        Rect rect = org.telegram.messenger.g0.Q;
        int left = barView.getLeft();
        d0 d0Var = vp0Var.f57870q1;
        rect.set(org.telegram.messenger.g0.W1(vp0Var.f57884x1, left, d0Var.getLeft()), org.telegram.messenger.g0.W1(vp0Var.f57884x1, barView.getTop(), d0Var.getTop()), org.telegram.messenger.g0.W1(vp0Var.f57884x1, barView.getRight(), d0Var.getRight()), org.telegram.messenger.g0.W1(vp0Var.f57884x1, barView.getBottom(), d0Var.getBottom()));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        float W1 = org.telegram.messenger.g0.W1(vp0Var.f57884x1, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(24.0f));
        if (vp0Var.M1 != null) {
            rect.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(4.0f));
            vp0Var.M1.r(W1);
            vp0Var.M1.setBounds(rect);
            vp0Var.M1.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, W1, W1, vp0Var.f57886y1);
        }
        if (barView.getChildCount() >= 1 && vp0Var.f57884x1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof e1) {
                childAt = ((e1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - vp0Var.f57884x1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y10 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i7 = h1Var.f57218a;
                int i10 = vp0Var.R0;
                View view = childAt;
                if (i10 != -1) {
                    if (i10 == 0) {
                        viewGroup = vp0Var.f57853d1;
                    } else if (i10 == 2) {
                        viewGroup = vp0Var.f57854e1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof e1) {
                        childAt2 = ((e1) viewGroup).getColorClickableView();
                    }
                    x10 = org.telegram.messenger.g0.T1(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), vp0Var.S0);
                    y10 = org.telegram.messenger.g0.T1(y10, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), vp0Var.S0);
                }
                if (d0Var != null && d0Var.getChildCount() > 0) {
                    View childAt3 = d0Var.getChildAt(0);
                    x10 = org.telegram.messenger.g0.T1(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (d0Var.getX() - barView.getLeft()), vp0Var.f57884x1);
                    y10 = org.telegram.messenger.g0.T1(y10, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (d0Var.getY() - barView.getTop()), vp0Var.f57884x1);
                    i7 = i0.a.f(vp0Var.f57884x1, h1Var.f57218a, vp0Var.F1.b(0));
                }
                float f10 = x10;
                float f11 = y10;
                if (f10 != this.f57787a || f11 != this.f57788b) {
                    this.f57787a = f10;
                    this.f57788b = f11;
                    paint2.setShader(new SweepGradient(f10, f11, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - org.telegram.messenger.g0.L(0.5f);
                if (d0Var != null && d0Var.getChildCount() > 0) {
                    View childAt4 = d0Var.getChildAt(0);
                    min = org.telegram.messenger.g0.T1(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - org.telegram.messenger.g0.L(2.0f), vp0Var.f57884x1);
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
                if (d0Var != null && d0Var.getSelectedColorIndex() != 0) {
                    L = org.telegram.messenger.g0.T1(f12 - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(2.0f) + f12, vp0Var.f57884x1);
                }
                y0.A1(f10, f11, L, paint.getColor(), canvas2);
                if (d0Var != null && d0Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * vp0Var.f57884x1));
                    canvas2.drawCircle(f10, f11, com.google.android.gms.internal.vision.e2.t(1.0f, vp0Var.f57884x1, paint3.getStrokeWidth() + org.telegram.messenger.g0.L(3.0f), f12), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        w01 w01Var = this.f57789c.N0;
        if (w01Var != null) {
            w01Var.invalidate();
        }
    }
}
