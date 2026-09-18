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
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class h7 extends w51 {
    public static final int f47485a = 0;

    static {
        w51.setup(new w51());
    }

    public static x51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        x51 J = x51.J(h7.class);
        J.d = i10;
        J.f30261z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.f30248l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f30249m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        float f7;
        i7 i7Var = (i7) view;
        int i10 = x51Var.f30261z;
        CharSequence charSequence = x51Var.f30248l;
        CharSequence charSequence2 = x51Var.f30249m;
        org.telegram.ui.Components.p6 p6Var = i7Var.e;
        TextView textView = i7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        i7Var.f47525n = i10;
        if (!equals) {
            i7Var.f47526r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (i7Var.f47524f == null) {
                SpannableString spannableString = new SpannableString("x");
                i7Var.f47524f = spannableString;
                spannableString.setSpan(new q90(AndroidUtilities.dp(55.0f), p6Var), 0, i7Var.f47524f.length(), 33);
            }
            charSequence2 = i7Var.f47524f;
        }
        p6Var.setText(charSequence2);
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
        i7Var.h = z10;
        i7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(x51 x51Var, x51 x51Var2) {
        if (x51Var.f30261z == x51Var2.f30261z && x51Var.d == x51Var2.d && TextUtils.equals(x51Var.f30249m, x51Var2.f30249m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new i7(context, e6Var);
    }

    @Override
    public final boolean equals(x51 x51Var, x51 x51Var2) {
        if (x51Var.d == x51Var2.d) {
            return true;
        }
        return false;
    }
}
