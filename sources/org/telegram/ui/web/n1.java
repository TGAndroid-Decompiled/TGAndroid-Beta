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
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.xp;
public final class n1 extends v31 {
    public static final int f51251b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        o1 o1Var = (o1) view;
        CharSequence charSequence = w31Var.f39832n;
        String str = (String) w31Var.f39830l;
        long j3 = w31Var.B;
        ImageView imageView = o1Var.f51258a;
        o1Var.f51259b.setText(charSequence);
        m2 m2Var = o1Var.f51260c;
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
        o1Var.f51261e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        i5 i5Var = o1Var.d;
        if (i5Var != null) {
            i5Var.n(imageView);
            o1Var.d = null;
        }
        o1Var.h = null;
        if (j3 != 0) {
            i5 m10 = i5.m(p10.f24459s0, j3, null, 1);
            o1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(o1Var.d);
        } else {
            ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(6.0f), k6.r1(0.1f, k6.x0(null, k6.G6, false)));
            o1Var.h = d02;
            xp xpVar = new xp(d02, new l3(charSequence2));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            xpVar.h = L;
            xpVar.f40320n = L2;
            imageView.setImageDrawable(xpVar);
        }
        o1Var.f51262f = z9;
        o1Var.invalidate();
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new o1(context);
    }
}
