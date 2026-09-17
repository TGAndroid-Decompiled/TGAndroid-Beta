package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class i2 extends ClickableSpan {
    public final long f47303a;
    public final a4 f47304b;

    public i2(a4 a4Var, long j3) {
        this.f47304b = a4Var;
        this.f47303a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47304b.X1(this.f47303a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
