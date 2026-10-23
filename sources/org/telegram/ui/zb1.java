package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class zb1 extends org.telegram.ui.Components.w9 {
    public Drawable G;
    public final boolean H;
    public float I;
    public float J;
    public final kc1 K;

    public zb1(kc1 kc1Var, Activity activity) {
        super(activity);
        this.K = kc1Var;
        this.H = true;
    }

    @Override
    public Drawable getBackground() {
        return this.G;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.I = 0.0f;
        this.J = 0.0f;
        boolean z10 = this.H;
        kc1 kc1Var = this.K;
        if (z10) {
            Drawable drawable = this.G;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.wc0)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f7 = 2.0f / AndroidUtilities.density;
                        canvas.scale(f7, f7);
                        this.G.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                        this.G.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.G.getIntrinsicWidth(), measuredHeight / this.G.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.G.getIntrinsicWidth() * max * kc1Var.f38587y1);
                        int ceil2 = (int) Math.ceil(this.G.getIntrinsicHeight() * max * kc1Var.f38587y1);
                        int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                        int i10 = (measuredHeight - ceil2) / 2;
                        this.J = i10;
                        this.G.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                        this.G.draw(canvas);
                    }
                }
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.G.draw(canvas);
            }
        }
        if (kc1Var.a2) {
            if (!kc1Var.f38528c.isFinished() && kc1Var.f38528c.computeScrollOffset()) {
                if (kc1Var.f38528c.getStartX() < kc1Var.W1 && kc1Var.f38528c.getStartX() > 0) {
                    kc1Var.X1 = kc1Var.f38528c.getCurrX();
                }
                kc1Var.V0();
                invalidate();
            }
            canvas.save();
            float f10 = -kc1Var.X1;
            this.I = f10;
            canvas.translate(f10, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (kc1Var.M1) {
            float f11 = kc1Var.f38560n1;
            if (f11 > 0.0f) {
                canvas.drawColor(i0.a.o(-16777216, (int) (f11 * 255.0f * kc1Var.f38562o1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        kc1 kc1Var = this.K;
        org.telegram.ui.Components.h91 h91Var = kc1Var.f38578v1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        h91Var.getClass();
        float a2 = org.telegram.ui.Components.h91.a(measuredWidth, measuredHeight);
        kc1Var.f38587y1 = a2;
        if (kc1Var.E1) {
            setScaleX(a2);
            setScaleY(kc1Var.f38587y1);
        }
        if (kc1Var.f38524b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (kc1Var.f38527b2 != measuredWidth2) {
            kc1Var.a2 = false;
            Bitmap bitmap = kc1Var.C1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / kc1Var.C1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    kc1Var.a2 = true;
                    kc1Var.Z1 = (int) ((kc1Var.C1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    kc1Var.X1 = measuredWidth3;
                    kc1Var.Y1 = measuredWidth3;
                    kc1Var.W1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    kc1Var.V0();
                }
            }
            if (!kc1Var.a2) {
                s(-1, -1);
                this.v = false;
            }
        }
        kc1Var.f38527b2 = measuredWidth2;
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.G = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.G != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
