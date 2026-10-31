package rh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
public final class r3 extends ec {
    public final org.telegram.ui.ActionBar.p6 P;
    public String Q;
    public int R;

    public r3(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.P = p6Var;
        org.telegram.ui.ActionBar.a7.V(this, org.telegram.ui.ActionBar.t6.G6, p6Var);
        setTextSize(1, 14.0f);
        setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
    }

    public final void e(String str, int i10, b1 b1Var) {
        org.telegram.ui.Wallet.x0 x0Var;
        if (str == this.Q && this.R == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.k6.m(str, getPaint().getFontMetricsInt(), false, null, 0));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String I0 = xh.i.I0(i10);
        if (b1Var != null) {
            x0Var = new org.telegram.ui.Wallet.x0(this, b1Var, i10, 12);
        } else {
            x0Var = null;
        }
        append.append((CharSequence) fc.b(I0, x0Var, this.P, null));
        setText(spannableStringBuilder);
        this.Q = str;
        this.R = i10;
    }
}
