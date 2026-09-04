package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.v51;
public final class n3 extends g51 {
    public static final int f50460a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        o3 o3Var = (o3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) h51Var.G;
        int i10 = h51Var.f26607z;
        String str = (String) h51Var.f26594l;
        boolean z11 = h51Var.f26588e;
        aj0 aj0Var = o3Var.f20403c;
        m3 m3Var = o3Var.N;
        if (m3Var == null || o3Var.M != stargiftattributemodel.document.f19875id) {
            o3Var.M = stargiftattributemodel.document.f19875id;
            if (m3Var != null) {
                m3Var.o(aj0Var);
            }
            o3Var.N = new q5(3, o3Var.L, stargiftattributemodel.document);
        }
        if (aj0Var.isAttachedToWindow()) {
            o3Var.N.a(aj0Var);
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
            spannableStringBuilder2.setSpan(new e51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        o3Var.g(spannableStringBuilder, 0, o3Var.N);
        o3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new o3(context, i10, f6Var);
    }
}
