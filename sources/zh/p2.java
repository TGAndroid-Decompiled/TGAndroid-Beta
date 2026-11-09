package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class p2 extends x31 {
    public static final int f60512b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        q2 q2Var = (q2) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) y31Var.G;
        int i7 = y31Var.f40581z;
        String str = (String) y31Var.f40568l;
        boolean z10 = y31Var.f40562e;
        q2Var.getClass();
        ShapeDrawable L = l6.L(org.telegram.messenger.g0.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, q2Var.O);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new v31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        q2Var.j(spannableStringBuilder, 0, L);
        q2Var.setChecked(z10);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, context, g6Var, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.c(l6.E8, l6.F8);
        z0Var.g(-1, PorterDuff.Mode.MULTIPLY);
        z0Var.f28819c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        z0Var.a(2);
        z0Var.setBackground(null);
        return z0Var;
    }
}
