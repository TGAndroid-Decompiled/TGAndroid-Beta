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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.zq;
import org.telegram.ui.mk;
public final class w1 extends e61 {
    public static final int f42793a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        x1 x1Var = (x1) view;
        CharSequence charSequence = f61Var.f26142n;
        String str = (String) f61Var.f26140l;
        long j10 = f61Var.B;
        ImageView imageView = x1Var.f42799a;
        x1Var.f42800b.setText(charSequence);
        mk mkVar = x1Var.f42801c;
        mkVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            mkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            mkVar.setScaleX(1.3f);
            mkVar.setScaleY(1.3f);
        } else {
            mkVar.setTranslationY(0.0f);
            mkVar.setScaleX(1.0f);
            mkVar.setScaleY(1.0f);
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
        r5 r5Var = x1Var.d;
        if (r5Var != null) {
            r5Var.o(imageView);
            x1Var.d = null;
        }
        if (j10 != 0) {
            r5 n10 = r5.n(UserConfig.selectedAccount, j10, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            zq zqVar = new zq(h6.c0(AndroidUtilities.dp(6.0f), h6.m1(0.1f, h6.x0(null, h6.G6, false))), new w3(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            zqVar.h = dp;
            zqVar.f32996n = dp2;
            imageView.setImageDrawable(zqVar);
        }
        x1Var.f42802f = z10;
        x1Var.invalidate();
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new x1(context);
    }
}
