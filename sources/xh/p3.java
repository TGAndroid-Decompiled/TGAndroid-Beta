package xh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p3 implements View.OnClickListener {
    public final int f45866a;
    public final u3 f45867b;

    public p3(u3 u3Var, int i10) {
        this.f45866a = i10;
        this.f45867b = u3Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f45866a) {
            case 0:
                CharSequence text = this.f45867b.v.getText();
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
                u3 u3Var = this.f45867b;
                if (u3Var.N.getVisibility() == 0 && (onClickListener = u3Var.T) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
