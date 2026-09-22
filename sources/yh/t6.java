package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class t6 extends ClickableSpan {
    public final x5 f47778a;

    public t6(x5 x5Var) {
        this.f47778a = x5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f47778a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
