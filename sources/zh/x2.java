package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class x2 extends q31 {
    public static final int f60469b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        y2 y2Var = (y2) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) r31Var.G;
        int i7 = r31Var.f37611z;
        String str = (String) r31Var.f37598l;
        boolean z10 = r31Var.f37592e;
        ch0 ch0Var = y2Var.f28812c;
        w2 w2Var = y2Var.f60471a0;
        if (w2Var == null || y2Var.W != stargiftattributemodel.document.f26958id) {
            y2Var.W = stargiftattributemodel.document.f26958id;
            if (w2Var != null) {
                w2Var.n(ch0Var);
            }
            y2Var.f60471a0 = new i5(3, y2Var.V, stargiftattributemodel.document);
        }
        if (ch0Var.isAttachedToWindow()) {
            y2Var.f60471a0.a(ch0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, y2Var.O);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new o31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        y2Var.j(spannableStringBuilder, 0, y2Var.f60471a0);
        y2Var.setChecked(z10);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new y2(i7, context, f6Var);
    }
}
