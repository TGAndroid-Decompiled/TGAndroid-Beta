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
import org.telegram.messenger.tl;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.zr;
import org.telegram.ui.ue1;
public final class b extends View {
    public final n6 f48094a;
    public float f48095b;
    public ValueAnimator f48096c;
    public int d;
    public final Paint e;

    public b(Context context) {
        super(context);
        this.f48095b = 1.0f;
        n6 n6Var = new n6(false, false, true);
        this.f48094a = n6Var;
        n6Var.n(0.3f, 250L, zr.h);
        n6Var.setCallback(this);
        n6Var.w(AndroidUtilities.dp(11.5f));
        n6Var.x(AndroidUtilities.bold());
        n6Var.u(-1);
        n6Var.t("", true, true);
        n6Var.f28797b = 17;
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i10, boolean z10) {
        if (!q.i()) {
            i10 = 0;
        }
        if (i10 > 0) {
            setVisibility(0);
        }
        n6 n6Var = this.f48094a;
        if (z10) {
            n6Var.a();
        }
        if (z10 && i10 != this.d && i10 > 0) {
            ValueAnimator valueAnimator = this.f48096c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f48096c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f48096c = ofFloat;
            ofFloat.addUpdateListener(new i6(this, 26));
            this.f48096c.addListener(new ue1(this, 21));
            tl.l(2.0f, this.f48096c);
            this.f48096c.setDuration(200L);
            this.f48096c.start();
        }
        this.d = i10;
        int length = n6Var.f28802i.length();
        n6Var.t("x" + i10, z10, true);
        int length2 = n6Var.f28802i.length();
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
        n6 n6Var = this.f48094a;
        rect.set(0, 0, dp + ((int) n6Var.c()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.f48095b != 1.0f) {
            canvas.save();
            float f7 = this.f48095b;
            canvas.scale(f7, f7, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        n6Var.setBounds(rect);
        n6Var.draw(canvas);
        if (this.f48095b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.f48094a.e() + AndroidUtilities.dp(15.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
    }
}
