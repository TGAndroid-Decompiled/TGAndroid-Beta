package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class o3 extends t61 {
    public static final int f51674a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        p3 p3Var = (p3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) u61Var.G;
        int i10 = u61Var.f31084z;
        String str = (String) u61Var.f31071l;
        boolean z11 = u61Var.f31065e;
        ik0 ik0Var = p3Var.f20324c;
        n3 n3Var = p3Var.N;
        if (n3Var == null || p3Var.M != stargiftattributemodel.document.f19809id) {
            p3Var.M = stargiftattributemodel.document.f19809id;
            if (n3Var != null) {
                n3Var.o(ik0Var);
            }
            p3Var.N = new s5(3, p3Var.L, stargiftattributemodel.document);
        }
        if (ik0Var.isAttachedToWindow()) {
            p3Var.N.a(ik0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, p3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new r61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        p3Var.g(spannableStringBuilder, 0, p3Var.N);
        p3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new p3(context, i10, c6Var);
    }
}
