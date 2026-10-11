package yh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class l3 implements View.OnClickListener {
    public final int f52911a;
    public final p3 f52912b;

    public l3(p3 p3Var, int i10) {
        this.f52911a = i10;
        this.f52912b = p3Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f52911a) {
            case 0:
                CharSequence text = this.f52912b.v.getText();
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
                p3 p3Var = this.f52912b;
                if (p3Var.N.getVisibility() == 0 && (onClickListener = p3Var.T) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
