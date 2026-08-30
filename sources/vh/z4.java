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
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class z4 extends h51 {
    public static final int f46338a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        TL_iv.RichText richText;
        a5 a5Var = (a5) view;
        a aVar = (a) i51Var.G;
        y4 y4Var = (y4) i51Var.H;
        d1 d1Var = a5Var.f45805r;
        a5Var.f46283a = aVar;
        a5Var.f45806s = y4Var;
        a5Var.g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        a5Var.c(aVar);
        if (y4Var != null) {
            richText = (TL_iv.RichText) ((x2) y4Var).f46278a.f46122j3.get(Long.valueOf(aVar.f45790t));
        } else {
            richText = null;
        }
        if (!String.valueOf(d1Var.getText()).equals(x5.l(richText))) {
            d1Var.setTextSilently(Emoji.replaceEmoji(x5.r(richText, null, true), d1Var.getPaint().getFontMetricsInt(), false));
            d1Var.invalidateEffects();
        }
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new a5(context, f6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
