package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zc1 extends View {
    public org.telegram.ui.Components.k01 f43904a;
    public org.telegram.ui.Components.k01 f43905b;
    public boolean f43906c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Cells.z f43907e;
    public final ColorMatrixColorFilter f43908f;
    public final Paint h;
    public final Paint f43909n;
    public final jd1 f43910r;

    public zc1(Context context, jd1 jd1Var) {
        super(context);
        this.f43910r = jd1Var;
        this.d = new org.telegram.ui.Components.z5(this, 0L, 350L, org.telegram.ui.Components.pr.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.k6.Y(285212671, 8, 8);
        this.f43907e = Y;
        this.h = new Paint(1);
        this.f43909n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f43908f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.k01 k01Var = this.f43904a;
        if (k01Var != null) {
            return k01Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z4) {
        boolean z10;
        if (spannableStringBuilder != null) {
            this.f43905b = new org.telegram.ui.Components.k01(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43906c = z10;
        if (!z4) {
            this.d.f(z10, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f43904a = new org.telegram.ui.Components.k01(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        jd1 jd1Var = this.f43910r;
        yc1 yc1Var = jd1Var.f38013u0;
        ic1 ic1Var = jd1Var.f37961a;
        org.telegram.ui.ActionBar.k6.s(this, yc1Var, ic1Var);
        Paint F = ic1Var.F("paintChatActionBackground");
        ColorFilter colorFilter = F.getColorFilter();
        F.setColorFilter(this.f43908f);
        canvas.drawRoundRect(rectF, height, height, F);
        F.setColorFilter(colorFilter);
        if (jd1Var.J1) {
            float f10 = jd1Var.f37993k1;
            if (f10 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f10 * 255.0f * jd1Var.l1));
                Paint paint = this.f43909n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e6 = this.d.e(this.f43906c);
        org.telegram.ui.Components.k01 k01Var = this.f43904a;
        if (k01Var != null) {
            k01Var.f28238p = getWidth() - AndroidUtilities.dp(14.0f);
            k01Var.c((getWidth() - this.f43904a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e6), 1.0f, -1, canvas);
        }
        if (this.f43905b != null) {
            canvas.save();
            canvas.scale(e6, e6, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.k01 k01Var2 = this.f43905b;
            k01Var2.f28238p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            k01Var2.c((getWidth() - this.f43905b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.k6.l1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.f43907e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f43907e;
        if (action == 0) {
            zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            zVar.setState(new int[]{16842910, 16842919});
            z4 = true;
        } else {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                zVar.setState(StateSet.NOTHING);
            }
            z4 = false;
        }
        if (super.onTouchEvent(motionEvent) || z4) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f43907e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
