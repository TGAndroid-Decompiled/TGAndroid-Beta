package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.v51;
public final class p3 extends g51 {
    public static final int f46020a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        q3 q3Var = (q3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) h51Var.G;
        int i10 = h51Var.f24520z;
        String str = (String) h51Var.f24507l;
        boolean z11 = h51Var.e;
        bj0 bj0Var = q3Var.f18612c;
        o3 o3Var = q3Var.N;
        if (o3Var == null || q3Var.M != stargiftattributemodel.document.f18089id) {
            q3Var.M = stargiftattributemodel.document.f18089id;
            if (o3Var != null) {
                o3Var.o(bj0Var);
            }
            q3Var.N = new q5(3, q3Var.L, stargiftattributemodel.document);
        }
        if (bj0Var.isAttachedToWindow()) {
            q3Var.N.a(bj0Var);
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
            spannableStringBuilder2.setSpan(new e51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        q3Var.g(spannableStringBuilder, 0, q3Var.N);
        q3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new q3(context, i10, d6Var);
    }
}
