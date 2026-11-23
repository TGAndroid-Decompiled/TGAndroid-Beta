package wg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.Pair;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m6;
public final class a extends ReplacementSpan {
    public final Drawable f59819a;
    public final Drawable f59820b;
    public boolean f59821c;
    public boolean d;
    public final m6 f59822e;
    public final TextPaint f59823f;
    public final int h;

    public a(r1 r1Var, TextPaint textPaint, int i7) {
        this.f59823f = textPaint;
        m6 m6Var = new m6(false, false, true);
        this.f59822e = m6Var;
        m6Var.n(0.3f, 250L, kr.h);
        m6Var.setCallback(r1Var);
        m6Var.w(org.telegram.messenger.g0.L(11.5f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.t("", true, true);
        m6Var.f37394b = 17;
        Drawable mutate = r1Var.getContext().getDrawable(2131231934).mutate();
        this.f59819a = mutate;
        Drawable mutate2 = r1Var.getContext().getDrawable(2131231935).mutate();
        this.f59820b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i7;
        m6Var.t(i7 > 1 ? String.valueOf(i7) : "", false, true);
    }

    public static Pair a(r1 r1Var, TextPaint textPaint, int i7) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(r1Var, textPaint, i7);
        spannableString.setSpan(aVar, 0, 1, 33);
        return new Pair(spannableString, aVar);
    }

    public final int b() {
        int i7;
        if (this.d) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        return (int) (this.f59822e.e() + org.telegram.messenger.g0.L(i7 + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        TextPaint textPaint = this.f59823f;
        int color = textPaint.getColor();
        m6 m6Var = this.f59822e;
        int color2 = m6Var.f37392a.getColor();
        Drawable drawable = this.f59820b;
        Drawable drawable2 = this.f59819a;
        if (color != color2) {
            m6Var.u(textPaint.getColor());
            int color3 = m6Var.f37392a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(m6Var.f37392a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f59821c) {
            i14 = org.telegram.messenger.g0.L(8.0f);
        } else {
            i14 = 0;
        }
        canvas.translate(f10 + i14, -org.telegram.messenger.g0.L(0.2f));
        if (this.h == 1) {
            canvas.translate(org.telegram.messenger.g0.L(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(org.telegram.messenger.g0.L(16.0f), 0.0f);
        Rect rect = org.telegram.messenger.g0.Q;
        rect.set(0, 0, (int) m6Var.c(), (int) m6Var.f37398e);
        m6Var.setBounds(rect);
        m6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
