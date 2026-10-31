package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.x41;
import org.telegram.ui.wv0;
public class p2 extends View {
    public boolean A0;
    public Path B0;
    public float C0;
    public float D;
    public Paint D0;
    public float E;
    public Paint E0;
    public final Paint F;
    public LinearGradient F0;
    public CharSequence G;
    public Matrix G0;
    public final org.telegram.ui.Components.e6 H;
    public LinearGradient H0;
    public boolean I;
    public long I0;
    public final TextPaint J;
    public final RectF J0;
    public Layout.Alignment K;
    public q80 K0;
    public StaticLayout L;
    public org.telegram.ui.Components.k5 M;
    public float N;
    public float O;
    public float P;
    public final ji.a Q;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final org.telegram.ui.Components.t5 W;
    public int f51725a;
    public org.telegram.ui.Cells.y f51726a0;
    public float f51727b;
    public Paint f51728b0;
    public float f51729c;
    public bi0 f51730c0;
    public long d;
    public float f51731d0;
    public boolean e;
    public int f51732e0;
    public final boolean f51733f;
    public int f51734f0;
    public int f51735g0;
    public int h;
    public boolean f51736h0;
    public float f51737i0;
    public float f51738j0;
    public int f51739k0;
    public Runnable f51740l0;
    public final wv0 m0;
    public Drawable f51741n;
    public ValueAnimator f51742n0;
    public float f51743o0;
    public final dc f51744p0;
    public final Rect f51745q0;
    public boolean f51746r;
    public final RectF f51747r0;
    public boolean f51748s;
    public final RectF f51749s0;
    public final Path f51750t0;
    public float f51751u0;
    public float f51752v0;
    public float f51753w;
    public float f51754w0;
    public final RectF f51755x;
    public float f51756x0;
    public float f51757y;
    public boolean f51758y0;
    public boolean f51759z0;

