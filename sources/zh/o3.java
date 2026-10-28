package zh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class o3 extends t61 {
    public static final int f53237a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        p3 p3Var = (p3) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) u61Var.G;
        int i10 = u61Var.f33262z;
        String str = (String) u61Var.f33249l;
        boolean z11 = u61Var.e;
        bk0 bk0Var = p3Var.f22639c;
        n3 n3Var = p3Var.f53271a0;
        if (n3Var == null || p3Var.W != stargiftattributemodel.document.f22034id) {
            p3Var.W = stargiftattributemodel.document.f22034id;
            if (n3Var != null) {
                n3Var.o(bk0Var);
            }
            p3Var.f53271a0 = new t5(3, p3Var.V, stargiftattributemodel.document);
        }
        if (bk0Var.isAttachedToWindow()) {
            p3Var.f53271a0.a(bk0Var);
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
            spannableStringBuilder2.setSpan(new r61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        p3Var.j(spannableStringBuilder, 0, p3Var.f53271a0);
        p3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new p3(context, i10, u6Var);
    }
}
