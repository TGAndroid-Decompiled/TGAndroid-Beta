package zh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class f2 extends ClickableSpan {
    public final long f51858a;
    public final w3 f51859b;

    public f2(w3 w3Var, long j3) {
        this.f51859b = w3Var;
        this.f51858a = j3;
    }

    @Override
    public final void onClick(View view) {
        this.f51859b.X1(this.f51858a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
