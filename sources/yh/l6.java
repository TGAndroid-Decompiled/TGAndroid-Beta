package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class l6 extends ClickableSpan {
    public final q5 f52959a;

    public l6(q5 q5Var) {
        this.f52959a = q5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f52959a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
