package xh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g2 extends ClickableSpan {
    public final long f45444a;
    public final x3 f45445b;

    public g2(x3 x3Var, long j3) {
        this.f45445b = x3Var;
        this.f45444a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f45445b.X1(this.f45444a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
