package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f47412a;
    public final x3 f47413b;

    public f2(x3 x3Var, long j3) {
        this.f47413b = x3Var;
        this.f47412a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47413b.X1(this.f47412a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
