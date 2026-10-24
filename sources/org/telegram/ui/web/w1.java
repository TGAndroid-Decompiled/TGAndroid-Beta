package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import ei.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.lk;
public final class w1 extends k61 {
    public static final int f43305a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        x1 x1Var = (x1) view;
        CharSequence charSequence = l61Var.f28229n;
        String str = (String) l61Var.f28227l;
        long j10 = l61Var.B;
        ImageView imageView = x1Var.f43310a;
        x1Var.f43311b.setText(charSequence);
        lk lkVar = x1Var.f43312c;
        lkVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            lkVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            lkVar.setScaleX(1.3f);
            lkVar.setScaleY(1.3f);
        } else {
            lkVar.setTranslationY(0.0f);
            lkVar.setScaleX(1.0f);
            lkVar.setScaleY(1.0f);
        }
        x1Var.e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        p5 p5Var = x1Var.d;
        if (p5Var != null) {
            p5Var.o(imageView);
            x1Var.d = null;
        }
        x1Var.h = null;
        if (j10 != 0) {
            p5 n10 = p5.n(UserConfig.selectedAccount, j10, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            ShapeDrawable c02 = k6.c0(AndroidUtilities.dp(6.0f), k6.o1(0.1f, k6.x0(null, k6.G6, false)));
            x1Var.h = c02;
            wq wqVar = new wq(c02, new w3(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            wqVar.h = dp;
            wqVar.f32326n = dp2;
            imageView.setImageDrawable(wqVar);
        }
        x1Var.f43313f = z10;
        x1Var.invalidate();
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new x1(context);
    }
}
