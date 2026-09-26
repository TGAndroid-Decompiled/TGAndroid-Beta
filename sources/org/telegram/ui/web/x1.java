package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ci.d4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.pk;
public final class x1 extends v51 {
    public static final int f39270a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        y1 y1Var = (y1) view;
        CharSequence charSequence = w51Var.f29897n;
        String str = (String) w51Var.f29895l;
        long j3 = w51Var.B;
        ImageView imageView = y1Var.f39284a;
        y1Var.f39285b.setText(charSequence);
        pk pkVar = y1Var.f39286c;
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
            rq rqVar = new rq(h6.b0(AndroidUtilities.dp(6.0f), h6.l1(0.1f, h6.w0(null, h6.G6, false))), new d4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            rqVar.h = dp;
            rqVar.f28032n = dp2;
            imageView.setImageDrawable(rqVar);
        }
        y1Var.f39287f = z10;
        y1Var.invalidate();
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, d6 d6Var) {
        return new y1(context);
    }
}
