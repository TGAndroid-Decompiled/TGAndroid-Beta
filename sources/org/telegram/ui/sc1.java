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
public final class sc1 extends View {
    public org.telegram.ui.Components.k01 f38295a;
    public org.telegram.ui.Components.k01 f38296b;
    public boolean f38297c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Cells.z e;
    public final ColorMatrixColorFilter f38298f;
    public final Paint h;
    public final Paint f38299n;
    public final cd1 f38300r;

    public sc1(Context context, cd1 cd1Var) {
        super(context);
        this.f38300r = cd1Var;
        this.d = new org.telegram.ui.Components.z5(this, 0L, 350L, org.telegram.ui.Components.nr.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.j6.Y(285212671, 8, 8);
        this.e = Y;
        this.h = new Paint(1);
        this.f38299n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f38298f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.k01 k01Var = this.f38295a;
        if (k01Var != null) {
            return k01Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z4) {
        boolean z10;
        if (spannableStringBuilder != null) {
            this.f38296b = new org.telegram.ui.Components.k01(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38297c = z10;
        if (!z4) {
            this.d.f(z10, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f38295a = new org.telegram.ui.Components.k01(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        cd1 cd1Var = this.f38300r;
        rc1 rc1Var = cd1Var.f33338u0;
        cc1 cc1Var = cd1Var.f33287a;
        org.telegram.ui.ActionBar.j6.s(this, rc1Var, cc1Var);
        Paint G = cc1Var.G("paintChatActionBackground");
        ColorFilter colorFilter = G.getColorFilter();
        G.setColorFilter(this.f38298f);
        canvas.drawRoundRect(rectF, height, height, G);
        G.setColorFilter(colorFilter);
        if (cd1Var.J1) {
            float f10 = cd1Var.f33318k1;
            if (f10 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f10 * 255.0f * cd1Var.l1));
                Paint paint = this.f38299n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e = this.d.e(this.f38297c);
        org.telegram.ui.Components.k01 k01Var = this.f38295a;
        if (k01Var != null) {
            k01Var.f26094p = getWidth() - AndroidUtilities.dp(14.0f);
            k01Var.c((getWidth() - this.f38295a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e), 1.0f, -1, canvas);
        }
        if (this.f38296b != null) {
            canvas.save();
            canvas.scale(e, e, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.k01 k01Var2 = this.f38296b;
            k01Var2.f26094p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            k01Var2.c((getWidth() - this.f38296b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.j6.l1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.e;
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
        if (drawable != this.e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
