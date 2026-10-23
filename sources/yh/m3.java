package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yj0;
public final class m3 extends g61 {
    public static final int f50408a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        n3 n3Var = (n3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) h61Var.G;
        int i10 = h61Var.f26799z;
        String str = (String) h61Var.f26786l;
        boolean z11 = h61Var.e;
        yj0 yj0Var = n3Var.f20767c;
        l3 l3Var = n3Var.N;
        if (l3Var == null || n3Var.M != stargiftattributemodel.document.f20286id) {
            n3Var.M = stargiftattributemodel.document.f20286id;
            if (l3Var != null) {
                l3Var.o(yj0Var);
            }
            n3Var.N = new r5(3, n3Var.L, stargiftattributemodel.document);
        }
        if (yj0Var.isAttachedToWindow()) {
            n3Var.N.a(yj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, n3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new e61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        n3Var.g(spannableStringBuilder, 0, n3Var.N);
        n3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        return new n3(context, i10, d6Var);
    }
}
