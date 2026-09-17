package zh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class e2 extends ClickableSpan {
    public final long f51820a;
    public final w3 f51821b;

    public e2(w3 w3Var, long j3) {
        this.f51821b = w3Var;
        this.f51820a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51821b.X1(this.f51820a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
