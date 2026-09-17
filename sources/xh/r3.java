package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.x51;
public final class r3 extends i51 {
    public static final int f46138a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        s3 s3Var = (s3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) j51Var.G;
        int i10 = j51Var.f25137z;
        String str = (String) j51Var.f25124l;
        boolean z11 = j51Var.e;
        f6 f6Var = s3Var.F;
        bj0 bj0Var = s3Var.f18654c;
        q3 q3Var = s3Var.N;
        if (q3Var == null || s3Var.M != stargiftattributepattern.document.f18127id) {
            s3Var.M = stargiftattributepattern.document.f18127id;
            if (q3Var != null) {
                q3Var.o(bj0Var);
            }
            ?? o5Var = new o5(3, s3Var.L, stargiftattributepattern.document);
            s3Var.N = o5Var;
            o5Var.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.E8, f6Var), PorterDuff.Mode.SRC_IN));
        }
        if (bj0Var.isAttachedToWindow()) {
            s3Var.N.a(bj0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, f6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new g51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        s3Var.g(spannableStringBuilder, 0, s3Var.N);
        s3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new s3(context, i10, f6Var);
    }
}
