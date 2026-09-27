package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class j3 extends w51 {
    public static final int f46284a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        k3 k3Var = (k3) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) x51Var.G;
        int i10 = x51Var.f30315z;
        String str = (String) x51Var.f30302l;
        boolean z11 = x51Var.e;
        k3Var.getClass();
        ShapeDrawable K = i6.K(AndroidUtilities.dp(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, k3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new u51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        k3Var.g(spannableStringBuilder, 0, K);
        k3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, e6 e6Var) {
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, context, e6Var, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.c(i6.v0(i6.E8, e6Var), i6.v0(i6.F8, e6Var));
        g1Var.e(-1, PorterDuff.Mode.MULTIPLY);
        g1Var.f18882c.setTranslationX(AndroidUtilities.dp(2.0f));
        g1Var.a(2);
        g1Var.setBackground(null);
        return g1Var;
    }
}
