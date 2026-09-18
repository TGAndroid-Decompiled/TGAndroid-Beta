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
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.x51;
import org.telegram.ui.tk;
public final class x1 extends i51 {
    public static final int f39002a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        y1 y1Var = (y1) view;
        CharSequence charSequence = j51Var.f25129n;
        String str = (String) j51Var.f25127l;
        long j3 = j51Var.B;
        ImageView imageView = y1Var.f39007a;
        y1Var.f39008b.setText(charSequence);
        tk tkVar = y1Var.f39009c;
        tkVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            tkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            tkVar.setScaleX(1.3f);
            tkVar.setScaleY(1.3f);
        } else {
            tkVar.setTranslationY(0.0f);
            tkVar.setScaleX(1.0f);
            tkVar.setScaleY(1.0f);
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
            pq pqVar = new pq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, j6.w0(null, j6.G6, false))), new e4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            pqVar.h = dp;
            pqVar.f27113n = dp2;
            imageView.setImageDrawable(pqVar);
        }
        y1Var.f39010f = z10;
        y1Var.invalidate();
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, f6 f6Var) {
        return new y1(context);
    }
}
