package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import bi.w4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.uk;
public final class z1 extends u51 {
    public static final int f38170a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        a2 a2Var = (a2) view;
        CharSequence charSequence = v51Var.f27831n;
        String str = (String) v51Var.f27829l;
        long j3 = v51Var.B;
        ImageView imageView = a2Var.f37858a;
        a2Var.f37859b.setText(charSequence);
        uk ukVar = a2Var.f37860c;
        ukVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            ukVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            ukVar.setScaleX(1.3f);
            ukVar.setScaleY(1.3f);
        } else {
            ukVar.setTranslationY(0.0f);
            ukVar.setScaleX(1.0f);
            ukVar.setScaleY(1.0f);
        }
        a2Var.e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        p5 p5Var = a2Var.d;
        if (p5Var != null) {
            p5Var.o(imageView);
            a2Var.d = null;
        }
        if (j3 != 0) {
            p5 n10 = p5.n(UserConfig.selectedAccount, j3, null, 1);
            a2Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(a2Var.d);
        } else {
            vq vqVar = new vq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, j6.w0(null, j6.G6, false))), new w4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            vqVar.h = dp;
            vqVar.f28577n = dp2;
            imageView.setImageDrawable(vqVar);
        }
        a2Var.f37861f = z10;
        a2Var.invalidate();
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new a2(context);
    }
}
