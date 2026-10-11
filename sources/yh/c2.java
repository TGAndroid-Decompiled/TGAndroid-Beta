package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c2 extends ClickableSpan {
    public final long f52424a;
    public final s3 f52425b;

    public c2(s3 s3Var, long j3) {
        this.f52425b = s3Var;
        this.f52424a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52425b.Y1(this.f52424a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
