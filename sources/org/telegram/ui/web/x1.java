package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ci.d4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.rk;
public final class x1 extends w51 {
    public static final int f39228a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        y1 y1Var = (y1) view;
        CharSequence charSequence = x51Var.f30304n;
        String str = (String) x51Var.f30302l;
        long j3 = x51Var.B;
        ImageView imageView = y1Var.f39233a;
        y1Var.f39234b.setText(charSequence);
        rk rkVar = y1Var.f39235c;
        rkVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            rkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            rkVar.setScaleX(1.3f);
            rkVar.setScaleY(1.3f);
        } else {
            rkVar.setTranslationY(0.0f);
            rkVar.setScaleX(1.0f);
            rkVar.setScaleY(1.0f);
        }
        y1Var.e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        q5 q5Var = y1Var.d;
        if (q5Var != null) {
            q5Var.o(imageView);
            y1Var.d = null;
        }
        if (j3 != 0) {
            q5 n10 = q5.n(UserConfig.selectedAccount, j3, null, 1);
            y1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(y1Var.d);
        } else {
            rq rqVar = new rq(i6.b0(AndroidUtilities.dp(6.0f), i6.l1(0.1f, i6.w0(null, i6.G6, false))), new d4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            rqVar.h = dp;
            rqVar.f28066n = dp2;
            imageView.setImageDrawable(rqVar);
        }
        y1Var.f39236f = z10;
        y1Var.invalidate();
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, e6 e6Var) {
        return new y1(context);
    }
}
