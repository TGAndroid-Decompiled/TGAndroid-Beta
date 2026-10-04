package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r81 implements Utilities.Callback5, Utilities.Callback5Return, r0.n {
    public final a91 f39954a;

    public r81(a91 a91Var) {
        this.f39954a = a91Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        a91 a91Var = this.f39954a;
        a91Var.T = i10;
        int i11 = defaultWindowInsets.f11527b;
        if (a91Var.N != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11;
            ViewGroup.LayoutParams layoutParams = a91Var.N.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                a91Var.N.setLayoutParams(layoutParams);
            }
        }
        li.a.c(a91Var.f34744c, i11, defaultWindowInsets.d, AndroidUtilities.dp(12.0f), a91Var.U);
        return r0.l1.f45616b;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(a91.S(this.f39954a, (org.telegram.ui.Components.g61) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        a91.e0(this.f39954a, (org.telegram.ui.Components.g61) obj);
    }
}
