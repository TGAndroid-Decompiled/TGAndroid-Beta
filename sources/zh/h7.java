package zh;

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
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;
public final class h7 extends g51 {
    public static final int f52021a = 0;

    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        h51 J = h51.J(h7.class);
        J.d = i10;
        J.f26634z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.f26621l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f26622m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        float f7;
        i7 i7Var = (i7) view;
        int i10 = h51Var.f26634z;
        CharSequence charSequence = h51Var.f26621l;
        CharSequence charSequence2 = h51Var.f26622m;
        org.telegram.ui.Components.q6 q6Var = i7Var.f52081e;
        TextView textView = i7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        i7Var.f52083n = i10;
        if (!equals) {
            i7Var.f52084r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (i7Var.f52082f == null) {
                SpannableString spannableString = new SpannableString("x");
                i7Var.f52082f = spannableString;
                spannableString.setSpan(new i90(AndroidUtilities.dp(55.0f), q6Var), 0, i7Var.f52082f.length(), 33);
            }
            charSequence2 = i7Var.f52082f;
        }
        q6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(pr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        i7Var.h = z10;
        i7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        if (h51Var.f26634z == h51Var2.f26634z && h51Var.d == h51Var2.d && TextUtils.equals(h51Var.f26622m, h51Var2.f26622m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new i7(context, f6Var);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.d == h51Var2.d) {
            return true;
        }
        return false;
    }
}
