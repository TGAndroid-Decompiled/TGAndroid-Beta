package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f51272a;
    public final x3 f51273b;

    public f2(x3 x3Var, long j3) {
        this.f51273b = x3Var;
        this.f51272a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51273b.X1(this.f51272a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
