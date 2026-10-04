package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class e2 extends ClickableSpan {
    public final long f51222a;
    public final x3 f51223b;

    public e2(x3 x3Var, long j3) {
        this.f51223b = x3Var;
        this.f51222a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51223b.X1(this.f51222a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
