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
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q6;
public final class a extends ReplacementSpan {
    public final Drawable f48351a;
    public final Drawable f48352b;
    public boolean f48353c;
    public boolean d;
    public final q6 f48354e;
    public final TextPaint f48355f;
    public final int h;

    public a(u1 u1Var, TextPaint textPaint, int i10) {
        this.f48355f = textPaint;
        q6 q6Var = new q6(false, false, true);
        this.f48354e = q6Var;
        q6Var.n(0.3f, 250L, is.h);
        q6Var.setCallback(u1Var);
        q6Var.w(AndroidUtilities.dp(11.5f));
        q6Var.x(AndroidUtilities.bold());
        q6Var.t("", true, true);
        q6Var.f30019b = 17;
        Drawable mutate = u1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.f48351a = mutate;
        Drawable mutate2 = u1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.f48352b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i10;
        q6Var.t(i10 > 1 ? String.valueOf(i10) : "", false, true);
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
        return (int) (this.f48354e.e() + AndroidUtilities.dp(i10 + 16));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15;
        TextPaint textPaint = this.f48355f;
        int color = textPaint.getColor();
        q6 q6Var = this.f48354e;
        int color2 = q6Var.f30017a.getColor();
        Drawable drawable = this.f48352b;
        Drawable drawable2 = this.f48351a;
        if (color != color2) {
            q6Var.u(textPaint.getColor());
            int color3 = q6Var.f30017a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(q6Var.f30017a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f48353c) {
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
        rect.set(0, 0, (int) q6Var.c(), (int) q6Var.f30022e);
        q6Var.setBounds(rect);
        q6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
