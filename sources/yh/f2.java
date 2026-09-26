package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f47364a;
    public final x3 f47365b;

    public f2(x3 x3Var, long j3) {
        this.f47365b = x3Var;
        this.f47364a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47365b.X1(this.f47364a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
