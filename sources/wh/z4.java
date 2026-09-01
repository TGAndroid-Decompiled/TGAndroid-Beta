package wh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class z4 extends i51 {
    public static final int f50222a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        TL_iv.RichText richText;
        a5 a5Var = (a5) view;
        a aVar = (a) j51Var.G;
        y4 y4Var = (y4) j51Var.H;
        e1 e1Var = a5Var.f49645r;
        a5Var.f50175a = aVar;
        a5Var.f49646s = y4Var;
        a5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        a5Var.c(aVar);
        if (y4Var != null) {
            richText = (TL_iv.RichText) ((x2) y4Var).f50154a.f49990j3.get(Long.valueOf(aVar.f49633t));
        } else {
            richText = null;
        }
        if (!String.valueOf(e1Var.getText()).equals(x5.l(richText))) {
            e1Var.setTextSilently(Emoji.replaceEmoji(x5.r(richText, null, true), e1Var.getPaint().getFontMetricsInt(), false));
            e1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new a5(context, g6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
