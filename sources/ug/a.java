package ug;

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
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.p6;
public final class a extends ReplacementSpan {
    public final Drawable f47638a;
    public final Drawable f47639b;
    public boolean f47640c;
    public boolean d;
    public final p6 e;
    public final TextPaint f47641f;
    public final int h;

    public a(u1 u1Var, TextPaint textPaint, int i10) {
        this.f47641f = textPaint;
        p6 p6Var = new p6(false, false, true);
        this.e = p6Var;
        p6Var.n(0.3f, 250L, bs.h);
        p6Var.setCallback(u1Var);
        p6Var.w(AndroidUtilities.dp(11.5f));
        p6Var.x(AndroidUtilities.bold());
        p6Var.t("", true, true);
        p6Var.f29180b = 17;
        Drawable mutate = u1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.f47638a = mutate;
        Drawable mutate2 = u1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.f47639b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i10;
        p6Var.t(i10 > 1 ? String.valueOf(i10) : "", false, true);
    }

    public static Pair a(u1 u1Var, TextPaint textPaint, int i10) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(u1Var, textPaint, i10);
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
        TextPaint textPaint = this.f47641f;
        int color = textPaint.getColor();
        p6 p6Var = this.e;
        int color2 = p6Var.f29178a.getColor();
        Drawable drawable = this.f47639b;
        Drawable drawable2 = this.f47638a;
        if (color != color2) {
            p6Var.u(textPaint.getColor());
            int color3 = p6Var.f29178a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(p6Var.f29178a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f47640c) {
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
        rect.set(0, 0, (int) p6Var.c(), (int) p6Var.e);
        p6Var.setBounds(rect);
        p6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
