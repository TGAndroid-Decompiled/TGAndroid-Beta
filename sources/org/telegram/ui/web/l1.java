package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import hi.k3;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class l1 extends a41 {
    public static final int f52701b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        m1 m1Var = (m1) view;
        CharSequence charSequence = b41Var.f33183n;
        String str = (String) b41Var.f33181l;
        long j3 = b41Var.B;
        ImageView imageView = m1Var.f52713a;
        m1Var.f52714b.setText(charSequence);
        l2 l2Var = m1Var.f52715c;
        l2Var.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            l2Var.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            l2Var.setScaleX(1.3f);
            l2Var.setScaleY(1.3f);
        } else {
            l2Var.setTranslationY(0.0f);
            l2Var.setScaleX(1.0f);
            l2Var.setScaleY(1.0f);
        }
        m1Var.f52716e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        g5 g5Var = m1Var.d;
        if (g5Var != null) {
            g5Var.n(imageView);
            m1Var.d = null;
        }
        m1Var.h = null;
        if (j3 != 0) {
            g5 m10 = g5.m(m10.f24934t0, j3, null, 1);
            m1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(m1Var.d);
        } else {
            ShapeDrawable d02 = j6.d0(org.telegram.messenger.g0.L(6.0f), j6.r1(0.1f, j6.x0(null, j6.G6, false)));
            m1Var.h = d02;
            fq fqVar = new fq(d02, new k3(charSequence2));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            fqVar.h = L;
            fqVar.f34674n = L2;
            imageView.setImageDrawable(fqVar);
        }
        m1Var.f52717f = z10;
        m1Var.invalidate();
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new m1(context);
    }
}
