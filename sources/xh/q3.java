package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
public final class q3 extends w51 {
    public static final int f46429a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        r3 r3Var = (r3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) x51Var.G;
        int i10 = x51Var.f30315z;
        String str = (String) x51Var.f30302l;
        boolean z11 = x51Var.e;
        nj0 nj0Var = r3Var.f18882c;
        p3 p3Var = r3Var.N;
        if (p3Var == null || r3Var.M != stargiftattributemodel.document.f18335id) {
            r3Var.M = stargiftattributemodel.document.f18335id;
            if (p3Var != null) {
                p3Var.o(nj0Var);
            }
            r3Var.N = new q5(3, r3Var.L, stargiftattributemodel.document);
        }
        if (nj0Var.isAttachedToWindow()) {
            r3Var.N.a(nj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, r3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new u51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        r3Var.g(spannableStringBuilder, 0, r3Var.N);
        r3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, e6 e6Var) {
        return new r3(context, i10, e6Var);
    }
}
