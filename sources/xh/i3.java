package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class i3 extends v51 {
    public static final int f46200a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        j3 j3Var = (j3) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) w51Var.G;
        int i10 = w51Var.f29961z;
        String str = (String) w51Var.f29948l;
        boolean z11 = w51Var.e;
        j3Var.getClass();
        ShapeDrawable K = j6.K(AndroidUtilities.dp(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, j3Var.F);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new t51(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        j3Var.g(spannableStringBuilder, 0, K);
        j3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, context, f6Var, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.c(j6.v0(j6.E8, f6Var), j6.v0(j6.F8, f6Var));
        f1Var.e(-1, PorterDuff.Mode.MULTIPLY);
        f1Var.f18845c.setTranslationX(AndroidUtilities.dp(2.0f));
        f1Var.a(2);
        f1Var.setBackground(null);
        return f1Var;
    }
}
