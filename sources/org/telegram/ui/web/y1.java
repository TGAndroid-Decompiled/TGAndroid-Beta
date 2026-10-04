package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ci.d4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.pk;
public final class y1 extends f61 {
    public static final int f42419a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        z1 z1Var = (z1) view;
        CharSequence charSequence = g61Var.f26670n;
        String str = (String) g61Var.f26668l;
        long j3 = g61Var.B;
        ImageView imageView = z1Var.f42434a;
        z1Var.f42435b.setText(charSequence);
        pk pkVar = z1Var.f42436c;
        pkVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            pkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            pkVar.setScaleX(1.3f);
            pkVar.setScaleY(1.3f);
        } else {
            pkVar.setTranslationY(0.0f);
            pkVar.setScaleX(1.0f);
            pkVar.setScaleY(1.0f);
        }
        z1Var.f42437e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        q5 q5Var = z1Var.d;
        if (q5Var != null) {
            q5Var.o(imageView);
            z1Var.d = null;
        }
        if (j3 != 0) {
            q5 n10 = q5.n(UserConfig.selectedAccount, j3, null, 1);
            z1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(z1Var.d);
        } else {
            sq sqVar = new sq(i6.b0(AndroidUtilities.dp(6.0f), i6.l1(0.1f, i6.w0(null, i6.G6, false))), new d4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            sqVar.h = dp;
            sqVar.f30853n = dp2;
            imageView.setImageDrawable(sqVar);
        }
        z1Var.f42438f = z10;
        z1Var.invalidate();
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new z1(context);
    }
}
