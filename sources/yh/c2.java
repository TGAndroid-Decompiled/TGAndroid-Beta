package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c2 extends ClickableSpan {
    public final long f52458a;
    public final s3 f52459b;

    public c2(s3 s3Var, long j3) {
        this.f52459b = s3Var;
        this.f52458a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52459b.Y1(this.f52458a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
