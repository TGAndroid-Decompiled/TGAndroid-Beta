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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.s5;
public final class s3 extends o61 {
    public static final int f51520a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        t3 t3Var = (t3) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) p61Var.G;
        int i10 = p61Var.f29747z;
        String str = (String) p61Var.f29734l;
        boolean z11 = p61Var.f29728e;
        e6 e6Var = t3Var.F;
        fk0 fk0Var = t3Var.f20577c;
        r3 r3Var = t3Var.N;
        if (r3Var == null || t3Var.M != stargiftattributepattern.document.f20044id) {
            t3Var.M = stargiftattributepattern.document.f20044id;
            if (r3Var != null) {
                r3Var.o(fk0Var);
            }
            ?? s5Var = new s5(3, t3Var.L, stargiftattributepattern.document);
            t3Var.N = s5Var;
            s5Var.setColorFilter(new PorterDuffColorFilter(i6.w0(i6.E8, e6Var), PorterDuff.Mode.SRC_IN));
        }
        if (fk0Var.isAttachedToWindow()) {
            t3Var.N.a(fk0Var);
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
            spannableStringBuilder2.setSpan(new m61(AndroidUtilities.bold()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        t3Var.g(spannableStringBuilder, 0, t3Var.N);
        t3Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new t3(context, i10, e6Var);
    }
}
