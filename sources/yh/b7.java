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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class b7 extends o61 {
    public static final int f52307a = 0;

    static {
        o61.setup(new o61());
    }

    public static p61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        p61 J = p61.J(b7.class);
        J.d = i10;
        J.f29747z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.f29734l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f29735m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        float f7;
        c7 c7Var = (c7) view;
        int i10 = p61Var.f29747z;
        CharSequence charSequence = p61Var.f29734l;
        CharSequence charSequence2 = p61Var.f29735m;
        org.telegram.ui.Components.r6 r6Var = c7Var.f52359e;
        TextView textView = c7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        c7Var.f52361n = i10;
        if (!equals) {
            c7Var.f52362r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (c7Var.f52360f == null) {
                SpannableString spannableString = new SpannableString("x");
                c7Var.f52360f = spannableString;
                spannableString.setSpan(new ja0(AndroidUtilities.dp(55.0f), r6Var), 0, c7Var.f52360f.length(), 33);
            }
            charSequence2 = c7Var.f52360f;
        }
        r6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(hs.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        c7Var.h = z10;
        c7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        if (p61Var.f29747z == p61Var2.f29747z && p61Var.d == p61Var2.d && TextUtils.equals(p61Var.f29735m, p61Var2.f29735m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new c7(context, e6Var);
    }

    @Override
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        if (p61Var.d == p61Var2.d) {
            return true;
        }
        return false;
    }
}
