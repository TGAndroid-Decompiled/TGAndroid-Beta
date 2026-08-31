package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.pk;
public final class w1 extends i51 {
    public static final int f42753a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        x1 x1Var = (x1) view;
        CharSequence charSequence = j51Var.f28016n;
        String str = (String) j51Var.f28014l;
        long j10 = j51Var.B;
        ImageView imageView = x1Var.f42768a;
        x1Var.f42769b.setText(charSequence);
        pk pkVar = x1Var.f42770c;
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
        x1Var.f42771e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        l5 l5Var = x1Var.d;
        if (l5Var != null) {
            l5Var.o(imageView);
            x1Var.d = null;
        }
        if (j10 != 0) {
            l5 n10 = l5.n(UserConfig.selectedAccount, j10, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            pq pqVar = new pq(k6.b0(AndroidUtilities.dp(6.0f), k6.l1(0.1f, k6.w0(null, k6.G6, false))), new eg.i1(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            pqVar.h = dp;
            pqVar.f30170n = dp2;
            imageView.setImageDrawable(pqVar);
        }
        x1Var.f42772f = z4;
        x1Var.invalidate();
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new x1(context);
    }
}
