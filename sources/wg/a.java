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
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
public final class a extends ReplacementSpan {
    public final Drawable f59698a;
    public final Drawable f59699b;
    public boolean f59700c;
    public boolean d;
    public final n6 f59701e;
    public final TextPaint f59702f;
    public final int h;

    public a(r1 r1Var, TextPaint textPaint, int i7) {
        this.f59702f = textPaint;
        n6 n6Var = new n6(false, false, true);
        this.f59701e = n6Var;
        n6Var.n(0.3f, 250L, nr.h);
        n6Var.setCallback(r1Var);
        n6Var.w(org.telegram.messenger.g0.L(11.5f));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.t("", true, true);
        n6Var.f37751b = 17;
        Drawable mutate = r1Var.getContext().getDrawable(2131231931).mutate();
        this.f59698a = mutate;
        Drawable mutate2 = r1Var.getContext().getDrawable(2131231932).mutate();
        this.f59699b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i7;
        n6Var.t(i7 > 1 ? String.valueOf(i7) : "", false, true);
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
        return (int) (this.f59701e.e() + org.telegram.messenger.g0.L(i7 + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        int i14;
        TextPaint textPaint = this.f59702f;
        int color = textPaint.getColor();
        n6 n6Var = this.f59701e;
        int color2 = n6Var.f37749a.getColor();
        Drawable drawable = this.f59699b;
        Drawable drawable2 = this.f59698a;
        if (color != color2) {
            n6Var.u(textPaint.getColor());
            int color3 = n6Var.f37749a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(n6Var.f37749a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f59700c) {
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
        rect.set(0, 0, (int) n6Var.c(), (int) n6Var.f37755e);
        n6Var.setBounds(rect);
        n6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
