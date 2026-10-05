package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class w6 extends ClickableSpan {
    public final a6 f52202a;

    public w6(a6 a6Var) {
        this.f52202a = a6Var;
    }

    @Override
    public final void onClick(View view) {
        this.f52202a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
