package sg;

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
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wr;
public final class a extends ReplacementSpan {
    public final Drawable f41842a;
    public final Drawable f41843b;
    public boolean f41844c;
    public boolean d;
    public final n6 e;
    public final TextPaint f41845f;
    public final int h;

    public a(t1 t1Var, TextPaint textPaint, int i10) {
        this.f41845f = textPaint;
        n6 n6Var = new n6(false, false, true, false);
        this.e = n6Var;
        n6Var.k(0.3f, 250L, wr.h);
        n6Var.setCallback(t1Var);
        n6Var.t(AndroidUtilities.dp(11.5f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.q("", true, true);
        n6Var.f25425b = 17;
        Drawable mutate = t1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge).mutate();
        this.f41842a = mutate;
        Drawable mutate2 = t1Var.getContext().getDrawable(R.drawable.mini_boost_profile_badge2).mutate();
        this.f41843b = mutate2;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
        this.h = i10;
        n6Var.q(i10 > 1 ? String.valueOf(i10) : "", false, true);
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
        TextPaint textPaint = this.f41845f;
        int color = textPaint.getColor();
        n6 n6Var = this.e;
        int color2 = n6Var.f25424a.getColor();
        Drawable drawable = this.f41843b;
        Drawable drawable2 = this.f41842a;
        if (color != color2) {
            n6Var.r(textPaint.getColor());
            int color3 = n6Var.f25424a.getColor();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable2.setColorFilter(new PorterDuffColorFilter(color3, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(n6Var.f25424a.getColor(), mode));
        }
        canvas.save();
        if (this.d && !this.f41844c) {
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
        rect.set(0, 0, (int) n6Var.d(), (int) n6Var.e);
        n6Var.setBounds(rect);
        n6Var.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        return b();
    }
}
