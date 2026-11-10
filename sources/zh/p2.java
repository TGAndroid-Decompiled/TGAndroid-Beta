package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class p2 extends w31 {
    public static final int f60521b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        q2 q2Var = (q2) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) x31Var.G;
        int i7 = x31Var.f40169z;
        String str = (String) x31Var.f40156l;
        boolean z10 = x31Var.f40150e;
        q2Var.getClass();
        ShapeDrawable L = m6.L(org.telegram.messenger.g0.L(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, q2Var.O);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new u31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        q2Var.j(spannableStringBuilder, 0, L);
        q2Var.setChecked(z10);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, context, h6Var, false, false);
        z0Var.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        z0Var.c(m6.E8, m6.F8);
        z0Var.g(-1, PorterDuff.Mode.MULTIPLY);
        z0Var.f28804c.setTranslationX(org.telegram.messenger.g0.L(2.0f));
        z0Var.a(2);
        z0Var.setBackground(null);
        return z0Var;
    }
}
