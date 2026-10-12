package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ci.c4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.xk;
public final class w1 extends t61 {
    public static final int f43466a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        x1 x1Var = (x1) view;
        CharSequence charSequence = u61Var.f31078n;
        String str = (String) u61Var.f31076l;
        long j3 = u61Var.B;
        ImageView imageView = x1Var.f43471a;
        x1Var.f43472b.setText(charSequence);
        xk xkVar = x1Var.f43473c;
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
        x1Var.f43474e = str;
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
            hr hrVar = new hr(h6.c0(AndroidUtilities.dp(6.0f), h6.m1(0.1f, h6.x0(null, h6.G6, false))), new c4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            hrVar.h = dp;
            hrVar.f26894n = dp2;
            imageView.setImageDrawable(hrVar);
        }
        x1Var.f43475f = z10;
        x1Var.invalidate();
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new x1(context);
    }
}
