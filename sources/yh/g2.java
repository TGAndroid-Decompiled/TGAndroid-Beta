package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class g2 extends ClickableSpan {
    public final long f47151a;
    public final z3 f47152b;

    public g2(z3 z3Var, long j3) {
        this.f47152b = z3Var;
        this.f47151a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47152b.X1(this.f47151a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
