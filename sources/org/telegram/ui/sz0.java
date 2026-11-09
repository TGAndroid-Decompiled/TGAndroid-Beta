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
public final class sz0 extends org.telegram.ui.Cells.q1 {
    public boolean f50012ld;
    public final RectF f50013md;
    public final RectF f50014nd;
    public RadialGradient f50015od;
    public Paint f50016pd;
    public Matrix f50017qd;
    public final Path f50018rd;
    public Paint f50019sd;
    public final Paint f50020td;
    public org.telegram.ui.Components.d01 f50021ud;
    public final org.telegram.ui.Components.w5 f50022vd;
    public final int f50023wd;
    public final int f50024xd;
    public final uz0 f50025yd;

    public sz0(uz0 uz0Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11) {
        super(context, i7, false, null, g6Var);
        this.f50025yd = uz0Var;
        this.f50023wd = i10;
        this.f50024xd = i11;
        this.f50012ld = false;
        this.f50013md = new RectF();
        this.f50014nd = new RectF();
        this.f50018rd = new Path();
        this.f50020td = new Paint(1);
        this.f50022vd = new org.telegram.ui.Components.w5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void N0(Canvas canvas) {
        Paint paint = this.f50016pd;
        uz0 uz0Var = this.f50025yd;
        if (paint != null) {
            float f10 = uz0Var.f50512s;
            RectF rectF = uz0Var.R;
            if (f10 > 0.0f) {
                if (uz0Var.Q) {
                    if (this.Gc) {
                        Bitmap bitmap = uz0Var.P.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.f50018rd;
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
                        if (this.f50019sd == null) {
                            Paint paint2 = new Paint(1);
                            this.f50019sd = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.f50019sd);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.f50022vd.d(uz0Var.Q), 1.0f - uz0Var.f50512s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.f50017qd.reset();
            float width2 = (rectF.width() / 76.8f) * uz0Var.f50513w;
            this.f50017qd.postScale(width2, width2);
            this.f50017qd.postTranslate(rectF.centerX(), rectF.centerY());
            this.f50015od.setLocalMatrix(this.f50017qd);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.N0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.f50016pd);
            canvas.restore();
            canvas.restore();
        } else {
            super.N0(canvas);
        }
        canvas.saveLayerAlpha(uz0Var.R, (int) (uz0Var.f50513w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.f50020td;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(uz0Var.R);
        rectF2.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - uz0Var.f50501a0) * (-360.0f), false, paint3);
        if (this.f50021ud == null) {
            org.telegram.ui.Components.d01 d01Var = new org.telegram.ui.Components.d01(120);
            this.f50021ud = d01Var;
            d01Var.f32817b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.8f));
        this.f50021ud.a((1.0f - uz0Var.f50501a0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void O0(Canvas canvas) {
        float f10 = this.f50025yd.f50513w;
        Typeface typeface = org.telegram.messenger.g0.f22535a;
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
        ch.p0 p0Var = this.N;
        uz0 uz0Var = this.f50025yd;
        canvas.translate(org.telegram.messenger.g0.W1(uz0Var.f50512s, 0, -p0Var.f6359b), org.telegram.messenger.g0.W1(uz0Var.f50512s, uz0Var.O.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), p0Var.f6369n));
        super.o1(canvas, (1.0f - uz0Var.f50512s) * f10, num);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        uz0 uz0Var = this.f50025yd;
        boolean z9 = uz0Var.S;
        RectF rectF = uz0Var.R;
        if (z9) {
            boolean z10 = this.f50012ld;
            RectF rectF2 = this.f50014nd;
            RectF rectF3 = this.f50013md;
            if (!z10) {
                rectF3.set(getPhotoImage().K0, getPhotoImage().L0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.f50012ld = true;
                this.f50015od = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.f50016pd = paint;
                paint.setShader(this.f50015od);
                this.f50016pd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.f50017qd = new Matrix();
            }
            org.telegram.messenger.g0.Z1(rectF3, rectF2, uz0Var.f50512s, rectF);
            u3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (uz0Var.f50512s > 0.0f && uz0Var.Q) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.Sc = 1.0f - uz0Var.f50512s;
        } else {
            canvas2 = canvas;
        }
        d1(canvas2);
        if (uz0Var.S && uz0Var.f50512s > 0.0f && uz0Var.Q) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.f50023wd, this.f50024xd);
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        TextureView textureView = this.f50025yd.P;
        if (textureView != null && i7 == 8) {
            textureView.setVisibility(i7);
        }
    }

    @Override
    public final void x1(float f10, Canvas canvas, boolean z9) {
        canvas.save();
        uz0 uz0Var = this.f50025yd;
        if (uz0Var.S) {
            int i7 = this.z9;
            org.telegram.messenger.ij ijVar = uz0Var.M;
            int i10 = 0;
            if (ijVar != null && ijVar.P3()) {
                org.telegram.messenger.ij ijVar2 = uz0Var.M;
                if (ijVar2 != null && ijVar2.D == 19) {
                    i10 = 4;
                }
                i10 += 20;
            }
            canvas.translate(((this.f50014nd.right - (org.telegram.messenger.g0.L(8 + i10) + i7)) - this.B9) * uz0Var.f50512s, 0.0f);
        }
        super.x1(f10, canvas, z9);
        canvas.restore();
    }

    @Override
    public final void setPressed(boolean z9) {
    }
}
