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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.y41;
public final class e3 extends a51 {
    public static final int f45040b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        f3 f3Var = (f3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) b51Var.G;
        int i10 = b51Var.f24656z;
        String str = (String) b51Var.f24643l;
        boolean z11 = b51Var.e;
        p6 p6Var = f3Var.O;
        fi0 fi0Var = f3Var.f20167c;
        d3 d3Var = f3Var.f45063a0;
        if (d3Var == null || f3Var.W != stargiftattributepattern.document.f19800id) {
            f3Var.W = stargiftattributepattern.document.f19800id;
            if (d3Var != null) {
                d3Var.n(fi0Var);
            }
            ?? f5Var = new f5(3, f3Var.V, stargiftattributepattern.document);
            f3Var.f45063a0 = f5Var;
            a7.y(f3Var, f5Var, t6.E8, p6Var, PorterDuff.Mode.SRC_IN);
        }
        if (fi0Var.isAttachedToWindow()) {
            f3Var.f45063a0.a(fi0Var);
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
            spannableStringBuilder2.setSpan(new y41(org.telegram.messenger.i0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        f3Var.j(spannableStringBuilder, 0, f3Var.f45063a0);
        f3Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new f3(i10, context, p6Var);
    }
}
