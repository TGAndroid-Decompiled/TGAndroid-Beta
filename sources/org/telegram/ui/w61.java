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
public final class w61 implements org.telegram.ui.ActionBar.f6 {
    public org.telegram.ui.ActionBar.f6 f50944a;
    public final SparseIntArray f50945b = new SparseIntArray();
    public final Paint f50946c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint f50947e;
    public final TextPaint f50948f;
    public final TextPaint f50949g;
    public final TextPaint h;
    public Bitmap f50950i;
    public BitmapShader f50951j;
    public Matrix f50952k;
    public final v71 f50953l;
    public final v71 f50954m;

    public w61(v71 v71Var) {
        this.f50954m = v71Var;
        this.f50953l = v71Var;
        Paint paint = new Paint(3);
        this.f50947e = paint;
        TextPaint textPaint = new TextPaint();
        this.f50948f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.f50949g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.iz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.iz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override
    public final boolean a() {
        n71 n71Var = this.f50954m.f50566q1;
        if (n71Var != null) {
            return n71Var.a();
        }
        n71 n71Var2 = this.f50953l.f50566q1;
        if (n71Var2 != null) {
            return n71Var2.a();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f50944a;
        if (f6Var != null) {
            return f6Var.a();
        }
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public final void b(float f10, float f11, int i7, int i10) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.f50950i;
        if (bitmap != null && (bitmapShader = this.f50951j) != null) {
            org.telegram.ui.ActionBar.k6.s(bitmap, bitmapShader, this.f50952k, i7, i10, f10, f11);
        } else {
            org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
        }
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.f28184v3;
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
                return this.f50949g;
            case 1:
                return this.f50946c;
            case 2:
                return this.h;
            case 3:
                return this.f50947e;
            case 4:
                return this.d;
            case 5:
                return this.f50948f;
            default:
                org.telegram.ui.ActionBar.f6 f6Var = this.f50944a;
                if (f6Var != null) {
                    return f6Var.d(str);
                }
                return org.telegram.ui.ActionBar.k6.V0(str);
        }
    }

    @Override
    public final boolean e() {
        return org.telegram.messenger.iz.H0;
    }

    @Override
    public final int f(int i7) {
        return h(i7);
    }

    @Override
    public final boolean g() {
        org.telegram.ui.ActionBar.f6 f6Var = this.f50944a;
        if (f6Var != null) {
            return f6Var.g();
        }
        return org.telegram.ui.ActionBar.k6.d1();
    }

    @Override
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f50944a;
        if (f6Var != null) {
            return f6Var.getDrawable(str);
        }
        return org.telegram.ui.ActionBar.k6.R0(str);
    }

    @Override
    public final int h(int i7) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f50944a;
        if (f6Var != null) {
            return f6Var.h(i7);
        }
        return org.telegram.ui.ActionBar.k6.v0(i7);
    }

    @Override
    public final int j(int i7) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f50944a;
        if (f6Var != null) {
            return f6Var.j(i7);
        }
        return h(i7);
    }

    public final void k(Drawable drawable, Drawable drawable2, Float f10) {
        Bitmap bitmap;
        float f11;
        float f12;
        float f13;
        float f14;
        int i7 = org.telegram.ui.ActionBar.k6.Zc;
        int h = h(i7);
        int h7 = h(org.telegram.ui.ActionBar.k6.f27802ad);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z9 = drawable instanceof org.telegram.ui.Components.qa0;
        TextPaint textPaint = this.f50949g;
        TextPaint textPaint2 = this.f50948f;
        if ((z9 || (drawable instanceof BitmapDrawable)) && org.telegram.messenger.iz.o() != 0 && org.telegram.messenger.sc.e(32)) {
            if (z9) {
                bitmap = ((org.telegram.ui.Components.qa0) drawable).f37260k;
            } else if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                bitmap = null;
            }
            if (this.f50950i != bitmap) {
                this.f50950i = bitmap;
                Bitmap bitmap2 = this.f50950i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.f50951j = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.f50952k == null) {
                    this.f50952k = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.h.setColor(-1);
        } else {
            this.f50950i = null;
            this.f50951j = null;
            int i10 = org.telegram.ui.ActionBar.k6.Wc;
            textPaint2.setColor(h(i10));
            textPaint.setColor(h(i10));
            textPaint2.linkColor = h(org.telegram.ui.ActionBar.k6.Xc);
        }
        Paint paint = this.f50946c;
        paint.setColor(h);
        Paint paint2 = this.d;
        paint2.setColor(h7);
        if (this.f50951j != null && (this.f50945b.indexOfKey(i7) < 0 || z9 || (drawable instanceof BitmapDrawable))) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (z9) {
                float f15 = -0.06f;
                if (((org.telegram.ui.Components.qa0) drawable).f37266q >= 0.0f) {
                    colorMatrix.setSaturation(1.6f);
                    if (a()) {
                        f14 = 0.97f;
                    } else {
                        f14 = 0.92f;
                    }
                    org.telegram.messenger.g0.n2(colorMatrix, f14);
                    if (a()) {
                        f15 = 0.12f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix, f15);
                } else {
                    colorMatrix.setSaturation(1.1f);
                    if (a()) {
                        f13 = 0.4f;
                    } else {
                        f13 = 0.8f;
                    }
                    org.telegram.messenger.g0.n2(colorMatrix, f13);
                    if (a()) {
                        f15 = 0.08f;
                    }
                    org.telegram.messenger.g0.h(colorMatrix, f15);
                }
            } else {
                colorMatrix.setSaturation(1.6f);
                if (a()) {
                    f11 = 0.9f;
                } else {
                    f11 = 0.84f;
                }
                org.telegram.messenger.g0.n2(colorMatrix, f11);
                if (a()) {
                    f12 = -0.04f;
                } else {
                    f12 = 0.06f;
                }
                org.telegram.messenger.g0.h(colorMatrix, f12);
            }
            if (z9) {
                float f16 = ((org.telegram.ui.Components.qa0) drawable).f37266q;
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
            paint.setShader(this.f50951j);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            paint.setAlpha(255);
            paint2.setShader(this.f50951j);
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
    public final void i(int i7, int i10) {
    }
}
