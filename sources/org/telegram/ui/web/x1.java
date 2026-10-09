package org.telegram.ui.web;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ci.c4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.tk;
public final class x1 extends o61 {
    public static final int f43533a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        y1 y1Var = (y1) view;
        CharSequence charSequence = p61Var.f29736n;
        String str = (String) p61Var.f29734l;
        long j3 = p61Var.B;
        ImageView imageView = y1Var.f43548a;
        y1Var.f43549b.setText(charSequence);
        tk tkVar = y1Var.f43550c;
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
        y1Var.f43551e = str;
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
        if (j3 != 0) {
            s5 n10 = s5.n(UserConfig.selectedAccount, j3, null, 1);
            y1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(y1Var.d);
        } else {
            fr frVar = new fr(i6.c0(AndroidUtilities.dp(6.0f), i6.m1(0.1f, i6.x0(null, i6.G6, false))), new c4(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            frVar.h = dp;
            frVar.f26468n = dp2;
            imageView.setImageDrawable(frVar);
        }
        y1Var.f43552f = z10;
        y1Var.invalidate();
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, e6 e6Var) {
        return new y1(context);
    }
}
