package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zl0;
public final class q0 extends g61 {
    static {
        g61.setup(new g61());
    }

    public static h61 a(int i10, p0 p0Var) {
        h61 K = h61.K(q0.class);
        K.f27102u = 1;
        K.f27106z = i10;
        K.G = p0Var;
        return K;
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        boolean z11;
        String str;
        r0 r0Var = (r0) view;
        p0 p0Var = (p0) h61Var.G;
        int i10 = h61Var.f27106z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        r0Var.f51897s = z11;
        w9 w9Var = r0Var.d;
        TextView textView = r0Var.f51893e;
        xh.f1 f1Var = r0Var.f51892c;
        r0Var.v = p0Var;
        int i11 = -1;
        if (i10 == 0) {
            f1Var.d(null);
            f1Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = p0Var.f51780c;
            textView.setText(stargiftattributemodel.name);
            r0.a(r0Var, stargiftattributemodel.document, 80, h61Var.G, true);
            w9Var.setColorFilter(null);
            f1Var.f49963w = org.telegram.ui.ActionBar.i6.Oh;
            str = y3.J1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = p0Var.f51778a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = p0Var.f51779b;
            f1Var.d(stargiftattributebackdrop);
            f1Var.e(stargiftattributepattern);
            f1Var.f49963w = org.telegram.ui.ActionBar.i6.f20827d6;
            textView.setText(stargiftattributebackdrop.name);
            r0.a(r0Var, stargiftattributepattern.document, 48, h61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(i0.a.k(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = y3.J1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = p0Var.f51778a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = p0Var.f51779b;
            f1Var.d(stargiftattributebackdrop2);
            f1Var.e(stargiftattributepattern2);
            f1Var.f49963w = org.telegram.ui.ActionBar.i6.f20827d6;
            textView.setText(stargiftattributepattern2.name);
            r0.a(r0Var, stargiftattributepattern2.document, 64, h61Var.G, false);
            w9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = y3.J1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            i11 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20935j5, r0Var.f51890a);
        }
        textView.setTextColor(i11);
        r0Var.f51894f.setText(str);
        r0Var.h = numArr[0];
        r0Var.b();
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new r0(context, d6Var);
    }
}
