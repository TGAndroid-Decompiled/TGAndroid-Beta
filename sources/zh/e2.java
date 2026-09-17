package zh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class e2 extends ClickableSpan {
    public final long f51851a;
    public final w3 f51852b;

    public e2(w3 w3Var, long j3) {
        this.f51852b = w3Var;
        this.f51851a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51852b.X1(this.f51851a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
