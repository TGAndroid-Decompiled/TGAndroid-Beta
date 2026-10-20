package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ei.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zq;
import org.telegram.ui.kk;
public final class v1 extends g61 {
    public static final int f42832a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        w1 w1Var = (w1) view;
        CharSequence charSequence = h61Var.f26784n;
        String str = (String) h61Var.f26782l;
        long j10 = h61Var.B;
        ImageView imageView = w1Var.f42838a;
        w1Var.f42839b.setText(charSequence);
        kk kkVar = w1Var.f42840c;
        kkVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            kkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            kkVar.setScaleX(1.3f);
            kkVar.setScaleY(1.3f);
        } else {
            kkVar.setTranslationY(0.0f);
            kkVar.setScaleX(1.0f);
            kkVar.setScaleY(1.0f);
        }
        w1Var.e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        r5 r5Var = w1Var.d;
        if (r5Var != null) {
            r5Var.o(imageView);
            w1Var.d = null;
        }
        if (j10 != 0) {
            r5 n10 = r5.n(UserConfig.selectedAccount, j10, null, 1);
            w1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(w1Var.d);
        } else {
            zq zqVar = new zq(h6.c0(AndroidUtilities.dp(6.0f), h6.m1(0.1f, h6.x0(null, h6.G6, false))), new w3(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            zqVar.h = dp;
            zqVar.f33020n = dp2;
            imageView.setImageDrawable(zqVar);
        }
        w1Var.f42841f = z10;
        w1Var.invalidate();
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, d6 d6Var) {
        return new w1(context);
    }
}
