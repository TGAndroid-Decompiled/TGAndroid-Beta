package wh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class z4 extends g51 {
    public static final int f50258a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        TL_iv.RichText richText;
        a5 a5Var = (a5) view;
        a aVar = (a) h51Var.G;
        y4 y4Var = (y4) h51Var.H;
        e1 e1Var = a5Var.f49681r;
        a5Var.f50211a = aVar;
        a5Var.f49682s = y4Var;
        a5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        a5Var.c(aVar);
        if (y4Var != null) {
            richText = (TL_iv.RichText) ((x2) y4Var).f50190a.f50026j3.get(Long.valueOf(aVar.f49669t));
        } else {
            richText = null;
        }
        if (!String.valueOf(e1Var.getText()).equals(x5.l(richText))) {
            e1Var.setTextSilently(Emoji.replaceEmoji(x5.r(richText, null, true), e1Var.getPaint().getFontMetricsInt(), false));
            e1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new a5(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
