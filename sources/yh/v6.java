package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class v6 extends ClickableSpan {
    public final z5 f52129a;

    public v6(z5 z5Var) {
        this.f52129a = z5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f52129a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
