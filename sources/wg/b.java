package wg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.s81;
public final class b extends View {
    public final i6 f57696a;
    public float f57697b;
    public ValueAnimator f57698c;
    public int d;
    public final Paint f57699e;

    public b(Context context) {
        super(context);
        this.f57697b = 1.0f;
        i6 i6Var = new i6(false, false, true);
        this.f57696a = i6Var;
        i6Var.n(0.3f, 250L, xq.h);
        i6Var.setCallback(this);
        i6Var.w(org.telegram.messenger.g0.L(11.5f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.u(-1);
        i6Var.t("", true, true);
        i6Var.f34552b = 17;
        Paint paint = new Paint(1);
        this.f57699e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i7, boolean z9) {
        if (!s.i()) {
            i7 = 0;
        }
        if (i7 > 0) {
            setVisibility(0);
        }
        i6 i6Var = this.f57696a;
        if (z9) {
            i6Var.a();
        }
        if (z9 && i7 != this.d && i7 > 0) {
            ValueAnimator valueAnimator = this.f57698c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f57698c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f57698c = ofFloat;
            ofFloat.addUpdateListener(new ti.d(this, 5));
            this.f57698c.addListener(new s81(this, 23));
            org.telegram.messenger.camera.q.i(2.0f, this.f57698c);
            this.f57698c.setDuration(200L);
            this.f57698c.start();
        }
        this.d = i7;
        int length = i6Var.f34558i.length();
        i6Var.t("x" + i7, z9, true);
        int length2 = i6Var.f34558i.length();
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
        i6 i6Var = this.f57696a;
        rect.set(0, 0, L + ((int) i6Var.c()), org.telegram.messenger.g0.L(20.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        if (this.f57697b != 1.0f) {
            canvas.save();
            float f10 = this.f57697b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.f57699e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.g0.L(19.0f));
        i6Var.setBounds(rect);
        i6Var.draw(canvas);
        if (this.f57697b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f57696a.e() + org.telegram.messenger.g0.L(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), 1073741824));
    }
}
