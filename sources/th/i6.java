package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ui;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ov0;
public final class i6 extends View implements s9 {
    public final boolean D;
    public int E;
    public int F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public final j6 J;
    public final PorterDuffColorFilter f49068a;
    public boolean f49069b;
    public final TextPaint f49070c;
    public final TextPaint d;
    public final Paint e;
    public final Paint f49071f;
    public float h;
    public float f49072n;
    public final h6[] f49073r;
    public int f49074s;
    public StaticLayout f49075w;
    public float f49076x;
    public boolean f49077y;

    public i6(j6 j6Var, Context context) {
        super(context);
        this.J = j6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f49070c = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.d = textPaint2;
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f49071f = paint2;
        this.f49073r = r7;
        this.f49074s = 0;
        new Path();
        this.D = true;
        this.H = false;
        h6[] h6VarArr = {new h6(this), null};
        textPaint.setColor(-1);
        textPaint.linkColor = -1;
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint2.setColor(-1);
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setTextSize(org.telegram.messenger.i0.L(16.0f));
        paint.setColor(-16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(16.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f49068a = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    public static StaticLayout a(i6 i6Var, TextPaint textPaint, CharSequence charSequence, int i10) {
        Layout.Alignment alignment;
        if (Build.VERSION.SDK_INT >= 24) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setBreakStrategy(0).setHyphenationFrequency(0);
            if (cd.X) {
                alignment = ov0.a();
            } else {
                Layout.Alignment[] alignmentArr = ov0.f29202a;
                if (alignmentArr.length >= 5) {
                    alignment = alignmentArr[3];
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            return hyphenationFrequency.setAlignment(alignment).build();
        }
        return new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void b(CharSequence charSequence, e6 e6Var, e6 e6Var2, boolean z10, boolean z11) {
        boolean z12;
        if (charSequence == null) {
            charSequence = "";
        }
        h6[] h6VarArr = this.f49073r;
        CharSequence charSequence2 = h6VarArr[0].f49041n;
        Pattern pattern = ui.R1;
        if (charSequence2 == null || !TextUtils.equals(charSequence2, charSequence)) {
            z12 = false;
        } else {
            z12 = ui.K(ui.b0(d20.f15147s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence2)}, true, true), ui.b0(d20.f15147s0).W(new CharSequence[]{new SpannableStringBuilder(charSequence)}, true, true));
        }
        if (z12) {
            h6 h6Var = h6VarArr[0];
            if (h6Var.f49042o == e6Var && h6Var.f49043p == e6Var2) {
                h6Var.f49044q = z10;
                invalidate();
                return;
            }
        }
        this.f49077y = false;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = false;
        if (z11) {
            if (h6VarArr[1] == null) {
                h6VarArr[1] = new h6(this);
            }
            h6 h6Var2 = h6VarArr[1];
            h6 h6Var3 = h6VarArr[0];
            h6Var2.g(h6Var3.f49041n, h6Var3.f49042o, h6Var3.f49043p);
            h6 h6Var4 = h6VarArr[1];
            h6 h6Var5 = h6VarArr[0];
            h6Var4.f49044q = h6Var5.f49044q;
            h6Var4.f49045r.e(true, h6Var5.f49045r.f30445c);
            h6VarArr[0].g(charSequence, e6Var, e6Var2);
            h6 h6Var6 = h6VarArr[0];
            h6Var6.f49044q = z10;
            h6Var6.f49045r.e(true, 0.0f);
            this.G = 1.0f;
            ValueAnimator valueAnimator2 = this.I;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.H = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new qh.e0(this, 22));
            this.I.addListener(new sg.r(this, 12));
            this.I.setDuration(180L);
            this.I.setInterpolator(gr.f26496g);
            this.I.start();
            return;
        }
        h6VarArr[0].g(charSequence, e6Var, e6Var2);
        h6VarArr[0].f49044q = z10;
        invalidate();
        this.G = 0.0f;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: th.i6.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public float getAnimatedHeight() {
        int i10 = this.F * 2;
        h6[] h6VarArr = this.f49073r;
        int i11 = 0;
        int i12 = h6VarArr[0].f49039l;
        h6 h6Var = h6VarArr[1];
        if (h6Var != null) {
            i11 = h6Var.f49039l;
        }
        return org.telegram.messenger.i0.W1(this.G, i12, i11) + i10;
    }

    public Paint getPaint() {
        return this.f49070c;
    }

    @Override
    public Layout getStaticTextLayout() {
        return this.f49073r[0].e;
    }

    @Override
    public CharSequence getText() {
        return this.f49073r[0].f49041n;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        h6 h6Var = this.f49073r[0];
        i6 i6Var = h6Var.v;
        org.telegram.ui.Components.o5.release(i6Var, h6Var.d);
        org.telegram.ui.Components.o5.release(i6Var, h6Var.f49034f);
        if (h6Var.h == null) {
            return;
        }
        while (true) {
            f6[] f6VarArr = h6Var.h;
            if (i10 < f6VarArr.length) {
                f6 f6Var = f6VarArr[i10];
                if (f6Var != null) {
                    org.telegram.ui.Components.o5.release(i6Var, f6Var.f48973a);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.f49075w != null) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        h6[] h6VarArr = this.f49073r;
        h6VarArr[0].b(canvas2, 1.0f - this.G);
        h6 h6Var = h6VarArr[1];
        if (h6Var != null) {
            h6Var.b(canvas2, this.G);
        }
        if (this.f49075w != null) {
            float scrollY = this.h + this.J.getScrollY();
            int i10 = (int) ((1.0f - Utilities.i(this.f49076x / 0.5f, 1.0f, 0.0f)) * 255.0f);
            Paint paint = this.f49071f;
            paint.setAlpha(i10);
            Paint paint2 = this.e;
            paint2.setAlpha(i10);
            this.d.setAlpha(i10);
            canvas2.save();
            canvas2.translate(this.f49072n - org.telegram.messenger.i0.L(32.0f), scrollY);
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.i0.L(32.0f), this.f49075w.getHeight() + this.F, paint);
            canvas2.restore();
            canvas2.drawRect(this.f49072n - org.telegram.messenger.i0.L(16.0f), scrollY, getMeasuredWidth(), this.f49075w.getHeight() + scrollY + this.F, paint2);
            canvas2.save();
            canvas2.translate(this.f49072n, scrollY);
            this.f49075w.draw(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = (i11 + i10) << 16;
        this.E = org.telegram.messenger.i0.L(16.0f);
        this.F = org.telegram.messenger.i0.L(8.0f);
        int i13 = this.f49074s;
        h6[] h6VarArr = this.f49073r;
        int i14 = 0;
        if (i13 != i12) {
            this.f49074s = i12;
            int max = Math.max(0, View.MeasureSpec.getSize(i10) - (this.E * 2));
            h6VarArr[0].e(max);
            h6 h6Var = h6VarArr[1];
            if (h6Var != null) {
                h6Var.e(max);
            }
        }
        int i15 = this.F * 2;
        int i16 = h6VarArr[0].f49039l;
        h6 h6Var2 = h6VarArr[1];
        if (h6Var2 != null) {
            i14 = h6Var2.f49039l;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.W1(this.G, i16, i14) + i15, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: th.i6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setPressed(boolean z10) {
        boolean z11;
        if (z10 != isPressed()) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.setPressed(z10);
        if (z11) {
            invalidate();
        }
    }

    @Override
    public void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.J.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        h6 h6Var;
        e6 e6Var;
        e6 e6Var2;
        e6 e6Var3;
        e6 e6Var4;
        h6[] h6VarArr = this.f49073r;
        h6 h6Var2 = h6VarArr[0];
        if ((h6Var2 != null && (h6Var2.f49046s == drawable || (((e6Var3 = h6Var2.f49042o) != null && e6Var3.f48933j == drawable) || ((e6Var4 = h6Var2.f49043p) != null && e6Var4.f48933j == drawable)))) || ((h6Var = h6VarArr[1]) != null && (h6Var.f49046s == drawable || (((e6Var = h6Var.f49042o) != null && e6Var.f48933j == drawable) || ((e6Var2 = h6Var.f49043p) != null && e6Var2.f48933j == drawable))))) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }
}
