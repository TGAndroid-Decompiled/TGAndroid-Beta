package zh;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
public final class k3 implements View.OnClickListener {
    public final int f50756a;
    public final o3 f50757b;

    public k3(o3 o3Var, int i10) {
        this.f50756a = i10;
        this.f50757b = o3Var;
    }

    @Override
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        switch (this.f50756a) {
            case 0:
                CharSequence text = this.f50757b.v.getText();
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
                o3 o3Var = this.f50757b;
                if (o3Var.N.getVisibility() == 0 && (onClickListener = o3Var.T) != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
        }
    }
}
