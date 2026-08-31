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
public final class tc1 extends org.telegram.ui.Components.p9 {
    public Drawable D;
    public final boolean E;
    public float F;
    public float G;
    public final ed1 H;

    public tc1(ed1 ed1Var, Activity activity) {
        super(activity);
        this.H = ed1Var;
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
        ed1 ed1Var = this.H;
        if (z4) {
            Drawable drawable = this.D;
            if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.fc0)) {
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
                        int ceil = (int) Math.ceil(this.D.getIntrinsicWidth() * max * ed1Var.f36541v1);
                        int ceil2 = (int) Math.ceil(this.D.getIntrinsicHeight() * max * ed1Var.f36541v1);
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
        if (ed1Var.X1) {
            if (!ed1Var.f36493c.isFinished() && ed1Var.f36493c.computeScrollOffset()) {
                if (ed1Var.f36493c.getStartX() < ed1Var.T1 && ed1Var.f36493c.getStartX() > 0) {
                    ed1Var.U1 = ed1Var.f36493c.getCurrX();
                }
                ed1Var.V0();
                invalidate();
            }
            canvas.save();
            float f11 = -ed1Var.U1;
            this.F = f11;
            canvas.translate(f11, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (ed1Var.J1) {
            float f12 = ed1Var.f36518k1;
            if (f12 > 0.0f) {
                canvas.drawColor(i0.a.k(-16777216, (int) (f12 * 255.0f * ed1Var.l1)));
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ed1 ed1Var = this.H;
        org.telegram.ui.Components.p81 p81Var = ed1Var.f36535s1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        p81Var.getClass();
        float a2 = org.telegram.ui.Components.p81.a(measuredWidth, measuredHeight);
        ed1Var.f36541v1 = a2;
        if (ed1Var.B1) {
            setScaleX(a2);
            setScaleY(ed1Var.f36541v1);
        }
        if (ed1Var.f36489b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (ed1Var.Y1 != measuredWidth2) {
            ed1Var.X1 = false;
            Bitmap bitmap = ed1Var.f36552z1;
            if (bitmap != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / ed1Var.f36552z1.getHeight()) * bitmap.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    ed1Var.X1 = true;
                    ed1Var.W1 = (int) ((ed1Var.f36552z1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    ed1Var.U1 = measuredWidth3;
                    ed1Var.V1 = measuredWidth3;
                    ed1Var.T1 = measuredWidth3 * 2.0f;
                    s(measuredHeight2, getMeasuredHeight());
                    this.v = true;
                    ed1Var.V0();
                }
            }
            if (!ed1Var.X1) {
                s(-1, -1);
                this.v = false;
            }
        }
        ed1Var.Y1 = measuredWidth2;
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
