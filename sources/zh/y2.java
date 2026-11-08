package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class y2 extends w31 {
    public static final int f60616b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        z2 z2Var = (z2) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) x31Var.G;
        int i7 = x31Var.f40193z;
        String str = (String) x31Var.f40180l;
        boolean z10 = x31Var.f40174e;
        f6 f6Var = z2Var.O;
        ch0 ch0Var = z2Var.f28816c;
        x2 x2Var = z2Var.f60632a0;
        if (x2Var == null || z2Var.W != stargiftattributepattern.document.f26962id) {
            z2Var.W = stargiftattributepattern.document.f26962id;
            if (x2Var != null) {
                x2Var.n(ch0Var);
            }
            ?? i5Var = new i5(3, z2Var.V, stargiftattributepattern.document);
            z2Var.f60632a0 = i5Var;
            r6.y(z2Var, i5Var, k6.E8, f6Var, PorterDuff.Mode.SRC_IN);
        }
        if (ch0Var.isAttachedToWindow()) {
            z2Var.f60632a0.a(ch0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, f6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new u31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        z2Var.j(spannableStringBuilder, 0, z2Var.f60632a0);
        z2Var.setChecked(z10);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new z2(i7, context, f6Var);
    }
}
