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
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.rr;
public final class a extends ReplacementSpan {
    public final Drawable f43011a;
    public final Drawable f43012b;
    public boolean f43013c;
    public boolean d;
    public final o6 e;
    public final TextPaint f43014f;
    public final int h;

    public a(t1 t1Var, TextPaint textPaint, int i10) {
        this.f43014f = textPaint;
        o6 o6Var = new o6(false, false, true, false);
        this.e = o6Var;
        o6Var.k(0.3f, 250L, rr.h);
        o6Var.setCallback(t1Var);
        o6Var.t(AndroidUtilities.dp(11.5f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.q("", true, true);
        o6Var.f26614b = 17;
        Drawable mutate = t1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.f43011a = mutate;
        Drawable mutate2 = t1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.f43012b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i10;
        o6Var.q(i10 > 1 ? String.valueOf(i10) : "", false, true);
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
        TextPaint textPaint = this.f43014f;
        int color = textPaint.getColor();
        o6 o6Var = this.e;
        int color2 = o6Var.f26613a.getColor();
        Drawable drawable = this.f43012b;
        Drawable drawable2 = this.f43011a;
        if (color != color2) {
            o6Var.r(textPaint.getColor());
            int color3 = o6Var.f26613a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(o6Var.f26613a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f43013c) {
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
        rect.set(0, 0, (int) o6Var.d(), (int) o6Var.e);
        o6Var.setBounds(rect);
        o6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
