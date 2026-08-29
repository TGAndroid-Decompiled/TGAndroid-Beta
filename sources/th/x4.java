package th;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class x4 extends v41 {
    public static final int f48885a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        TL_iv.RichText richText;
        y4 y4Var = (y4) view;
        a aVar = (a) w41Var.G;
        w4 w4Var = (w4) w41Var.H;
        d1 d1Var = y4Var.f48907r;
        y4Var.f48892a = aVar;
        y4Var.f48908s = w4Var;
        y4Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        y4Var.c(aVar);
        if (w4Var != null) {
            richText = (TL_iv.RichText) ((v2) w4Var).f48817a.f48648i3.get(Long.valueOf(aVar.f48344t));
        } else {
            richText = null;
        }
        if (!String.valueOf(d1Var.getText()).equals(v5.l(richText))) {
            d1Var.setTextSilently(Emoji.replaceEmoji(v5.r(richText, null, true), d1Var.getPaint().getFontMetricsInt(), false));
            d1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new y4(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
