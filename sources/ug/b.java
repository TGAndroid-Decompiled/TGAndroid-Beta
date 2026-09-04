package ug;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.oj1;
public final class b extends View {
    public final p6 f47064a;
    public float f47065b;
    public ValueAnimator f47066c;
    public int d;
    public final Paint f47067e;

    public b(Context context) {
        super(context);
        this.f47065b = 1.0f;
        p6 p6Var = new p6(false, false, true, false);
        this.f47064a = p6Var;
        p6Var.k(0.3f, 250L, pr.h);
        p6Var.setCallback(this);
        p6Var.t(AndroidUtilities.dp(11.5f));
        p6Var.u(AndroidUtilities.bold());
        p6Var.r(-1);
        p6Var.q("", true, true);
        p6Var.f29285b = 17;
        Paint paint = new Paint(1);
        this.f47067e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i10, boolean z10) {
        if (!t.i()) {
            i10 = 0;
        }
        if (i10 > 0) {
            setVisibility(0);
        }
        p6 p6Var = this.f47064a;
        if (z10) {
            p6Var.b();
        }
        if (z10 && i10 != this.d && i10 > 0) {
            ValueAnimator valueAnimator = this.f47066c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f47066c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f47066c = ofFloat;
            ofFloat.addUpdateListener(new ki.a(this, 19));
            this.f47066c.addListener(new oj1(this, 9));
            this.f47066c.setInterpolator(new OvershootInterpolator(2.0f));
            this.f47066c.setDuration(200L);
            this.f47066c.start();
        }
        this.d = i10;
        int length = p6Var.f29289g.length();
        p6Var.q("x" + i10, z10, true);
        int length2 = p6Var.f29289g.length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        int dp = AndroidUtilities.dp(8.0f);
        p6 p6Var = this.f47064a;
        rect.set(0, 0, dp + ((int) p6Var.d()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.f47065b != 1.0f) {
            canvas.save();
            float f7 = this.f47065b;
            canvas.scale(f7, f7, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.f47067e);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        p6Var.setBounds(rect);
        p6Var.draw(canvas);
        if (this.f47065b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f47064a.e() + AndroidUtilities.dp(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }
}
