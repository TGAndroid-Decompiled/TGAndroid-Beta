package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import fi.l3;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.h5;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xp;
public final class m1 extends w31 {
    public static final int f51177b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, m41 m41Var, r41 r41Var) {
        n1 n1Var = (n1) view;
        CharSequence charSequence = x31Var.f40158n;
        String str = (String) x31Var.f40156l;
        long j3 = x31Var.B;
        ImageView imageView = n1Var.f51184a;
        n1Var.f51185b.setText(charSequence);
        n2 n2Var = n1Var.f51186c;
        n2Var.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            n2Var.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            n2Var.setScaleX(1.3f);
            n2Var.setScaleY(1.3f);
        } else {
            n2Var.setTranslationY(0.0f);
            n2Var.setScaleX(1.0f);
            n2Var.setScaleY(1.0f);
        }
        n1Var.f51187e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        h5 h5Var = n1Var.d;
        if (h5Var != null) {
            h5Var.n(imageView);
            n1Var.d = null;
        }
        n1Var.h = null;
        if (j3 != 0) {
            h5 m10 = h5.m(p10.f24474s0, j3, null, 1);
            n1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(n1Var.d);
        } else {
            ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(6.0f), m6.r1(0.1f, m6.x0(null, m6.G6, false)));
            n1Var.h = d02;
            xp xpVar = new xp(d02, new l3(charSequence2));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            xpVar.h = L;
            xpVar.f40379n = L2;
            imageView.setImageDrawable(xpVar);
        }
        n1Var.f51188f = z9;
        n1Var.invalidate();
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, h6 h6Var) {
        return new n1(context);
    }
}
