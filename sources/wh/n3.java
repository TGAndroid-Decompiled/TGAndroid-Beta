package wh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class n3 extends u51 {
    public static final int f44267a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        o3 o3Var = (o3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) v51Var.G;
        int i10 = v51Var.f27842z;
        String str = (String) v51Var.f27829l;
        boolean z11 = v51Var.e;
        kj0 kj0Var = o3Var.f17725c;
        m3 m3Var = o3Var.N;
        if (m3Var == null || o3Var.M != stargiftattributemodel.document.f17201id) {
            o3Var.M = stargiftattributemodel.document.f17201id;
            if (m3Var != null) {
                m3Var.o(kj0Var);
            }
            o3Var.N = new p5(3, o3Var.L, stargiftattributemodel.document);
        }
        if (kj0Var.isAttachedToWindow()) {
            o3Var.N.a(kj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, o3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new s51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        o3Var.g(spannableStringBuilder, 0, o3Var.N);
        o3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new o3(context, i10, f6Var);
    }
}
