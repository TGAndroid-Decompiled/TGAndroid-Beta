package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f51266a;
    public final x3 f51267b;

    public f2(x3 x3Var, long j3) {
        this.f51267b = x3Var;
        this.f51266a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51267b.X1(this.f51266a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
