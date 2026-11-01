package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.y41;
public final class b3 extends a51 {
    public static final int f44992b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        c3 c3Var = (c3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) b51Var.G;
        int i10 = b51Var.f24656z;
        String str = (String) b51Var.f24643l;
        boolean z11 = b51Var.e;
        fi0 fi0Var = c3Var.f20167c;
        a3 a3Var = c3Var.f45025a0;
        if (a3Var == null || c3Var.W != stargiftattributemodel.document.f19800id) {
            c3Var.W = stargiftattributemodel.document.f19800id;
            if (a3Var != null) {
                a3Var.n(fi0Var);
            }
            c3Var.f45025a0 = new f5(3, c3Var.V, stargiftattributemodel.document);
        }
        if (fi0Var.isAttachedToWindow()) {
            c3Var.f45025a0.a(fi0Var);
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
            spannableStringBuilder2.setSpan(new y41(org.telegram.messenger.i0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        c3Var.j(spannableStringBuilder, 0, c3Var.f45025a0);
        c3Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new c3(i10, context, p6Var);
    }
}
