package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f47367a;
    public final x3 f47368b;

    public f2(x3 x3Var, long j3) {
        this.f47368b = x3Var;
        this.f47367a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47368b.X1(this.f47367a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
