package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ci.c4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.tk;
public final class w1 extends q61 {
    public static final int f43716a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        x1 x1Var = (x1) view;
        CharSequence charSequence = r61Var.f30363n;
        String str = (String) r61Var.f30361l;
        long j3 = r61Var.B;
        ImageView imageView = x1Var.f43721a;
        x1Var.f43722b.setText(charSequence);
        tk tkVar = x1Var.f43723c;
        tkVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            tkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            tkVar.setScaleX(1.3f);
            tkVar.setScaleY(1.3f);
        } else {
            tkVar.setTranslationY(0.0f);
            tkVar.setScaleX(1.0f);
            tkVar.setScaleY(1.0f);
        }
        x1Var.f43724e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        s5 s5Var = x1Var.d;
        if (s5Var != null) {
            s5Var.o(imageView);
            x1Var.d = null;
        }
        if (j3 != 0) {
            s5 n10 = s5.n(UserConfig.selectedAccount, j3, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            fr frVar = new fr(h6.c0(AndroidUtilities.dp(6.0f), h6.m1(0.1f, h6.x0(null, h6.G6, false))), new c4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            frVar.h = dp;
            frVar.f26472n = dp2;
            imageView.setImageDrawable(frVar);
        }
        x1Var.f43725f = z10;
        x1Var.invalidate();
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new x1(context);
    }
}
