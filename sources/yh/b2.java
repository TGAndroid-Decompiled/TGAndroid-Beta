package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class b2 extends ClickableSpan {
    public final long f52507a;
    public final s3 f52508b;

    public b2(s3 s3Var, long j3) {
        this.f52508b = s3Var;
        this.f52507a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52508b.Y1(this.f52507a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
