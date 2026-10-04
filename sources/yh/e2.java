package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class e2 extends ClickableSpan {
    public final long f51228a;
    public final x3 f51229b;

    public e2(x3 x3Var, long j3) {
        this.f51229b = x3Var;
        this.f51228a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51229b.X1(this.f51228a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
