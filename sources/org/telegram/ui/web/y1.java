package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import di.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.v51;
import org.telegram.ui.sk;
public final class y1 extends g51 {
    public static final int f42323a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        z1 z1Var = (z1) view;
        CharSequence charSequence = h51Var.f26596n;
        String str = (String) h51Var.f26594l;
        long j3 = h51Var.B;
        ImageView imageView = z1Var.f42338a;
        z1Var.f42339b.setText(charSequence);
        sk skVar = z1Var.f42340c;
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
        z1Var.f42341e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        q5 q5Var = z1Var.d;
        if (q5Var != null) {
            q5Var.o(imageView);
            z1Var.d = null;
        }
        if (j3 != 0) {
            q5 n10 = q5.n(UserConfig.selectedAccount, j3, null, 1);
            z1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(z1Var.d);
        } else {
            oq oqVar = new oq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, j6.w0(null, j6.G6, false))), new e4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            oqVar.h = dp;
            oqVar.f29164n = dp2;
            imageView.setImageDrawable(oqVar);
        }
        z1Var.f42342f = z10;
        z1Var.invalidate();
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new z1(context);
    }
}
