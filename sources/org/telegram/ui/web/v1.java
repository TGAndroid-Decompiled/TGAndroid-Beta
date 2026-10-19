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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.zq;
import org.telegram.ui.kk;
public final class v1 extends f61 {
    public static final int f42825a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        w1 w1Var = (w1) view;
        CharSequence charSequence = g61Var.f26501n;
        String str = (String) g61Var.f26499l;
        long j10 = g61Var.B;
        ImageView imageView = w1Var.f42831a;
        w1Var.f42832b.setText(charSequence);
        kk kkVar = w1Var.f42833c;
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
        w1Var.f42834f = z10;
        w1Var.invalidate();
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new w1(context);
    }
}
