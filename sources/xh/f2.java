package xh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f45398a;
    public final x3 f45399b;

    public f2(x3 x3Var, long j3) {
        this.f45399b = x3Var;
        this.f45398a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f45399b.X1(this.f45398a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
