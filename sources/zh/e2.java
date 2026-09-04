package zh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class e2 extends ClickableSpan {
    public final long f51819a;
    public final w3 f51820b;

    public e2(w3 w3Var, long j3) {
        this.f51820b = w3Var;
        this.f51819a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51820b.X1(this.f51819a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
