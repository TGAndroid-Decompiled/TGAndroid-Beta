package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class z2 extends w31 {
    public static final int f60662b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        a3 a3Var = (a3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) x31Var.G;
        int i7 = x31Var.f40169z;
        String str = (String) x31Var.f40156l;
        boolean z10 = x31Var.f40150e;
        h6 h6Var = a3Var.O;
        ch0 ch0Var = a3Var.f28804c;
        y2 y2Var = a3Var.f60212a0;
        if (y2Var == null || a3Var.W != stargiftattributepattern.document.f26966id) {
            a3Var.W = stargiftattributepattern.document.f26966id;
            if (y2Var != null) {
                y2Var.n(ch0Var);
            }
            ?? h5Var = new h5(3, a3Var.V, stargiftattributepattern.document);
            a3Var.f60212a0 = h5Var;
            t6.x(a3Var, h5Var, m6.E8, h6Var, PorterDuff.Mode.SRC_IN);
        }
        if (ch0Var.isAttachedToWindow()) {
            a3Var.f60212a0.a(ch0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, h6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new u31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        a3Var.j(spannableStringBuilder, 0, a3Var.f60212a0);
        a3Var.setChecked(z10);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new a3(i7, context, h6Var);
    }
}
