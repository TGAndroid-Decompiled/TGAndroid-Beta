package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class p0 extends v51 {
    static {
        v51.setup(new v51());
    }

    public static w51 a(int i10, o0 o0Var) {
        w51 J = w51.J(p0.class);
        J.f29957u = 1;
        J.f29961z = i10;
        J.G = o0Var;
        return J;
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        boolean z11;
        String str;
        q0 q0Var = (q0) view;
        o0 o0Var = (o0) w51Var.G;
        int i10 = w51Var.f29961z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        q0Var.f47929s = z11;
        v9 v9Var = q0Var.d;
        TextView textView = q0Var.e;
        xh.f1 f1Var = q0Var.f47925c;
        q0Var.v = o0Var;
        int i11 = -1;
        if (i10 == 0) {
            f1Var.d(null);
            f1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.f47838c;
            textView.setText(stargiftattributemodel.name);
            q0.a(q0Var, stargiftattributemodel.document, 80, w51Var.G, true);
            v9Var.setColorFilter(null);
            f1Var.f46162w = org.telegram.ui.ActionBar.j6.Oh;
            str = y3.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.f47836a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var.f47837b;
            f1Var.d(stargiftattributebackdrop);
            f1Var.e(stargiftattributepattern);
            f1Var.f46162w = org.telegram.ui.ActionBar.j6.f19094d6;
            textView.setText(stargiftattributebackdrop.name);
            q0.a(q0Var, stargiftattributepattern.document, 48, w51Var.G, false);
            v9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = y3.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = o0Var.f47836a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = o0Var.f47837b;
            f1Var.d(stargiftattributebackdrop2);
            f1Var.e(stargiftattributepattern2);
            f1Var.f46162w = org.telegram.ui.ActionBar.j6.f19094d6;
            textView.setText(stargiftattributepattern2.name);
            q0.a(q0Var, stargiftattributepattern2.document, 64, w51Var.G, false);
            v9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = y3.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19201j5, q0Var.f47923a);
        }
        textView.setTextColor(i11);
        q0Var.f47926f.setText(str);
        q0Var.h = numArr[0];
        q0Var.b();
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q0(context, f6Var);
    }
}
