package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import fi.u3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.ok;
public final class w1 extends t61 {
    public static final int f44949a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        x1 x1Var = (x1) view;
        CharSequence charSequence = u61Var.f33251n;
        String str = (String) u61Var.f33249l;
        long j10 = u61Var.B;
        ImageView imageView = x1Var.f44963a;
        x1Var.f44964b.setText(charSequence);
        ok okVar = x1Var.f44965c;
        okVar.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            okVar.setTranslationY(-AndroidUtilities.dp(14.0f));
            okVar.setScaleX(1.3f);
            okVar.setScaleY(1.3f);
        } else {
            okVar.setTranslationY(0.0f);
            okVar.setScaleX(1.0f);
            okVar.setScaleY(1.0f);
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
        t5 t5Var = x1Var.d;
        if (t5Var != null) {
            t5Var.o(imageView);
            x1Var.d = null;
        }
        x1Var.h = null;
        if (j10 != 0) {
            t5 n10 = t5.n(UserConfig.selectedAccount, j10, null, 1);
            x1Var.d = n10;
            n10.a(imageView);
            imageView.setImageDrawable(x1Var.d);
        } else {
            ShapeDrawable c02 = y6.c0(AndroidUtilities.dp(6.0f), y6.o1(0.1f, y6.x0(null, y6.G6, false)));
            x1Var.h = c02;
            ar arVar = new ar(c02, new u3(charSequence2));
            int dp = AndroidUtilities.dp(28.0f);
            int dp2 = AndroidUtilities.dp(28.0f);
            arVar.h = dp;
            arVar.f26643n = dp2;
            imageView.setImageDrawable(arVar);
        }
        x1Var.f44966f = z10;
        x1Var.invalidate();
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new x1(context);
    }
}
