package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class v2 extends w31 {
    public static final int f60569b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        w2 w2Var = (w2) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) x31Var.G;
        int i7 = x31Var.f40193z;
        String str = (String) x31Var.f40180l;
        boolean z10 = x31Var.f40174e;
        ch0 ch0Var = w2Var.f28816c;
        u2 u2Var = w2Var.f60574a0;
        if (u2Var == null || w2Var.W != stargiftattributemodel.document.f26962id) {
            w2Var.W = stargiftattributemodel.document.f26962id;
            if (u2Var != null) {
                u2Var.n(ch0Var);
            }
            w2Var.f60574a0 = new i5(3, w2Var.V, stargiftattributemodel.document);
        }
        if (ch0Var.isAttachedToWindow()) {
            w2Var.f60574a0.a(ch0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, w2Var.O);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new u31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        w2Var.j(spannableStringBuilder, 0, w2Var.f60574a0);
        w2Var.setChecked(z10);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new w2(i7, context, f6Var);
    }
}
