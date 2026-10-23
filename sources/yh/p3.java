package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r5;
public final class p3 extends l61 {
    public static final int f50934a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        q3 q3Var = (q3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) m61Var.G;
        int i10 = m61Var.f28572z;
        String str = (String) m61Var.f28559l;
        boolean z11 = m61Var.e;
        g6 g6Var = q3Var.O;
        bk0 bk0Var = q3Var.f20837c;
        o3 o3Var = q3Var.f50947a0;
        if (o3Var == null || q3Var.W != stargiftattributepattern.document.f20349id) {
            q3Var.W = stargiftattributepattern.document.f20349id;
            if (o3Var != null) {
                o3Var.o(bk0Var);
            }
            ?? r5Var = new r5(3, q3Var.V, stargiftattributepattern.document);
            q3Var.f50947a0 = r5Var;
            r6.z(q3Var, r5Var, k6.E8, g6Var, PorterDuff.Mode.SRC_IN);
        }
        if (bk0Var.isAttachedToWindow()) {
            q3Var.f50947a0.a(bk0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, g6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new j61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        q3Var.j(spannableStringBuilder, 0, q3Var.f50947a0);
        q3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new q3(context, i10, g6Var);
    }
}
