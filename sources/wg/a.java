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
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.wq;
public final class a extends ReplacementSpan {
    public final Drawable f57684a;
    public final Drawable f57685b;
    public boolean f57686c;
    public boolean d;
    public final h6 f57687e;
    public final TextPaint f57688f;
    public final int h;

    public a(q1 q1Var, TextPaint textPaint, int i7) {
        this.f57688f = textPaint;
        h6 h6Var = new h6(false, false, true);
        this.f57687e = h6Var;
        h6Var.n(0.3f, 250L, wq.h);
        h6Var.setCallback(q1Var);
        h6Var.w(org.telegram.messenger.g0.L(11.5f));
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.t("", true, true);
        h6Var.f34187b = 17;
        Drawable mutate = q1Var.getContext().getDrawable(2131231930).mutate();
        this.f57684a = mutate;
        Drawable mutate2 = q1Var.getContext().getDrawable(2131231931).mutate();
        this.f57685b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i7;
        h6Var.t(i7 > 1 ? String.valueOf(i7) : "", false, true);
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
        return (int) (this.f57687e.e() + org.telegram.messenger.g0.L(i7 + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        TextPaint textPaint = this.f57688f;
        int color = textPaint.getColor();
        h6 h6Var = this.f57687e;
        int color2 = h6Var.f34185a.getColor();
        Drawable drawable = this.f57685b;
        Drawable drawable2 = this.f57684a;
        if (color != color2) {
            h6Var.u(textPaint.getColor());
            int color3 = h6Var.f34185a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(h6Var.f34185a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f57686c) {
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
        rect.set(0, 0, (int) h6Var.c(), (int) h6Var.f34190e);
        h6Var.setBounds(rect);
        h6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
