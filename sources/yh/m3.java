package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.c61;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.xj0;
public final class m3 extends e61 {
    public static final int f50398a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        n3 n3Var = (n3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) f61Var.G;
        int i10 = f61Var.f26153z;
        String str = (String) f61Var.f26140l;
        boolean z11 = f61Var.e;
        xj0 xj0Var = n3Var.f20759c;
        l3 l3Var = n3Var.N;
        if (l3Var == null || n3Var.M != stargiftattributemodel.document.f20278id) {
            n3Var.M = stargiftattributemodel.document.f20278id;
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
            spannableStringBuilder2.setSpan(new c61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
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
