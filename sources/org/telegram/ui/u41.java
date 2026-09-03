package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class u41 extends org.telegram.ui.Cells.s1 {
    public boolean Ce;
    public final RectF De;
    public final RectF Ee;
    public RadialGradient Fe;
    public Paint Ge;
    public Matrix He;
    public final Path Ie;
    public Paint Je;
    public final Paint Ke;
    public org.telegram.ui.Components.z11 Le;
    public final org.telegram.ui.Components.z5 Me;
    public final int Ne;
    public final int Oe;
    public final w41 Pe;

    public u41(w41 w41Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12) {
        super(context, i10, false, null, f6Var);
        this.Pe = w41Var;
        this.Ne = i11;
        this.Oe = i12;
        this.Ce = false;
        this.De = new RectF();
        this.Ee = new RectF();
        this.Ie = new Path();
        this.Ke = new Paint(1);
        this.Me = new org.telegram.ui.Components.z5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void E1(Canvas canvas) {
        Paint paint = this.Ge;
        w41 w41Var = this.Pe;
        if (paint != null) {
            float f10 = w41Var.f39271s;
            RectF rectF = w41Var.O;
            if (f10 > 0.0f) {
                if (w41Var.N) {
                    if (this.f22076le) {
                        Bitmap bitmap = w41Var.M.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.Ie;
                            path.rewind();
                            path.addCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, Path.Direction.CW);
                            canvas.clipPath(path);
                            canvas.scale(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                            canvas.translate(rectF.left, rectF.top);
                            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            bitmap.recycle();
                        }
                    } else {
                        float centerX = rectF.centerX();
                        float centerY = rectF.centerY();
                        float width = rectF.width() / 2.0f;
                        if (this.Je == null) {
                            Paint paint2 = new Paint(1);
                            this.Je = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.Je);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.Me.e(w41Var.N), 1.0f - w41Var.f39271s));
                    getPhotoImage().draw(canvas);
                } else {
                    getPhotoImage().draw(canvas);
                }
            }
            this.He.reset();
            float width2 = (rectF.width() / 76.8f) * w41Var.v;
            this.He.postScale(width2, width2);
            this.He.postTranslate(rectF.centerX(), rectF.centerY());
            this.Fe.setLocalMatrix(this.He);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.E1(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.Ge);
            canvas.restore();
            canvas.restore();
        } else {
            super.E1(canvas);
        }
        canvas.saveLayerAlpha(w41Var.O, (int) (w41Var.v * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.Ke;
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(w41Var.O);
        rectF2.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - w41Var.X) * (-360.0f), false, paint3);
        if (this.Le == null) {
            org.telegram.ui.Components.z11 z11Var = new org.telegram.ui.Components.z11(120);
            this.Le = z11Var;
            z11Var.f31226b = true;
        }
        paint3.setStrokeWidth(AndroidUtilities.dp(2.8f));
        this.Le.a((1.0f - w41Var.X) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void F1(Canvas canvas) {
        AndroidUtilities.lerp(1.0f, 1.5f, this.Pe.v);
        super.F1(canvas);
    }

    @Override
    public final void d2(Canvas canvas, float f10, Integer num) {
        canvas.save();
        mg.r0 r0Var = this.K;
        w41 w41Var = this.Pe;
        canvas.translate(AndroidUtilities.lerp(0, -r0Var.f14103c, w41Var.f39271s), AndroidUtilities.lerp(w41Var.L.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), r0Var.f14113p, w41Var.f39271s));
        super.d2(canvas, (1.0f - w41Var.f39271s) * f10, num);
        canvas.restore();
    }

    @Override
    public final int getBoundsLeft() {
        return 0;
    }

    @Override
    public final int getBoundsRight() {
        return getWidth();
    }

    @Override
    public final void m2(float f10, Canvas canvas, boolean z4) {
        canvas.save();
        w41 w41Var = this.Pe;
        if (w41Var.P) {
            int i10 = this.f22086mb;
            MessageObject messageObject = w41Var.J;
            int i11 = 0;
            if (messageObject != null && messageObject.isOutOwner()) {
                MessageObject messageObject2 = w41Var.J;
                if (messageObject2 != null && messageObject2.type == 19) {
                    i11 = 4;
                }
                i11 += 20;
            }
            canvas.translate(((this.Ee.right - (AndroidUtilities.dp(8 + i11) + i10)) - this.f22115ob) * w41Var.f39271s, 0.0f);
        }
        super.m2(f10, canvas, z4);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        w41 w41Var = this.Pe;
        boolean z4 = w41Var.P;
        RectF rectF = w41Var.O;
        if (z4) {
            boolean z10 = this.Ce;
            RectF rectF2 = this.Ee;
            RectF rectF3 = this.De;
            if (!z10) {
                rectF3.set(getPhotoImage().getImageX(), getPhotoImage().getImageY(), getPhotoImage().getImageX2(), getPhotoImage().getImageY2());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.Ce = true;
                this.Fe = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.Ge = paint;
                paint.setShader(this.Fe);
                this.Ge.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.He = new Matrix();
            }
            AndroidUtilities.lerp(rectF3, rectF2, w41Var.f39271s, rectF);
            U3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().setRoundRadius((int) rectF.width());
            if (w41Var.f39271s > 0.0f && w41Var.N) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.f22175se = 1.0f - w41Var.f39271s;
        } else {
            canvas2 = canvas;
        }
        S1(canvas2);
        if (w41Var.P && w41Var.f39271s > 0.0f && w41Var.N) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(this.Ne, this.Oe);
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        TextureView textureView = this.Pe.M;
        if (textureView != null && i10 == 8) {
            textureView.setVisibility(i10);
        }
    }

    @Override
    public final void setPressed(boolean z4) {
    }
}
