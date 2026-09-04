package zh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class r6 extends ClickableSpan {
    public final v5 f52527a;

    public r6(v5 v5Var) {
        this.f52527a = v5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f52527a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
