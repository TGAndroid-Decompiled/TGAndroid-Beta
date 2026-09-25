package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.zc;
import org.telegram.ui.wl0;
public final class n3 extends zc {
    public final org.telegram.ui.ActionBar.d6 N;
    public String O;
    public int P;

    public n3(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.N = d6Var;
        setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, x0 x0Var) {
        wl0 wl0Var;
        if (str == this.O && this.P == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String G0 = ei.l.G0(i10);
        if (x0Var != null) {
            wl0Var = new wl0(this, x0Var, i10, 16);
        } else {
            wl0Var = null;
        }
        append.append((CharSequence) ad.b(G0, wl0Var, this.N, null));
        setText(spannableStringBuilder);
        this.O = str;
        this.P = i10;
    }
}
