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
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class b7 extends q61 {
    public static final int f52394a = 0;

    static {
        q61.setup(new q61());
    }

    public static r61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        r61 J = r61.J(b7.class);
        J.d = i10;
        J.f30374z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.f30361l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f30362m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        float f7;
        c7 c7Var = (c7) view;
        int i10 = r61Var.f30374z;
        CharSequence charSequence = r61Var.f30361l;
        CharSequence charSequence2 = r61Var.f30362m;
        org.telegram.ui.Components.r6 r6Var = c7Var.f52446e;
        TextView textView = c7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        c7Var.f52448n = i10;
        if (!equals) {
            c7Var.f52449r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (c7Var.f52447f == null) {
                SpannableString spannableString = new SpannableString("x");
                c7Var.f52447f = spannableString;
                spannableString.setSpan(new ka0(AndroidUtilities.dp(55.0f), r6Var), 0, c7Var.f52447f.length(), 33);
            }
            charSequence2 = c7Var.f52447f;
        }
        r6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(is.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        c7Var.h = z10;
        c7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(r61 r61Var, r61 r61Var2) {
        if (r61Var.f30374z == r61Var2.f30374z && r61Var.d == r61Var2.d && TextUtils.equals(r61Var.f30362m, r61Var2.f30362m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new c7(context, d6Var);
    }

    @Override
    public final boolean equals(r61 r61Var, r61 r61Var2) {
        if (r61Var.d == r61Var2.d) {
            return true;
        }
        return false;
    }
}
