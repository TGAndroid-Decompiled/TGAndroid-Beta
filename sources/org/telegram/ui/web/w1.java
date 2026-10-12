package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import di.c4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.z61;
import org.telegram.ui.xk;
public final class w1 extends k61 {
    public static final int f41548a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        x1 x1Var = (x1) view;
        CharSequence charSequence = l61Var.f26956n;
        String str = (String) l61Var.f26954l;
        long j10 = l61Var.B;
        ImageView imageView = x1Var.f41553a;
        x1Var.f41554b.setText(charSequence);
        xk xkVar = x1Var.f41555c;
        xkVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            xkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            xkVar.setScaleX(1.3f);
            xkVar.setScaleY(1.3f);
        } else {
            xkVar.setTranslationY(0.0f);
            xkVar.setScaleX(1.0f);
            xkVar.setScaleY(1.0f);
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
        s5 s5Var = x1Var.d;
        if (s5Var != null) {
            s5Var.o(imageView);
            x1Var.d = null;
        }
        if (j10 != 0) {
            s5 n10 = s5.n(UserConfig.selectedAccount, j10, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            cr crVar = new cr(g6.c0(AndroidUtilities.dp(6.0f), g6.m1(0.1f, g6.x0(null, g6.G6, false))), new c4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            crVar.h = dp;
            crVar.f24195n = dp2;
            imageView.setImageDrawable(crVar);
        }
        x1Var.f41556f = z10;
        x1Var.invalidate();
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new x1(context);
    }
}
