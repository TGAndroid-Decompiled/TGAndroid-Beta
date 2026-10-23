package rg;

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
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.jt0;
public final class k0 extends FrameLayout {
    public float f45849a;
    public float f45850b;
    public final jt0 f45851c;

    public k0(jt0 jt0Var, Context context) {
        super(context);
        this.f45851c = jt0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = jt0Var.H1;
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
        jt0 jt0Var = this.f45851c;
        qg.s1 s1Var = jt0Var.K1;
        Paint paint = jt0Var.I1;
        Paint paint2 = jt0Var.H1;
        Paint paint3 = jt0Var.J1;
        barView = jt0Var.getBarView();
        Rect rect = AndroidUtilities.rectTmp2;
        int left = barView.getLeft();
        j0 j0Var = jt0Var.G1;
        rect.set(AndroidUtilities.lerp(left, j0Var.getLeft(), jt0Var.N1), AndroidUtilities.lerp(barView.getTop(), j0Var.getTop(), jt0Var.N1), AndroidUtilities.lerp(barView.getRight(), j0Var.getRight(), jt0Var.N1), AndroidUtilities.lerp(barView.getBottom(), j0Var.getBottom(), jt0Var.N1));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), jt0Var.N1);
        if (jt0Var.f45887c2 != null) {
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            jt0Var.f45887c2.q(lerp);
            jt0Var.f45887c2.setBounds(rect);
            jt0Var.f45887c2.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, lerp, lerp, jt0Var.O1);
        }
        if (barView.getChildCount() >= 1 && jt0Var.N1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof p1) {
                childAt = ((p1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - jt0Var.N1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = s1Var.f45066a;
                int i11 = jt0Var.f45896h1;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = jt0Var.f45914t1;
                    } else if (i11 == 2) {
                        viewGroup = jt0Var.f45915u1;
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
                    x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), jt0Var.f45898i1);
                    y3 = AndroidUtilities.lerp(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), jt0Var.f45898i1);
                }
                if (j0Var != null && j0Var.getChildCount() > 0) {
                    View childAt3 = j0Var.getChildAt(0);
                    x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (j0Var.getX() - barView.getLeft()), jt0Var.N1);
                    y3 = AndroidUtilities.lerp(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (j0Var.getY() - barView.getTop()), jt0Var.N1);
                    i10 = i0.a.f(jt0Var.N1, s1Var.f45066a, jt0Var.V1.b(0));
                }
                float f7 = x10;
                float f10 = y3;
                if (f7 != this.f45849a || f10 != this.f45850b) {
                    this.f45849a = f7;
                    this.f45850b = f10;
                    paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (j0Var != null && j0Var.getChildCount() > 0) {
                    View childAt4 = j0Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), jt0Var.N1);
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
                    dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, jt0Var.N1);
                }
                j1.D1(f7, f10, dp, paint.getColor(), canvas2);
                if (j0Var != null && j0Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * jt0Var.N1));
                    canvas2.drawCircle(f7, f10, k3.D(1.0f, jt0Var.N1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        i0 i0Var = this.f45851c.f45888d1;
        if (i0Var != null) {
            i0Var.invalidate();
        }
    }
}
