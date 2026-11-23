package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rh implements View.OnClickListener {
    public final mf0 f51608a;
    public final org.telegram.ui.Components.ek0 f51609b;
    public final LinearLayout f51610c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f51611e;
    public final bn f51612f;

    public rh(bn bnVar, mf0 mf0Var, org.telegram.ui.Components.ek0 ek0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f51612f = bnVar;
        this.f51608a = mf0Var;
        this.f51609b = ek0Var;
        this.f51610c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f51611e = iArr;
    }

    @Override
    public final void onClick(View view) {
        mf0 mf0Var = this.f51608a;
        ArrayList arrayList = mf0Var.f49841b;
        ArrayList arrayList2 = mf0Var.f49842c;
        bn bnVar = this.f51612f;
        if (bnVar.f45994g9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f28547id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28398id);
                    }
                    bnVar.presentFragment(new ProfileActivity(bundle, null));
                    bnVar.P7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.cz.f23362c1 > 0 && bnVar.f46064m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.gc t6 = new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(bnVar.getParentActivity()), bnVar.Ba).t(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131748295, null)), null);
                bnVar.C1 = t6;
                t6.f35489j = 4000;
                t6.j();
                org.telegram.messenger.cz.S(org.telegram.messenger.cz.f23362c1 - 1);
            }
            org.telegram.ui.Components.ek0 ek0Var = this.f51609b;
            ek0Var.requestLayout();
            this.f51610c.requestLayout();
            ek0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.f51611e[0]);
        }
    }
}
