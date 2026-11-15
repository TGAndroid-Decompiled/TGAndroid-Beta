package qi;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.ui.ActionBar.j6;
public final class g extends CharacterStyle {
    public final String f55605a;
    public final float f55606b;
    public final boolean f55607c;

    public g(String str, String str2, boolean z10) {
        int length;
        int i7;
        this.f55607c = z10;
        this.f55605a = str;
        if (str2 == null) {
            length = 0;
        } else {
            length = str2.length();
        }
        p pVar = j.f55613a;
        if (length > 120) {
            i7 = 5;
        } else if (length > 50) {
            i7 = 3;
        } else {
            i7 = 2;
        }
        this.f55606b = i7;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        if (this.f55607c) {
            textPaint.setTextSize(g0.L(gz.W0 - this.f55606b));
        }
        textPaint.setColor(j6.x0(null, j6.Vc, false));
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setUnderlineText(false);
    }
}
