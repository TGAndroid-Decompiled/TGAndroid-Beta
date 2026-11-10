package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class w2 extends w31 {
    public static final int f60605b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        x2 x2Var = (x2) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) x31Var.G;
        int i7 = x31Var.f40169z;
        String str = (String) x31Var.f40156l;
        boolean z10 = x31Var.f40150e;
        ch0 ch0Var = x2Var.f28804c;
        v2 v2Var = x2Var.f60607a0;
        if (v2Var == null || x2Var.W != stargiftattributemodel.document.f26966id) {
            x2Var.W = stargiftattributemodel.document.f26966id;
            if (v2Var != null) {
                v2Var.n(ch0Var);
            }
            x2Var.f60607a0 = new h5(3, x2Var.V, stargiftattributemodel.document);
        }
        if (ch0Var.isAttachedToWindow()) {
            x2Var.f60607a0.a(ch0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, x2Var.O);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new u31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        x2Var.j(spannableStringBuilder, 0, x2Var.f60607a0);
        x2Var.setChecked(z10);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new x2(i7, context, h6Var);
    }
}
