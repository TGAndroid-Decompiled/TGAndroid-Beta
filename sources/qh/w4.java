package qh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class w4 extends k41 {
    public static final int f46777a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        TL_iv.RichText richText;
        x4 x4Var = (x4) view;
        a aVar = (a) l41Var.G;
        v4 v4Var = (v4) l41Var.H;
        d1 d1Var = x4Var.f46831r;
        x4Var.f46834a = aVar;
        x4Var.f46832s = v4Var;
        x4Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        x4Var.c(aVar);
        if (v4Var != null) {
            richText = (TL_iv.RichText) ((u2) v4Var).f46740a.f46575i3.get(Long.valueOf(aVar.f46285t));
        } else {
            richText = null;
        }
        if (!String.valueOf(d1Var.getText()).equals(u5.l(richText))) {
            d1Var.setTextSilently(Emoji.replaceEmoji(u5.r(richText, null, true), d1Var.getPaint().getFontMetricsInt(), false));
            d1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new x4(context, b6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
