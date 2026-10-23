package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r5;
public final class m3 extends l61 {
    public static final int f50864a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        n3 n3Var = (n3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) m61Var.G;
        int i10 = m61Var.f28572z;
        String str = (String) m61Var.f28559l;
        boolean z11 = m61Var.e;
        bk0 bk0Var = n3Var.f20837c;
        l3 l3Var = n3Var.f50880a0;
        if (l3Var == null || n3Var.W != stargiftattributemodel.document.f20349id) {
            n3Var.W = stargiftattributemodel.document.f20349id;
            if (l3Var != null) {
                l3Var.o(bk0Var);
            }
            n3Var.f50880a0 = new r5(3, n3Var.V, stargiftattributemodel.document);
        }
        if (bk0Var.isAttachedToWindow()) {
            n3Var.f50880a0.a(bk0Var);
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
            spannableStringBuilder2.setSpan(new j61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        n3Var.j(spannableStringBuilder, 0, n3Var.f50880a0);
        n3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new n3(context, i10, g6Var);
    }
}
