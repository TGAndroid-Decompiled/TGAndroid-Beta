package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zl0;
public final class p0 extends f61 {
    static {
        f61.setup(new f61());
    }

    public static g61 a(int i10, o0 o0Var) {
        g61 J = g61.J(p0.class);
        J.f26683u = 1;
        J.f26687z = i10;
        J.G = o0Var;
        return J;
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        boolean z11;
        String str;
        q0 q0Var = (q0) view;
        o0 o0Var = (o0) g61Var.G;
        int i10 = g61Var.f26687z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        q0Var.f51843s = z11;
        w9 w9Var = q0Var.d;
        TextView textView = q0Var.f51839e;
        xh.f1 f1Var = q0Var.f51838c;
        q0Var.v = o0Var;
        int i11 = -1;
        if (i10 == 0) {
            f1Var.d(null);
            f1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.f51728c;
            textView.setText(stargiftattributemodel.name);
            q0.a(q0Var, stargiftattributemodel.document, 80, g61Var.G, true);
            w9Var.setColorFilter(null);
            f1Var.f49956w = org.telegram.ui.ActionBar.i6.Oh;
            str = x3.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.f51726a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var.f51727b;
            f1Var.d(stargiftattributebackdrop);
            f1Var.e(stargiftattributepattern);
            f1Var.f49956w = org.telegram.ui.ActionBar.i6.f20822d6;
            textView.setText(stargiftattributebackdrop.name);
            q0.a(q0Var, stargiftattributepattern.document, 48, g61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = x3.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = o0Var.f51726a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = o0Var.f51727b;
            f1Var.d(stargiftattributebackdrop2);
            f1Var.e(stargiftattributepattern2);
            f1Var.f49956w = org.telegram.ui.ActionBar.i6.f20822d6;
            textView.setText(stargiftattributepattern2.name);
            q0.a(q0Var, stargiftattributepattern2.document, 64, g61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = x3.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20930j5, q0Var.f51836a);
        }
        textView.setTextColor(i11);
        q0Var.f51840f.setText(str);
        q0Var.h = numArr[0];
        q0Var.b();
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new q0(context, d6Var);
    }
}
