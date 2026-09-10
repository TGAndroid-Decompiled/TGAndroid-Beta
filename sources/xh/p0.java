package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
public final class p0 extends u51 {
    static {
        u51.setup(new u51());
    }

    public static v51 a(int i10, o0 o0Var) {
        v51 J = v51.J(p0.class);
        J.f27838u = 1;
        J.f27842z = i10;
        J.G = o0Var;
        return J;
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        boolean z11;
        String str;
        q0 q0Var = (q0) view;
        o0 o0Var = (o0) v51Var.G;
        int i10 = v51Var.f27842z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        q0Var.f45907s = z11;
        w9 w9Var = q0Var.d;
        TextView textView = q0Var.e;
        wh.e1 e1Var = q0Var.f45903c;
        q0Var.v = o0Var;
        int i11 = -1;
        if (i10 == 0) {
            e1Var.d(null);
            e1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.f45788c;
            textView.setText(stargiftattributemodel.name);
            q0.a(q0Var, stargiftattributemodel.document, 80, v51Var.G, true);
            w9Var.setColorFilter(null);
            e1Var.f44076w = org.telegram.ui.ActionBar.j6.Oh;
            str = x3.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.f45786a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var.f45787b;
            e1Var.d(stargiftattributebackdrop);
            e1Var.e(stargiftattributepattern);
            e1Var.f44076w = org.telegram.ui.ActionBar.j6.f17928d6;
            textView.setText(stargiftattributebackdrop.name);
            q0.a(q0Var, stargiftattributepattern.document, 48, v51Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = x3.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = o0Var.f45786a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = o0Var.f45787b;
            e1Var.d(stargiftattributebackdrop2);
            e1Var.e(stargiftattributepattern2);
            e1Var.f44076w = org.telegram.ui.ActionBar.j6.f17928d6;
            textView.setText(stargiftattributepattern2.name);
            q0.a(q0Var, stargiftattributepattern2.document, 64, v51Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = x3.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18034j5, q0Var.f45901a);
        }
        textView.setTextColor(i11);
        q0Var.f45904f.setText(str);
        q0Var.h = numArr[0];
        q0Var.b();
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q0(context, f6Var);
    }
}
