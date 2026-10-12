package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.z61;
public final class n3 extends k61 {
    public static final int f49037a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        o3 o3Var = (o3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) l61Var.G;
        int i10 = l61Var.f26967z;
        String str = (String) l61Var.f26954l;
        boolean z11 = l61Var.e;
        bk0 bk0Var = o3Var.f19721c;
        m3 m3Var = o3Var.N;
        if (m3Var == null || o3Var.M != stargiftattributemodel.document.f19222id) {
            o3Var.M = stargiftattributemodel.document.f19222id;
            if (m3Var != null) {
                m3Var.o(bk0Var);
            }
            o3Var.N = new s5(3, o3Var.L, stargiftattributemodel.document);
        }
        if (bk0Var.isAttachedToWindow()) {
            o3Var.N.a(bk0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, o3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new i61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        o3Var.g(spannableStringBuilder, 0, o3Var.N);
        o3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new o3(context, i10, c6Var);
    }
}
