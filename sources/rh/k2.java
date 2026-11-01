package rh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class k2 extends ClickableSpan {
    public final long f47162a;
    public final e4 f47163b;

    public k2(e4 e4Var, long j10) {
        this.f47163b = e4Var;
        this.f47162a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f47163b.U1(this.f47162a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
