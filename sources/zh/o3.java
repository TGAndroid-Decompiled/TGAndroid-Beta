package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.t61;
public final class o3 extends s61 {
    public static final int f53179a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        p3 p3Var = (p3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) t61Var.G;
        int i10 = t61Var.f32888z;
        String str = (String) t61Var.f32875l;
        boolean z11 = t61Var.e;
        ak0 ak0Var = p3Var.f22638c;
        n3 n3Var = p3Var.f53213a0;
        if (n3Var == null || p3Var.W != stargiftattributemodel.document.f22033id) {
            p3Var.W = stargiftattributemodel.document.f22033id;
            if (n3Var != null) {
                n3Var.o(ak0Var);
            }
            p3Var.f53213a0 = new t5(3, p3Var.V, stargiftattributemodel.document);
        }
        if (ak0Var.isAttachedToWindow()) {
            p3Var.f53213a0.a(ak0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, p3Var.O);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new q61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        p3Var.j(spannableStringBuilder, 0, p3Var.f53213a0);
        p3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new p3(context, i10, u6Var);
    }
}
