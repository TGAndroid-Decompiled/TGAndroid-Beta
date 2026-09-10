package xh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
public final class l7 extends u51 {
    public static final int f45674a = 0;

    static {
        u51.setup(new u51());
    }

    public static v51 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        v51 J = v51.J(l7.class);
        J.d = i10;
        J.f27842z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.f27829l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f27830m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        float f7;
        m7 m7Var = (m7) view;
        int i10 = v51Var.f27842z;
        CharSequence charSequence = v51Var.f27829l;
        CharSequence charSequence2 = v51Var.f27830m;
        org.telegram.ui.Components.o6 o6Var = m7Var.e;
        TextView textView = m7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        m7Var.f45726n = i10;
        if (!equals) {
            m7Var.f45727r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (m7Var.f45725f == null) {
                SpannableString spannableString = new SpannableString("x");
                m7Var.f45725f = spannableString;
                spannableString.setSpan(new r90(AndroidUtilities.dp(55.0f), o6Var), 0, m7Var.f45725f.length(), 33);
            }
            charSequence2 = m7Var.f45725f;
        }
        o6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(wr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        m7Var.h = z10;
        m7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(v51 v51Var, v51 v51Var2) {
        if (v51Var.f27842z == v51Var2.f27842z && v51Var.d == v51Var2.d && TextUtils.equals(v51Var.f27830m, v51Var2.f27830m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new m7(context, f6Var);
    }

    @Override
    public final boolean equals(v51 v51Var, v51 v51Var2) {
        if (v51Var.d == v51Var2.d) {
            return true;
        }
        return false;
    }
}
