package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;
public final class b extends View {
    public final m6 f43081a;
    public float f43082b;
    public ValueAnimator f43083c;
    public int d;
    public final Paint e;

    public b(Context context) {
        super(context);
        this.f43082b = 1.0f;
        m6 m6Var = new m6(false, false, true, false);
        this.f43081a = m6Var;
        m6Var.k(0.3f, 250L, qr.h);
        m6Var.setCallback(this);
        m6Var.t(AndroidUtilities.dp(11.5f));
        m6Var.u(AndroidUtilities.bold());
        m6Var.r(-1);
        m6Var.q("", true, true);
        m6Var.f26085b = 17;
        Paint paint = new Paint(1);
        this.e = paint;
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
        m6 m6Var = this.f43081a;
        if (z10) {
            m6Var.b();
        }
        if (z10 && i10 != this.d && i10 > 0) {
            ValueAnimator valueAnimator = this.f43083c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f43083c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f43083c = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 18));
            this.f43083c.addListener(new qg.n0(this, 6));
            this.f43083c.setInterpolator(new OvershootInterpolator(2.0f));
            this.f43083c.setDuration(200L);
            this.f43083c.start();
        }
        this.d = i10;
        int length = m6Var.f26088g.length();
        m6Var.q("x" + i10, z10, true);
        int length2 = m6Var.f26088g.length();
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
        m6 m6Var = this.f43081a;
        rect.set(0, 0, dp + ((int) m6Var.d()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.f43082b != 1.0f) {
            canvas.save();
            float f7 = this.f43082b;
            canvas.scale(f7, f7, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        m6Var.setBounds(rect);
        m6Var.draw(canvas);
        if (this.f43082b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f43081a.e() + AndroidUtilities.dp(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }
}
