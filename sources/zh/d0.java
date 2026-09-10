package zh;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class d0 extends CharacterStyle {
    public final float f48337a = 0.75f;

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (this.f48337a * textPaint.getAlpha()));
    }
}
