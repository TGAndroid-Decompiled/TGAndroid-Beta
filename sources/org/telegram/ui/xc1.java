package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
public final class xc1 implements org.telegram.ui.ActionBar.e6 {
    public org.telegram.ui.ActionBar.e6 f43920a;
    public final SparseIntArray f43921b = new SparseIntArray();
    public final Paint f43922c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint f43923e;
    public final TextPaint f43924f;
    public final TextPaint h;
    public final TextPaint f43925n;
    public Bitmap f43926r;
    public BitmapShader f43927s;
    public Matrix v;
    public final xd1 f43928w;
    public final xd1 f43929x;

    public xc1(xd1 xd1Var) {
        this.f43929x = xd1Var;
        this.f43928w = xd1Var;
        Paint paint = new Paint(3);
        this.f43923e = paint;
        TextPaint textPaint = new TextPaint();
        this.f43924f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.h = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.f43925n = textPaint3;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override
    public final Paint F(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1490966183:
                if (str.equals("paintChatActionText2")) {
                    c10 = 0;
                    break;
                }
                break;
            case 561929466:
                if (str.equals("paintChatActionBackground")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1712385955:
                if (str.equals("paintChatBotButton")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1790254137:
                if (str.equals("paintChatActionBackgroundDarken")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1897339317:
                if (str.equals("paintChatActionBackgroundSelected")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2030114297:
                if (str.equals("paintChatActionText")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return this.h;
            case 1:
                return this.f43922c;
            case 2:
                return this.f43925n;
            case 3:
                return this.f43923e;
            case 4:
                return this.d;
            case 5:
                return this.f43924f;
            default:
                org.telegram.ui.ActionBar.e6 e6Var = this.f43920a;
                if (e6Var != null) {
                    return e6Var.F(str);
                }
                return org.telegram.ui.ActionBar.i6.T0(str);
        }
    }

    @Override
    public final boolean a() {
        od1 od1Var = this.f43929x.f43979p1;
        if (od1Var != null) {
            return od1Var.a();
        }
        od1 od1Var2 = this.f43928w.f43979p1;
        if (od1Var2 != null) {
            return od1Var2.a();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f43920a;
        if (e6Var != null) {
            return e6Var.a();
        }
        return org.telegram.ui.ActionBar.i6.I.q();
    }

    @Override
    public final int a1(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f43920a;
        if (e6Var != null) {
            return e6Var.a1(i10);
        }
        return x0(i10);
    }

    public final void b(Drawable drawable, Drawable drawable2, Float f7) {
        Bitmap bitmap;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = org.telegram.ui.ActionBar.i6.f20949lc;
        int x02 = x0(i10);
        int x03 = x0(org.telegram.ui.ActionBar.i6.f20968mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.cd0;
        TextPaint textPaint = this.h;
        TextPaint textPaint2 = this.f43924f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.cd0) drawable).f25341k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f43926r != bitmap) {
                this.f43926r = bitmap;
                Bitmap bitmap2 = this.f43926r;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f43927s = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.v == null) {
                    this.v = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.f43925n.setColor(-1);
        } else {
            this.f43926r = null;
            this.f43927s = null;
            int i11 = org.telegram.ui.ActionBar.i6.f20894ic;
            textPaint2.setColor(x0(i11));
            textPaint.setColor(x0(i11));
            textPaint2.linkColor = x0(org.telegram.ui.ActionBar.i6.f20912jc);
        }
        Paint paint = this.f43922c;
        paint.setColor(x02);
        Paint paint2 = this.d;
        paint2.setColor(x03);
        if (this.f43927s != null && (this.f43921b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((org.telegram.ui.Components.cd0) drawable).f25347q >= 0.0f) {
                    colorMatrix.setSaturation(1.6f);
                    if (a()) {
                        f13 = 0.97f;
                    } else {
                        f13 = 0.92f;
                    }
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f13);
                    if (a()) {
                        f14 = 0.12f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f14);
                } else {
                    colorMatrix.setSaturation(1.1f);
                    if (a()) {
                        f12 = 0.4f;
                    } else {
                        f12 = 0.8f;
                    }
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f12);
                    if (a()) {
                        f14 = 0.08f;
                    }
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f14);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                if (a()) {
                    f10 = 0.9f;
                } else {
                    f10 = 0.84f;
                }
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, f10);
                if (a()) {
                    f11 = -0.04f;
                } else {
                    f11 = 0.06f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f11);
            }
            if (z10) {
                float f15 = ((org.telegram.ui.Components.cd0) drawable).f25347q;
                if (f7 != null) {
                    f15 = f7.floatValue();
                }
                if (f15 >= 0.0f) {
                    colorMatrix.setSaturation(1.8f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.97f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.03f);
                } else {
                    colorMatrix.setSaturation(0.5f);
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.35f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.03f);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.97f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.06f);
            }
            paint.setShader(this.f43927s);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f43927s);
            ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.85f);
            paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
            paint2.setAlpha(255);
            return;
        }
        paint.setColorFilter(null);
        paint.setShader(null);
        paint2.setColorFilter(null);
        paint2.setShader(null);
    }

    @Override
    public final int c0(int i10) {
        return x0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f43920a;
        if (e6Var != null) {
            return e6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.i6.P0(str);
    }

    @Override
    public final boolean k0() {
        org.telegram.ui.ActionBar.e6 e6Var = this.f43920a;
        if (e6Var != null) {
            return e6Var.k0();
        }
        return org.telegram.ui.ActionBar.i6.b1();
    }

    @Override
    public final void m(float f7, float f10, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f43926r;
        if (bitmap != null && (bitmapShader = this.f43927s) != null) {
            org.telegram.ui.ActionBar.i6.r(bitmap, bitmapShader, this.v, i10, i11, f7, f10);
        } else {
            org.telegram.ui.ActionBar.i6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.i6.f21125v3;
    }

    @Override
    public final int x0(int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f43920a;
        if (e6Var != null) {
            return e6Var.x0(i10);
        }
        return org.telegram.ui.ActionBar.i6.x0(null, i10, false);
    }

    @Override
    public final void I0(int i10, int i11) {
    }
}
