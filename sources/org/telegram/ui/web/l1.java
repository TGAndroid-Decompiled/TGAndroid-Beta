package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import hi.k3;
import org.telegram.messenger.k10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p5;
public final class l1 extends n41 {
    public static final int f53231b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        m1 m1Var = (m1) view;
        CharSequence charSequence = o41Var.f38093o;
        String str = (String) o41Var.f38091m;
        long j3 = o41Var.C;
        ImageView imageView = m1Var.f53243a;
        m1Var.f53244b.setText(charSequence);
        n2 n2Var = m1Var.f53245c;
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
        m1Var.f53246e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        p5 p5Var = m1Var.d;
        if (p5Var != null) {
            p5Var.n(imageView);
            m1Var.d = null;
        }
        m1Var.h = null;
        if (j3 != 0) {
            p5 m10 = p5.m(k10.f24968t0, j3, null, 1);
            m1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(m1Var.d);
        } else {
            ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(6.0f), m6.r1(0.1f, m6.x0(null, m6.G6, false)));
            m1Var.h = d02;
            oq oqVar = new oq(d02, new k3(charSequence2));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            oqVar.h = L;
            oqVar.f38334n = L2;
            imageView.setImageDrawable(oqVar);
        }
        m1Var.f53247f = z10;
        m1Var.invalidate();
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new m1(context);
    }
}
