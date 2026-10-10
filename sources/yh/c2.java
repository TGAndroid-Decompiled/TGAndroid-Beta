package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c2 extends ClickableSpan {
    public final long f52381a;
    public final s3 f52382b;

    public c2(s3 s3Var, long j3) {
        this.f52382b = s3Var;
        this.f52381a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52382b.Y1(this.f52381a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
