package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class e2 extends ClickableSpan {
    public final long f47435a;
    public final x3 f47436b;

    public e2(x3 x3Var, long j3) {
        this.f47436b = x3Var;
        this.f47435a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47436b.X1(this.f47435a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
