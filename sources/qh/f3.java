package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.gl0;
public class f3 extends View {
    public Paint A0;
    public float B;
    public Paint B0;
    public final Paint C;
    public LinearGradient C0;
    public CharSequence D;
    public Matrix D0;
    public final org.telegram.ui.Components.j6 E;
    public LinearGradient E0;
    public boolean F;
    public long F0;
    public final TextPaint G;
    public final RectF G0;
    public Layout.Alignment H;
    public h90 H0;
    public StaticLayout I;
    public org.telegram.ui.Components.q5 J;
    public float K;
    public float L;
    public float M;
    public final d90 N;
    public float O;
    public float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final org.telegram.ui.Components.z5 T;
    public org.telegram.ui.Cells.z U;
    public Paint V;
    public ij0 W;
    public int f45285a;
    public float f45286a0;
    public float f45287b;
    public int f45288b0;
    public float f45289c;
    public int f45290c0;
    public long d;
    public int f45291d0;
    public boolean f45292e;
    public boolean f45293e0;
    public final boolean f45294f;
    public float f45295f0;
    public float f45296g0;
    public int h;
    public int f45297h0;
    public Runnable f45298i0;
    public final gl0 f45299j0;
    public ValueAnimator f45300k0;
    public float f45301l0;
    public final rc m0;
    public Drawable f45302n;
    public final Rect f45303n0;
    public final RectF f45304o0;
    public final RectF f45305p0;
    public final Path f45306q0;
    public boolean f45307r;
    public float f45308r0;
    public boolean f45309s;
    public float f45310s0;
    public float f45311t0;
    public float f45312u0;
    public float v;
    public boolean f45313v0;
    public final RectF f45314w;
    public boolean f45315w0;
    public float f45316x;
    public boolean f45317x0;
    public float f45318y;
    public Path f45319y0;
    public float f45320z0;

