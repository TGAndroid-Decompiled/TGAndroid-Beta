package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class r6 extends ClickableSpan {
    public final w5 f47958a;

    public r6(w5 w5Var) {
        this.f47958a = w5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f47958a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
