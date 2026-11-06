package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import fi.l3;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xp;
public final class m1 extends q31 {
    public static final int f51230b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        n1 n1Var = (n1) view;
        CharSequence charSequence = r31Var.f37600n;
        String str = (String) r31Var.f37598l;
        long j3 = r31Var.B;
        ImageView imageView = n1Var.f51237a;
        n1Var.f51238b.setText(charSequence);
        m2 m2Var = n1Var.f51239c;
        m2Var.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            m2Var.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            m2Var.setScaleX(1.3f);
            m2Var.setScaleY(1.3f);
        } else {
            m2Var.setTranslationY(0.0f);
            m2Var.setScaleX(1.0f);
            m2Var.setScaleY(1.0f);
        }
        n1Var.f51240e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        i5 i5Var = n1Var.d;
        if (i5Var != null) {
            i5Var.n(imageView);
            n1Var.d = null;
        }
        n1Var.h = null;
        if (j3 != 0) {
            i5 m10 = i5.m(p10.f24459s0, j3, null, 1);
            n1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(n1Var.d);
        } else {
            ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(6.0f), k6.r1(0.1f, k6.x0(null, k6.G6, false)));
            n1Var.h = d02;
            xp xpVar = new xp(d02, new l3(charSequence2));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            xpVar.h = L;
            xpVar.f40301n = L2;
            imageView.setImageDrawable(xpVar);
        }
        n1Var.f51241f = z9;
        n1Var.invalidate();
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new n1(context);
    }
}
