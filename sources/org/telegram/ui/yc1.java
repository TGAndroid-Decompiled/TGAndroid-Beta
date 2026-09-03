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
public final class yc1 extends org.telegram.ui.Components.p9 {
    public Drawable D;
    public final boolean E;
    public float F;
    public float G;
    public final jd1 H;

    public yc1(jd1 jd1Var, Activity activity) {
        super(activity);
        this.H = jd1Var;
        this.E = true;
    }

    @Override
    public Drawable getBackground() {
        return this.D;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        this.F = 0.0f;
        this.G = 0.0f;
        boolean z4 = this.E;
        jd1 jd1Var = this.H;
        if (z4) {
            Drawable drawable = this.D;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.ec0)) {
                if (drawable instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f10 = 2.0f / AndroidUtilities.density;
                        canvas.scale(f10, f10);
                        this.D.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                        this.D.draw(canvas);
                        canvas.restore();
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float max = Math.max(getMeasuredWidth() / this.D.getIntrinsicWidth(), measuredHeight / this.D.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(this.D.getIntrinsicWidth() * max * jd1Var.f35233v1);
                        int ceil2 = (int) Math.ceil(this.D.getIntrinsicHeight() * max * jd1Var.f35233v1);
                        int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                        int i10 = (measuredHeight - ceil2) / 2;
                        this.G = i10;
                        this.D.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                        this.D.draw(canvas);
                    }
                }
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.D.draw(canvas);
            }
        }
        if (jd1Var.X1) {
            if (!jd1Var.f35186c.isFinished() && jd1Var.f35186c.computeScrollOffset()) {
                if (jd1Var.f35186c.getStartX() < jd1Var.T1 && jd1Var.f35186c.getStartX() > 0) {
                    jd1Var.U1 = jd1Var.f35186c.getCurrX();
                }
                jd1Var.V0();
                invalidate();
            }
            canvas.save();
            float f11 = -jd1Var.U1;
            this.F = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (jd1Var.J1) {
            float f12 = jd1Var.f35210k1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.k(-16777216, (int) (f12 * 255.0f * jd1Var.l1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        jd1 jd1Var = this.H;
        org.telegram.ui.Components.o81 o81Var = jd1Var.f35227s1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        o81Var.getClass();
        float a2 = org.telegram.ui.Components.o81.a(measuredWidth, measuredHeight);
        jd1Var.f35233v1 = a2;
        if (jd1Var.B1) {
            setScaleX(a2);
            setScaleY(jd1Var.f35233v1);
        }
        if (jd1Var.f35182b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (jd1Var.Y1 != measuredWidth2) {
            jd1Var.X1 = false;
            Bitmap bitmap = jd1Var.f35244z1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / jd1Var.f35244z1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    jd1Var.X1 = true;
                    jd1Var.W1 = (int) ((jd1Var.f35244z1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    jd1Var.U1 = measuredWidth3;
                    jd1Var.V1 = measuredWidth3;
                    jd1Var.T1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    jd1Var.V0();
                }
            }
            if (!jd1Var.X1) {
                s(-1, -1);
                this.v = false;
            }
        }
        jd1Var.Y1 = measuredWidth2;
    }

    @Override
    public void setBackground(Drawable drawable) {
        this.D = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.D != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
