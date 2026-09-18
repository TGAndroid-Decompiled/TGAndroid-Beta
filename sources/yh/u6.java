package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class u6 extends ClickableSpan {
    public final y5 f47901a;

    public u6(y5 y5Var) {
        this.f47901a = y5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f47901a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
