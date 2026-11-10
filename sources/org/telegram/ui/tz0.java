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
public final class tz0 extends org.telegram.ui.Cells.q1 {
    public boolean f50360ld;
    public final RectF f50361md;
    public final RectF f50362nd;
    public RadialGradient f50363od;
    public Paint f50364pd;
    public Matrix f50365qd;
    public final Path f50366rd;
    public Paint f50367sd;
    public final Paint f50368td;
    public org.telegram.ui.Components.c01 f50369ud;
    public final org.telegram.ui.Components.v5 f50370vd;
    public final int f50371wd;
    public final int f50372xd;
    public final vz0 f50373yd;

    public tz0(vz0 vz0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11) {
        super(context, i7, false, null, h6Var);
        this.f50373yd = vz0Var;
        this.f50371wd = i10;
        this.f50372xd = i11;
        this.f50360ld = false;
        this.f50361md = new RectF();
        this.f50362nd = new RectF();
        this.f50366rd = new Path();
        this.f50368td = new Paint(1);
        this.f50370vd = new org.telegram.ui.Components.v5(0.0f, this, 0L, 120L, new LinearInterpolator());
    }

    @Override
    public final void N0(Canvas canvas) {
        Paint paint = this.f50364pd;
        vz0 vz0Var = this.f50373yd;
        if (paint != null) {
            float f10 = vz0Var.f50841s;
            RectF rectF = vz0Var.R;
            if (f10 > 0.0f) {
                if (vz0Var.Q) {
                    if (this.Gc) {
                        Bitmap bitmap = vz0Var.P.getBitmap();
                        if (bitmap != null) {
                            canvas.save();
                            Path path = this.f50366rd;
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
                        if (this.f50367sd == null) {
                            Paint paint2 = new Paint(1);
                            this.f50367sd = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        canvas.drawCircle(centerX, centerY, width, this.f50367sd);
                    }
                    getPhotoImage().setAlpha(Math.max(1.0f - this.f50370vd.d(vz0Var.Q), 1.0f - vz0Var.f50841s));
                    getPhotoImage().h(canvas, null);
                } else {
                    getPhotoImage().h(canvas, null);
                }
            }
            this.f50365qd.reset();
            float width2 = (rectF.width() / 76.8f) * vz0Var.f50842w;
            this.f50365qd.postScale(width2, width2);
            this.f50365qd.postTranslate(rectF.centerX(), rectF.centerY());
            this.f50363od.setLocalMatrix(this.f50365qd);
            canvas.saveLayerAlpha(rectF, 255, 31);
            super.N0(canvas);
            canvas.save();
            canvas.drawRect(rectF, this.f50364pd);
            canvas.restore();
            canvas.restore();
        } else {
            super.N0(canvas);
        }
        canvas.saveLayerAlpha(vz0Var.R, (int) (vz0Var.f50842w * 178.0f), 31);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.f50368td;
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(3.33f));
        paint3.setColor(-1);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(vz0Var.R);
        rectF2.inset(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        canvas.drawArc(rectF2, -90.0f, (1.0f - vz0Var.f50830a0) * (-360.0f), false, paint3);
        if (this.f50369ud == null) {
            org.telegram.ui.Components.c01 c01Var = new org.telegram.ui.Components.c01(120);
            this.f50369ud = c01Var;
            c01Var.f32408b = true;
        }
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(2.8f));
        this.f50369ud.a((1.0f - vz0Var.f50830a0) * (-360.0f), 1.0f, canvas, paint3, rectF2);
        canvas.restore();
    }

    @Override
    public final void O0(Canvas canvas) {
        float f10 = this.f50373yd.f50842w;
        Typeface typeface = org.telegram.messenger.g0.f22539a;
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
        vz0 vz0Var = this.f50373yd;
        canvas.translate(org.telegram.messenger.g0.W1(vz0Var.f50841s, 0, -p0Var.f6364b), org.telegram.messenger.g0.W1(vz0Var.f50841s, vz0Var.O.getBackgroundDrawableBottom() - getBackgroundDrawableBottom(), p0Var.f6374n));
        super.o1(canvas, (1.0f - vz0Var.f50841s) * f10, num);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        vz0 vz0Var = this.f50373yd;
        boolean z9 = vz0Var.S;
        RectF rectF = vz0Var.R;
        if (z9) {
            boolean z10 = this.f50360ld;
            RectF rectF2 = this.f50362nd;
            RectF rectF3 = this.f50361md;
            if (!z10) {
                rectF3.set(getPhotoImage().K0, getPhotoImage().L0, getPhotoImage().y(), getPhotoImage().A());
                float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) * 0.92f;
                rectF2.set((getMeasuredWidth() - min) / 2.0f, (getMeasuredHeight() - min) / 2.0f, (getMeasuredWidth() + min) / 2.0f, (getMeasuredHeight() + min) / 2.0f);
                this.f50360ld = true;
                this.f50363od = new RadialGradient(0.0f, 0.0f, 48.0f, new int[]{-1, -1, 0}, new float[]{0.0f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
                Paint paint = new Paint(1);
                this.f50364pd = paint;
                paint.setShader(this.f50363od);
                this.f50364pd.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                this.f50365qd = new Matrix();
            }
            org.telegram.messenger.g0.Z1(rectF3, rectF2, vz0Var.f50841s, rectF);
            u3(rectF.left, rectF.top, rectF.width(), rectF.height());
            getPhotoImage().J0((int) rectF.width());
            if (vz0Var.f50841s > 0.0f && vz0Var.Q) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            } else {
                canvas2 = canvas;
            }
            this.Sc = 1.0f - vz0Var.f50841s;
        } else {
            canvas2 = canvas;
        }
        d1(canvas2);
        if (vz0Var.S && vz0Var.f50841s > 0.0f && vz0Var.Q) {
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(this.f50371wd, this.f50372xd);
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        TextureView textureView = this.f50373yd.P;
        if (textureView != null && i7 == 8) {
            textureView.setVisibility(i7);
        }
    }

    @Override
    public final void x1(float f10, Canvas canvas, boolean z9) {
        canvas.save();
        vz0 vz0Var = this.f50373yd;
        if (vz0Var.S) {
            int i7 = this.z9;
            org.telegram.messenger.ij ijVar = vz0Var.M;
            int i10 = 0;
            if (ijVar != null && ijVar.P3()) {
                org.telegram.messenger.ij ijVar2 = vz0Var.M;
                if (ijVar2 != null && ijVar2.D == 19) {
                    i10 = 4;
                }
                i10 += 20;
            }
            canvas.translate(((this.f50362nd.right - (org.telegram.messenger.g0.L(8 + i10) + i7)) - this.B9) * vz0Var.f50841s, 0.0f);
        }
        super.x1(f10, canvas, z9);
        canvas.restore();
    }

    @Override
    public final void setPressed(boolean z9) {
    }
}
