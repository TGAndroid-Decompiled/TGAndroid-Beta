package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class b2 extends ClickableSpan {
    public final long f52279a;
    public final s3 f52280b;

    public b2(s3 s3Var, long j3) {
        this.f52280b = s3Var;
        this.f52279a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52280b.Y1(this.f52279a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
