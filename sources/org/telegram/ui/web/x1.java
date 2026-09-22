package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ci.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.w51;
import org.telegram.ui.sk;
public final class x1 extends h51 {
    public static final int f39158a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        y1 y1Var = (y1) view;
        CharSequence charSequence = i51Var.f24902n;
        String str = (String) i51Var.f24900l;
        long j3 = i51Var.B;
        ImageView imageView = y1Var.f39163a;
        y1Var.f39164b.setText(charSequence);
        sk skVar = y1Var.f39165c;
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
        y1Var.e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        o5 o5Var = y1Var.d;
        if (o5Var != null) {
            o5Var.o(imageView);
            y1Var.d = null;
        }
        if (j3 != 0) {
            o5 n10 = o5.n(UserConfig.selectedAccount, j3, null, 1);
            y1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(y1Var.d);
        } else {
            pq pqVar = new pq(i6.b0(AndroidUtilities.dp(6.0f), i6.l1(0.1f, i6.w0(null, i6.G6, false))), new e4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            pqVar.h = dp;
            pqVar.f27119n = dp2;
            imageView.setImageDrawable(pqVar);
        }
        y1Var.f39166f = z10;
        y1Var.invalidate();
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, e6 e6Var) {
        return new y1(context);
    }
}
