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
public final class u61 implements org.telegram.ui.ActionBar.i6 {
    public org.telegram.ui.ActionBar.i6 f52554a;
    public final SparseIntArray f52555b = new SparseIntArray();
    public final Paint f52556c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint f52557e;
    public final TextPaint f52558f;
    public final TextPaint f52559g;
    public final TextPaint h;
    public Bitmap f52560i;
    public BitmapShader f52561j;
    public Matrix f52562k;
    public final v71 f52563l;
    public final v71 f52564m;

    public u61(v71 v71Var) {
        this.f52564m = v71Var;
        this.f52563l = v71Var;
        Paint paint = new Paint(3);
        this.f52557e = paint;
        TextPaint textPaint = new TextPaint();
        this.f52558f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f52559g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.bz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.bz.W0) - 2));
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
        int i7 = org.telegram.ui.ActionBar.n6.f29440cd;
        int i10 = i(i7);
        int i11 = i(org.telegram.ui.ActionBar.n6.f29457dd);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.za0;
        TextPaint textPaint = this.f52559g;
        TextPaint textPaint2 = this.f52558f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && org.telegram.messenger.bz.o() != 0 && org.telegram.messenger.pc.e(32)) {
            if (z10) {
                bitmap = ((org.telegram.ui.Components.za0) drawable).f42795k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f52560i != bitmap) {
                this.f52560i = bitmap;
                Bitmap bitmap2 = this.f52560i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f52561j = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.f52562k == null) {
                    this.f52562k = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.h.setColor(-1);
        } else {
            this.f52560i = null;
            this.f52561j = null;
            int i12 = org.telegram.ui.ActionBar.n6.Zc;
            textPaint2.setColor(i(i12));
            textPaint.setColor(i(i12));
            textPaint2.linkColor = i(org.telegram.ui.ActionBar.n6.f29400ad);
        }
        Paint paint = this.f52556c;
        paint.setColor(i10);
        Paint paint2 = this.d;
        paint2.setColor(i11);
        if (this.f52561j != null && (this.f52555b.indexOfKey(i7) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z10) {
                float f15 = -0.06f;
                if (((org.telegram.ui.Components.za0) drawable).f42801q >= 0.0f) {
                    colorMatrix.setSaturation(1.6f);
                    if (b()) {
                        f14 = 0.97f;
                    } else {
                        f14 = 0.92f;
                    }
                    org.telegram.messenger.g0.n2(colorMatrix, f14);
                    if (b()) {
                        f15 = 0.12f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix, f15);
                } else {
                    colorMatrix.setSaturation(1.1f);
                    if (b()) {
                        f13 = 0.4f;
                    } else {
                        f13 = 0.8f;
                    }
                    org.telegram.messenger.g0.n2(colorMatrix, f13);
                    if (b()) {
                        f15 = 0.08f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix, f15);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                if (b()) {
                    f11 = 0.9f;
                } else {
                    f11 = 0.84f;
                }
                org.telegram.messenger.g0.n2(colorMatrix, f11);
                if (b()) {
                    f12 = -0.04f;
                } else {
                    f12 = 0.06f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f12);
            }
            if (z10) {
                float f16 = ((org.telegram.ui.Components.za0) drawable).f42801q;
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
            paint.setShader(this.f52561j);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f52561j);
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
    public final boolean b() {
        n71 n71Var = this.f52564m.f52895r1;
        if (n71Var != null) {
            return n71Var.b();
        }
        n71 n71Var2 = this.f52563l.f52895r1;
        if (n71Var2 != null) {
            return n71Var2.b();
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f52554a;
        if (i6Var != null) {
            return i6Var.b();
        }
        return org.telegram.ui.ActionBar.n6.I.q();
    }

    @Override
    public final void c(float f10, float f11, int i7, int i10) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f52560i;
        if (bitmap != null && (bitmapShader = this.f52561j) != null) {
            org.telegram.ui.ActionBar.n6.s(bitmap, bitmapShader, this.f52562k, i7, i10, f10, f11);
        } else {
            org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
        }
    }

    @Override
    public final ColorFilter d() {
        return org.telegram.ui.ActionBar.n6.f29783v3;
    }

    @Override
    public final Paint e(String str) {
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
                return this.f52559g;
            case 1:
                return this.f52556c;
            case 2:
                return this.h;
            case 3:
                return this.f52557e;
            case 4:
                return this.d;
            case 5:
                return this.f52558f;
            default:
                org.telegram.ui.ActionBar.i6 i6Var = this.f52554a;
                if (i6Var != null) {
                    return i6Var.e(str);
                }
                return org.telegram.ui.ActionBar.n6.V0(str);
        }
    }

    @Override
    public final boolean f() {
        return org.telegram.messenger.bz.H0;
    }

    @Override
    public final int g(int i7) {
        return i(i7);
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f52554a;
        if (i6Var != null) {
            return i6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.n6.R0(str);
    }

    @Override
    public final boolean h() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f52554a;
        if (i6Var != null) {
            return i6Var.h();
        }
        return org.telegram.ui.ActionBar.n6.d1();
    }

    @Override
    public final int i(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f52554a;
        if (i6Var != null) {
            return i6Var.i(i7);
        }
        return org.telegram.ui.ActionBar.n6.v0(i7);
    }

    @Override
    public final int k(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f52554a;
        if (i6Var != null) {
            return i6Var.k(i7);
        }
        return i(i7);
    }

    @Override
    public final void j(int i7, int i10) {
    }
}
