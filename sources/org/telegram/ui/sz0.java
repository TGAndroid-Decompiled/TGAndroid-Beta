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
import android.graphics.Typeface;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
public final class sz0 extends org.telegram.ui.Cells.r1 {
    public final RectF Ad;
    public final RectF Bd;
    public RadialGradient Cd;
    public Paint Dd;
    public Matrix Ed;
    public final Path Fd;
    public Paint Gd;
    public final Paint Hd;
    public org.telegram.ui.Components.n01 Id;
    public final org.telegram.ui.Components.d6 Jd;
    public final int Kd;
    public final int Ld;
    public final uz0 Md;
    public boolean f52169zd;

    public sz0(uz0 uz0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11) {
        super(context, i7, false, null, h6Var);
        this.Md = uz0Var;
        this.Kd = i10;
        this.Ld = i11;
        this.f52169zd = false;
        this.Ad = new RectF();
        this.Bd = new RectF();
        this.Fd = new Path();
        this.Hd = new Paint(1);
        this.Jd = new org.telegram.ui.Components.d6(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void N0(Canvas canvas) {
        Paint paint = this.Dd;
        uz0 uz0Var = this.Md;
        if (paint != null) {
            float f10 = uz0Var.f52670s;
            RectF rectF = uz0Var.S;
            if (f10 > 0.0f) {
                if (uz0Var.R) {
                    if (this.Hc) {
                        Bitmap bitmap = uz0Var.Q.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.Fd;
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
                        if (this.Gd == null) {
                            Paint paint2 = new Paint(1);
                            this.Gd = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.Gd);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.Jd.d(uz0Var.R), 1.0f - uz0Var.f52670s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.Ed.reset();
            float width2 = (rectF.width() / 76.8f) * uz0Var.f52671w;
            this.Ed.postScale(width2, width2);
            this.Ed.postTranslate(rectF.centerX(), rectF.centerY());
            this.Cd.setLocalMatrix(this.Ed);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.N0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.Dd);
            canvas.restore();
            canvas.restore();
        } else {
            super.N0(canvas);
        }
        canvas.saveLayerAlpha(uz0Var.S, (int) (uz0Var.f52671w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.Hd;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(uz0Var.S);
        rectF2.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - uz0Var.f52660b0) * (-360.0f), false, paint3);
        if (this.Id == null) {
            org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01(120);
            this.Id = n01Var;
            n01Var.f37708b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.8f));
        this.Id.a((1.0f - uz0Var.f52660b0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void O0(Canvas canvas) {
        float f10 = this.Md.f52671w;
        Typeface typeface = org.telegram.messenger.g0.f24018a;
        super.O0(canvas);
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
    public final void o1(Canvas canvas, float f10, Integer num) {
        canvas.save();
        ch.q0 q0Var = this.O;
        uz0 uz0Var = this.Md;
        canvas.translate(org.telegram.messenger.g0.W1(uz0Var.f52670s, 0, -q0Var.f5512b), org.telegram.messenger.g0.W1(uz0Var.f52670s, uz0Var.P.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), q0Var.f5522n));
        super.o1(canvas, (1.0f - uz0Var.f52670s) * f10, num);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        uz0 uz0Var = this.Md;
        boolean z10 = uz0Var.T;
        RectF rectF = uz0Var.S;
        if (z10) {
            boolean z11 = this.f52169zd;
            RectF rectF2 = this.Bd;
            RectF rectF3 = this.Ad;
            if (!z11) {
                rectF3.set(getPhotoImage().L0, getPhotoImage().M0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.f52169zd = true;
                this.Cd = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.Dd = paint;
                paint.setShader(this.Cd);
                this.Dd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.Ed = new Matrix();
            }
            org.telegram.messenger.g0.Z1(rectF3, rectF2, uz0Var.f52670s, rectF);
            w3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (uz0Var.f52670s > 0.0f && uz0Var.R) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.f31447gd = 1.0f - uz0Var.f52670s;
        } else {
            canvas2 = canvas;
        }
        d1(canvas2);
        if (uz0Var.T && uz0Var.f52670s > 0.0f && uz0Var.R) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.Kd, this.Ld);
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        TextureView textureView = this.Md.Q;
        if (textureView != null && i7 == 8) {
            textureView.setVisibility(i7);
        }
    }

    @Override
    public final void y1(float f10, Canvas canvas, boolean z10) {
        canvas.save();
        uz0 uz0Var = this.Md;
        if (uz0Var.T) {
            int i7 = this.A9;
            org.telegram.messenger.gj gjVar = uz0Var.N;
            int i10 = 0;
            if (gjVar != null && gjVar.P3()) {
                org.telegram.messenger.gj gjVar2 = uz0Var.N;
                if (gjVar2 != null && gjVar2.D == 19) {
                    i10 = 4;
                }
                i10 += 20;
            }
            canvas.translate(((this.Bd.right - (org.telegram.messenger.g0.L(8 + i10) + i7)) - this.C9) * uz0Var.f52670s, 0.0f);
        }
        super.y1(f10, canvas, z10);
        canvas.restore();
    }

    @Override
    public final void setPressed(boolean z10) {
    }
}
