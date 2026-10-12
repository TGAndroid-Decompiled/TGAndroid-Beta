package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class l6 extends ClickableSpan {
    public final q5 f53074a;

    public l6(q5 q5Var) {
        this.f53074a = q5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f53074a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
