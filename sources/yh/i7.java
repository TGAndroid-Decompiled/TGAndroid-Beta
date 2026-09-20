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
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class i7 extends v51 {
    public static final int f47566a = 0;

    static {
        v51.setup(new v51());
    }

    public static w51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        w51 J = w51.J(i7.class);
        J.d = i10;
        J.f29961z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.f29948l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f29949m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        float f7;
        j7 j7Var = (j7) view;
        int i10 = w51Var.f29961z;
        CharSequence charSequence = w51Var.f29948l;
        CharSequence charSequence2 = w51Var.f29949m;
        org.telegram.ui.Components.o6 o6Var = j7Var.e;
        TextView textView = j7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        j7Var.f47612n = i10;
        if (!equals) {
            j7Var.f47613r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (j7Var.f47611f == null) {
                SpannableString spannableString = new SpannableString("x");
                j7Var.f47611f = spannableString;
                spannableString.setSpan(new p90(AndroidUtilities.dp(55.0f), o6Var), 0, j7Var.f47611f.length(), 33);
            }
            charSequence2 = j7Var.f47611f;
        }
        o6Var.setText(charSequence2);
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
        j7Var.h = z10;
        j7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(w51 w51Var, w51 w51Var2) {
        if (w51Var.f29961z == w51Var2.f29961z && w51Var.d == w51Var2.d && TextUtils.equals(w51Var.f29949m, w51Var2.f29949m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new j7(context, f6Var);
    }

    @Override
    public final boolean equals(w51 w51Var, w51 w51Var2) {
        if (w51Var.d == w51Var2.d) {
            return true;
        }
        return false;
    }
}
