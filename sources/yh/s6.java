package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class s6 extends ClickableSpan {
    public final w5 f48003a;

    public s6(w5 w5Var) {
        this.f48003a = w5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f48003a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
