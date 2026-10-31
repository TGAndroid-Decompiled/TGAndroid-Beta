package rh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.z41;
public final class u7 extends z41 {
    public static final int f47557b = 0;

    static {
        z41.h(new z41());
    }

    public static a51 i(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String f7;
        a51 K = a51.K(u7.class);
        K.d = i10;
        K.f24305z = i11;
        long j10 = tL_starsTopupOption.stars;
        K.B = j10;
        K.f24292l = cd.H(' ', "StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            f7 = null;
        } else {
            f7 = org.telegram.messenger.u1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f24293m = f7;
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        float f7;
        v7 v7Var = (v7) view;
        int i10 = a51Var.f24305z;
        CharSequence charSequence = a51Var.f24292l;
        CharSequence charSequence2 = a51Var.f24293m;
        org.telegram.ui.Components.f6 f6Var = v7Var.e;
        TextView textView = v7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        v7Var.f47594n = i10;
        if (!equals) {
            v7Var.f47595r.e(true, i10);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (v7Var.f47593f == null) {
                SpannableString spannableString = new SpannableString("x");
                v7Var.f47593f = spannableString;
                spannableString.setSpan(new u80(org.telegram.messenger.i0.L(55.0f), f6Var), 0, v7Var.f47593f.length(), 33);
            }
            charSequence2 = v7Var.f47593f;
        }
        f6Var.setText(charSequence2);
        if (cd.X) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        if (equals) {
            textView.animate().translationX(f7 * (i10 - 1) * org.telegram.messenger.i0.L(2.66f)).setDuration(320L).setInterpolator(gr.h).start();
        } else {
            textView.setTranslationX(f7 * (i10 - 1) * org.telegram.messenger.i0.L(2.66f));
        }
        v7Var.h = z10;
        v7Var.invalidate();
    }

    @Override
    public final boolean c(a51 a51Var, a51 a51Var2) {
        if (a51Var.f24305z == a51Var2.f24305z && a51Var.d == a51Var2.d && TextUtils.equals(a51Var.f24293m, a51Var2.f24293m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new v7(context, p6Var);
    }

    @Override
    public final boolean e(a51 a51Var, a51 a51Var2) {
        if (a51Var.d == a51Var2.d) {
            return true;
        }
        return false;
    }
}
