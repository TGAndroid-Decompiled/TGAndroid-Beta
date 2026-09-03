package vh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class a5 extends h51 {
    public static final int f45879a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        TL_iv.RichText richText;
        b5 b5Var = (b5) view;
        a aVar = (a) i51Var.G;
        z4 z4Var = (z4) i51Var.H;
        e1 e1Var = b5Var.f45901r;
        b5Var.f46414a = aVar;
        b5Var.f45902s = z4Var;
        b5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        b5Var.c(aVar);
        if (z4Var != null) {
            richText = (TL_iv.RichText) ((y2) z4Var).f46409a.f46219j3.get(Long.valueOf(aVar.f45868t));
        } else {
            richText = null;
        }
        if (!String.valueOf(e1Var.getText()).equals(y5.l(richText))) {
            e1Var.setTextSilently(Emoji.replaceEmoji(y5.r(richText, null, true), e1Var.getPaint().getFontMetricsInt(), false));
            e1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new b5(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
