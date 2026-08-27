package rh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class x4 extends m41 {

    public static final int f47587a = 0;

    static {
        m41.setup(new x4());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        TL_iv.RichText richText;
        y4 y4Var = (y4) view;
        a aVar = (a) n41Var.G;
        w4 w4Var = (w4) n41Var.H;
        d1 d1Var = y4Var.f47609r;
        y4Var.f47594a = aVar;
        y4Var.f47610s = w4Var;
        y4Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        y4Var.c(aVar);
        if (w4Var != null) {
            richText = (TL_iv.RichText) ((v2) w4Var).f47519a.f47350i3.get(Long.valueOf(aVar.f47044t));
        } else {
            richText = null;
        }
        if (String.valueOf(d1Var.getText()).equals(v5.l(richText))) {
            return;
        }
        d1Var.setTextSilently(Emoji.replaceEmoji(v5.r(richText, null, true), d1Var.getPaint().getFontMetricsInt(), false));
        d1Var.invalidateEffects();
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new y4(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
