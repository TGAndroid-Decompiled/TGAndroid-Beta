package org.telegram.ui.web;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.d20;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.q2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class n1 extends z41 {
    public static final int f43145b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        o1 o1Var = (o1) view;
        CharSequence charSequence = a51Var.f24294n;
        String str = (String) a51Var.f24292l;
        long j10 = a51Var.B;
        ImageView imageView = o1Var.f43152a;
        o1Var.f43153b.setText(charSequence);
        q2 q2Var = o1Var.f43154c;
        q2Var.setText(str);
        if (TextUtils.isEmpty(charSequence)) {
            q2Var.setTranslationY(-org.telegram.messenger.i0.L(14.0f));
            q2Var.setScaleX(1.3f);
            q2Var.setScaleY(1.3f);
        } else {
            q2Var.setTranslationY(0.0f);
            q2Var.setScaleX(1.0f);
            q2Var.setScaleY(1.0f);
        }
        o1Var.e = str;
        if (TextUtils.isEmpty(charSequence)) {
            if (!str.isEmpty() && !TextUtils.isEmpty(str)) {
                charSequence = str;
            } else {
                charSequence = "";
            }
        }
        String charSequence2 = charSequence.toString();
        f5 f5Var = o1Var.d;
        if (f5Var != null) {
            f5Var.n(imageView);
            o1Var.d = null;
        }
        o1Var.h = null;
        if (j10 != 0) {
            f5 m10 = f5.m(d20.f15147s0, j10, null, 1);
            o1Var.d = m10;
            m10.a(imageView);
            imageView.setImageDrawable(o1Var.d);
        } else {
            ShapeDrawable d02 = t6.d0(org.telegram.messenger.i0.L(6.0f), t6.r1(0.1f, t6.x0(null, t6.G6, false)));
            o1Var.h = d02;
            eq eqVar = new eq(d02, new jg.x0(charSequence2));
            int L = org.telegram.messenger.i0.L(28.0f);
            int L2 = org.telegram.messenger.i0.L(28.0f);
            eqVar.h = L;
            eqVar.f25843n = L2;
            imageView.setImageDrawable(eqVar);
        }
        o1Var.f43155f = z10;
        o1Var.invalidate();
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new o1(context);
    }
}
