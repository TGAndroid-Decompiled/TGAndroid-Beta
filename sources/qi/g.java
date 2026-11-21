package qi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.m6;
public final class g extends CharacterStyle {
    public final String f56220a;
    public final float f56221b;
    public final boolean f56222c;

    public g(String str, String str2, boolean z10) {
        int length;
        int i7;
        this.f56222c = z10;
        this.f56220a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        p pVar = j.f56228a;
        if (length > 120) {
            i7 = 5;
        } else if (length > 50) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        this.f56221b = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f56222c) {
            textPaint.setTextSize(g0.L(bz.W0 - this.f56221b));
        }
        textPaint.setColor(m6.x0(null, m6.Vc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
