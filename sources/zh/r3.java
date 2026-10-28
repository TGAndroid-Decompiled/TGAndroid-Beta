package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class r3 extends t61 {
    public static final int f53298a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        s3 s3Var = (s3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u61Var.G;
        int i10 = u61Var.f33262z;
        String str = (String) u61Var.f33249l;
        boolean z11 = u61Var.e;
        u6 u6Var = s3Var.O;
        bk0 bk0Var = s3Var.f22639c;
        q3 q3Var = s3Var.f53306a0;
        if (q3Var == null || s3Var.W != stargiftattributepattern.document.f22034id) {
            s3Var.W = stargiftattributepattern.document.f22034id;
            if (q3Var != null) {
                q3Var.o(bk0Var);
            }
            ?? t5Var = new t5(3, s3Var.V, stargiftattributepattern.document);
            s3Var.f53306a0 = t5Var;
            f7.y(s3Var, t5Var, y6.E8, u6Var, PorterDuff.Mode.SRC_IN);
        }
        if (bk0Var.isAttachedToWindow()) {
            s3Var.f53306a0.a(bk0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, u6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new r61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        s3Var.j(spannableStringBuilder, 0, s3Var.f53306a0);
        s3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new s3(context, i10, u6Var);
    }
}
