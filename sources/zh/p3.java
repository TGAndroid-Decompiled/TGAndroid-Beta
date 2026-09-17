package zh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class p3 implements View.OnClickListener {
    public final int f52446a;
    public final t3 f52447b;

    public p3(t3 t3Var, int i10) {
        this.f52446a = i10;
        this.f52447b = t3Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f52446a) {
            case 0:
                CharSequence text = this.f52447b.v.getText();
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
                t3 t3Var = this.f52447b;
                if (t3Var.N.getVisibility() == 0 && (onClickListener = t3Var.T) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
