package yh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class r3 implements View.OnClickListener {
    public final int f47661a;
    public final w3 f47662b;

    public r3(w3 w3Var, int i10) {
        this.f47661a = i10;
        this.f47662b = w3Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f47661a) {
            case 0:
                CharSequence text = this.f47662b.v.getText();
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
                w3 w3Var = this.f47662b;
                if (w3Var.N.getVisibility() == 0 && (onClickListener = w3Var.T) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
