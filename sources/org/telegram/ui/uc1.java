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
public final class uc1 extends View {
    public org.telegram.ui.Components.l01 f41885a;
    public org.telegram.ui.Components.l01 f41886b;
    public boolean f41887c;
    public final org.telegram.ui.Components.z5 d;
    public final org.telegram.ui.Cells.z f41888e;
    public final ColorMatrixColorFilter f41889f;
    public final Paint h;
    public final Paint f41890n;
    public final ed1 f41891r;

    public uc1(Context context, ed1 ed1Var) {
        super(context);
        this.f41891r = ed1Var;
        this.d = new org.telegram.ui.Components.z5(this, 0L, 350L, org.telegram.ui.Components.pr.h);
        org.telegram.ui.Cells.z Y = org.telegram.ui.ActionBar.k6.Y(285212671, 8, 8);
        this.f41888e = Y;
        this.h = new Paint(1);
        this.f41890n = new Paint(1);
        Y.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f41889f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.l01 l01Var = this.f41885a;
        if (l01Var != null) {
            return l01Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z4) {
        boolean z10;
        if (spannableStringBuilder != null) {
            this.f41886b = new org.telegram.ui.Components.l01(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41887c = z10;
        if (!z4) {
            this.d.f(z10, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f41885a = new org.telegram.ui.Components.l01(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        ed1 ed1Var = this.f41891r;
        tc1 tc1Var = ed1Var.f36538u0;
        dc1 dc1Var = ed1Var.f36486a;
        org.telegram.ui.ActionBar.k6.s(this, tc1Var, dc1Var);
        Paint F = dc1Var.F("paintChatActionBackground");
        ColorFilter colorFilter = F.getColorFilter();
        F.setColorFilter(this.f41889f);
        canvas.drawRoundRect(rectF, height, height, F);
        F.setColorFilter(colorFilter);
        if (ed1Var.J1) {
            float f10 = ed1Var.f36518k1;
            if (f10 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f10 * 255.0f * ed1Var.l1));
                Paint paint = this.f41890n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e6 = this.d.e(this.f41887c);
        org.telegram.ui.Components.l01 l01Var = this.f41885a;
        if (l01Var != null) {
            l01Var.f28532p = getWidth() - AndroidUtilities.dp(14.0f);
            l01Var.c((getWidth() - this.f41885a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e6), 1.0f, -1, canvas);
        }
        if (this.f41886b != null) {
            canvas.save();
            canvas.scale(e6, e6, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.l01 l01Var2 = this.f41886b;
            l01Var2.f28532p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            l01Var2.c((getWidth() - this.f41886b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.k6.l1(0.75f, -1), canvas);
            canvas.restore();
        }
        int width = getWidth();
        int height2 = getHeight();
        org.telegram.ui.Cells.z zVar = this.f41888e;
        zVar.setBounds(0, 0, width, height2);
        zVar.draw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.f41888e;
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
        if (drawable != this.f41888e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
