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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.sk;
public final class y1 extends x51 {
    public static final int f39140a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        z1 z1Var = (z1) view;
        CharSequence charSequence = y51Var.f30520n;
        String str = (String) y51Var.f30518l;
        long j3 = y51Var.B;
        ImageView imageView = z1Var.f39154a;
        z1Var.f39155b.setText(charSequence);
        sk skVar = z1Var.f39156c;
        skVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            skVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            skVar.setScaleX(1.3f);
            skVar.setScaleY(1.3f);
        } else {
            skVar.setTranslationY(0.0f);
            skVar.setScaleX(1.0f);
            skVar.setScaleY(1.0f);
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
            pqVar.f27401n = dp2;
            imageView.setImageDrawable(pqVar);
        }
        z1Var.f39157f = z10;
        z1Var.invalidate();
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, f6 f6Var) {
        return new z1(context);
    }
}
