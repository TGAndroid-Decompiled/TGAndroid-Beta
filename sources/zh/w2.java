package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class w2 extends x31 {
    public static final int f60593b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        x2 x2Var = (x2) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) y31Var.G;
        int i7 = y31Var.f40581z;
        String str = (String) y31Var.f40568l;
        boolean z10 = y31Var.f40562e;
        dh0 dh0Var = x2Var.f28819c;
        v2 v2Var = x2Var.f60595a0;
        if (v2Var == null || x2Var.W != stargiftattributemodel.document.f26962id) {
            x2Var.W = stargiftattributemodel.document.f26962id;
            if (v2Var != null) {
                v2Var.n(dh0Var);
            }
            x2Var.f60595a0 = new i5(3, x2Var.V, stargiftattributemodel.document);
        }
        if (dh0Var.isAttachedToWindow()) {
            x2Var.f60595a0.a(dh0Var);
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
            spannableStringBuilder2.setSpan(new v31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        x2Var.j(spannableStringBuilder, 0, x2Var.f60595a0);
        x2Var.setChecked(z10);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new x2(i7, context, g6Var);
    }
}
