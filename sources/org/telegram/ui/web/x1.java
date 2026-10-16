package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import di.c4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.xk;
public final class x1 extends l61 {
    public static final int f41249a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        y1 y1Var = (y1) view;
        CharSequence charSequence = m61Var.f26948n;
        String str = (String) m61Var.f26946l;
        long j10 = m61Var.B;
        ImageView imageView = y1Var.f41254a;
        y1Var.f41255b.setText(charSequence);
        xk xkVar = y1Var.f41256c;
        xkVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            xkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            xkVar.setScaleX(1.3f);
            xkVar.setScaleY(1.3f);
        } else {
            xkVar.setTranslationY(0.0f);
            xkVar.setScaleX(1.0f);
            xkVar.setScaleY(1.0f);
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
        s5 s5Var = y1Var.d;
        if (s5Var != null) {
            s5Var.o(imageView);
            y1Var.d = null;
        }
        if (j10 != 0) {
            s5 n10 = s5.n(UserConfig.selectedAccount, j10, null, 1);
            y1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(y1Var.d);
        } else {
            cr crVar = new cr(g6.c0(AndroidUtilities.dp(6.0f), g6.m1(0.1f, g6.x0(null, g6.G6, false))), new c4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            crVar.h = dp;
            crVar.f23880n = dp2;
            imageView.setImageDrawable(crVar);
        }
        y1Var.f41257f = z10;
        y1Var.invalidate();
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new y1(context);
    }
}
