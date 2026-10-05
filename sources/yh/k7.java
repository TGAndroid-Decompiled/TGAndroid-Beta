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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class k7 extends g61 {
    public static final int f51553a = 0;

    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        h61 K = h61.K(k7.class);
        K.d = i10;
        K.f27106z = i11;
        long j3 = tL_starsTopupOption.stars;
        K.B = j3;
        K.f27093l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f27094m = formatCurrency;
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        float f7;
        l7 l7Var = (l7) view;
        int i10 = h61Var.f27106z;
        CharSequence charSequence = h61Var.f27093l;
        CharSequence charSequence2 = h61Var.f27094m;
        org.telegram.ui.Components.p6 p6Var = l7Var.f51601e;
        TextView textView = l7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        l7Var.f51603n = i10;
        if (!equals) {
            l7Var.f51604r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (l7Var.f51602f == null) {
                SpannableString spannableString = new SpannableString("x");
                l7Var.f51602f = spannableString;
                spannableString.setSpan(new v90(AndroidUtilities.dp(55.0f), p6Var), 0, l7Var.f51602f.length(), 33);
            }
            charSequence2 = l7Var.f51602f;
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
        l7Var.h = z10;
        l7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(h61 h61Var, h61 h61Var2) {
        if (h61Var.f27106z == h61Var2.f27106z && h61Var.d == h61Var2.d && TextUtils.equals(h61Var.f27094m, h61Var2.f27094m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new l7(context, d6Var);
    }

    @Override
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        if (h61Var.d == h61Var2.d) {
            return true;
        }
        return false;
    }
}
