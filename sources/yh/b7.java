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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class b7 extends p61 {
    public static final int f52428a = 0;

    static {
        p61.setup(new p61());
    }

    public static q61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        q61 J = q61.J(b7.class);
        J.d = i10;
        J.f30180z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.f30167l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f30168m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        float f7;
        c7 c7Var = (c7) view;
        int i10 = q61Var.f30180z;
        CharSequence charSequence = q61Var.f30167l;
        CharSequence charSequence2 = q61Var.f30168m;
        org.telegram.ui.Components.r6 r6Var = c7Var.f52480e;
        TextView textView = c7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        c7Var.f52482n = i10;
        if (!equals) {
            c7Var.f52483r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (c7Var.f52481f == null) {
                SpannableString spannableString = new SpannableString("x");
                c7Var.f52481f = spannableString;
                spannableString.setSpan(new ja0(AndroidUtilities.dp(55.0f), r6Var), 0, c7Var.f52481f.length(), 33);
            }
            charSequence2 = c7Var.f52481f;
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
    public final boolean contentsEquals(q61 q61Var, q61 q61Var2) {
        if (q61Var.f30180z == q61Var2.f30180z && q61Var.d == q61Var2.d && TextUtils.equals(q61Var.f30168m, q61Var2.f30168m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new c7(context, d6Var);
    }

    @Override
    public final boolean equals(q61 q61Var, q61 q61Var2) {
        if (q61Var.d == q61Var2.d) {
            return true;
        }
        return false;
    }
}
