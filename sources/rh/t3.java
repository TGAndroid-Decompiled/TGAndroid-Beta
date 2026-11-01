package rh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class t3 implements View.OnClickListener {
    public final int f47508a;
    public final y3 f47509b;

    public t3(y3 y3Var, int i10) {
        this.f47508a = i10;
        this.f47509b = y3Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f47508a) {
            case 0:
                CharSequence text = this.f47509b.f47756w.getText();
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
                y3 y3Var = this.f47509b;
                if (y3Var.O.getVisibility() == 0 && (onClickListener = y3Var.W) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
