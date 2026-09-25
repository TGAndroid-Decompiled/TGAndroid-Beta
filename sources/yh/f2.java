package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f47366a;
    public final x3 f47367b;

    public f2(x3 x3Var, long j3) {
        this.f47367b = x3Var;
        this.f47366a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47367b.X1(this.f47366a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
