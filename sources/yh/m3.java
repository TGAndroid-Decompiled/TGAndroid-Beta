package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.xj0;
public final class m3 extends f61 {
    public static final int f50397a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        n3 n3Var = (n3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) g61Var.G;
        int i10 = g61Var.f26512z;
        String str = (String) g61Var.f26499l;
        boolean z11 = g61Var.e;
        xj0 xj0Var = n3Var.f20762c;
        l3 l3Var = n3Var.N;
        if (l3Var == null || n3Var.M != stargiftattributemodel.document.f20281id) {
            n3Var.M = stargiftattributemodel.document.f20281id;
            if (l3Var != null) {
                l3Var.o(xj0Var);
            }
            n3Var.N = new r5(3, n3Var.L, stargiftattributemodel.document);
        }
        if (xj0Var.isAttachedToWindow()) {
            n3Var.N.a(xj0Var);
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
            spannableStringBuilder2.setSpan(new d61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        n3Var.g(spannableStringBuilder, 0, n3Var.N);
        n3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new n3(context, i10, d6Var);
    }
}
