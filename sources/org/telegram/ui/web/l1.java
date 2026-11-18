package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import hi.l3;
import org.telegram.messenger.j10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.z41;
public final class l1 extends k41 {
    public static final int f53233b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        m1 m1Var = (m1) view;
        CharSequence charSequence = l41Var.f37020o;
        String str = (String) l41Var.f37018m;
        long j3 = l41Var.C;
        ImageView imageView = m1Var.f53245a;
        m1Var.f53246b.setText(charSequence);
        o2 o2Var = m1Var.f53247c;
        o2Var.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            o2Var.setTranslationY(-org.telegram.messenger.g0.L(14.0f));
            o2Var.setScaleX(1.3f);
            o2Var.setScaleY(1.3f);
        } else {
            o2Var.setTranslationY(0.0f);
            o2Var.setScaleX(1.0f);
            o2Var.setScaleY(1.0f);
        }
        m1Var.f53248e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        o5 o5Var = m1Var.d;
        if (o5Var != null) {
            o5Var.n(imageView);
            m1Var.d = null;
        }
        m1Var.h = null;
        if (j3 != 0) {
            o5 m10 = o5.m(j10.f24773t0, j3, null, 1);
            m1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(m1Var.d);
        } else {
            ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(6.0f), n6.r1(0.1f, n6.x0(null, n6.G6, false)));
            m1Var.h = d02;
            mq mqVar = new mq(d02, new l3(charSequence2));
            int L = org.telegram.messenger.g0.L(28.0f);
            int L2 = org.telegram.messenger.g0.L(28.0f);
            mqVar.h = L;
            mqVar.f37612n = L2;
            imageView.setImageDrawable(mqVar);
        }
        m1Var.f53249f = z10;
        m1Var.invalidate();
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new m1(context);
    }
}
