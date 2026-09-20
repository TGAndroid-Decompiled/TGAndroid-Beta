package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class p3 extends v51 {
    public static final int f46368a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        q3 q3Var = (q3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) w51Var.G;
        int i10 = w51Var.f29961z;
        String str = (String) w51Var.f29948l;
        boolean z11 = w51Var.e;
        kj0 kj0Var = q3Var.f18845c;
        o3 o3Var = q3Var.N;
        if (o3Var == null || q3Var.M != stargiftattributemodel.document.f18334id) {
            q3Var.M = stargiftattributemodel.document.f18334id;
            if (o3Var != null) {
                o3Var.o(kj0Var);
            }
            q3Var.N = new p5(3, q3Var.L, stargiftattributemodel.document);
        }
        if (kj0Var.isAttachedToWindow()) {
            q3Var.N.a(kj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, q3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new t51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        q3Var.g(spannableStringBuilder, 0, q3Var.N);
        q3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new q3(context, i10, f6Var);
    }
}
