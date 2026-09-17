package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class h2 extends ClickableSpan {
    public final long f47267a;
    public final a4 f47268b;

    public h2(a4 a4Var, long j3) {
        this.f47268b = a4Var;
        this.f47267a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47268b.X1(this.f47267a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
