package qi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class h extends MetricAffectingSpan {
    public static final Typeface[] f55608c;
    public final int f55609a;
    public final int f55610b;

    static {
        Typeface typeface = Typeface.MONOSPACE;
        f55608c = new Typeface[]{typeface, Typeface.create(typeface, 1), Typeface.create(typeface, 2), Typeface.create(typeface, 3)};
    }

    public h(int i7) {
        int i10;
        this.f55610b = i7;
        if ((i7 & 256) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f55609a = i10 | ((i7 & 512) != 0 ? 2 : 0);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(f55608c[this.f55609a]);
    }
}
