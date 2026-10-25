package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class h3 extends s61 {
    public static final int f53023a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        i3 i3Var = (i3) view;
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t61Var.G;
        int i10 = t61Var.f32885z;
        String str = (String) t61Var.f32872l;
        boolean z11 = t61Var.e;
        i3Var.getClass();
        ShapeDrawable K = y6.K(AndroidUtilities.dp(20.0f), stargiftattributebackdrop.center_color | (-16777216));
        SpannableStringBuilder spannableStringBuilder = stargiftattributebackdrop.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = AndroidUtilities.highlightText(spannableStringBuilder, str, i3Var.O);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder2.setSpan(new q61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        i3Var.j(spannableStringBuilder, 0, K);
        i3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, context, u6Var, false, false);
        g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        g1Var.c(y6.E8, y6.F8);
        g1Var.g(-1, PorterDuff.Mode.MULTIPLY);
        g1Var.f22636c.setTranslationX(AndroidUtilities.dp(2.0f));
        g1Var.a(2);
        g1Var.setBackground(null);
        return g1Var;
    }
}
