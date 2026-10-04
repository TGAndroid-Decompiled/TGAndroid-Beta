package yh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.zl0;
public final class j7 extends f61 {
    public static final int f51484a = 0;

    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        g61 J = g61.J(j7.class);
        J.d = i10;
        J.f26681z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.f26668l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f26669m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        float f7;
        k7 k7Var = (k7) view;
        int i10 = g61Var.f26681z;
        CharSequence charSequence = g61Var.f26668l;
        CharSequence charSequence2 = g61Var.f26669m;
        org.telegram.ui.Components.p6 p6Var = k7Var.f51538e;
        TextView textView = k7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        k7Var.f51540n = i10;
        if (!equals) {
            k7Var.f51541r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (k7Var.f51539f == null) {
                SpannableString spannableString = new SpannableString("x");
                k7Var.f51539f = spannableString;
                spannableString.setSpan(new v90(AndroidUtilities.dp(55.0f), p6Var), 0, k7Var.f51539f.length(), 33);
            }
            charSequence2 = k7Var.f51539f;
        }
        p6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(tr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        k7Var.h = z10;
        k7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(g61 g61Var, g61 g61Var2) {
        if (g61Var.f26681z == g61Var2.f26681z && g61Var.d == g61Var2.d && TextUtils.equals(g61Var.f26669m, g61Var2.f26669m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new k7(context, d6Var);
    }

    @Override
    public final boolean equals(g61 g61Var, g61 g61Var2) {
        if (g61Var.d == g61Var2.d) {
            return true;
        }
        return false;
    }
}
