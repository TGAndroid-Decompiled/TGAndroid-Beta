package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.w51;
public final class r3 extends h51 {
    public static final int f46111a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        s3 s3Var = (s3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) i51Var.G;
        int i10 = i51Var.f24913z;
        String str = (String) i51Var.f24900l;
        boolean z11 = i51Var.e;
        e6 e6Var = s3Var.F;
        aj0 aj0Var = s3Var.f18623c;
        q3 q3Var = s3Var.N;
        if (q3Var == null || s3Var.M != stargiftattributepattern.document.f18115id) {
            s3Var.M = stargiftattributepattern.document.f18115id;
            if (q3Var != null) {
                q3Var.o(aj0Var);
            }
            ?? o5Var = new o5(3, s3Var.L, stargiftattributepattern.document);
            s3Var.N = o5Var;
            o5Var.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.E8, e6Var), PorterDuff.Mode.SRC_IN));
        }
        if (aj0Var.isAttachedToWindow()) {
            s3Var.N.a(aj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, e6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new f51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        s3Var.g(spannableStringBuilder, 0, s3Var.N);
        s3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new s3(context, i10, e6Var);
    }
}
