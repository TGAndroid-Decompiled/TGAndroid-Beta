package wg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.k71;
import tg.z1;
public final class b extends View {
    public final n6 f59761a;
    public float f59762b;
    public ValueAnimator f59763c;
    public int d;
    public final Paint f59764e;

    public b(Context context) {
        super(context);
        this.f59762b = 1.0f;
        n6 n6Var = new n6(false, false, true);
        this.f59761a = n6Var;
        n6Var.n(0.3f, 250L, nr.h);
        n6Var.setCallback(this);
        n6Var.w(org.telegram.messenger.g0.L(11.5f));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.u(-1);
        n6Var.t("", true, true);
        n6Var.f37795b = 17;
        Paint paint = new Paint(1);
        this.f59764e = paint;
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
        n6 n6Var = this.f59761a;
        if (z10) {
            n6Var.a();
        }
        if (z10 && i7 != this.d && i7 > 0) {
            ValueAnimator valueAnimator = this.f59763c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f59763c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f59763c = ofFloat;
            ofFloat.addUpdateListener(new z1(this, 6));
            this.f59763c.addListener(new k71(this, 24));
            org.telegram.ui.Cells.c0.q(2.0f, this.f59763c);
            this.f59763c.setDuration(200L);
            this.f59763c.start();
        }
        this.d = i7;
        int length = n6Var.f37802i.length();
        n6Var.t("x" + i7, z10, true);
        int length2 = n6Var.f37802i.length();
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
        n6 n6Var = this.f59761a;
        rect.set(0, 0, L + ((int) n6Var.c()), org.telegram.messenger.g0.L(20.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        if (this.f59762b != 1.0f) {
            canvas.save();
            float f10 = this.f59762b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.f59764e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.g0.L(19.0f));
        n6Var.setBounds(rect);
        n6Var.draw(canvas);
        if (this.f59762b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f59761a.e() + org.telegram.messenger.g0.L(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), 1073741824));
    }
}
