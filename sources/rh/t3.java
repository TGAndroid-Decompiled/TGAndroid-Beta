package rh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class t3 implements View.OnClickListener {
    public final int f47500a;
    public final y3 f47501b;

    public t3(y3 y3Var, int i10) {
        this.f47500a = i10;
        this.f47501b = y3Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f47500a) {
            case 0:
                CharSequence text = this.f47501b.f47744w.getText();
                if (text instanceof Spanned) {
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > 0) {
                        clickableSpanArr[0].onClick(view);
                        return;
                    }
                    return;
                }
                return;
            default:
                y3 y3Var = this.f47501b;
                if (y3Var.O.getVisibility() == 0 && (onClickListener = y3Var.W) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
