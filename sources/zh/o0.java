package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.z9;
public final class o0 extends k61 {
    static {
        k61.setup(new k61());
    }

    public static l61 a(int i10, n0 n0Var) {
        l61 J = l61.J(o0.class);
        J.f26963u = 1;
        J.f26967z = i10;
        J.G = n0Var;
        return J;
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        boolean z11;
        String str;
        p0 p0Var = (p0) view;
        n0 n0Var = (n0) l61Var.G;
        int i10 = l61Var.f26967z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        p0Var.f50973s = z11;
        z9 z9Var = p0Var.d;
        TextView textView = p0Var.e;
        yh.e1 e1Var = p0Var.f50969c;
        p0Var.v = n0Var;
        int i11 = -1;
        if (i10 == 0) {
            e1Var.d(null);
            e1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = n0Var.f50852c;
            textView.setText(stargiftattributemodel.name);
            p0.a(p0Var, stargiftattributemodel.document, 80, l61Var.G, true);
            z9Var.setColorFilter(null);
            e1Var.f48842w = org.telegram.ui.ActionBar.g6.Oh;
            str = r3.K1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = n0Var.f50850a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = n0Var.f50851b;
            e1Var.d(stargiftattributebackdrop);
            e1Var.e(stargiftattributepattern);
            e1Var.f48842w = org.telegram.ui.ActionBar.g6.f19901d6;
            textView.setText(stargiftattributebackdrop.name);
            p0.a(p0Var, stargiftattributepattern.document, 48, l61Var.G, false);
            z9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = r3.K1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = n0Var.f50850a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = n0Var.f50851b;
            e1Var.d(stargiftattributebackdrop2);
            e1Var.e(stargiftattributepattern2);
            e1Var.f48842w = org.telegram.ui.ActionBar.g6.f19901d6;
            textView.setText(stargiftattributepattern2.name);
            p0.a(p0Var, stargiftattributepattern2.document, 64, l61Var.G, false);
            z9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = r3.K1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20007j5, p0Var.f50967a);
        }
        textView.setTextColor(i11);
        p0Var.f50970f.setText(str);
        p0Var.h = numArr[0];
        p0Var.b();
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new p0(context, c6Var);
    }
}
