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
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.xq;
public final class a extends ReplacementSpan {
    public final Drawable f57581a;
    public final Drawable f57582b;
    public boolean f57583c;
    public boolean d;
    public final i6 f57584e;
    public final TextPaint f57585f;
    public final int h;

    public a(q1 q1Var, TextPaint textPaint, int i7) {
        this.f57585f = textPaint;
        i6 i6Var = new i6(false, false, true);
        this.f57584e = i6Var;
        i6Var.n(0.3f, 250L, xq.h);
        i6Var.setCallback(q1Var);
        i6Var.w(org.telegram.messenger.g0.L(11.5f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.t("", true, true);
        i6Var.f34477b = 17;
        Drawable mutate = q1Var.getContext().getDrawable(2131231930).mutate();
        this.f57581a = mutate;
        Drawable mutate2 = q1Var.getContext().getDrawable(2131231931).mutate();
        this.f57582b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i7;
        i6Var.t(i7 > 1 ? String.valueOf(i7) : "", false, true);
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
        return (int) (this.f57584e.e() + org.telegram.messenger.g0.L(i7 + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        TextPaint textPaint = this.f57585f;
        int color = textPaint.getColor();
        i6 i6Var = this.f57584e;
        int color2 = i6Var.f34475a.getColor();
        Drawable drawable = this.f57582b;
        Drawable drawable2 = this.f57581a;
        if (color != color2) {
            i6Var.u(textPaint.getColor());
            int color3 = i6Var.f34475a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(i6Var.f34475a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f57583c) {
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
        rect.set(0, 0, (int) i6Var.c(), (int) i6Var.f34480e);
        i6Var.setBounds(rect);
        i6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
