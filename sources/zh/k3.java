package zh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class k3 implements View.OnClickListener {
    public final int f50757a;
    public final o3 f50758b;

    public k3(o3 o3Var, int i10) {
        this.f50757a = i10;
        this.f50758b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f50757a) {
            case 0:
                CharSequence text = this.f50758b.v.getText();
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
                o3 o3Var = this.f50758b;
                if (o3Var.N.getVisibility() == 0 && (onClickListener = o3Var.T) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
