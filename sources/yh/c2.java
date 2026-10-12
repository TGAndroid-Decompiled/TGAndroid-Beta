package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c2 extends ClickableSpan {
    public final long f52561a;
    public final s3 f52562b;

    public c2(s3 s3Var, long j3) {
        this.f52562b = s3Var;
        this.f52561a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52562b.Y1(this.f52561a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
