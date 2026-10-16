package zh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class b2 extends ClickableSpan {
    public final long f50296a;
    public final r3 f50297b;

    public b2(r3 r3Var, long j10) {
        this.f50297b = r3Var;
        this.f50296a = j10;
    }

    @Override
    public final void onClick(View view) {
        this.f50297b.Y1(this.f50296a);
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
