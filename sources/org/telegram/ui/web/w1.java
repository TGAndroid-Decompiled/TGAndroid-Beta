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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.yq;
import org.telegram.ui.lk;
public final class w1 extends l61 {
    public static final int f43316a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        x1 x1Var = (x1) view;
        CharSequence charSequence = m61Var.f28561n;
        String str = (String) m61Var.f28559l;
        long j10 = m61Var.B;
        ImageView imageView = x1Var.f43321a;
        x1Var.f43322b.setText(charSequence);
        lk lkVar = x1Var.f43323c;
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
        r5 r5Var = x1Var.d;
        if (r5Var != null) {
            r5Var.o(imageView);
            x1Var.d = null;
        }
        x1Var.h = null;
        if (j10 != 0) {
            r5 n10 = r5.n(UserConfig.selectedAccount, j10, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            ShapeDrawable c02 = k6.c0(AndroidUtilities.dp(6.0f), k6.o1(0.1f, k6.x0(null, k6.G6, false)));
            x1Var.h = c02;
            yq yqVar = new yq(c02, new w3(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            yqVar.h = dp;
            yqVar.f33016n = dp2;
            imageView.setImageDrawable(yqVar);
        }
        x1Var.f43324f = z10;
        x1Var.invalidate();
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new x1(context);
    }
}
