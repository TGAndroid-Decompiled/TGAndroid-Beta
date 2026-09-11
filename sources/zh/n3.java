package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bd;
import org.telegram.ui.ai0;
public final class n3 extends ad {
    public final org.telegram.ui.ActionBar.f6 N;
    public String O;
    public int P;

    public n3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.N = f6Var;
        setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, x0 x0Var) {
        ai0 ai0Var;
        if (str == this.O && this.P == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String G0 = fi.m.G0(i10);
        if (x0Var != null) {
            ai0Var = new ai0(this, x0Var, i10, 17);
        } else {
            ai0Var = null;
        }
        append.append((CharSequence) bd.b(G0, ai0Var, this.N, null));
        setText(spannableStringBuilder);
        this.O = str;
        this.P = i10;
    }
}
