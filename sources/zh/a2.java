package zh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class a2 extends ClickableSpan {
    public final long f50255a;
    public final r3 f50256b;

    public a2(r3 r3Var, long j10) {
        this.f50256b = r3Var;
        this.f50255a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f50256b.Y1(this.f50255a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
