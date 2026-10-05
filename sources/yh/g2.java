package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g2 extends ClickableSpan {
    public final long f51331a;
    public final y3 f51332b;

    public g2(y3 y3Var, long j3) {
        this.f51332b = y3Var;
        this.f51331a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51332b.X1(this.f51331a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
