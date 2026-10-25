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
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.t61;
public final class r3 extends s61 {
    public static final int f53237a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        s3 s3Var = (s3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) t61Var.G;
        int i10 = t61Var.f32885z;
        String str = (String) t61Var.f32872l;
        boolean z11 = t61Var.e;
        u6 u6Var = s3Var.O;
        ak0 ak0Var = s3Var.f22636c;
        q3 q3Var = s3Var.f53245a0;
        if (q3Var == null || s3Var.W != stargiftattributepattern.document.f22033id) {
            s3Var.W = stargiftattributepattern.document.f22033id;
            if (q3Var != null) {
                q3Var.o(ak0Var);
            }
            ?? t5Var = new t5(3, s3Var.V, stargiftattributepattern.document);
            s3Var.f53245a0 = t5Var;
            f7.y(s3Var, t5Var, y6.E8, u6Var, PorterDuff.Mode.SRC_IN);
        }
        if (ak0Var.isAttachedToWindow()) {
            s3Var.f53245a0.a(ak0Var);
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
            spannableStringBuilder2.setSpan(new q61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        s3Var.j(spannableStringBuilder, 0, s3Var.f53245a0);
        s3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new s3(context, i10, u6Var);
    }
}
