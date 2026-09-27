package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class r81 implements Utilities.Callback5, Utilities.Callback5Return, li.h, r0.n, li.i {
    public final a91 f37036a;

    public r81(a91 a91Var) {
        this.f37036a = a91Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        int i10 = defaultWindowInsets.d;
        a91 a91Var = this.f37036a;
        a91Var.S = i10;
        li.b.a(a91Var.f32014c, defaultWindowInsets.f10580b, i10, AndroidUtilities.dp(12.0f), a91Var.T);
        return r0.l1.f42184b;
    }

    @Override
    public int g() {
        a91 a91Var = this.f37036a;
        a91Var.getClass();
        return a91Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19001a7);
    }

    @Override
    public void j(int i10) {
        a91.Z(this.f37036a, i10);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        return Boolean.valueOf(a91.V(this.f37036a, (org.telegram.ui.Components.x51) obj, (View) obj2));
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        a91.g0(this.f37036a, (org.telegram.ui.Components.x51) obj);
    }
}
