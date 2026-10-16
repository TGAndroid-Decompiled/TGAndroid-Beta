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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class b7 extends l61 {
    public static final int f50322a = 0;

    static {
        l61.setup(new l61());
    }

    public static m61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        m61 J = m61.J(b7.class);
        J.d = i10;
        J.f26959z = i11;
        long j10 = tL_starsTopupOption.stars;
        J.B = j10;
        J.f26946l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f26947m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        float f7;
        c7 c7Var = (c7) view;
        int i10 = m61Var.f26959z;
        CharSequence charSequence = m61Var.f26946l;
        CharSequence charSequence2 = m61Var.f26947m;
        org.telegram.ui.Components.s6 s6Var = c7Var.e;
        TextView textView = c7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        c7Var.f50357n = i10;
        if (!equals) {
            c7Var.f50358r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (c7Var.f50356f == null) {
                SpannableString spannableString = new SpannableString("x");
                c7Var.f50356f = spannableString;
                spannableString.setSpan(new ia0(AndroidUtilities.dp(55.0f), s6Var), 0, c7Var.f50356f.length(), 33);
            }
            charSequence2 = c7Var.f50356f;
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
    public final boolean contentsEquals(m61 m61Var, m61 m61Var2) {
        if (m61Var.f26959z == m61Var2.f26959z && m61Var.d == m61Var2.d && TextUtils.equals(m61Var.f26947m, m61Var2.f26947m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new c7(context, c6Var);
    }

    @Override
    public final boolean equals(m61 m61Var, m61 m61Var2) {
        if (m61Var.d == m61Var2.d) {
            return true;
        }
        return false;
    }
}
