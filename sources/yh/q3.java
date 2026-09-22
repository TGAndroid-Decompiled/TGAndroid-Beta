package yh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class q3 implements View.OnClickListener {
    public final int f47965a;
    public final v3 f47966b;

    public q3(v3 v3Var, int i10) {
        this.f47965a = i10;
        this.f47966b = v3Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f47965a) {
            case 0:
                CharSequence text = this.f47966b.v.getText();
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
                v3 v3Var = this.f47966b;
                if (v3Var.N.getVisibility() == 0 && (onClickListener = v3Var.T) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
