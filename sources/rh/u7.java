package rh;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class u7 extends a51 {
    public static final int f47564b = 0;

    static {
        a51.h(new a51());
    }

    public static b51 i(int i10, int i11, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        String f7;
        b51 K = b51.K(u7.class);
        K.d = i10;
        K.f24656z = i11;
        long j10 = tL_starsTopupOption.stars;
        K.B = j10;
        K.f24643l = dd.H(' ', "StarsCount", (int) j10);
        if (tL_starsTopupOption.loadingStorePrice) {
            f7 = null;
        } else {
            f7 = org.telegram.messenger.u1.i().f(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        }
        K.f24644m = f7;
        K.G = tL_starsTopupOption;
        return K;
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        float f7;
        v7 v7Var = (v7) view;
        int i10 = b51Var.f24656z;
        CharSequence charSequence = b51Var.f24643l;
        CharSequence charSequence2 = b51Var.f24644m;
        org.telegram.ui.Components.f6 f6Var = v7Var.e;
        TextView textView = v7Var.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        v7Var.f47608n = i10;
        if (!equals) {
            v7Var.f47609r.e(true, i10);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (v7Var.f47607f == null) {
                SpannableString spannableString = new SpannableString("x");
                v7Var.f47607f = spannableString;
                spannableString.setSpan(new u80(org.telegram.messenger.i0.L(55.0f), f6Var), 0, v7Var.f47607f.length(), 33);
            }
            charSequence2 = v7Var.f47607f;
        }
        f6Var.setText(charSequence2);
        if (dd.X) {
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
    public final boolean c(b51 b51Var, b51 b51Var2) {
        if (b51Var.f24656z == b51Var2.f24656z && b51Var.d == b51Var2.d && TextUtils.equals(b51Var.f24644m, b51Var2.f24644m)) {
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new v7(context, p6Var);
    }

    @Override
    public final boolean e(b51 b51Var, b51 b51Var2) {
        if (b51Var.d == b51Var2.d) {
            return true;
        }
        return false;
    }
}
