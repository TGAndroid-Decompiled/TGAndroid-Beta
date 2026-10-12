package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class r3 extends t61 {
    public static final int f51732a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        s3 s3Var = (s3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u61Var.G;
        int i10 = u61Var.f31089z;
        String str = (String) u61Var.f31076l;
        boolean z11 = u61Var.f31070e;
        c6 c6Var = s3Var.F;
        ik0 ik0Var = s3Var.f20323c;
        q3 q3Var = s3Var.N;
        if (q3Var == null || s3Var.M != stargiftattributepattern.document.f19808id) {
            s3Var.M = stargiftattributepattern.document.f19808id;
            if (q3Var != null) {
                q3Var.o(ik0Var);
            }
            ?? s5Var = new s5(3, s3Var.L, stargiftattributepattern.document);
            s3Var.N = s5Var;
            s5Var.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.E8, c6Var), PorterDuff.Mode.SRC_IN));
        }
        if (ik0Var.isAttachedToWindow()) {
            s3Var.N.a(ik0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, c6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new r61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        s3Var.g(spannableStringBuilder, 0, s3Var.N);
        s3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new s3(context, i10, c6Var);
    }
}
