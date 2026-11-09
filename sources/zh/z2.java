package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class z2 extends x31 {
    public static final int f60650b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        a3 a3Var = (a3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) y31Var.G;
        int i7 = y31Var.f40581z;
        String str = (String) y31Var.f40568l;
        boolean z10 = y31Var.f40562e;
        g6 g6Var = a3Var.O;
        dh0 dh0Var = a3Var.f28819c;
        y2 y2Var = a3Var.f60214a0;
        if (y2Var == null || a3Var.W != stargiftattributepattern.document.f26962id) {
            a3Var.W = stargiftattributepattern.document.f26962id;
            if (y2Var != null) {
                y2Var.n(dh0Var);
            }
            ?? i5Var = new i5(3, a3Var.V, stargiftattributepattern.document);
            a3Var.f60214a0 = i5Var;
            s6.x(a3Var, i5Var, l6.E8, g6Var, PorterDuff.Mode.SRC_IN);
        }
        if (dh0Var.isAttachedToWindow()) {
            a3Var.f60214a0.a(dh0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, g6Var);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new v31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        a3Var.j(spannableStringBuilder, 0, a3Var.f60214a0);
        a3Var.setChecked(z10);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new a3(i7, context, g6Var);
    }
}
