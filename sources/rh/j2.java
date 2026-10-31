package rh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class j2 extends ClickableSpan {
    public final long f47112a;
    public final e4 f47113b;

    public j2(e4 e4Var, long j10) {
        this.f47113b = e4Var;
        this.f47112a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f47113b.U1(this.f47112a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
