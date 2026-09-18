package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g2 extends ClickableSpan {
    public final long f47422a;
    public final y3 f47423b;

    public g2(y3 y3Var, long j3) {
        this.f47423b = y3Var;
        this.f47422a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47423b.X1(this.f47422a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
