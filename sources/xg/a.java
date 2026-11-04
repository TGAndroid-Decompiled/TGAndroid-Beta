package xg;

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
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.xq;
public final class a extends ReplacementSpan {
    public final Drawable f58627a;
    public final Drawable f58628b;
    public boolean f58629c;
    public boolean d;
    public final g6 f58630e;
    public final TextPaint f58631f;
    public final int h;

    public a(q1 q1Var, TextPaint textPaint, int i3) {
        this.f58631f = textPaint;
        g6 g6Var = new g6(false, false, true);
        this.f58630e = g6Var;
        g6Var.n(0.3f, 250L, xq.h);
        g6Var.setCallback(q1Var);
        g6Var.w(org.telegram.messenger.g0.L(11.5f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.t("", true, true);
        g6Var.f33983b = 17;
        Drawable mutate = q1Var.getContext().getDrawable(2131231930).mutate();
        this.f58627a = mutate;
        Drawable mutate2 = q1Var.getContext().getDrawable(2131231931).mutate();
        this.f58628b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i3;
        g6Var.t(i3 > 1 ? String.valueOf(i3) : "", false, true);
    }

    public static Pair a(q1 q1Var, TextPaint textPaint, int i3) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(q1Var, textPaint, i3);
        spannableString.setSpan(aVar, 0, 1, 33);
        return new Pair(spannableString, aVar);
    }

    public final int b() {
        int i3;
        if (this.d) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        return (int) (this.f58630e.e() + org.telegram.messenger.g0.L(i3 + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        TextPaint textPaint = this.f58631f;
        int color = textPaint.getColor();
        g6 g6Var = this.f58630e;
        int color2 = g6Var.f33981a.getColor();
        Drawable drawable = this.f58628b;
        Drawable drawable2 = this.f58627a;
        if (color != color2) {
            g6Var.u(textPaint.getColor());
            int color3 = g6Var.f33981a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(g6Var.f33981a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f58629c) {
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
        rect.set(0, 0, (int) g6Var.c(), (int) g6Var.f33986e);
        g6Var.setBounds(rect);
        g6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
