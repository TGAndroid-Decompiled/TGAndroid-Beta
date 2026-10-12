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
import org.telegram.ui.hu0;
public final class l0 extends FrameLayout {
    public float f44340a;
    public float f44341b;
    public final hu0 f44342c;

    public l0(hu0 hu0Var, Context context) {
        super(context);
        this.f44342c = hu0Var;
        new Path();
        setWillNotDraw(false);
        Paint paint = hu0Var.H1;
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
        hu0 hu0Var = this.f44342c;
        qg.q1 q1Var = hu0Var.K1;
        Paint paint = hu0Var.I1;
        Paint paint2 = hu0Var.H1;
        Paint paint3 = hu0Var.J1;
        barView = hu0Var.getBarView();
        Rect rect = AndroidUtilities.rectTmp2;
        int left = barView.getLeft();
        k0 k0Var = hu0Var.G1;
        rect.set(AndroidUtilities.lerp(left, k0Var.getLeft(), hu0Var.N1), AndroidUtilities.lerp(barView.getTop(), k0Var.getTop(), hu0Var.N1), AndroidUtilities.lerp(barView.getRight(), k0Var.getRight(), hu0Var.N1), AndroidUtilities.lerp(barView.getBottom(), k0Var.getBottom(), hu0Var.N1));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), hu0Var.N1);
        if (hu0Var.f44404c2 != null) {
            rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            hu0Var.f44404c2.q(lerp);
            hu0Var.f44404c2.setBounds(rect);
            hu0Var.f44404c2.draw(canvas2);
        } else {
            canvas2.drawRoundRect(rectF, lerp, lerp, hu0Var.O1);
        }
        if (barView.getChildCount() >= 1 && hu0Var.N1 != 1.0f) {
            canvas2.save();
            canvas2.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof q1) {
                childAt = ((q1) barView).getColorClickableView();
            }
            if (childAt.getAlpha() != 0.0f) {
                canvas2.scale(childAt.getScaleX(), childAt.getScaleY(), childAt.getPivotX(), childAt.getPivotY());
                paint2.setAlpha((int) (childAt.getAlpha() * (1.0f - hu0Var.N1) * 255.0f));
                int width = (childAt.getWidth() - childAt.getPaddingLeft()) - childAt.getPaddingRight();
                int height = (childAt.getHeight() - childAt.getPaddingTop()) - childAt.getPaddingBottom();
                float x10 = (width / 2.0f) + childAt.getX() + childAt.getPaddingLeft();
                float y3 = (height / 2.0f) + childAt.getY() + childAt.getPaddingTop();
                int i10 = q1Var.f43543a;
                int i11 = hu0Var.f44413h1;
                View view = childAt;
                if (i11 != -1) {
                    if (i11 == 0) {
                        viewGroup = hu0Var.f44431t1;
                    } else if (i11 == 2) {
                        viewGroup = hu0Var.f44432u1;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup == null) {
                        viewGroup2 = barView;
                    } else {
                        viewGroup2 = viewGroup;
                    }
                    View childAt2 = viewGroup2.getChildAt(0);
                    if (viewGroup instanceof q1) {
                        childAt2 = ((q1) viewGroup).getColorClickableView();
                    }
                    x10 = AndroidUtilities.lerp(x10, (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f) + childAt2.getX() + childAt2.getPaddingLeft(), hu0Var.f44415i1);
                    y3 = AndroidUtilities.lerp(y3, (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f) + childAt2.getY() + childAt2.getPaddingTop(), hu0Var.f44415i1);
                }
                if (k0Var != null && k0Var.getChildCount() > 0) {
                    View childAt3 = k0Var.getChildAt(0);
                    x10 = AndroidUtilities.lerp(x10, (childAt3.getWidth() / 2.0f) + childAt3.getX() + (k0Var.getX() - barView.getLeft()), hu0Var.N1);
                    y3 = AndroidUtilities.lerp(y3, (childAt3.getHeight() / 2.0f) + childAt3.getY() + (k0Var.getY() - barView.getTop()), hu0Var.N1);
                    i10 = i0.a.d(hu0Var.N1, q1Var.f43543a, hu0Var.V1.b(0));
                }
                float f7 = x10;
                float f10 = y3;
                if (f7 != this.f44340a || f10 != this.f44341b) {
                    this.f44340a = f7;
                    this.f44341b = f10;
                    paint2.setShader(new SweepGradient(f7, f10, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
                }
                float min = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (k0Var != null && k0Var.getChildCount() > 0) {
                    View childAt4 = k0Var.getChildAt(0);
                    min = AndroidUtilities.lerp(min, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), hu0Var.N1);
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
                if (k0Var != null && k0Var.getSelectedColorIndex() != 0) {
                    dp = AndroidUtilities.lerp(f11 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f11, hu0Var.N1);
                }
                k1.y1(f7, f10, dp, paint.getColor(), canvas2);
                if (k0Var != null && k0Var.getSelectedColorIndex() == 0) {
                    paint3.setAlpha((int) (view.getAlpha() * paint3.getAlpha() * hu0Var.N1));
                    canvas2.drawCircle(f7, f10, k3.D(1.0f, hu0Var.N1, paint3.getStrokeWidth() + AndroidUtilities.dp(3.0f), f11), paint3);
                }
            }
            canvas2.restore();
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        j0 j0Var = this.f44342c.f44405d1;
        if (j0Var != null) {
            j0Var.invalidate();
        }
    }
}
