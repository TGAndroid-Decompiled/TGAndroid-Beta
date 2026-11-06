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
import org.telegram.ui.r81;
public final class b extends View {
    public final i6 f57604a;
    public float f57605b;
    public ValueAnimator f57606c;
    public int d;
    public final Paint f57607e;

    public b(Context context) {
        super(context);
        this.f57605b = 1.0f;
        i6 i6Var = new i6(false, false, true);
        this.f57604a = i6Var;
        i6Var.n(0.3f, 250L, xq.h);
        i6Var.setCallback(this);
        i6Var.w(org.telegram.messenger.g0.L(11.5f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.u(-1);
        i6Var.t("", true, true);
        i6Var.f34508b = 17;
        Paint paint = new Paint(1);
        this.f57607e = paint;
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
        i6 i6Var = this.f57604a;
        if (z9) {
            i6Var.a();
        }
        if (z9 && i7 != this.d && i7 > 0) {
            ValueAnimator valueAnimator = this.f57606c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f57606c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f57606c = ofFloat;
            ofFloat.addUpdateListener(new ti.d(this, 5));
            this.f57606c.addListener(new r81(this, 23));
            org.telegram.messenger.camera.q.i(2.0f, this.f57606c);
            this.f57606c.setDuration(200L);
            this.f57606c.start();
        }
        this.d = i7;
        int length = i6Var.f34514i.length();
        i6Var.t("x" + i7, z9, true);
        int length2 = i6Var.f34514i.length();
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
        i6 i6Var = this.f57604a;
        rect.set(0, 0, L + ((int) i6Var.c()), org.telegram.messenger.g0.L(20.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        if (this.f57605b != 1.0f) {
            canvas.save();
            float f10 = this.f57605b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.f57607e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.g0.L(19.0f));
        i6Var.setBounds(rect);
        i6Var.draw(canvas);
        if (this.f57605b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f57604a.e() + org.telegram.messenger.g0.L(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), 1073741824));
    }
}
