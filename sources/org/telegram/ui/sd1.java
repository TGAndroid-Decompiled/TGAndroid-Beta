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
public final class sd1 extends View {
    public org.telegram.ui.Components.i11 f39794a;
    public org.telegram.ui.Components.i11 f39795b;
    public boolean f39796c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Cells.z e;
    public final ColorMatrixColorFilter f39797f;
    public final Paint h;
    public final Paint f39798n;
    public final ce1 f39799r;

    public sd1(Context context, ce1 ce1Var) {
        super(context);
        this.f39799r = ce1Var;
        this.d = new org.telegram.ui.Components.g6(this, 0L, 350L, org.telegram.ui.Components.es.h);
        org.telegram.ui.Cells.z Z = org.telegram.ui.ActionBar.g6.Z(285212671, 8, 8);
        this.e = Z;
        this.h = new Paint(1);
        this.f39798n = new Paint(1);
        Z.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f39797f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.i11 i11Var = this.f39794a;
        if (i11Var != null) {
            return i11Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f39795b = new org.telegram.ui.Components.i11(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f39796c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f39794a = new org.telegram.ui.Components.i11(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        ce1 ce1Var = this.f39799r;
        rd1 rd1Var = ce1Var.f34639x0;
        cd1 cd1Var = ce1Var.f34577a;
        org.telegram.ui.ActionBar.g6.s(this, rd1Var, cd1Var);
        Paint F = cd1Var.F("paintChatActionBackground");
        ColorFilter colorFilter = F.getColorFilter();
        F.setColorFilter(this.f39797f);
        canvas.drawRoundRect(rectF, height, height, F);
        F.setColorFilter(colorFilter);
        if (ce1Var.M1) {
            float f7 = ce1Var.f34616n1;
            if (f7 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f7 * 255.0f * ce1Var.f34618o1));
                Paint paint = this.f39798n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e = this.d.e(this.f39796c);
        org.telegram.ui.Components.i11 i11Var = this.f39794a;
        if (i11Var != null) {
            i11Var.f25465p = getWidth() - AndroidUtilities.dp(14.0f);
            i11Var.c((getWidth() - this.f39794a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e), 1.0f, -1, canvas);
        }
        if (this.f39795b != null) {
            canvas.save();
            canvas.scale(e, e, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.i11 i11Var2 = this.f39795b;
            i11Var2.f25465p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            i11Var2.c((getWidth() - this.f39795b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.g6.m1(0.75f, -1), canvas);
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
        boolean z10;
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.e;
        if (action == 0) {
            zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
            zVar.setState(new int[]{16842910, 16842919});
            z10 = true;
        } else {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                zVar.setState(StateSet.NOTHING);
            }
            z10 = false;
        }
        if (super.onTouchEvent(motionEvent) || z10) {
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
