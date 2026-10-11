package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.y9;
public final class o0 extends q61 {
    static {
        q61.setup(new q61());
    }

    public static r61 a(int i10, n0 n0Var) {
        r61 J = r61.J(o0.class);
        J.f30370u = 1;
        J.f30374z = i10;
        J.G = n0Var;
        return J;
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        boolean z11;
        String str;
        p0 p0Var = (p0) view;
        n0 n0Var = (n0) r61Var.G;
        int i10 = r61Var.f30374z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        p0Var.f53074s = z11;
        y9 y9Var = p0Var.d;
        TextView textView = p0Var.f53070e;
        xh.g1 g1Var = p0Var.f53069c;
        p0Var.v = n0Var;
        int i11 = -1;
        if (i10 == 0) {
            g1Var.d(null);
            g1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = n0Var.f52983c;
            textView.setText(stargiftattributemodel.name);
            p0.a(p0Var, stargiftattributemodel.document, 80, r61Var.G, true);
            y9Var.setColorFilter(null);
            g1Var.f51334w = org.telegram.ui.ActionBar.h6.Oh;
            str = s3.K1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = n0Var.f52981a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = n0Var.f52982b;
            g1Var.d(stargiftattributebackdrop);
            g1Var.e(stargiftattributepattern);
            g1Var.f51334w = org.telegram.ui.ActionBar.h6.f20786d6;
            textView.setText(stargiftattributebackdrop.name);
            p0.a(p0Var, stargiftattributepattern.document, 48, r61Var.G, false);
            y9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = s3.K1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = n0Var.f52981a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = n0Var.f52982b;
            g1Var.d(stargiftattributebackdrop2);
            g1Var.e(stargiftattributepattern2);
            g1Var.f51334w = org.telegram.ui.ActionBar.h6.f20786d6;
            textView.setText(stargiftattributepattern2.name);
            p0.a(p0Var, stargiftattributepattern2.document, 64, r61Var.G, false);
            y9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = s3.K1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20894j5, p0Var.f53067a);
        }
        textView.setTextColor(i11);
        p0Var.f53071f.setText(str);
        p0Var.h = numArr[0];
        p0Var.b();
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new p0(context, d6Var);
    }
}
