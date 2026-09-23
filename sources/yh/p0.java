package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
public final class p0 extends g51 {
    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, o0 o0Var) {
        h51 J = h51.J(p0.class);
        J.f24516u = 1;
        J.f24520z = i10;
        J.G = o0Var;
        return J;
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        boolean z11;
        String str;
        q0 q0Var = (q0) view;
        o0 o0Var = (o0) h51Var.G;
        int i10 = h51Var.f24520z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        q0Var.f47576s = z11;
        w9 w9Var = q0Var.d;
        TextView textView = q0Var.e;
        xh.f1 f1Var = q0Var.f47572c;
        q0Var.v = o0Var;
        int i11 = -1;
        if (i10 == 0) {
            f1Var.d(null);
            f1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.f47485c;
            textView.setText(stargiftattributemodel.name);
            q0.a(q0Var, stargiftattributemodel.document, 80, h51Var.G, true);
            w9Var.setColorFilter(null);
            f1Var.f45814w = org.telegram.ui.ActionBar.h6.Oh;
            str = y3.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.f47483a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var.f47484b;
            f1Var.d(stargiftattributebackdrop);
            f1Var.e(stargiftattributepattern);
            f1Var.f45814w = org.telegram.ui.ActionBar.h6.f18789d6;
            textView.setText(stargiftattributebackdrop.name);
            q0.a(q0Var, stargiftattributepattern.document, 48, h51Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = y3.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = o0Var.f47483a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = o0Var.f47484b;
            f1Var.d(stargiftattributebackdrop2);
            f1Var.e(stargiftattributepattern2);
            f1Var.f45814w = org.telegram.ui.ActionBar.h6.f18789d6;
            textView.setText(stargiftattributepattern2.name);
            q0.a(q0Var, stargiftattributepattern2.document, 64, h51Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = y3.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18895j5, q0Var.f47570a);
        }
        textView.setTextColor(i11);
        q0Var.f47573f.setText(str);
        q0Var.h = numArr[0];
        q0Var.b();
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new q0(context, d6Var);
    }
}
