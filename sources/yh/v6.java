package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class v6 extends ClickableSpan {
    public final z5 f52130a;

    public v6(z5 z5Var) {
        this.f52130a = z5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f52130a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
