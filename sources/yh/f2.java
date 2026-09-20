package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f47406a;
    public final y3 f47407b;

    public f2(y3 y3Var, long j3) {
        this.f47407b = y3Var;
        this.f47406a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f47407b.X1(this.f47406a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
