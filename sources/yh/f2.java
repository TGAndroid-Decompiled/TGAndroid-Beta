package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f51287a;
    public final y3 f51288b;

    public f2(y3 y3Var, long j3) {
        this.f51288b = y3Var;
        this.f51287a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51288b.X1(this.f51287a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
