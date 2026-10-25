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
public final class sb1 implements org.telegram.ui.ActionBar.u6 {
    public org.telegram.ui.ActionBar.u6 f43452a;
    public final SparseIntArray f43453b = new SparseIntArray();
    public final Paint f43454c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint e;
    public final TextPaint f43455f;
    public final TextPaint f43456g;
    public final TextPaint h;
    public Bitmap f43457i;
    public BitmapShader f43458j;
    public Matrix f43459k;
    public final tc1 f43460l;
    public final tc1 f43461m;

    public sb1(tc1 tc1Var) {
        this.f43461m = tc1Var;
        this.f43460l = tc1Var;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f43455f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f43456g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        kc1 kc1Var = this.f43461m.f43779q1;
        if (kc1Var != null) {
            return kc1Var.a();
        }
        kc1 kc1Var2 = this.f43460l.f43779q1;
        if (kc1Var2 != null) {
            return kc1Var2.a();
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.f43452a;
        if (u6Var != null) {
            return u6Var.a();
        }
        return org.telegram.ui.ActionBar.y6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f43457i;
        if (bitmap != null && (bitmapShader = this.f43458j) != null) {
            org.telegram.ui.ActionBar.y6.r(bitmap, bitmapShader, this.f43459k, i10, i11, f7, f10);
        } else {
            org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
        }
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.y6.f23687v3;
    }

    @Override
    public final Paint d(String str) {
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
                return this.f43456g;
            case 1:
                return this.f43454c;
            case 2:
                return this.h;
            case 3:
                return this.e;
            case 4:
                return this.d;
            case 5:
                return this.f43455f;
            default:
                org.telegram.ui.ActionBar.u6 u6Var = this.f43452a;
                if (u6Var != null) {
                    return u6Var.d(str);
                }
                return org.telegram.ui.ActionBar.y6.U0(str);
        }
    }

    @Override
    public final int e(int i10) {
        return g(i10);
    }

    @Override
    public final boolean f() {
        org.telegram.ui.ActionBar.u6 u6Var = this.f43452a;
        if (u6Var != null) {
            return u6Var.f();
        }
        return org.telegram.ui.ActionBar.y6.c1();
    }

    @Override
    public final int g(int i10) {
        org.telegram.ui.ActionBar.u6 u6Var = this.f43452a;
        if (u6Var != null) {
            return u6Var.g(i10);
        }
        return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.u6 u6Var = this.f43452a;
        if (u6Var != null) {
            return u6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.y6.Q0(str);
    }

    @Override
    public final int i(int i10) {
        org.telegram.ui.ActionBar.u6 u6Var = this.f43452a;
        if (u6Var != null) {
            return u6Var.i(i10);
        }
        return g(i10);
    }

    public final void j(Drawable drawable, Drawable drawable2, Float f7) {
        Bitmap bitmap;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10 = org.telegram.ui.ActionBar.y6.f23506lc;
        int g7 = g(i10);
        int g10 = g(org.telegram.ui.ActionBar.y6.f23524mc);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.uc0;
        TextPaint textPaint = this.f43456g;
        TextPaint textPaint2 = this.f43455f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.uc0) drawable).f33361k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f43457i != bitmap) {
                this.f43457i = bitmap;
                Bitmap bitmap2 = this.f43457i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f43458j = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.f43459k == null) {
                    this.f43459k = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.h.setColor(-1);
        } else {
            this.f43457i = null;
            this.f43458j = null;
            int i11 = org.telegram.ui.ActionBar.y6.f23451ic;
            textPaint2.setColor(g(i11));
            textPaint.setColor(g(i11));
            textPaint2.linkColor = g(org.telegram.ui.ActionBar.y6.f23468jc);
        }
        Paint paint = this.f43454c;
        paint.setColor(g7);
        Paint paint2 = this.d;
        paint2.setColor(g10);
        if (this.f43458j != null && (this.f43453b.indexOfKey(i10) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f14 = -0.06f;
                if (((org.telegram.ui.Components.uc0) drawable).f33367q >= 0.0f) {
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
                float f15 = ((org.telegram.ui.Components.uc0) drawable).f33367q;
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
            paint.setShader(this.f43458j);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f43458j);
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
    public final void h(int i10, int i11) {
    }
}
