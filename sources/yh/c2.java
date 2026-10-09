package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c2 extends ClickableSpan {
    public final long f52335a;
    public final s3 f52336b;

    public c2(s3 s3Var, long j3) {
        this.f52336b = s3Var;
        this.f52335a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52336b.Y1(this.f52335a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
