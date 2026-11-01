package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class p0 extends a51 {
    static {
        a51.h(new a51());
    }

    public static b51 i(int i10, o0 o0Var) {
        b51 K = b51.K(p0.class);
        K.f24652u = 1;
        K.f24656z = i10;
        K.G = o0Var;
        return K;
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        boolean z11;
        String str;
        q0 q0Var = (q0) view;
        o0 o0Var = (o0) b51Var.G;
        int i10 = b51Var.f24656z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        q0Var.f47354s = z11;
        g9 g9Var = q0Var.d;
        TextView textView = q0Var.e;
        ph.z0 z0Var = q0Var.f47350c;
        q0Var.f47355w = o0Var;
        if (i10 == 0) {
            z0Var.d(null);
            z0Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.f47288c;
            textView.setText(stargiftattributemodel.name);
            q0.a(q0Var, stargiftattributemodel.document, 80, b51Var.G, true);
            g9Var.setColorFilter(null);
            z0Var.f45394y = org.telegram.ui.ActionBar.t6.Ci;
            str = e4.G1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.f47286a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var.f47287b;
            z0Var.d(stargiftattributebackdrop);
            z0Var.e(stargiftattributepattern);
            z0Var.f45394y = org.telegram.ui.ActionBar.t6.f20930d6;
            textView.setText(stargiftattributebackdrop.name);
            q0.a(q0Var, stargiftattributepattern.document, 48, b51Var.G, false);
            g9Var.setColorFilter(new PorterDuffColorFilter(i0.b.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = e4.G1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = o0Var.f47286a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = o0Var.f47287b;
            z0Var.d(stargiftattributebackdrop2);
            z0Var.e(stargiftattributepattern2);
            z0Var.f45394y = org.telegram.ui.ActionBar.t6.f20930d6;
            textView.setText(stargiftattributepattern2.name);
            q0.a(q0Var, stargiftattributepattern2.document, 64, b51Var.G, false);
            g9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = e4.G1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, q0Var.f47348a);
        } else {
            org.telegram.ui.ActionBar.a7.r(textView);
            textView.setTextColor(-1);
        }
        q0Var.f47351f.setText(str);
        q0Var.h = numArr[0];
        q0Var.b();
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new q0(context, p6Var);
    }
}
