package xg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;
import ug.f2;
public final class b extends View {
    public final g6 f58652a;
    public float f58653b;
    public ValueAnimator f58654c;
    public int d;
    public final Paint f58655e;

    public b(Context context) {
        super(context);
        this.f58653b = 1.0f;
        g6 g6Var = new g6(false, false, true);
        this.f58652a = g6Var;
        g6Var.n(0.3f, 250L, xq.h);
        g6Var.setCallback(this);
        g6Var.w(org.telegram.messenger.g0.L(11.5f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(-1);
        g6Var.t("", true, true);
        g6Var.f33983b = 17;
        Paint paint = new Paint(1);
        this.f58655e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i3, boolean z10) {
        if (!s.i()) {
            i3 = 0;
        }
        if (i3 > 0) {
            setVisibility(0);
        }
        g6 g6Var = this.f58652a;
        if (z10) {
            g6Var.a();
        }
        if (z10 && i3 != this.d && i3 > 0) {
            ValueAnimator valueAnimator = this.f58654c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f58654c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f58654c = ofFloat;
            ofFloat.addUpdateListener(new f2(this, 5));
            this.f58654c.addListener(new i81(this, 23));
            org.telegram.messenger.camera.q.i(2.0f, this.f58654c);
            this.f58654c.setDuration(200L);
            this.f58654c.start();
        }
        this.d = i3;
        int length = g6Var.f33989i.length();
        g6Var.t("x" + i3, z10, true);
        int length2 = g6Var.f33989i.length();
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
        g6 g6Var = this.f58652a;
        rect.set(0, 0, L + ((int) g6Var.c()), org.telegram.messenger.g0.L(20.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        if (this.f58653b != 1.0f) {
            canvas.save();
            float f10 = this.f58653b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.f58655e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.g0.L(19.0f));
        g6Var.setBounds(rect);
        g6Var.draw(canvas);
        if (this.f58653b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f58652a.e() + org.telegram.messenger.g0.L(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), 1073741824));
    }
}
