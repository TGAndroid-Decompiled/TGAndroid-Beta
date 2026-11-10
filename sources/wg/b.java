package wg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.wq;
import org.telegram.ui.u81;
public final class b extends View {
    public final h6 f57694a;
    public float f57695b;
    public ValueAnimator f57696c;
    public int d;
    public final Paint f57697e;

    public b(Context context) {
        super(context);
        this.f57695b = 1.0f;
        h6 h6Var = new h6(false, false, true);
        this.f57694a = h6Var;
        h6Var.n(0.3f, 250L, wq.h);
        h6Var.setCallback(this);
        h6Var.w(org.telegram.messenger.g0.L(11.5f));
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.u(-1);
        h6Var.t("", true, true);
        h6Var.f34187b = 17;
        Paint paint = new Paint(1);
        this.f57697e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i7, boolean z9) {
        if (!r.i()) {
            i7 = 0;
        }
        if (i7 > 0) {
            setVisibility(0);
        }
        h6 h6Var = this.f57694a;
        if (z9) {
            h6Var.a();
        }
        if (z9 && i7 != this.d && i7 > 0) {
            ValueAnimator valueAnimator = this.f57696c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f57696c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f57696c = ofFloat;
            ofFloat.addUpdateListener(new ti.d(this, 5));
            this.f57696c.addListener(new u81(this, 23));
            org.telegram.messenger.camera.q.i(2.0f, this.f57696c);
            this.f57696c.setDuration(200L);
            this.f57696c.start();
        }
        this.d = i7;
        int length = h6Var.f34193i.length();
        h6Var.t("x" + i7, z9, true);
        int length2 = h6Var.f34193i.length();
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
        h6 h6Var = this.f57694a;
        rect.set(0, 0, L + ((int) h6Var.c()), org.telegram.messenger.g0.L(20.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        if (this.f57695b != 1.0f) {
            canvas.save();
            float f10 = this.f57695b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.f57697e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.g0.L(19.0f));
        h6Var.setBounds(rect);
        h6Var.draw(canvas);
        if (this.f57695b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f57694a.e() + org.telegram.messenger.g0.L(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), 1073741824));
    }
}