    public p2(Context context, int i10) {
        super(context);
        this.f51727b = 0.5f;
        this.f51729c = 0.0f;
        this.d = 3500L;
        this.e = true;
        this.f51733f = true;
        this.h = -1;
        this.f51748s = true;
        this.f51753w = org.telegram.messenger.i0.L(8.0f);
        this.f51755x = new RectF(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(7.0f));
        this.f51757y = org.telegram.messenger.i0.L(2.0f);
        this.D = org.telegram.messenger.i0.L(7.0f);
        this.E = org.telegram.messenger.i0.L(6.0f);
        Paint paint = new Paint(1);
        this.F = paint;
        TextPaint textPaint = new TextPaint(1);
        this.J = textPaint;
        this.K = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new ji.a();
        this.T = true;
        this.U = true;
        gr grVar = gr.h;
        this.W = new org.telegram.ui.Components.t5(this, 350L, grVar);
        this.f51732e0 = org.telegram.messenger.i0.L(2.0f);
        this.m0 = new wv0(this, 0);
        this.f51743o0 = 1.0f;
        this.f51744p0 = new dc(this, 2.0f, 5.0f);
        this.f51745q0 = new Rect();
        this.f51747r0 = new RectF();
        this.f51749s0 = new RectF();
        this.f51750t0 = new Path();
        this.f51759z0 = true;
        this.J0 = new RectF();
        this.f51725a = i10;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.f51753w));
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(true, true, false);
        this.H = e6Var;
        e6Var.n(0.4f, 320L, grVar);
        e6Var.setCallback(this);
        t(14.0f);
        e6Var.u(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return Integer.MAX_VALUE;
        }
        int length = charSequence.length() / 2;
        float f7 = 0.0f;
        int i10 = 0;
        int i11 = -1;
        float f10 = 0.0f;
        float f11 = Float.MAX_VALUE;
        float f12 = 0.0f;
        while (i10 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i11;
            }
            f12 = g(charSequence.subSequence(0, length), textPaint);
            f10 = g(org.telegram.messenger.i0.n1(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (f12 != f7 || f10 != f11) {
                if (f12 < f10) {
                    length++;
                    i11 = 1;
                } else {
                    length--;
                    i11 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i10++;
                f7 = f12;
                f11 = f10;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f12, f10));
    }

    public static CharSequence b(CharSequence charSequence, TextPaint textPaint) {
        int i10;
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return charSequence;
        }
        int length = charSequence.length() / 2;
        float f7 = Float.MAX_VALUE;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        float f10 = 0.0f;
        float f11 = Float.MAX_VALUE;
        while (i11 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i12;
            }
            float g10 = g(charSequence.subSequence(0, length), textPaint);
            float g11 = g(org.telegram.messenger.i0.n1(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (length > 0 && length < charSequence.length() && Math.max(g10, g11) < f7) {
                f7 = Math.max(g10, g11);
                i13 = length;
            }
            if (g10 != f10 || g11 != f11) {
                if (g10 < g11) {
                    length++;
                    i10 = 1;
                } else {
                    length--;
                    i10 = -1;
                }
                if (length <= 0 || length >= charSequence.length()) {
                    break;
                }
                i11++;
                f10 = g10;
                i12 = i10;
                f11 = g11;
            } else {
                break;
            }
        }
        if (i13 < 0) {
            return charSequence;
        }
        return TextUtils.concat(org.telegram.messenger.i0.n1(charSequence.subSequence(0, i13)), "\n", org.telegram.messenger.i0.n1(charSequence.subSequence(i13, charSequence.length())));
    }

    public static float g(CharSequence charSequence, TextPaint textPaint) {
        int spanStart;
        int spanEnd;
        CharSequence charSequence2;
        float f7 = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        x41[] x41VarArr = (x41[]) spanned.getSpans(0, charSequence.length(), x41.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i10 = 0;
        int i11 = 0;
        while (i10 < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i10];
            TextPaint textPaint2 = textPaint;
            i11 = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint2, charSequence2, spanStart, spanEnd, textPaint.getFontMetricsInt()) - textPaint2.measureText(spanned, spanned.getSpanStart(replacementSpan), spanned.getSpanEnd(replacementSpan))) + i11);
            i10++;
            textPaint = textPaint2;
            charSequence = charSequence;
        }
        CharSequence charSequence3 = charSequence;
        TextPaint textPaint3 = textPaint;
        if (x41VarArr != null && x41VarArr.length != 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < x41VarArr.length; i13++) {
                int spanStart2 = spanned.getSpanStart(x41VarArr[i13]);
                int spanEnd2 = spanned.getSpanEnd(x41VarArr[i13]);
                int max = Math.max(i12, spanStart2);
                if (max - i12 > 0) {
                    f7 += textPaint3.measureText(spanned, i12, max);
                }
                i12 = Math.max(max, spanEnd2);
                if (i12 - max > 0) {
                    Typeface typeface = textPaint3.getTypeface();
                    textPaint3.setTypeface(x41VarArr[i13].f32348a);
                    textPaint3.setTypeface(typeface);
                    f7 = textPaint3.measureText(spanned, max, i12) + f7;
                }
            }
            int max2 = Math.max(i12, charSequence3.length());
            if (max2 - i12 > 0) {
                f7 += textPaint3.measureText(spanned, i12, max2);
            }
            return f7 + i11;
        }
        return textPaint3.measureText(charSequence3.toString()) + i11;
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.f51755x;
        int i10 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i11 = this.h;
        if (i11 > 0) {
            i10 = Math.min(i11, i10);
        }
        return Math.max(0, i10);
    }

    public void c(Canvas canvas, float f7) {
        int i10 = this.f51739k0;
        Paint paint = this.F;
        if (i10 != 0) {
            paint.setShadowLayer(this.f51737i0, 0.0f, this.f51738j0, org.telegram.ui.ActionBar.t6.r1(f7, i10));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f7));
        Path path = this.f51750t0;
        canvas.drawPath(path, paint);
        paint.setAlpha(alpha);
        if (this.A0) {
            int L = org.telegram.messenger.i0.L(64.0f);
            float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.I0) % 4000)) / 4000.0f;
            float b10 = z20.b(this.f51754w0 * 4.0f, L * 2, currentTimeMillis, -L);
            this.G0.reset();
            this.G0.postTranslate(this.f51747r0.left + b10, 0.0f);
            this.F0.setLocalMatrix(this.G0);
            this.H0.setLocalMatrix(this.G0);
            canvas.drawPath(path, this.D0);
            canvas.drawPath(this.B0, this.E0);
            invalidate();
        }
    }

    public final void d(Path path, float f7, float f10, float f11, RectF rectF, Rect rect) {
        float f12;
        float f13 = f7 / 2.0f;
        float f14 = f10 / 2.0f;
        float min = Math.min(this.f51753w, Math.min(f13, f14));
        int i10 = this.f51725a;
        if (i10 != 1 && i10 != 3) {
            float i11 = Utilities.i(org.telegram.messenger.i0.W1(this.f51727b, getPaddingTop(), getMeasuredHeight() - getPaddingBottom()) + this.f51729c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min2 = Math.min(Math.max(getPaddingTop(), i11 - f14) + f10, getMeasuredHeight() - getPaddingBottom());
            float f15 = min2 - f10;
            float f16 = this.D;
            f12 = Utilities.i(i11, (min2 - min) - f16, f15 + min + f16);
            if (this.f51725a == 0) {
                rectF.set(getPaddingLeft() + this.E, f15, getPaddingLeft() + this.E + f7, min2);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.E) - f7, f15, (getMeasuredWidth() - getPaddingRight()) - this.E, min2);
            }
        } else {
            float i12 = Utilities.i(org.telegram.messenger.i0.W1(this.f51727b, getPaddingLeft(), getMeasuredWidth() - getPaddingRight()) + this.f51729c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min3 = Math.min(Math.max(getPaddingLeft(), i12 - f13) + f7, getMeasuredWidth() - getPaddingRight());
            float f17 = min3 - f7;
            float f18 = this.D;
            float i13 = Utilities.i(i12, (min3 - min) - f18, f17 + min + f18);
            if (this.f51725a == 1) {
                rectF.set(f17, getPaddingTop() + this.E, min3, getPaddingTop() + this.E + f10);
            } else {
                rectF.set(f17, ((getMeasuredHeight() - this.E) - getPaddingBottom()) - f10, min3, (getMeasuredHeight() - this.E) - getPaddingBottom());
            }
            f12 = i13;
        }
        float f19 = -f11;
        rectF.inset(f19, f19);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z10 = this.f51748s;
        RectF rectF2 = this.J0;
        if (z10) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f20 = rectF.left;
            float f21 = rectF.bottom;
            float f22 = min * 2.0f;
            rectF2.set(f20, f21 - f22, f22 + f20, f21);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.f51725a == 0) {
            path.lineTo(rectF.left, this.D + f12 + org.telegram.messenger.i0.L(2.0f));
            path.lineTo(rectF.left, this.D + f12);
            path.lineTo(rectF.left - this.E, org.telegram.messenger.i0.L(1.0f) + f12);
            float f23 = rectF.left - this.E;
            this.f51751u0 = f23;
            this.f51752v0 = f12;
            path.lineTo(f23, f12 - org.telegram.messenger.i0.L(1.0f));
            path.lineTo(rectF.left, f12 - this.D);
            path.lineTo(rectF.left, (f12 - this.D) - org.telegram.messenger.i0.L(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.E);
            }
        }
        if (this.f51748s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f24 = rectF.left;
            float f25 = rectF.top;
            float f26 = min * 2.0f;
            rectF2.set(f24, f25, f24 + f26, f26 + f25);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.f51725a == 1) {
            path.lineTo((f12 - this.D) - org.telegram.messenger.i0.L(2.0f), rectF.top);
            path.lineTo(f12 - this.D, rectF.top);
            path.lineTo(f12 - org.telegram.messenger.i0.L(1.0f), rectF.top - this.E);
            this.f51751u0 = f12;
            this.f51752v0 = rectF.top - this.E;
            path.lineTo(org.telegram.messenger.i0.L(1.0f) + f12, rectF.top - this.E);
            path.lineTo(this.D + f12, rectF.top);
            path.lineTo(this.D + f12 + org.telegram.messenger.i0.L(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.E);
            }
        }
        if (this.f51748s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f27 = rectF.right;
            float f28 = min * 2.0f;
            float f29 = rectF.top;
            rectF2.set(f27 - f28, f29, f27, f28 + f29);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.f51725a == 2) {
            path.lineTo(rectF.right, (f12 - this.D) - org.telegram.messenger.i0.L(2.0f));
            path.lineTo(rectF.right, f12 - this.D);
            path.lineTo(rectF.right + this.E, f12 - org.telegram.messenger.i0.L(1.0f));
            float f30 = rectF.right + this.E;
            this.f51751u0 = f30;
            this.f51752v0 = f12;
            path.lineTo(f30, org.telegram.messenger.i0.L(1.0f) + f12);
            path.lineTo(rectF.right, this.D + f12);
            path.lineTo(rectF.right, this.D + f12 + org.telegram.messenger.i0.L(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.E);
            }
        }
        if (this.f51748s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f31 = rectF.right;
            float f32 = min * 2.0f;
            float f33 = rectF.bottom;
            rectF2.set(f31 - f32, f33 - f32, f31, f33);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.f51725a == 3) {
            path.lineTo(this.D + f12 + org.telegram.messenger.i0.L(2.0f), rectF.bottom);
            path.lineTo(this.D + f12, rectF.bottom);
            path.lineTo(org.telegram.messenger.i0.L(1.0f) + f12, rectF.bottom + this.E);
            this.f51751u0 = f12;
            this.f51752v0 = rectF.bottom + this.E;
            path.lineTo(f12 - org.telegram.messenger.i0.L(1.0f), rectF.bottom + this.E);
            path.lineTo(f12 - this.D, rectF.bottom);
            path.lineTo((f12 - this.D) - org.telegram.messenger.i0.L(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.E);
            }
        }
        path.close();
        this.f51758y0 = true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: vh.p2.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void e(boolean z10) {
        org.telegram.messenger.i0.r(this.m0);
        Runnable runnable = this.f51740l0;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
        this.V = false;
        org.telegram.ui.Components.t5 t5Var = this.W;
        if (!z10) {
            t5Var.getClass();
            t5Var.e(false, 0.0f);
        }
        invalidate();
        Runnable runnable2 = this.f51740l0;
        if (runnable2 != null) {
            org.telegram.messenger.i0.h3(runnable2, t5Var.f30445c * ((float) t5Var.f30447g));
        }
        this.Q.f(true);
    }

    public final void f(int i10, CharSequence charSequence) {
        this.L = new StaticLayout(charSequence, this.J, i10, this.K, 1.0f, 0.0f, false);
        float f7 = i10;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < this.L.getLineCount(); i11++) {
            f7 = Math.min(f7, this.L.getLineLeft(i11));
            f10 = Math.max(f10, this.L.getLineRight(i11));
        }
        this.O = Math.max(0.0f, f10 - f7);
        this.P = this.L.getHeight();
        this.N = f7;
        this.M = org.telegram.ui.Components.o5.update(0, this, this.M, this.L);
    }

    public CharSequence getText() {
        CharSequence charSequence = this.G;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.I) {
            return this.H.f25700i;
        }
        StaticLayout staticLayout = this.L;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public TextPaint getTextPaint() {
        if (this.I) {
            return this.J;
        }
        return this.H.f25693a;
    }

    public final void h(int i10) {
        Paint paint = this.F;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidate();
        }
    }

    public final void i(boolean z10) {
        this.f51746r = z10;
        if (!this.I) {
            float f7 = 11.0f;
            float L = org.telegram.messenger.i0.L(11.0f);
            float L2 = org.telegram.messenger.i0.L(6.0f);
            if (this.f51746r) {
                f7 = 15.0f;
            }
            this.f51755x.set(L, L2, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(7.0f));
        }
    }

    public final void j(bi0 bi0Var) {
        bi0 bi0Var2 = this.f51730c0;
        if (bi0Var2 != null) {
            bi0Var2.setCallback(null);
        }
        this.f51730c0 = bi0Var;
        bi0Var.setCallback(this);
        bi0 bi0Var3 = this.f51730c0;
        if (c3.i0.t(bi0Var3)) {
            this.d = Math.max(this.d, bi0Var3.r());
        }
        bi0 bi0Var4 = this.f51730c0;
        this.f51734f0 = bi0Var4.f24753b;
        this.f51735g0 = bi0Var4.f24755c;
        this.f51736h0 = true;
    }

    public final void k(float f7, float f10, float f11, float f12) {
        this.f51755x.set(org.telegram.messenger.i0.N(f7), org.telegram.messenger.i0.N(f10), org.telegram.messenger.i0.N(f11), org.telegram.messenger.i0.N(f12));
    }

    public final void l(float f7, float f10) {
        if (Math.abs(this.f51727b - f7) >= 1.0f || Math.abs(this.f51729c - org.telegram.messenger.i0.L(f10)) >= 1.0f) {
            this.f51758y0 = false;
            invalidate();
        }
        this.f51727b = f7;
        this.f51729c = org.telegram.messenger.i0.L(f10);
    }

    public final void m(float f7, float f10) {
        if (Math.abs(this.f51727b - f7) >= 1.0f || Math.abs(this.f51729c - f10) >= 1.0f) {
            this.f51758y0 = false;
            invalidate();
        }
        this.f51727b = f7;
        this.f51729c = f10;
    }

    public final void n() {
        this.h = org.telegram.messenger.i0.L(165.0f);
    }

    public final void o(int i10) {
        this.h = i10;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.o5.release(this, this.M);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        this.f51758y0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.e6 e6Var = this.H;
        e6Var.M = textMaxWidth;
        if (this.I) {
            CharSequence charSequence = this.G;
            if (charSequence == null) {
                StaticLayout staticLayout = this.L;
                if (staticLayout != null) {
                    charSequence = staticLayout.getText();
                } else {
                    return;
                }
            }
            StaticLayout staticLayout2 = this.L;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                f(textMaxWidth, charSequence);
            }
        } else {
            CharSequence charSequence2 = this.G;
            if (charSequence2 != null) {
                e6Var.t(charSequence2, false, true);
            }
        }
        this.G = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: vh.p2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(boolean z10) {
        this.I = z10;
        RectF rectF = this.f51755x;
        float f7 = 15.0f;
        if (z10) {
            rectF.set(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(8.0f));
            this.f51757y = org.telegram.messenger.i0.L(6.0f);
            return;
        }
        float L = org.telegram.messenger.i0.L(11.0f);
        float L2 = org.telegram.messenger.i0.L(6.0f);
        if (!this.f51746r) {
            f7 = 11.0f;
        }
        rectF.set(L, L2, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(7.0f));
        this.f51757y = org.telegram.messenger.i0.L(2.0f);
    }

    public final void q(float f7) {
        CornerPathEffect cornerPathEffect;
        this.f51753w = org.telegram.messenger.i0.L(f7);
        CornerPathEffect cornerPathEffect2 = null;
        if (this.f51748s) {
            cornerPathEffect = new CornerPathEffect(this.f51753w);
        } else {
            cornerPathEffect = null;
        }
        this.F.setPathEffect(cornerPathEffect);
        Paint paint = this.f51728b0;
        if (paint != null) {
            if (this.f51748s) {
                cornerPathEffect2 = new CornerPathEffect(this.f51753w);
            }
            paint.setPathEffect(cornerPathEffect2);
        }
    }

    public final void r() {
        this.f51748s = false;
        this.F.setPathEffect(null);
    }

    public final void s(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.G = charSequence;
        } else if (!this.I) {
            this.H.t(charSequence, false, true);
        } else {
            f(getTextMaxWidth(), charSequence);
        }
    }

    public final void t(float f7) {
        this.H.w(org.telegram.messenger.i0.N(f7));
        this.J.setTextSize(org.telegram.messenger.i0.N(f7));
    }

    public final void u() {
        if (this.V && this.U) {
            ValueAnimator valueAnimator = this.f51742n0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f51742n0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f51742n0 = ofFloat;
            ofFloat.addUpdateListener(new qh.e0(this, 28));
            this.f51742n0.addListener(new sg.r(this, 16));
            this.f51742n0.setInterpolator(gr.f26499k);
            this.f51742n0.setDuration(300L);
            this.f51742n0.start();
        }
        org.telegram.messenger.i0.i2(getText());
        this.V = true;
        invalidate();
        wv0 wv0Var = this.m0;
        org.telegram.messenger.i0.r(wv0Var);
        long j10 = this.d;
        if (j10 > 0) {
            org.telegram.messenger.i0.h3(wv0Var, j10);
        }
        Runnable runnable = this.f51740l0;
        if (runnable != null) {
            org.telegram.messenger.i0.r(runnable);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.H && drawable != this.f51726a0 && drawable != this.f51730c0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
