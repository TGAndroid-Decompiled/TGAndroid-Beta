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
    public org.telegram.ui.Components.h11 f40098a;
    public org.telegram.ui.Components.h11 f40099b;
    public boolean f40100c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Cells.z e;
    public final ColorMatrixColorFilter f40101f;
    public final Paint h;
    public final Paint f40102n;
    public final ce1 f40103r;

    public sd1(Context context, ce1 ce1Var) {
        super(context);
        this.f40103r = ce1Var;
        this.d = new org.telegram.ui.Components.g6(this, 0L, 350L, org.telegram.ui.Components.es.h);
        org.telegram.ui.Cells.z Z = org.telegram.ui.ActionBar.g6.Z(285212671, 8, 8);
        this.e = Z;
        this.h = new Paint(1);
        this.f40102n = new Paint(1);
        Z.setCallback(this);
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.35f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
        this.f40101f = new ColorMatrixColorFilter(colorMatrix);
    }

    public final CharSequence b() {
        org.telegram.ui.Components.h11 h11Var = this.f40098a;
        if (h11Var != null) {
            return h11Var.k();
        }
        return null;
    }

    public final void c(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        boolean z11;
        if (spannableStringBuilder != null) {
            this.f40099b = new org.telegram.ui.Components.h11(spannableStringBuilder, 12.0f, null);
        }
        if (spannableStringBuilder != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40100c = z11;
        if (!z10) {
            this.d.f(z11, true);
        }
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.f40098a = new org.telegram.ui.Components.h11(charSequence, 14.0f, AndroidUtilities.bold());
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float height = getHeight() / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        ce1 ce1Var = this.f40103r;
        rd1 rd1Var = ce1Var.f34915x0;
        cd1 cd1Var = ce1Var.f34853a;
        org.telegram.ui.ActionBar.g6.s(this, rd1Var, cd1Var);
        Paint G = cd1Var.G("paintChatActionBackground");
        ColorFilter colorFilter = G.getColorFilter();
        G.setColorFilter(this.f40101f);
        canvas.drawRoundRect(rectF, height, height, G);
        G.setColorFilter(colorFilter);
        if (ce1Var.M1) {
            float f7 = ce1Var.f34892n1;
            if (f7 > 0.0f) {
                int k10 = i0.a.k(-16777216, (int) (f7 * 255.0f * ce1Var.f34894o1));
                Paint paint = this.f40102n;
                paint.setColor(k10);
                canvas.drawRoundRect(rectF, height, height, paint);
            }
        }
        Paint paint2 = this.h;
        paint2.setColor(520093695);
        canvas.drawRoundRect(rectF, height, height, paint2);
        float e = this.d.e(this.f40100c);
        org.telegram.ui.Components.h11 h11Var = this.f40098a;
        if (h11Var != null) {
            h11Var.f25483p = getWidth() - AndroidUtilities.dp(14.0f);
            h11Var.c((getWidth() - this.f40098a.l()) / 2.0f, ((AndroidUtilities.dp(24.0f) * 0.0f) + (getHeight() / 2.0f)) - (AndroidUtilities.dp(7.0f) * e), 1.0f, -1, canvas);
        }
        if (this.f40099b != null) {
            canvas.save();
            canvas.scale(e, e, getWidth() / 2.0f, (getHeight() / 2.0f) + AndroidUtilities.dp(11.0f));
            org.telegram.ui.Components.h11 h11Var2 = this.f40099b;
            h11Var2.f25483p = getWidth() - AndroidUtilities.dp(14.0f);
            float dp = 0.0f * AndroidUtilities.dp(24.0f);
            h11Var2.c((getWidth() - this.f40099b.l()) / 2.0f, AndroidUtilities.dp(11.0f) + dp + (getHeight() / 2.0f), 1.0f, org.telegram.ui.ActionBar.g6.m1(0.75f, -1), canvas);
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
