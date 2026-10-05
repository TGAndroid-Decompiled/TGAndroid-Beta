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
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.pk;
public final class y1 extends g61 {
    public static final int f42439a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        z1 z1Var = (z1) view;
        CharSequence charSequence = h61Var.f27095n;
        String str = (String) h61Var.f27093l;
        long j3 = h61Var.B;
        ImageView imageView = z1Var.f42454a;
        z1Var.f42455b.setText(charSequence);
        pk pkVar = z1Var.f42456c;
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
        z1Var.f42457e = str;
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
            sqVar.f30928n = dp2;
            imageView.setImageDrawable(sqVar);
        }
        z1Var.f42458f = z10;
        z1Var.invalidate();
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new z1(context);
    }
}
