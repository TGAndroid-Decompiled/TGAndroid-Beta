package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ci.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.rk;
public final class y1 extends v51 {
    public static final int f39119a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        z1 z1Var = (z1) view;
        CharSequence charSequence = w51Var.f29950n;
        String str = (String) w51Var.f29948l;
        long j3 = w51Var.B;
        ImageView imageView = z1Var.f39133a;
        z1Var.f39134b.setText(charSequence);
        rk rkVar = z1Var.f39135c;
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
        z1Var.e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        p5 p5Var = z1Var.d;
        if (p5Var != null) {
            p5Var.o(imageView);
            z1Var.d = null;
        }
        if (j3 != 0) {
            p5 n10 = p5.n(UserConfig.selectedAccount, j3, null, 1);
            z1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(z1Var.d);
        } else {
            pq pqVar = new pq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, j6.w0(null, j6.G6, false))), new e4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            pqVar.h = dp;
            pqVar.f27423n = dp2;
            imageView.setImageDrawable(pqVar);
        }
        z1Var.f39136f = z10;
        z1Var.invalidate();
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new z1(context);
    }
}
