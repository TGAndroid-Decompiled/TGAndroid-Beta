package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class s6 extends ClickableSpan {
    public final v5 f48033a;

    public s6(v5 v5Var) {
        this.f48033a = v5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f48033a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
