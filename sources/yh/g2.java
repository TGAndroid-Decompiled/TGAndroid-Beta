package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g2 extends ClickableSpan {
    public final long f47488a;
    public final y3 f47489b;

    public g2(y3 y3Var, long j3) {
        this.f47489b = y3Var;
        this.f47488a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47489b.X1(this.f47488a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
