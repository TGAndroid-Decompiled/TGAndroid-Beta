package ug;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import ei.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.p6;
import org.telegram.ui.vf1;
public final class b extends View {
    public final p6 f47690a;
    public float f47691b;
    public ValueAnimator f47692c;
    public int d;
    public final Paint e;

    public b(Context context) {
        super(context);
        this.f47691b = 1.0f;
        p6 p6Var = new p6(false, false, true);
        this.f47690a = p6Var;
        p6Var.n(0.3f, 250L, bs.h);
        p6Var.setCallback(this);
        p6Var.w(AndroidUtilities.dp(11.5f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.u(-1);
        p6Var.t("", true, true);
        p6Var.f29199b = 17;
        Paint paint = new Paint(1);
        this.e = paint;
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
        p6 p6Var = this.f47690a;
        if (z10) {
            p6Var.a();
        }
        if (z10 && i10 != this.d && i10 > 0) {
            ValueAnimator valueAnimator = this.f47692c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f47692c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f47692c = ofFloat;
            ofFloat.addUpdateListener(new i6(this, 26));
            this.f47692c.addListener(new vf1(this, 21));
            kk.l(2.0f, this.f47692c);
            this.f47692c.setDuration(200L);
            this.f47692c.start();
        }
        this.d = i10;
        int length = p6Var.f29205i.length();
        p6Var.t("x" + i10, z10, true);
        int length2 = p6Var.f29205i.length();
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
        p6 p6Var = this.f47690a;
        rect.set(0, 0, dp + ((int) p6Var.c()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.f47691b != 1.0f) {
            canvas.save();
            float f7 = this.f47691b;
            canvas.scale(f7, f7, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        p6Var.setBounds(rect);
        p6Var.draw(canvas);
        if (this.f47691b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f47690a.e() + AndroidUtilities.dp(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }
}
