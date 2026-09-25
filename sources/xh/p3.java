package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class p3 extends u51 {
    public static final int f46349a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        q3 q3Var = (q3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) v51Var.G;
        int i10 = v51Var.f29062z;
        String str = (String) v51Var.f29049l;
        boolean z11 = v51Var.e;
        lj0 lj0Var = q3Var.f18835c;
        o3 o3Var = q3Var.N;
        if (o3Var == null || q3Var.M != stargiftattributemodel.document.f18342id) {
            q3Var.M = stargiftattributemodel.document.f18342id;
            if (o3Var != null) {
                o3Var.o(lj0Var);
            }
            q3Var.N = new q5(3, q3Var.L, stargiftattributemodel.document);
        }
        if (lj0Var.isAttachedToWindow()) {
            q3Var.N.a(lj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, q3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new s51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        q3Var.g(spannableStringBuilder, 0, q3Var.N);
        q3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new q3(context, i10, d6Var);
    }
}
