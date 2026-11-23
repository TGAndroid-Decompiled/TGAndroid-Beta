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
public final class w61 implements org.telegram.ui.ActionBar.h6 {
    public org.telegram.ui.ActionBar.h6 f52955a;
    public final SparseIntArray f52956b = new SparseIntArray();
    public final Paint f52957c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint f52958e;
    public final TextPaint f52959f;
    public final TextPaint f52960g;
    public final TextPaint h;
    public Bitmap f52961i;
    public BitmapShader f52962j;
    public Matrix f52963k;
    public final x71 f52964l;
    public final x71 f52965m;

    public w61(x71 x71Var) {
        this.f52965m = x71Var;
        this.f52964l = x71Var;
        Paint paint = new Paint(3);
        this.f52958e = paint;
        TextPaint textPaint = new TextPaint();
        this.f52959f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f52960g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.cz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.cz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    public final void a(Drawable drawable, Drawable drawable2, Float f10) {
        Bitmap bitmap;
        float f11;
        float f12;
        float f13;
        float f14;
        int i7 = org.telegram.ui.ActionBar.m6.f29336cd;
        int k10 = k(i7);
        int k11 = k(org.telegram.ui.ActionBar.m6.f29353dd);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.cb0;
        TextPaint textPaint = this.f52960g;
        TextPaint textPaint2 = this.f52959f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && org.telegram.messenger.cz.o() != 0 && org.telegram.messenger.qc.e(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.cb0) drawable).f34119k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f52961i != bitmap) {
                this.f52961i = bitmap;
                Bitmap bitmap2 = this.f52961i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f52962j = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.f52963k == null) {
                    this.f52963k = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.h.setColor(-1);
        } else {
            this.f52961i = null;
            this.f52962j = null;
            int i10 = org.telegram.ui.ActionBar.m6.Zc;
            textPaint2.setColor(k(i10));
            textPaint.setColor(k(i10));
            textPaint2.linkColor = k(org.telegram.ui.ActionBar.m6.f29296ad);
        }
        Paint paint = this.f52957c;
        paint.setColor(k10);
        Paint paint2 = this.d;
        paint2.setColor(k11);
        if (this.f52962j != null && (this.f52956b.indexOfKey(i7) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f15 = -0.06f;
                if (((org.telegram.ui.Components.cb0) drawable).f34125q >= 0.0f) {
                    colorMatrix.setSaturation(1.6f);
                    if (d()) {
                        f14 = 0.97f;
                    } else {
                        f14 = 0.92f;
                    }
                    org.telegram.messenger.g0.n2(colorMatrix, f14);
                    if (d()) {
                        f15 = 0.12f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix, f15);
                } else {
                    colorMatrix.setSaturation(1.1f);
                    if (d()) {
                        f13 = 0.4f;
                    } else {
                        f13 = 0.8f;
                    }
                    org.telegram.messenger.g0.n2(colorMatrix, f13);
                    if (d()) {
                        f15 = 0.08f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix, f15);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                if (d()) {
                    f11 = 0.9f;
                } else {
                    f11 = 0.84f;
                }
                org.telegram.messenger.g0.n2(colorMatrix, f11);
                if (d()) {
                    f12 = -0.04f;
                } else {
                    f12 = 0.06f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f12);
            }
            if (z10) {
                float f16 = ((org.telegram.ui.Components.cb0) drawable).f34125q;
                if (f10 != null) {
                    f16 = f10.floatValue();
                }
                if (f16 >= 0.0f) {
                    colorMatrix.setSaturation(1.8f);
                    org.telegram.messenger.g0.n2(colorMatrix, 0.97f);
                    org.telegram.messenger.g0.h(colorMatrix, 0.03f);
                } else {
                    colorMatrix.setSaturation(0.5f);
                    org.telegram.messenger.g0.n2(colorMatrix, 0.35f);
                    org.telegram.messenger.g0.h(colorMatrix, 0.03f);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                org.telegram.messenger.g0.n2(colorMatrix, 0.97f);
                org.telegram.messenger.g0.h(colorMatrix, 0.06f);
            }
            paint.setShader(this.f52962j);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f52962j);
            ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
            org.telegram.messenger.g0.n2(colorMatrix2, 0.85f);
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
    public final boolean d() {
        p71 p71Var = this.f52965m.f53687r1;
        if (p71Var != null) {
            return p71Var.d();
        }
        p71 p71Var2 = this.f52964l.f53687r1;
        if (p71Var2 != null) {
            return p71Var2.d();
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f52955a;
        if (h6Var != null) {
            return h6Var.d();
        }
        return org.telegram.ui.ActionBar.m6.I.q();
    }

    @Override
    public final void e(float f10, float f11, int i7, int i10) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f52961i;
        if (bitmap != null && (bitmapShader = this.f52962j) != null) {
            org.telegram.ui.ActionBar.m6.s(bitmap, bitmapShader, this.f52963k, i7, i10, f10, f11);
        } else {
            org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
        }
    }

    @Override
    public final ColorFilter f() {
        return org.telegram.ui.ActionBar.m6.f29679v3;
    }

    @Override
    public final Paint g(String str) {
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
                return this.f52960g;
            case 1:
                return this.f52957c;
            case 2:
                return this.h;
            case 3:
                return this.f52958e;
            case 4:
                return this.d;
            case 5:
                return this.f52959f;
            default:
                org.telegram.ui.ActionBar.h6 h6Var = this.f52955a;
                if (h6Var != null) {
                    return h6Var.g(str);
                }
                return org.telegram.ui.ActionBar.m6.V0(str);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f52955a;
        if (h6Var != null) {
            return h6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.m6.R0(str);
    }

    @Override
    public final boolean h() {
        return org.telegram.messenger.cz.H0;
    }

    @Override
    public final int i(int i7) {
        return k(i7);
    }

    @Override
    public final boolean j() {
        org.telegram.ui.ActionBar.h6 h6Var = this.f52955a;
        if (h6Var != null) {
            return h6Var.j();
        }
        return org.telegram.ui.ActionBar.m6.d1();
    }

    @Override
    public final int k(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f52955a;
        if (h6Var != null) {
            return h6Var.k(i7);
        }
        return org.telegram.ui.ActionBar.m6.v0(i7);
    }

    @Override
    public final int m(int i7) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f52955a;
        if (h6Var != null) {
            return h6Var.m(i7);
        }
        return k(i7);
    }

    @Override
    public final void l(int i7, int i10) {
    }
}
