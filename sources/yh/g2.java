package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g2 extends ClickableSpan {
    public final long f47113a;
    public final y3 f47114b;

    public g2(y3 y3Var, long j3) {
        this.f47114b = y3Var;
        this.f47113a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47114b.X1(this.f47113a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
