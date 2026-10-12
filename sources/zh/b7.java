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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class b7 extends k61 {
    public static final int f50321a = 0;

    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        l61 J = l61.J(b7.class);
        J.d = i10;
        J.f26967z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f26954l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f26955m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        float f7;
        c7 c7Var = (c7) view;
        int i10 = l61Var.f26967z;
        CharSequence charSequence = l61Var.f26954l;
        CharSequence charSequence2 = l61Var.f26955m;
        org.telegram.ui.Components.s6 s6Var = c7Var.e;
        TextView textView = c7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        c7Var.f50356n = i10;
        if (!equals) {
            c7Var.f50357r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (c7Var.f50355f == null) {
                SpannableString spannableString = new SpannableString("x");
                c7Var.f50355f = spannableString;
                spannableString.setSpan(new ia0(AndroidUtilities.dp(55.0f), s6Var), 0, c7Var.f50355f.length(), 33);
            }
            charSequence2 = c7Var.f50355f;
        }
        s6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(es.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        c7Var.h = z10;
        c7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        if (l61Var.f26967z == l61Var2.f26967z && l61Var.d == l61Var2.d && TextUtils.equals(l61Var.f26955m, l61Var2.f26955m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new c7(context, c6Var);
    }

    @Override
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        if (l61Var.d == l61Var2.d) {
            return true;
        }
        return false;
    }
}
