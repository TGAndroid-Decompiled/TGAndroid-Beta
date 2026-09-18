package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class i2 extends ClickableSpan {
    public final long f47308a;
    public final a4 f47309b;

    public i2(a4 a4Var, long j3) {
        this.f47309b = a4Var;
        this.f47308a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47309b.X1(this.f47308a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
