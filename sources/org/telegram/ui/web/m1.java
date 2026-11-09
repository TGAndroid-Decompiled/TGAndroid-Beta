package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import fi.l3;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.y31;
public final class m1 extends x31 {
    public static final int f51223b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        n1 n1Var = (n1) view;
        CharSequence charSequence = y31Var.f40570n;
        String str = (String) y31Var.f40568l;
        long j3 = y31Var.B;
        ImageView imageView = n1Var.f51230a;
        n1Var.f51231b.setText(charSequence);
        m2 m2Var = n1Var.f51232c;
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
        n1Var.f51233e = str;
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
            i5 m10 = i5.m(p10.f24470s0, j3, null, 1);
            n1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(n1Var.d);
        } else {
            ShapeDrawable d02 = l6.d0(org.telegram.messenger.g0.L(6.0f), l6.r1(0.1f, l6.x0(null, l6.G6, false)));
            n1Var.h = d02;
            xp xpVar = new xp(d02, new l3(charSequence2));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            xpVar.h = L;
            xpVar.f40449n = L2;
            imageView.setImageDrawable(xpVar);
        }
        n1Var.f51234f = z9;
        n1Var.invalidate();
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new n1(context);
    }
}
