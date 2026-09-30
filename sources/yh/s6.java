package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class s6 extends ClickableSpan {
    public final v5 f48141a;

    public s6(v5 v5Var) {
        this.f48141a = v5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f48141a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
