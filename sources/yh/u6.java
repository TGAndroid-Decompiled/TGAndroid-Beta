package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class u6 extends ClickableSpan {
    public final y5 f47896a;

    public u6(y5 y5Var) {
        this.f47896a = y5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f47896a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
