package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class s6 extends ClickableSpan {
    public final x5 f48071a;

    public s6(x5 x5Var) {
        this.f48071a = x5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f48071a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
