package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f51265a;
    public final x3 f51266b;

    public f2(x3 x3Var, long j3) {
        this.f51266b = x3Var;
        this.f51265a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51266b.X1(this.f51265a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
