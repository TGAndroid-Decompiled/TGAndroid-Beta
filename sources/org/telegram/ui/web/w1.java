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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.v51;
import org.telegram.ui.pk;
public final class w1 extends g51 {
    public static final int f38893a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        x1 x1Var = (x1) view;
        CharSequence charSequence = h51Var.f24509n;
        String str = (String) h51Var.f24507l;
        long j3 = h51Var.B;
        ImageView imageView = x1Var.f38898a;
        x1Var.f38899b.setText(charSequence);
        pk pkVar = x1Var.f38900c;
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
        x1Var.e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        q5 q5Var = x1Var.d;
        if (q5Var != null) {
            q5Var.o(imageView);
            x1Var.d = null;
        }
        if (j3 != 0) {
            q5 n10 = q5.n(UserConfig.selectedAccount, j3, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            qq qqVar = new qq(h6.b0(AndroidUtilities.dp(6.0f), h6.l1(0.1f, h6.w0(null, h6.G6, false))), new d4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            qqVar.h = dp;
            qqVar.f27428n = dp2;
            imageView.setImageDrawable(qqVar);
        }
        x1Var.f38901f = z10;
        x1Var.invalidate();
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new x1(context);
    }
}
