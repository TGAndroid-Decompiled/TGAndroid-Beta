package zh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f51890a;
    public final w3 f51891b;

    public f2(w3 w3Var, long j3) {
        this.f51891b = w3Var;
        this.f51890a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51891b.X1(this.f51890a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
