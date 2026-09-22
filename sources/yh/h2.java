package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class h2 extends ClickableSpan {
    public final long f47179a;
    public final z3 f47180b;

    public h2(z3 z3Var, long j3) {
        this.f47180b = z3Var;
        this.f47179a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47180b.X1(this.f47179a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
