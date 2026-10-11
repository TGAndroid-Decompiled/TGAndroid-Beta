package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.dd;
import org.telegram.ui.ai0;
public final class j3 extends cd {
    public final org.telegram.ui.ActionBar.d6 P;
    public String Q;
    public int R;

    public j3(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.P = d6Var;
        setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, w0 w0Var) {
        ai0 ai0Var;
        if (str == this.Q && this.R == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) " ");
        String H0 = ei.l.H0(i10);
        if (w0Var != null) {
            ai0Var = new ai0(this, w0Var, i10, 22);
        } else {
            ai0Var = null;
        }
        append.append((CharSequence) dd.b(H0, ai0Var, this.P, null));
        setText(spannableStringBuilder);
        this.Q = str;
        this.R = i10;
    }
}
