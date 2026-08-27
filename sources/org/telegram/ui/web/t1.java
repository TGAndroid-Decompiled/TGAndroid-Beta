package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import lh.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ik;

public final class t1 extends m41 {

    public static final int f44003a = 0;

    static {
        m41.setup(new t1());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        u1 u1Var = (u1) view;
        CharSequence charSequence = n41Var.f30846n;
        String str = (String) n41Var.f30844l;
        long j10 = n41Var.B;
        ImageView imageView = u1Var.f44007a;
        u1Var.f44008b.setText(charSequence);
        ik ikVar = u1Var.f44009c;
        ikVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            ikVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            ikVar.setScaleX(1.3f);
            ikVar.setScaleY(1.3f);
        } else {
            ikVar.setTranslationY(0.0f);
            ikVar.setScaleX(1.0f);
            ikVar.setScaleY(1.0f);
        }
        u1Var.f44010e = str;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = (str.isEmpty() || TextUtils.isEmpty(str)) ? "" : str;
        }
        String string = charSequence.toString();
        k5 k5Var = u1Var.d;
        if (k5Var != null) {
            k5Var.o(imageView);
            u1Var.d = null;
        }
        if (j10 != 0) {
            k5 k5VarN = k5.n(UserConfig.selectedAccount, j10, null, 1);
            u1Var.d = k5VarN;
            k5VarN.a(imageView);
            imageView.setImageDrawable(u1Var.d);
        } else {
            dq dqVar = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, g6.w0(null, g6.G6, false))), new v3(string));
            int iDp = AndroidUtilities.dp(28.0f);
            int iDp2 = AndroidUtilities.dp(28.0f);
            dqVar.h = iDp;
            dqVar.f27825n = iDp2;
            imageView.setImageDrawable(dqVar);
        }
        u1Var.f44011f = z10;
        u1Var.invalidate();
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new u1(context);
    }
}
