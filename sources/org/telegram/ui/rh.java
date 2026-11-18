package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rh implements View.OnClickListener {
    public final nf0 f51597a;
    public final org.telegram.ui.Components.ck0 f51598b;
    public final LinearLayout f51599c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f51600e;
    public final bn f51601f;

    public rh(bn bnVar, nf0 nf0Var, org.telegram.ui.Components.ck0 ck0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f51601f = bnVar;
        this.f51597a = nf0Var;
        this.f51598b = ck0Var;
        this.f51599c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f51600e = iArr;
    }

    @Override
    public final void onClick(View view) {
        nf0 nf0Var = this.f51597a;
        ArrayList arrayList = nf0Var.f50159b;
        ArrayList arrayList2 = nf0Var.f50160c;
        bn bnVar = this.f51601f;
        if (bnVar.f46014g9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f28552id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28403id);
                    }
                    bnVar.presentFragment(new ProfileActivity(bundle, null));
                    bnVar.P7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.bz.f23153c1 > 0 && bnVar.f46084m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.gc t6 = new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.Ba).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131748296, null)), null);
                bnVar.C1 = t6;
                t6.f35461j = 4000;
                t6.j();
                org.telegram.messenger.bz.S(org.telegram.messenger.bz.f23153c1 - 1);
            }
            org.telegram.ui.Components.ck0 ck0Var = this.f51598b;
            ck0Var.requestLayout();
            this.f51599c.requestLayout();
            ck0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.f51600e[0]);
        }
    }
}
