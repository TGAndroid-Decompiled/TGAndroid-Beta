package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class p3 extends x51 {
    public static final int f46456a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        q3 q3Var = (q3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) y51Var.G;
        int i10 = y51Var.f30650z;
        String str = (String) y51Var.f30637l;
        boolean z11 = y51Var.e;
        oj0 oj0Var = q3Var.f18851c;
        o3 o3Var = q3Var.N;
        if (o3Var == null || q3Var.M != stargiftattributemodel.document.f18358id) {
            q3Var.M = stargiftattributemodel.document.f18358id;
            if (o3Var != null) {
                o3Var.o(oj0Var);
            }
            q3Var.N = new q5(3, q3Var.L, stargiftattributemodel.document);
        }
        if (oj0Var.isAttachedToWindow()) {
            q3Var.N.a(oj0Var);
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
            spannableStringBuilder2.setSpan(new v51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        q3Var.g(spannableStringBuilder, 0, q3Var.N);
        q3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new q3(context, i10, d6Var);
    }
}
