package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class h2 extends ClickableSpan {
    public final long f47244a;
    public final a4 f47245b;

    public h2(a4 a4Var, long j3) {
        this.f47245b = a4Var;
        this.f47244a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47245b.X1(this.f47244a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
