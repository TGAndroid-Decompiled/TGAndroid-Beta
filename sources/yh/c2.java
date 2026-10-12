package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class c2 extends ClickableSpan {
    public final long f52574a;
    public final s3 f52575b;

    public c2(s3 s3Var, long j3) {
        this.f52575b = s3Var;
        this.f52574a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f52575b.Y1(this.f52574a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
