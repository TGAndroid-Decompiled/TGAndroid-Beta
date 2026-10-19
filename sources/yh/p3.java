package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.xj0;
public final class p3 extends f61 {
    public static final int f50468a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        q3 q3Var = (q3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) g61Var.G;
        int i10 = g61Var.f26510z;
        String str = (String) g61Var.f26497l;
        boolean z11 = g61Var.e;
        d6 d6Var = q3Var.F;
        xj0 xj0Var = q3Var.f20760c;
        o3 o3Var = q3Var.N;
        if (o3Var == null || q3Var.M != stargiftattributepattern.document.f20279id) {
            q3Var.M = stargiftattributepattern.document.f20279id;
            if (o3Var != null) {
                o3Var.o(xj0Var);
            }
            ?? r5Var = new r5(3, q3Var.L, stargiftattributepattern.document);
            q3Var.N = r5Var;
            r5Var.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.E8, d6Var), PorterDuff.Mode.SRC_IN));
        }
        if (xj0Var.isAttachedToWindow()) {
            q3Var.N.a(xj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, d6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new d61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        q3Var.g(spannableStringBuilder, 0, q3Var.N);
        q3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new q3(context, i10, d6Var);
    }
}
