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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class b7 extends t61 {
    public static final int f52531a = 0;

    static {
        t61.setup(new t61());
    }

    public static u61 a(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String formatCurrency;
        u61 J = u61.J(b7.class);
        J.d = i10;
        J.f31089z = i11;
        long j3 = tL_starsTopupOption.stars;
        J.B = j3;
        J.f31076l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
        if (tL_starsTopupOption.loadingStorePrice) {
            formatCurrency = null;
        } else {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        J.f31077m = formatCurrency;
        J.G = tL_starsTopupOption;
        return J;
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        float f7;
        c7 c7Var = (c7) view;
        int i10 = u61Var.f31089z;
        CharSequence charSequence = u61Var.f31076l;
        CharSequence charSequence2 = u61Var.f31077m;
        org.telegram.ui.Components.r6 r6Var = c7Var.f52583e;
        TextView textView = c7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        c7Var.f52585n = i10;
        if (!equals) {
            c7Var.f52586r.d(i10, true);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (c7Var.f52584f == null) {
                SpannableString spannableString = new SpannableString("x");
                c7Var.f52584f = spannableString;
                spannableString.setSpan(new na0(AndroidUtilities.dp(55.0f), r6Var), 0, c7Var.f52584f.length(), 33);
            }
            charSequence2 = c7Var.f52584f;
        }
        r6Var.setText(charSequence2);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f)).setDuration(320L).setInterpolator(js.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * AndroidUtilities.dp(2.66f));
        }
        c7Var.h = z10;
        c7Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        if (u61Var.f31089z == u61Var2.f31089z && u61Var.d == u61Var2.d && TextUtils.equals(u61Var.f31077m, u61Var2.f31077m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new c7(context, c6Var);
    }

    @Override
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        if (u61Var.d == u61Var2.d) {
            return true;
        }
        return false;
    }
}
