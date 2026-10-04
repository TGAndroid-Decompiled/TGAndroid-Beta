package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r81 implements Utilities.Callback5, Utilities.Callback5Return, li.i, r0.n, li.j {
    public final a91 f39948a;

    public r81(a91 a91Var) {
        this.f39948a = a91Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        a91 a91Var = this.f39948a;
        a91Var.R = i10;
        li.a.c(a91Var.f34738c, defaultWindowInsets.f11526b, i10, AndroidUtilities.dp(12.0f), a91Var.S);
        return r0.l1.f45608b;
    }

    @Override
    public int f() {
        a91 a91Var = this.f39948a;
        a91Var.getClass();
        return a91Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20761a7);
    }

    @Override
    public void k(int i10) {
        a91.U(this.f39948a, i10);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(a91.S(this.f39948a, (org.telegram.ui.Components.g61) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        a91.g0(this.f39948a, (org.telegram.ui.Components.g61) obj);
    }
}
