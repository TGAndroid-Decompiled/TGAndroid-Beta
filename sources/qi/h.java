package qi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
public final class h extends MetricAffectingSpan {
    public static final Typeface[] f56192c;
    public final int f56193a;
    public final int f56194b;

    static {
        Typeface typeface = Typeface.MONOSPACE;
        f56192c = new Typeface[]{typeface, Typeface.create(typeface, 1), Typeface.create(typeface, 2), Typeface.create(typeface, 3)};
    }

    public h(int i7) {
        int i10;
        this.f56194b = i7;
        if ((i7 & 256) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f56193a = i10 | ((i7 & 512) != 0 ? 2 : 0);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
    }

    @Override
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(f56192c[this.f56193a]);
    }
}
