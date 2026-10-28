package vg;

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
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.r6;
public final class a extends ReplacementSpan {
    public final Drawable f50149a;
    public final Drawable f50150b;
    public boolean f50151c;
    public boolean d;
    public final r6 e;
    public final TextPaint f50152f;
    public final int h;

    public a(s1 s1Var, TextPaint textPaint, int i10) {
        this.f50152f = textPaint;
        r6 r6Var = new r6(false, false, true);
        this.e = r6Var;
        r6Var.n(0.3f, 250L, ds.h);
        r6Var.setCallback(s1Var);
        r6Var.w(AndroidUtilities.dp(11.5f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.t("", true, true);
        r6Var.f32142b = 17;
        Drawable mutate = s1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.f50149a = mutate;
        Drawable mutate2 = s1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.f50150b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i10;
        r6Var.t(i10 > 1 ? String.valueOf(i10) : "", false, true);
    }

    public static Pair a(s1 s1Var, TextPaint textPaint, int i10) {
        SpannableString spannableString = new SpannableString("d");
        a aVar = new a(s1Var, textPaint, i10);
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
        TextPaint textPaint = this.f50152f;
        int color = textPaint.getColor();
        r6 r6Var = this.e;
        int color2 = r6Var.f32140a.getColor();
        Drawable drawable = this.f50150b;
        Drawable drawable2 = this.f50149a;
        if (color != color2) {
            r6Var.u(textPaint.getColor());
            int color3 = r6Var.f32140a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(r6Var.f32140a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f50151c) {
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
        rect.set(0, 0, (int) r6Var.c(), (int) r6Var.e);
        r6Var.setBounds(rect);
        r6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
