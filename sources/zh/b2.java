package zh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class b2 extends ClickableSpan {
    public final long f50295a;
    public final r3 f50296b;

    public b2(r3 r3Var, long j10) {
        this.f50296b = r3Var;
        this.f50295a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f50296b.Y1(this.f50295a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
