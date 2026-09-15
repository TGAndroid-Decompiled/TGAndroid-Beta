package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.em0;
public final class q3 extends xc {
    public final org.telegram.ui.ActionBar.e6 N;
    public String O;
    public int P;

    public q3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.N = e6Var;
        setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, x0 x0Var) {
        em0 em0Var;
        if (str == this.O && this.P == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String G0 = ei.l.G0(i10);
        if (x0Var != null) {
            em0Var = new em0(this, x0Var, i10, 16);
        } else {
            em0Var = null;
        }
        append.append((CharSequence) yc.b(G0, em0Var, this.N, null));
        setText(spannableStringBuilder);
        this.O = str;
        this.P = i10;
    }
}
