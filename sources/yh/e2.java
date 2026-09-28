package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class e2 extends ClickableSpan {
    public final long f47327a;
    public final x3 f47328b;

    public e2(x3 x3Var, long j3) {
        this.f47328b = x3Var;
        this.f47327a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47328b.X1(this.f47327a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
