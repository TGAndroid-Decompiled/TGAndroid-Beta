package yh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class l6 extends ClickableSpan {
    public final p5 f52848a;

    public l6(p5 p5Var) {
        this.f52848a = p5Var;
    }

    @Override
    public final void onClick(View view) {
        this.f52848a.run();
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
