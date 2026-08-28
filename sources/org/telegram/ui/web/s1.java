package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import kh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.gk;
public final class s1 extends k41 {
    public static final int f44016a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        t1 t1Var = (t1) view;
        CharSequence charSequence = l41Var.f30341n;
        String str = (String) l41Var.f30339l;
        long j10 = l41Var.B;
        ImageView imageView = t1Var.f44020a;
        t1Var.f44021b.setText(charSequence);
        gk gkVar = t1Var.f44022c;
        gkVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            gkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            gkVar.setScaleX(1.3f);
            gkVar.setScaleY(1.3f);
        } else {
            gkVar.setTranslationY(0.0f);
            gkVar.setScaleX(1.0f);
            gkVar.setScaleY(1.0f);
        }
        t1Var.f44023e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        k5 k5Var = t1Var.d;
        if (k5Var != null) {
            k5Var.o(imageView);
            t1Var.d = null;
        }
        if (j10 != 0) {
            k5 n10 = k5.n(UserConfig.selectedAccount, j10, null, 1);
            t1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(t1Var.d);
        } else {
            fq fqVar = new fq(f6.b0(AndroidUtilities.dp(6.0f), f6.l1(0.1f, f6.w0(null, f6.G6, false))), new w3(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            fqVar.h = dp;
            fqVar.f28547n = dp2;
            imageView.setImageDrawable(fqVar);
        }
        t1Var.f44024f = z10;
        t1Var.invalidate();
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new t1(context);
    }
}
