package tg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;
public final class a extends ReplacementSpan {
    public final Drawable f43087a;
    public final Drawable f43088b;
    public boolean f43089c;
    public boolean d;
    public final m6 e;
    public final TextPaint f43090f;
    public final int h;

    public a(t1 t1Var, TextPaint textPaint, int i10) {
        this.f43090f = textPaint;
        m6 m6Var = new m6(false, false, true, false);
        this.e = m6Var;
        m6Var.k(0.3f, 250L, qr.h);
        m6Var.setCallback(t1Var);
        m6Var.t(AndroidUtilities.dp(11.5f));
        m6Var.u(AndroidUtilities.bold());
        m6Var.q("", true, true);
        m6Var.f26070b = 17;
        Drawable mutate = t1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.f43087a = mutate;
        Drawable mutate2 = t1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.f43088b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i10;
        m6Var.q(i10 > 1 ? String.valueOf(i10) : "", false, true);
    }

    public static Pair a(t1 t1Var, TextPaint textPaint, int i10) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(t1Var, textPaint, i10);
        spannableString.setSpan(aVar, 0, 1, 33);
        return new Pair(spannableString, aVar);
    }

    public final int b() {
        int i10;
        if (this.d) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        return (int) (this.e.e() + AndroidUtilities.dp(i10 + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15;
        TextPaint textPaint = this.f43090f;
        int color = textPaint.getColor();
        m6 m6Var = this.e;
        int color2 = m6Var.f26069a.getColor();
        Drawable drawable = this.f43088b;
        Drawable drawable2 = this.f43087a;
        if (color != color2) {
            m6Var.r(textPaint.getColor());
            int color3 = m6Var.f26069a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(m6Var.f26069a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f43089c) {
            i15 = AndroidUtilities.dp(8.0f);
        } else {
            i15 = 0;
        }
        canvas.translate(f7 + i15, -AndroidUtilities.dp(0.2f));
        if (this.h == 1) {
            canvas.translate(AndroidUtilities.dp(1.5f), 0.0f);
            drawable2.draw(canvas);
        } else {
            drawable.draw(canvas);
        }
        canvas.translate(AndroidUtilities.dp(16.0f), 0.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(0, 0, (int) m6Var.d(), (int) m6Var.e);
        m6Var.setBounds(rect);
        m6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
