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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.v51;
public final class i7 extends g51 {
    public static final int f47213a = 0;

    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        h51 J = h51.J(i7.class);
        J.d = i10;
        J.f24520z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.f24507l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f24508m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        float f7;
        j7 j7Var = (j7) view;
        int i10 = h51Var.f24520z;
        CharSequence charSequence = h51Var.f24507l;
        CharSequence charSequence2 = h51Var.f24508m;
        org.telegram.ui.Components.p6 p6Var = j7Var.e;
        TextView textView = j7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        j7Var.f47260n = i10;
        if (!equals) {
            j7Var.f47261r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (j7Var.f47259f == null) {
                SpannableString spannableString = new SpannableString("x");
                j7Var.f47259f = spannableString;
                spannableString.setSpan(new i90(AndroidUtilities.dp(55.0f), p6Var), 0, j7Var.f47259f.length(), 33);
            }
            charSequence2 = j7Var.f47259f;
        }
        p6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(rr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        j7Var.h = z10;
        j7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.f24520z == h51Var2.f24520z && h51Var.d == h51Var2.d && TextUtils.equals(h51Var.f24508m, h51Var2.f24508m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new j7(context, d6Var);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }
}
