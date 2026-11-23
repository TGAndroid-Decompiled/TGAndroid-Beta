package wg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.i71;
import tg.c2;
public final class b extends View {
    public final m6 f59828a;
    public float f59829b;
    public ValueAnimator f59830c;
    public int d;
    public final Paint f59831e;

    public b(Context context) {
        super(context);
        this.f59829b = 1.0f;
        m6 m6Var = new m6(false, false, true);
        this.f59828a = m6Var;
        m6Var.n(0.3f, 250L, kr.h);
        m6Var.setCallback(this);
        m6Var.w(org.telegram.messenger.g0.L(11.5f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.u(-1);
        m6Var.t("", true, true);
        m6Var.f37394b = 17;
        Paint paint = new Paint(1);
        this.f59831e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i7, boolean z10) {
        if (!r.i()) {
            i7 = 0;
        }
        if (i7 > 0) {
            setVisibility(0);
        }
        m6 m6Var = this.f59828a;
        if (z10) {
            m6Var.a();
        }
        if (z10 && i7 != this.d && i7 > 0) {
            ValueAnimator valueAnimator = this.f59830c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f59830c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f59830c = ofFloat;
            ofFloat.addUpdateListener(new c2(this, 6));
            this.f59830c.addListener(new i71(this, 24));
            org.telegram.ui.Cells.c0.q(2.0f, this.f59830c);
            this.f59830c.setDuration(200L);
            this.f59830c.start();
        }
        this.d = i7;
        int length = m6Var.f37401i.length();
        m6Var.t("x" + i7, z10, true);
        int length2 = m6Var.f37401i.length();
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
        m6 m6Var = this.f59828a;
        rect.set(0, 0, L + ((int) m6Var.c()), org.telegram.messenger.g0.L(20.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        if (this.f59829b != 1.0f) {
            canvas.save();
            float f10 = this.f59829b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.f59831e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.g0.L(19.0f));
        m6Var.setBounds(rect);
        m6Var.draw(canvas);
        if (this.f59829b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f59828a.e() + org.telegram.messenger.g0.L(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), 1073741824));
    }
}
