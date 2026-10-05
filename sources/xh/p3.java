package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class p3 extends g61 {
    public static final int f50187a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        q3 q3Var = (q3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) h61Var.G;
        int i10 = h61Var.f27106z;
        String str = (String) h61Var.f27093l;
        boolean z11 = h61Var.f27087e;
        nj0 nj0Var = q3Var.f20594c;
        o3 o3Var = q3Var.N;
        if (o3Var == null || q3Var.M != stargiftattributemodel.document.f20053id) {
            q3Var.M = stargiftattributemodel.document.f20053id;
            if (o3Var != null) {
                o3Var.o(nj0Var);
            }
            q3Var.N = new q5(3, q3Var.L, stargiftattributemodel.document);
        }
        if (nj0Var.isAttachedToWindow()) {
            q3Var.N.a(nj0Var);
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
            spannableStringBuilder2.setSpan(new e61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
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
