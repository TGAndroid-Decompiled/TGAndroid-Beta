package wg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.k71;
import tg.x1;
public final class b extends View {
    public final m6 f59718a;
    public float f59719b;
    public ValueAnimator f59720c;
    public int d;
    public final Paint f59721e;

    public b(Context context) {
        super(context);
        this.f59719b = 1.0f;
        m6 m6Var = new m6(false, false, true);
        this.f59718a = m6Var;
        m6Var.n(0.3f, 250L, lr.h);
        m6Var.setCallback(this);
        m6Var.w(org.telegram.messenger.g0.L(11.5f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.u(-1);
        m6Var.t("", true, true);
        m6Var.f37377b = 17;
        Paint paint = new Paint(1);
        this.f59721e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i7, boolean z10) {
        if (!s.i()) {
            i7 = 0;
        }
        if (i7 > 0) {
            setVisibility(0);
        }
        m6 m6Var = this.f59718a;
        if (z10) {
            m6Var.a();
        }
        if (z10 && i7 != this.d && i7 > 0) {
            ValueAnimator valueAnimator = this.f59720c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f59720c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f59720c = ofFloat;
            ofFloat.addUpdateListener(new x1(this, 6));
            this.f59720c.addListener(new k71(this, 24));
            org.telegram.ui.Cells.c0.q(2.0f, this.f59720c);
            this.f59720c.setDuration(200L);
            this.f59720c.start();
        }
        this.d = i7;
        int length = m6Var.f37384i.length();
        m6Var.t("x" + i7, z10, true);
        int length2 = m6Var.f37384i.length();
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
        m6 m6Var = this.f59718a;
        rect.set(0, 0, L + ((int) m6Var.c()), org.telegram.messenger.g0.L(20.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        if (this.f59719b != 1.0f) {
            canvas.save();
            float f10 = this.f59719b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.f59721e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.g0.L(19.0f));
        m6Var.setBounds(rect);
        m6Var.draw(canvas);
        if (this.f59719b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f59718a.e() + org.telegram.messenger.g0.L(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), 1073741824));
    }
}
