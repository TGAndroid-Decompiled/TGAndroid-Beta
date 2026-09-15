package yh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class s3 implements View.OnClickListener {
    public final int f47775a;
    public final x3 f47776b;

    public s3(x3 x3Var, int i10) {
        this.f47775a = i10;
        this.f47776b = x3Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f47775a) {
            case 0:
                CharSequence text = this.f47776b.v.getText();
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
                x3 x3Var = this.f47776b;
                if (x3Var.N.getVisibility() == 0 && (onClickListener = x3Var.T) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
