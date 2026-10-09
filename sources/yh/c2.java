package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c2 extends ClickableSpan {
    public final long f52337a;
    public final s3 f52338b;

    public c2(s3 s3Var, long j3) {
        this.f52338b = s3Var;
        this.f52337a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52338b.Y1(this.f52337a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
