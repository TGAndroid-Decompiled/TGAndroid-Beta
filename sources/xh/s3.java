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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.s5;
public final class s3 extends p61 {
    public static final int f51566a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        t3 t3Var = (t3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) q61Var.G;
        int i10 = q61Var.f30076z;
        String str = (String) q61Var.f30063l;
        boolean z11 = q61Var.f30057e;
        e6 e6Var = t3Var.F;
        gk0 gk0Var = t3Var.f20581c;
        r3 r3Var = t3Var.N;
        if (r3Var == null || t3Var.M != stargiftattributepattern.document.f20048id) {
            t3Var.M = stargiftattributepattern.document.f20048id;
            if (r3Var != null) {
                r3Var.o(gk0Var);
            }
            ?? s5Var = new s5(3, t3Var.L, stargiftattributepattern.document);
            t3Var.N = s5Var;
            s5Var.setColorFilter(new PorterDuffColorFilter(i6.w0(i6.E8, e6Var), PorterDuff.Mode.SRC_IN));
        }
        if (gk0Var.isAttachedToWindow()) {
            t3Var.N.a(gk0Var);
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
            spannableStringBuilder2.setSpan(new n61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        t3Var.g(spannableStringBuilder, 0, t3Var.N);
        t3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, e6 e6Var) {
        return new t3(context, i10, e6Var);
    }
}
