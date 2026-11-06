package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.t31;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class x2 extends v31 {
    public static final int f60494b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        y2 y2Var = (y2) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) w31Var.G;
        int i7 = w31Var.f39843z;
        String str = (String) w31Var.f39830l;
        boolean z10 = w31Var.f39824e;
        ch0 ch0Var = y2Var.f28812c;
        w2 w2Var = y2Var.f60496a0;
        if (w2Var == null || y2Var.W != stargiftattributemodel.document.f26958id) {
            y2Var.W = stargiftattributemodel.document.f26958id;
            if (w2Var != null) {
                w2Var.n(ch0Var);
            }
            y2Var.f60496a0 = new i5(3, y2Var.V, stargiftattributemodel.document);
        }
        if (ch0Var.isAttachedToWindow()) {
            y2Var.f60496a0.a(ch0Var);
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
            spannableStringBuilder2.setSpan(new t31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        y2Var.j(spannableStringBuilder, 0, y2Var.f60496a0);
        y2Var.setChecked(z10);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new y2(i7, context, f6Var);
    }
}
