package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.pk;
public final class v1 extends g51 {
    public static final int f42709a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        w1 w1Var = (w1) view;
        CharSequence charSequence = h51Var.f27377n;
        String str = (String) h51Var.f27375l;
        long j10 = h51Var.B;
        ImageView imageView = w1Var.f42714a;
        w1Var.f42715b.setText(charSequence);
        pk pkVar = w1Var.f42716c;
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
        w1Var.f42717e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        l5 l5Var = w1Var.d;
        if (l5Var != null) {
            l5Var.o(imageView);
            w1Var.d = null;
        }
        if (j10 != 0) {
            l5 n10 = l5.n(UserConfig.selectedAccount, j10, null, 1);
            w1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(w1Var.d);
        } else {
            pq pqVar = new pq(k6.b0(AndroidUtilities.dp(6.0f), k6.l1(0.1f, k6.w0(null, k6.G6, false))), new eg.i1(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            pqVar.h = dp;
            pqVar.f30163n = dp2;
            imageView.setImageDrawable(pqVar);
        }
        w1Var.f42718f = z4;
        w1Var.invalidate();
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new w1(context);
    }
}
