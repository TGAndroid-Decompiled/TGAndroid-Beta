package rh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class k2 extends ClickableSpan {
    public final long f47148a;
    public final e4 f47149b;

    public k2(e4 e4Var, long j10) {
        this.f47149b = e4Var;
        this.f47148a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f47149b.U1(this.f47148a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
