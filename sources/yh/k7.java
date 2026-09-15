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
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w51;
public final class k7 extends h51 {
    public static final int f47377a = 0;

    static {
        h51.setup(new h51());
    }

    public static i51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        i51 J = i51.J(k7.class);
        J.d = i10;
        J.f24907z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.f24894l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f24895m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        float f7;
        l7 l7Var = (l7) view;
        int i10 = i51Var.f24907z;
        CharSequence charSequence = i51Var.f24894l;
        CharSequence charSequence2 = i51Var.f24895m;
        org.telegram.ui.Components.n6 n6Var = l7Var.e;
        TextView textView = l7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        l7Var.f47422n = i10;
        if (!equals) {
            l7Var.f47423r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (l7Var.f47421f == null) {
                SpannableString spannableString = new SpannableString("x");
                l7Var.f47421f = spannableString;
                spannableString.setSpan(new h90(AndroidUtilities.dp(55.0f), n6Var), 0, l7Var.f47421f.length(), 33);
            }
            charSequence2 = l7Var.f47421f;
        }
        n6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(qr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        l7Var.h = z10;
        l7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        if (i51Var.f24907z == i51Var2.f24907z && i51Var.d == i51Var2.d && TextUtils.equals(i51Var.f24895m, i51Var2.f24895m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new l7(context, e6Var);
    }

    @Override
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        if (i51Var.d == i51Var2.d) {
            return true;
        }
        return false;
    }
}
