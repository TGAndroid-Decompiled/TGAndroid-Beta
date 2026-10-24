package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.p5;
public final class m3 extends k61 {
    public static final int f50863a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        n3 n3Var = (n3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) l61Var.G;
        int i10 = l61Var.f28240z;
        String str = (String) l61Var.f28227l;
        boolean z11 = l61Var.e;
        ak0 ak0Var = n3Var.f20838c;
        l3 l3Var = n3Var.f50879a0;
        if (l3Var == null || n3Var.W != stargiftattributemodel.document.f20350id) {
            n3Var.W = stargiftattributemodel.document.f20350id;
            if (l3Var != null) {
                l3Var.o(ak0Var);
            }
            n3Var.f50879a0 = new p5(3, n3Var.V, stargiftattributemodel.document);
        }
        if (ak0Var.isAttachedToWindow()) {
            n3Var.f50879a0.a(ak0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, n3Var.O);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new i61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        n3Var.j(spannableStringBuilder, 0, n3Var.f50879a0);
        n3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new n3(context, i10, g6Var);
    }
}
