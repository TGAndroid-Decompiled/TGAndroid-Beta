package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import gi.k3;
import org.telegram.messenger.h10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xp;
public final class k1 extends q31 {
    public static final int f50924b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        l1 l1Var = (l1) view;
        CharSequence charSequence = r31Var.f37629n;
        String str = (String) r31Var.f37627l;
        long j10 = r31Var.B;
        ImageView imageView = l1Var.f50939a;
        l1Var.f50940b.setText(charSequence);
        k2 k2Var = l1Var.f50941c;
        k2Var.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            k2Var.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            k2Var.setScaleX(1.3f);
            k2Var.setScaleY(1.3f);
        } else {
            k2Var.setTranslationY(0.0f);
            k2Var.setScaleX(1.0f);
            k2Var.setScaleY(1.0f);
        }
        l1Var.f50942e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        g5 g5Var = l1Var.d;
        if (g5Var != null) {
            g5Var.n(imageView);
            l1Var.d = null;
        }
        l1Var.h = null;
        if (j10 != 0) {
            g5 m10 = g5.m(h10.f22829t0, j10, null, 1);
            l1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(l1Var.d);
        } else {
            ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(6.0f), k6.r1(0.1f, k6.x0(null, k6.G6, false)));
            l1Var.h = d02;
            xp xpVar = new xp(d02, new k3(charSequence2));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            xpVar.h = L;
            xpVar.f40443n = L2;
            imageView.setImageDrawable(xpVar);
        }
        l1Var.f50943f = z10;
        l1Var.invalidate();
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new l1(context);
    }
}
