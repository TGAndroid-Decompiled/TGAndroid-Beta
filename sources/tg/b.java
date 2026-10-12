package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.am;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Wallet.z4;
public final class b extends View {
    public final q6 f48531a;
    public float f48532b;
    public ValueAnimator f48533c;
    public int d;
    public final Paint f48534e;

    public b(Context context) {
        super(context);
        this.f48532b = 1.0f;
        q6 q6Var = new q6(false, false, true);
        this.f48531a = q6Var;
        q6Var.n(0.3f, 250L, js.h);
        q6Var.setCallback(this);
        q6Var.w(AndroidUtilities.dp(11.5f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.u(-1);
        q6Var.t("", true, true);
        q6Var.f29690b = 17;
        Paint paint = new Paint(1);
        this.f48534e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i10, boolean z10) {
        if (!r.i()) {
            i10 = 0;
        }
        if (i10 > 0) {
            setVisibility(0);
        }
        q6 q6Var = this.f48531a;
        if (z10) {
            q6Var.a();
        }
        if (z10 && i10 != this.d && i10 > 0) {
            ValueAnimator valueAnimator = this.f48533c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f48533c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f48533c = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.s0(this, 18));
            this.f48533c.addListener(new z4(this, 15));
            am.l(2.0f, this.f48533c);
            this.f48533c.setDuration(200L);
            this.f48533c.start();
        }
        this.d = i10;
        int length = q6Var.f29696i.length();
        q6Var.t("x" + i10, z10, true);
        int length2 = q6Var.f29696i.length();
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
        q6 q6Var = this.f48531a;
        rect.set(0, 0, dp + ((int) q6Var.c()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.f48532b != 1.0f) {
            canvas.save();
            float f7 = this.f48532b;
            canvas.scale(f7, f7, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.f48534e);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        q6Var.setBounds(rect);
        q6Var.draw(canvas);
        if (this.f48532b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f48531a.e() + AndroidUtilities.dp(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }
}
