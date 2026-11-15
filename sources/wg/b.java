package wg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.g71;
import tg.y1;
public final class b extends View {
    public final g6 f59130a;
    public float f59131b;
    public ValueAnimator f59132c;
    public int d;
    public final Paint f59133e;

    public b(Context context) {
        super(context);
        this.f59131b = 1.0f;
        g6 g6Var = new g6(false, false, true);
        this.f59130a = g6Var;
        g6Var.n(0.3f, 250L, er.h);
        g6Var.setCallback(this);
        g6Var.w(org.telegram.messenger.g0.L(11.5f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(-1);
        g6Var.t("", true, true);
        g6Var.f34829b = 17;
        Paint paint = new Paint(1);
        this.f59133e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i7, boolean z10) {
        if (!q.i()) {
            i7 = 0;
        }
        if (i7 > 0) {
            setVisibility(0);
        }
        g6 g6Var = this.f59130a;
        if (z10) {
            g6Var.a();
        }
        if (z10 && i7 != this.d && i7 > 0) {
            ValueAnimator valueAnimator = this.f59132c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f59132c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f59132c = ofFloat;
            ofFloat.addUpdateListener(new y1(this, 6));
            this.f59132c.addListener(new g71(this, 24));
            i20.k(2.0f, this.f59132c);
            this.f59132c.setDuration(200L);
            this.f59132c.start();
        }
        this.d = i7;
        int length = g6Var.f34836i.length();
        g6Var.t("x" + i7, z10, true);
        int length2 = g6Var.f34836i.length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        int L = org.telegram.messenger.g0.L(8.0f);
        g6 g6Var = this.f59130a;
        rect.set(0, 0, L + ((int) g6Var.c()), org.telegram.messenger.g0.L(20.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        if (this.f59131b != 1.0f) {
            canvas.save();
            float f10 = this.f59131b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.f59133e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.g0.L(19.0f));
        g6Var.setBounds(rect);
        g6Var.draw(canvas);
        if (this.f59131b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f59130a.e() + org.telegram.messenger.g0.L(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), 1073741824));
    }
}
