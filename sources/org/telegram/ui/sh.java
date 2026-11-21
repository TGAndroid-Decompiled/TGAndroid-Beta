package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class sh implements View.OnClickListener {
    public final mf0 f52036a;
    public final org.telegram.ui.Components.ek0 f52037b;
    public final LinearLayout f52038c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f52039e;
    public final bn f52040f;

    public sh(bn bnVar, mf0 mf0Var, org.telegram.ui.Components.ek0 ek0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f52040f = bnVar;
        this.f52036a = mf0Var;
        this.f52037b = ek0Var;
        this.f52038c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f52039e = iArr;
    }

    @Override
    public final void onClick(View view) {
        mf0 mf0Var = this.f52036a;
        ArrayList arrayList = mf0Var.f49867b;
        ArrayList arrayList2 = mf0Var.f49868c;
        bn bnVar = this.f52040f;
        if (bnVar.f46037g9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f28580id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28431id);
                    }
                    bnVar.presentFragment(new ProfileActivity(bundle, null));
                    bnVar.P7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.bz.f23181c1 > 0 && bnVar.f46107m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.gc t6 = new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.Ba).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748295, null)), null);
                bnVar.C1 = t6;
                t6.f35508j = 4000;
                t6.j();
                org.telegram.messenger.bz.S(org.telegram.messenger.bz.f23181c1 - 1);
            }
            org.telegram.ui.Components.ek0 ek0Var = this.f52037b;
            ek0Var.requestLayout();
            this.f52038c.requestLayout();
            ek0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.f52039e[0]);
        }
    }
}
