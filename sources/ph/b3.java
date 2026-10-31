package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.z41;
public final class b3 extends z41 {
    public static final int f44981b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        c3 c3Var = (c3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) a51Var.G;
        int i10 = a51Var.f24305z;
        String str = (String) a51Var.f24292l;
        boolean z11 = a51Var.e;
        ei0 ei0Var = c3Var.f20166c;
        a3 a3Var = c3Var.f45014a0;
        if (a3Var == null || c3Var.W != stargiftattributemodel.document.f19799id) {
            c3Var.W = stargiftattributemodel.document.f19799id;
            if (a3Var != null) {
                a3Var.n(ei0Var);
            }
            c3Var.f45014a0 = new f5(3, c3Var.V, stargiftattributemodel.document);
        }
        if (ei0Var.isAttachedToWindow()) {
            c3Var.f45014a0.a(ei0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.i0.w1(spannableStringBuilder, str, c3Var.O);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new x41(org.telegram.messenger.i0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        c3Var.j(spannableStringBuilder, 0, c3Var.f45014a0);
        c3Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new c3(i10, context, p6Var);
    }
}
