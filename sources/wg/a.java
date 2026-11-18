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
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
public final class a extends ReplacementSpan {
    public final Drawable f59690a;
    public final Drawable f59691b;
    public boolean f59692c;
    public boolean d;
    public final m6 f59693e;
    public final TextPaint f59694f;
    public final int h;

    public a(q1 q1Var, TextPaint textPaint, int i7) {
        this.f59694f = textPaint;
        m6 m6Var = new m6(false, false, true);
        this.f59693e = m6Var;
        m6Var.n(0.3f, 250L, lr.h);
        m6Var.setCallback(q1Var);
        m6Var.w(org.telegram.messenger.g0.L(11.5f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.t("", true, true);
        m6Var.f37377b = 17;
        Drawable mutate = q1Var.getContext().getDrawable(2131231931).mutate();
        this.f59690a = mutate;
        Drawable mutate2 = q1Var.getContext().getDrawable(2131231932).mutate();
        this.f59691b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i7;
        m6Var.t(i7 > 1 ? String.valueOf(i7) : "", false, true);
    }

    public static Pair a(q1 q1Var, TextPaint textPaint, int i7) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(q1Var, textPaint, i7);
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
        return (int) (this.f59693e.e() + org.telegram.messenger.g0.L(i7 + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        TextPaint textPaint = this.f59694f;
        int color = textPaint.getColor();
        m6 m6Var = this.f59693e;
        int color2 = m6Var.f37375a.getColor();
        Drawable drawable = this.f59691b;
        Drawable drawable2 = this.f59690a;
        if (color != color2) {
            m6Var.u(textPaint.getColor());
            int color3 = m6Var.f37375a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(m6Var.f37375a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f59692c) {
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
        rect.set(0, 0, (int) m6Var.c(), (int) m6Var.f37381e);
        m6Var.setBounds(rect);
        m6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
