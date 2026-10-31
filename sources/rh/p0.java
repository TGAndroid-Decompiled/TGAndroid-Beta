package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class p0 extends z41 {
    static {
        z41.h(new z41());
    }

    public static a51 i(int i10, o0 o0Var) {
        a51 K = a51.K(p0.class);
        K.f24301u = 1;
        K.f24305z = i10;
        K.G = o0Var;
        return K;
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        boolean z11;
        String str;
        q0 q0Var = (q0) view;
        o0 o0Var = (o0) a51Var.G;
        int i10 = a51Var.f24305z;
        Integer[] numArr = new Integer[1];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        q0Var.f47340s = z11;
        g9 g9Var = q0Var.d;
        TextView textView = q0Var.e;
        ph.z0 z0Var = q0Var.f47336c;
        q0Var.f47341w = o0Var;
        if (i10 == 0) {
            z0Var.d(null);
            z0Var.e(null);
            TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var.f47274c;
            textView.setText(stargiftattributemodel.name);
            q0.a(q0Var, stargiftattributemodel.document, 80, a51Var.G, true);
            g9Var.setColorFilter(null);
            z0Var.f45383y = org.telegram.ui.ActionBar.t6.Ci;
            str = e4.G1(stargiftattributemodel.rarity, numArr);
        } else if (i10 == 1) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var.f47272a;
            TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var.f47273b;
            z0Var.d(stargiftattributebackdrop);
            z0Var.e(stargiftattributepattern);
            z0Var.f45383y = org.telegram.ui.ActionBar.t6.f20929d6;
            textView.setText(stargiftattributebackdrop.name);
            q0.a(q0Var, stargiftattributepattern.document, 48, a51Var.G, false);
            g9Var.setColorFilter(new PorterDuffColorFilter(i0.b.o(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
            str = e4.G1(stargiftattributebackdrop.rarity, numArr);
        } else if (i10 == 2) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = o0Var.f47272a;
            TL_stars.starGiftAttributePattern stargiftattributepattern2 = o0Var.f47273b;
            z0Var.d(stargiftattributebackdrop2);
            z0Var.e(stargiftattributepattern2);
            z0Var.f45383y = org.telegram.ui.ActionBar.t6.f20929d6;
            textView.setText(stargiftattributepattern2.name);
            q0.a(q0Var, stargiftattributepattern2.document, 64, a51Var.G, false);
            g9Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            str = e4.G1(stargiftattributepattern2.rarity, numArr);
        } else {
            str = "";
        }
        if (i10 == 0) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, q0Var.f47334a);
        } else {
            org.telegram.ui.ActionBar.a7.r(textView);
            textView.setTextColor(-1);
        }
        q0Var.f47337f.setText(str);
        q0Var.h = numArr[0];
        q0Var.b();
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new q0(context, p6Var);
    }
}
