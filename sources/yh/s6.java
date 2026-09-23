package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class s6 extends ClickableSpan {
    public final w5 f47709a;

    public s6(w5 w5Var) {
        this.f47709a = w5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f47709a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
