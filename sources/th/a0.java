package th;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class a0 extends CharacterStyle {
    public final float f48769a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f48769a * textPaint.getAlpha()));
    }
}
