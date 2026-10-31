package rh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class i7 extends ClickableSpan {
    public final l6 f47101a;

    public i7(l6 l6Var) {
        this.f47101a = l6Var;
    }

    @Override
    public final void onClick(View view) {
        this.f47101a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