    public f3(Context context, int i10) {
        super(context);
        this.f45287b = 0.5f;
        this.f45289c = 0.0f;
        this.d = 3500L;
        this.f45292e = true;
        this.f45294f = true;
        this.h = -1;
        this.f45309s = true;
        this.v = AndroidUtilities.dp(8.0f);
        this.f45314w = new RectF(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(7.0f));
        this.f45316x = AndroidUtilities.dp(2.0f);
        this.f45318y = AndroidUtilities.dp(7.0f);
        this.B = AndroidUtilities.dp(6.0f);
        Paint paint = new Paint(1);
        this.C = paint;
        TextPaint textPaint = new TextPaint(1);
        this.G = textPaint;
        this.H = Layout.Alignment.ALIGN_NORMAL;
        this.N = new d90();
        this.Q = true;
        this.R = true;
        pr prVar = pr.h;
        this.T = new org.telegram.ui.Components.z5(this, 350L, prVar);
        this.f45288b0 = AndroidUtilities.dp(2.0f);
        this.f45299j0 = new gl0(this, 27);
        this.f45301l0 = 1.0f;
        this.m0 = new rc(this, 2.0f, 5.0f);
        this.f45303n0 = new Rect();
        this.f45304o0 = new RectF();
        this.f45305p0 = new RectF();
        this.f45306q0 = new Path();
        this.f45315w0 = true;
        this.G0 = new RectF();
        this.f45285a = i10;
        paint.setColor(-433575896);
        paint.setPathEffect(new CornerPathEffect(this.v));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, false, false);
        this.E = j6Var;
        j6Var.k(0.4f, 320L, prVar);
        j6Var.setCallback(this);
        u(14.0f);
        j6Var.r(-1);
        textPaint.setColor(-1);
    }

    public static int a(CharSequence charSequence, TextPaint textPaint) {
        if (TextUtils.indexOf(charSequence, '\n') >= 0) {
            return Integer.MAX_VALUE;
        }
        int length = charSequence.length() / 2;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = -1;
        while (i10 < 10) {
            while (length > 0 && length < charSequence.length() && charSequence.charAt(length) != ' ') {
                length += i11;
            }
            f11 = g(charSequence.subSequence(0, length), textPaint);
            f12 = g(AndroidUtilities.getTrimmedString(charSequence.subSequence(length, charSequence.length())), textPaint);
            if (f11 != f10 || f12 != f13) {
                if (f11 < f12) {
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
                f10 = f11;
                f13 = f12;
            } else {
                break;
            }
        }
        return (int) Math.ceil(Math.max(f11, f12));
    }

    public static java.lang.CharSequence b(java.lang.CharSequence r12, android.text.TextPaint r13) {
        throw new UnsupportedOperationException("Method not decompiled: qh.f3.b(java.lang.CharSequence, android.text.TextPaint):java.lang.CharSequence");
    }

    public static float g(CharSequence charSequence, TextPaint textPaint) {
        float f10 = 0.0f;
        if (charSequence == null) {
            return 0.0f;
        }
        if (!(charSequence instanceof Spanned)) {
            return textPaint.measureText(charSequence.toString());
        }
        Spanned spanned = (Spanned) charSequence;
        g51[] g51VarArr = (g51[]) spanned.getSpans(0, charSequence.length(), g51.class);
        ReplacementSpan[] replacementSpanArr = (ReplacementSpan[]) spanned.getSpans(0, charSequence.length(), ReplacementSpan.class);
        int i10 = 0;
        int i11 = 0;
        while (i10 < replacementSpanArr.length) {
            ReplacementSpan replacementSpan = replacementSpanArr[i10];
            int spanStart = spanned.getSpanStart(replacementSpan);
            int spanEnd = spanned.getSpanEnd(replacementSpan);
            CharSequence charSequence2 = charSequence;
            TextPaint textPaint2 = textPaint;
            i11 = (int) (Math.max(0.0f, replacementSpan.getSize(textPaint2, charSequence2, spanStart, spanEnd, textPaint.getFontMetricsInt()) - textPaint2.measureText(spanned, spanStart, spanEnd)) + i11);
            i10++;
            textPaint = textPaint2;
            charSequence = charSequence2;
        }
        CharSequence charSequence3 = charSequence;
        TextPaint textPaint3 = textPaint;
        if (g51VarArr != null && g51VarArr.length != 0) {
            int i12 = 0;
            for (int i13 = 0; i13 < g51VarArr.length; i13++) {
                int spanStart2 = spanned.getSpanStart(g51VarArr[i13]);
                int spanEnd2 = spanned.getSpanEnd(g51VarArr[i13]);
                int max = Math.max(i12, spanStart2);
                if (max - i12 > 0) {
                    f10 += textPaint3.measureText(spanned, i12, max);
                }
                i12 = Math.max(max, spanEnd2);
                if (i12 - max > 0) {
                    Typeface typeface = textPaint3.getTypeface();
                    textPaint3.setTypeface(g51VarArr[i13].f27114a);
                    textPaint3.setTypeface(typeface);
                    f10 = textPaint3.measureText(spanned, max, i12) + f10;
                }
            }
            int max2 = Math.max(i12, charSequence3.length());
            if (max2 - i12 > 0) {
                f10 += textPaint3.measureText(spanned, i12, max2);
            }
            return f10 + i11;
        }
        return textPaint3.measureText(charSequence3.toString()) + i11;
    }

    private int getTextMaxWidth() {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        RectF rectF = this.f45314w;
        int i10 = measuredWidth - ((int) (rectF.left + rectF.right));
        int i11 = this.h;
        if (i11 > 0) {
            i10 = Math.min(i11, i10);
        }
        return Math.max(0, i10);
    }

    public void c(Canvas canvas, float f10) {
        int i10 = this.f45297h0;
        Paint paint = this.C;
        if (i10 != 0) {
            paint.setShadowLayer(this.f45295f0, 0.0f, this.f45296g0, org.telegram.ui.ActionBar.k6.l1(f10, i10));
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (alpha * f10));
        Path path = this.f45306q0;
        canvas.drawPath(path, paint);
        paint.setAlpha(alpha);
        if (this.f45317x0) {
            int dp = AndroidUtilities.dp(64.0f);
            this.D0.reset();
            this.D0.postTranslate(this.f45304o0.left + (((this.f45311t0 * 4.0f) + (dp * 2)) * (((float) ((System.currentTimeMillis() - this.F0) % 4000)) / 4000.0f)) + (-dp), 0.0f);
            this.C0.setLocalMatrix(this.D0);
            this.E0.setLocalMatrix(this.D0);
            canvas.drawPath(path, this.A0);
            canvas.drawPath(this.f45319y0, this.B0);
            invalidate();
        }
    }

    public final void d(Path path, float f10, float f11, float f12, RectF rectF, Rect rect) {
        float f13;
        float f14 = f10 / 2.0f;
        float f15 = f11 / 2.0f;
        float min = Math.min(this.v, Math.min(f14, f15));
        int i10 = this.f45285a;
        if (i10 != 1 && i10 != 3) {
            float clamp = Utilities.clamp(AndroidUtilities.lerp(getPaddingTop(), getMeasuredHeight() - getPaddingBottom(), this.f45287b) + this.f45289c, getMeasuredHeight() - getPaddingBottom(), getPaddingTop());
            float min2 = Math.min(Math.max(getPaddingTop(), clamp - f15) + f11, getMeasuredHeight() - getPaddingBottom());
            float f16 = min2 - f11;
            float f17 = this.f45318y;
            f13 = Utilities.clamp(clamp, (min2 - min) - f17, f16 + min + f17);
            if (this.f45285a == 0) {
                rectF.set(getPaddingLeft() + this.B, f16, getPaddingLeft() + this.B + f10, min2);
            } else {
                rectF.set(((getMeasuredWidth() - getPaddingRight()) - this.B) - f10, f16, (getMeasuredWidth() - getPaddingRight()) - this.B, min2);
            }
        } else {
            float clamp2 = Utilities.clamp(AndroidUtilities.lerp(getPaddingLeft(), getMeasuredWidth() - getPaddingRight(), this.f45287b) + this.f45289c, getMeasuredWidth() - getPaddingRight(), getPaddingLeft());
            float min3 = Math.min(Math.max(getPaddingLeft(), clamp2 - f14) + f10, getMeasuredWidth() - getPaddingRight());
            float f18 = min3 - f10;
            float f19 = this.f45318y;
            float clamp3 = Utilities.clamp(clamp2, (min3 - min) - f19, f18 + min + f19);
            if (this.f45285a == 1) {
                rectF.set(f18, getPaddingTop() + this.B, min3, getPaddingTop() + this.B + f11);
            } else {
                rectF.set(f18, ((getMeasuredHeight() - this.B) - getPaddingBottom()) - f11, min3, (getMeasuredHeight() - this.B) - getPaddingBottom());
            }
            f13 = clamp3;
        }
        float f20 = -f12;
        rectF.inset(f20, f20);
        if (rect != null) {
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        path.rewind();
        boolean z4 = this.f45309s;
        RectF rectF2 = this.G0;
        if (z4) {
            path.moveTo(rectF.left, rectF.bottom);
        } else {
            float f21 = rectF.left;
            float f22 = rectF.bottom;
            float f23 = min * 2.0f;
            rectF2.set(f21, f22 - f23, f23 + f21, f22);
            path.arcTo(rectF2, 90.0f, 90.0f);
        }
        if (this.f45285a == 0) {
            path.lineTo(rectF.left, this.f45318y + f13 + AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.left, this.f45318y + f13);
            path.lineTo(rectF.left - this.B, AndroidUtilities.dp(1.0f) + f13);
            float f24 = rectF.left - this.B;
            this.f45308r0 = f24;
            this.f45310s0 = f13;
            path.lineTo(f24, f13 - AndroidUtilities.dp(1.0f));
            path.lineTo(rectF.left, f13 - this.f45318y);
            path.lineTo(rectF.left, (f13 - this.f45318y) - AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.left = (int) (rect.left - this.B);
            }
        }
        if (this.f45309s) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            float f25 = rectF.left;
            float f26 = rectF.top;
            float f27 = min * 2.0f;
            rectF2.set(f25, f26, f25 + f27, f27 + f26);
            path.arcTo(rectF2, 180.0f, 90.0f);
        }
        if (this.f45285a == 1) {
            path.lineTo((f13 - this.f45318y) - AndroidUtilities.dp(2.0f), rectF.top);
            path.lineTo(f13 - this.f45318y, rectF.top);
            path.lineTo(f13 - AndroidUtilities.dp(1.0f), rectF.top - this.B);
            this.f45308r0 = f13;
            this.f45310s0 = rectF.top - this.B;
            path.lineTo(AndroidUtilities.dp(1.0f) + f13, rectF.top - this.B);
            path.lineTo(this.f45318y + f13, rectF.top);
            path.lineTo(this.f45318y + f13 + AndroidUtilities.dp(2.0f), rectF.top);
            if (rect != null) {
                rect.top = (int) (rect.top - this.B);
            }
        }
        if (this.f45309s) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            float f28 = rectF.right;
            float f29 = min * 2.0f;
            float f30 = rectF.top;
            rectF2.set(f28 - f29, f30, f28, f29 + f30);
            path.arcTo(rectF2, 270.0f, 90.0f);
        }
        if (this.f45285a == 2) {
            path.lineTo(rectF.right, (f13 - this.f45318y) - AndroidUtilities.dp(2.0f));
            path.lineTo(rectF.right, f13 - this.f45318y);
            path.lineTo(rectF.right + this.B, f13 - AndroidUtilities.dp(1.0f));
            float f31 = rectF.right + this.B;
            this.f45308r0 = f31;
            this.f45310s0 = f13;
            path.lineTo(f31, AndroidUtilities.dp(1.0f) + f13);
            path.lineTo(rectF.right, this.f45318y + f13);
            path.lineTo(rectF.right, this.f45318y + f13 + AndroidUtilities.dp(2.0f));
            if (rect != null) {
                rect.right = (int) (rect.right + this.B);
            }
        }
        if (this.f45309s) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            float f32 = rectF.right;
            float f33 = min * 2.0f;
            float f34 = rectF.bottom;
            rectF2.set(f32 - f33, f34 - f33, f32, f34);
            path.arcTo(rectF2, 0.0f, 90.0f);
        }
        if (this.f45285a == 3) {
            path.lineTo(this.f45318y + f13 + AndroidUtilities.dp(2.0f), rectF.bottom);
            path.lineTo(this.f45318y + f13, rectF.bottom);
            path.lineTo(AndroidUtilities.dp(1.0f) + f13, rectF.bottom + this.B);
            this.f45308r0 = f13;
            this.f45310s0 = rectF.bottom + this.B;
            path.lineTo(f13 - AndroidUtilities.dp(1.0f), rectF.bottom + this.B);
            path.lineTo(f13 - this.f45318y, rectF.bottom);
            path.lineTo((f13 - this.f45318y) - AndroidUtilities.dp(2.0f), rectF.bottom);
            if (rect != null) {
                rect.bottom = (int) (rect.bottom + this.B);
            }
        }
        path.close();
        this.f45313v0 = true;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z4;
        float d;
        float f10;
        RectF rectF;
        float f11;
        float f12;
        float f13;
        f3 f3Var;
        float f14;
        Canvas canvas2;
        int paddingTop;
        int paddingRight;
        if (!this.F || this.I != null) {
            if (this.S && !this.f45315w0) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e6 = this.T.e(z4);
            if (this.f45315w0) {
                this.f45315w0 = false;
                invalidate();
            }
            if (e6 <= 0.0f) {
                return;
            }
            boolean z10 = this.F;
            org.telegram.ui.Components.j6 j6Var = this.E;
            if (z10) {
                d = this.L;
            } else {
                d = j6Var.d();
            }
            if (this.F) {
                f10 = this.M;
            } else {
                f10 = j6Var.f28031e;
            }
            if (this.f45307r) {
                if (this.f45302n == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                    this.f45302n = mutate;
                    mutate.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                d += this.f45316x + this.f45302n.getIntrinsicWidth();
                f10 = Math.max(this.f45302n.getIntrinsicHeight(), f10);
            }
            if (this.W != null) {
                d += this.f45290c0 + this.f45288b0;
                f10 = Math.max(this.f45291d0, f10);
            }
            float f15 = d;
            RectF rectF2 = this.f45314w;
            float f16 = rectF2.left + f15 + rectF2.right;
            float f17 = rectF2.top + f10 + rectF2.bottom;
            boolean z11 = this.f45313v0;
            RectF rectF3 = this.f45304o0;
            if (z11 && Math.abs(f16 - this.f45311t0) <= 0.1f && Math.abs(f17 - this.f45312u0) <= 0.1f) {
                rectF = rectF3;
            } else {
                this.f45311t0 = f16;
                this.f45312u0 = f17;
                d(this.f45306q0, f16, f17, 0.0f, rectF3, this.f45303n0);
                rectF = rectF3;
                if (this.f45317x0) {
                    d(this.f45319y0, f16, f17, this.f45320z0, this.f45305p0, null);
                }
            }
            if (this.f45294f) {
                f11 = e6;
            } else {
                f11 = 1.0f;
            }
            canvas.save();
            if (e6 < 1.0f && this.f45292e) {
                float lerp = AndroidUtilities.lerp(0.75f, 1.0f, e6);
                canvas.scale(lerp, lerp, this.f45308r0, this.f45310s0);
            }
            float a2 = this.m0.a(0.025f);
            if (a2 != 1.0f) {
                canvas.scale(a2, a2, this.f45308r0, this.f45310s0);
            }
            if (this.f45301l0 != 1.0f) {
                int i10 = this.f45285a;
                int i11 = -1;
                if (i10 != 3 && i10 != 1) {
                    if (i10 == 0) {
                        paddingRight = getPaddingLeft();
                    } else {
                        paddingRight = getPaddingRight();
                    }
                    float max = (this.f45301l0 - 1.0f) * Math.max(paddingRight, AndroidUtilities.dp(24.0f));
                    if (this.f45285a != 0) {
                        i11 = 1;
                    }
                    canvas.translate(max * i11, 0.0f);
                } else {
                    if (i10 == 3) {
                        paddingTop = getPaddingBottom();
                    } else {
                        paddingTop = getPaddingTop();
                    }
                    float max2 = (this.f45301l0 - 1.0f) * Math.max(paddingTop, AndroidUtilities.dp(24.0f));
                    if (this.f45285a != 1) {
                        i11 = 1;
                    }
                    canvas.translate(0.0f, max2 * i11);
                }
            }
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(rectF);
            float f18 = -this.B;
            rectF4.inset(f18, f18);
            c(canvas, f11);
            org.telegram.ui.Cells.z zVar = this.U;
            if (zVar != null) {
                zVar.setAlpha((int) (f11 * 255.0f));
                this.U.setBounds(this.f45303n0);
                this.U.draw(canvas);
            }
            float f19 = ((rectF.top + rectF2.top) + (rectF.bottom - rectF2.bottom)) / 2.0f;
            ij0 ij0Var = this.W;
            if (ij0Var != null) {
                if (this.f45293e0) {
                    float f20 = (rectF2.left / 2.0f) + rectF.left + 0.0f;
                    float f21 = this.f45286a0 + f19;
                    f12 = 255.0f;
                    float f22 = this.f45291d0 / 2.0f;
                    ij0Var.setBounds((int) f20, (int) (f21 - f22), (int) (f20 + this.f45290c0), (int) (f22 + f21));
                    f13 = this.f45290c0 + this.f45288b0 + 0.0f;
                } else {
                    f12 = 255.0f;
                    float f23 = (0.0f + rectF.right) - (rectF2.right / 2.0f);
                    float f24 = this.f45286a0 + f19;
                    float f25 = this.f45291d0 / 2.0f;
                    ij0Var.setBounds((int) (f23 - this.f45290c0), (int) (f24 - f25), (int) f23, (int) (f25 + f24));
                    f13 = 0.0f;
                }
                this.W.setAlpha((int) (f11 * f12));
                this.W.draw(canvas);
            } else {
                f12 = 255.0f;
                f13 = 0.0f;
            }
            if (this.F) {
                f14 = f11;
                f3Var = this;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), Math.max(getHeight(), f17), (int) (f11 * f12), 31);
                float f26 = ((f13 + rectF.left) + rectF2.left) - f3Var.K;
                f3Var.O = f26;
                float f27 = f19 - (f3Var.M / 2.0f);
                f3Var.P = f27;
                canvas2.translate(f26, f27);
                if (f3Var.N.f(canvas2)) {
                    f3Var.invalidate();
                }
                f3Var.I.draw(canvas2);
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas2, f3Var.I, f3Var.J, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
                canvas2.restore();
            } else {
                f3Var = this;
                f14 = f11;
                canvas2 = canvas;
                CharSequence charSequence = f3Var.D;
                if (charSequence != null) {
                    j6Var.q(charSequence, f3Var.S, true);
                    f3Var.D = null;
                }
                float f28 = rectF.left;
                float f29 = rectF2.left;
                float f30 = f3Var.M / 2.0f;
                j6Var.setBounds((int) (f13 + f28 + f29), (int) (f19 - f30), (int) (f28 + f29 + f15), (int) (f30 + f19));
                j6Var.f28047w = (int) (f14 * f12);
                j6Var.draw(canvas2);
            }
            if (f3Var.f45307r) {
                if (f3Var.f45302n == null) {
                    Drawable mutate2 = f3Var.getContext().getResources().getDrawable(R.drawable.msg_mini_close_tooltip).mutate();
                    f3Var.f45302n = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(2113929215, PorterDuff.Mode.MULTIPLY));
                }
                f3Var.f45302n.setAlpha((int) (f14 * f12));
                Drawable drawable = f3Var.f45302n;
                drawable.setBounds((int) ((rectF.right - (rectF2.right * 0.66f)) - drawable.getIntrinsicWidth()), (int) (rectF.centerY() - (f3Var.f45302n.getIntrinsicHeight() / 2.0f)), (int) (rectF.right - (rectF2.right * 0.66f)), (int) ((f3Var.f45302n.getIntrinsicHeight() / 2.0f) + rectF.centerY()));
                f3Var.f45302n.draw(canvas2);
            }
            canvas2.restore();
        }
    }

    public final void e(boolean z4) {
        AndroidUtilities.cancelRunOnUIThread(this.f45299j0);
        Runnable runnable = this.f45298i0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.S = false;
        org.telegram.ui.Components.z5 z5Var = this.T;
        if (!z4) {
            z5Var.getClass();
            z5Var.d(0.0f, false);
        }
        invalidate();
        Runnable runnable2 = this.f45298i0;
        if (runnable2 != null) {
            AndroidUtilities.runOnUIThread(runnable2, z5Var.f33725c * ((float) z5Var.f33728g));
        }
        this.N.d(true);
    }

    public final void f(int i10, CharSequence charSequence) {
        this.I = new StaticLayout(charSequence, this.G, i10, this.H, 1.0f, 0.0f, false);
        float f10 = i10;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < this.I.getLineCount(); i11++) {
            f10 = Math.min(f10, this.I.getLineLeft(i11));
            f11 = Math.max(f11, this.I.getLineRight(i11));
        }
        this.L = Math.max(0.0f, f11 - f10);
        this.M = this.I.getHeight();
        this.K = f10;
        this.J = org.telegram.ui.Components.u5.update(0, this, this.J, this.I);
    }

    public CharSequence getText() {
        CharSequence charSequence = this.D;
        if (charSequence != null) {
            return charSequence;
        }
        if (!this.F) {
            return this.E.f28033g;
        }
        StaticLayout staticLayout = this.I;
        if (staticLayout != null) {
            return staticLayout.getText();
        }
        return null;
    }

    public TextPaint getTextPaint() {
        if (this.F) {
            return this.G;
        }
        return this.E.f28028a;
    }

    public final void h(int i10) {
        Paint paint = this.C;
        if (paint.getColor() != i10) {
            paint.setColor(i10);
            invalidate();
        }
    }

    public final void i() {
        this.f45307r = true;
        if (!this.F) {
            float f10 = 11.0f;
            float dp = AndroidUtilities.dp(11.0f);
            float dp2 = AndroidUtilities.dp(6.0f);
            if (this.f45307r) {
                f10 = 15.0f;
            }
            this.f45314w.set(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(7.0f));
        }
    }

    public final void j(int i10) {
        ij0 ij0Var = new ij0(i10, AndroidUtilities.dp(34.0f), l.d.j(i10, ""), AndroidUtilities.dp(34.0f));
        ij0Var.start();
        k(ij0Var);
    }

    public final void k(ij0 ij0Var) {
        ij0 ij0Var2 = this.W;
        if (ij0Var2 != null) {
            ij0Var2.setCallback(null);
        }
        this.W = ij0Var;
        ij0Var.setCallback(this);
        ij0 ij0Var3 = this.W;
        if (e2.c.s(ij0Var3)) {
            this.d = Math.max(this.d, ij0Var3.p());
        }
        ij0 ij0Var4 = this.W;
        this.f45290c0 = ij0Var4.f27812b;
        this.f45291d0 = ij0Var4.f27814c;
        this.f45293e0 = true;
    }

    public final void l(float f10, float f11, float f12, float f13) {
        this.f45314w.set(AndroidUtilities.dpf2(f10), AndroidUtilities.dpf2(f11), AndroidUtilities.dpf2(f12), AndroidUtilities.dpf2(f13));
    }

    public final void m(float f10, float f11) {
        if (Math.abs(this.f45287b - f10) >= 1.0f || Math.abs(this.f45289c - AndroidUtilities.dp(f11)) >= 1.0f) {
            this.f45313v0 = false;
            invalidate();
        }
        this.f45287b = f10;
        this.f45289c = AndroidUtilities.dp(f11);
    }

    public final void n(float f10, float f11) {
        if (Math.abs(this.f45287b - f10) >= 1.0f || Math.abs(this.f45289c - f11) >= 1.0f) {
            this.f45313v0 = false;
            invalidate();
        }
        this.f45287b = f10;
        this.f45289c = f11;
    }

    public final void o() {
        this.h = AndroidUtilities.dp(165.0f);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.u5.release(this, this.J);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        this.f45313v0 = false;
        int textMaxWidth = getTextMaxWidth();
        org.telegram.ui.Components.j6 j6Var = this.E;
        j6Var.G = textMaxWidth;
        if (this.F) {
            CharSequence charSequence = this.D;
            if (charSequence == null) {
                StaticLayout staticLayout = this.I;
                if (staticLayout != null) {
                    charSequence = staticLayout.getText();
                } else {
                    return;
                }
            }
            StaticLayout staticLayout2 = this.I;
            if (staticLayout2 == null || staticLayout2.getWidth() != textMaxWidth) {
                f(textMaxWidth, charSequence);
            }
        } else {
            CharSequence charSequence2 = this.D;
            if (charSequence2 != null) {
                j6Var.q(charSequence2, false, true);
            }
        }
        this.D = null;
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: qh.f3.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i10) {
        this.h = i10;
    }

    public final void q(boolean z4) {
        this.F = z4;
        RectF rectF = this.f45314w;
        float f10 = 15.0f;
        if (z4) {
            rectF.set(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(8.0f));
            this.f45316x = AndroidUtilities.dp(6.0f);
            return;
        }
        float dp = AndroidUtilities.dp(11.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        if (!this.f45307r) {
            f10 = 11.0f;
        }
        rectF.set(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(7.0f));
        this.f45316x = AndroidUtilities.dp(2.0f);
    }

    public final void r(float f10) {
        CornerPathEffect cornerPathEffect;
        this.v = AndroidUtilities.dp(f10);
        CornerPathEffect cornerPathEffect2 = null;
        if (this.f45309s) {
            cornerPathEffect = new CornerPathEffect(this.v);
        } else {
            cornerPathEffect = null;
        }
        this.C.setPathEffect(cornerPathEffect);
        Paint paint = this.V;
        if (paint != null) {
            if (this.f45309s) {
                cornerPathEffect2 = new CornerPathEffect(this.v);
            }
            paint.setPathEffect(cornerPathEffect2);
        }
    }

    public final void s() {
        this.f45309s = false;
        this.C.setPathEffect(null);
    }

    public final void t(CharSequence charSequence) {
        if (getMeasuredWidth() < 0) {
            this.D = charSequence;
        } else if (!this.F) {
            this.E.q(charSequence, false, true);
        } else {
            f(getTextMaxWidth(), charSequence);
        }
    }

    public final void u(float f10) {
        this.E.t(AndroidUtilities.dpf2(f10));
        this.G.setTextSize(AndroidUtilities.dpf2(f10));
    }

    public final void v() {
        if (this.S && this.R) {
            ValueAnimator valueAnimator = this.f45300k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f45300k0 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f45300k0 = ofFloat;
            ofFloat.addUpdateListener(new oh.f5(this, 16));
            this.f45300k0.addListener(new j2(this, 1));
            this.f45300k0.setInterpolator(pr.f30187k);
            this.f45300k0.setDuration(300L);
            this.f45300k0.start();
        }
        AndroidUtilities.makeAccessibilityAnnouncement(getText());
        this.S = true;
        invalidate();
        gl0 gl0Var = this.f45299j0;
        AndroidUtilities.cancelRunOnUIThread(gl0Var);
        long j10 = this.d;
        if (j10 > 0) {
            AndroidUtilities.runOnUIThread(gl0Var, j10);
        }
        Runnable runnable = this.f45298i0;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && drawable != this.U && drawable != this.W && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
