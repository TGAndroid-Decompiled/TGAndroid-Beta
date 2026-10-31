package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.z41;
public final class e3 extends z41 {
    public static final int f45029b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        f3 f3Var = (f3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) a51Var.G;
        int i10 = a51Var.f24305z;
        String str = (String) a51Var.f24292l;
        boolean z11 = a51Var.e;
        p6 p6Var = f3Var.O;
        ei0 ei0Var = f3Var.f20166c;
        d3 d3Var = f3Var.f45052a0;
        if (d3Var == null || f3Var.W != stargiftattributepattern.document.f19799id) {
            f3Var.W = stargiftattributepattern.document.f19799id;
            if (d3Var != null) {
                d3Var.n(ei0Var);
            }
            ?? f5Var = new f5(3, f3Var.V, stargiftattributepattern.document);
            f3Var.f45052a0 = f5Var;
            a7.y(f3Var, f5Var, t6.E8, p6Var, PorterDuff.Mode.SRC_IN);
        }
        if (ei0Var.isAttachedToWindow()) {
            f3Var.f45052a0.a(ei0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.i0.w1(spannableStringBuilder, str, p6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new x41(org.telegram.messenger.i0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        f3Var.j(spannableStringBuilder, 0, f3Var.f45052a0);
        f3Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new f3(i10, context, p6Var);
    }
}
