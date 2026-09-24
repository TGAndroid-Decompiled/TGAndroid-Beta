package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f47354a;
    public final x3 f47355b;

    public f2(x3 x3Var, long j3) {
        this.f47355b = x3Var;
        this.f47354a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47355b.X1(this.f47354a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
