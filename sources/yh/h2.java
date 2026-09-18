package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class h2 extends ClickableSpan {
    public final long f47272a;
    public final a4 f47273b;

    public h2(a4 a4Var, long j3) {
        this.f47273b = a4Var;
        this.f47272a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47273b.X1(this.f47272a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
