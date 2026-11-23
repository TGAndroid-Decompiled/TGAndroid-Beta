package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class sh implements View.OnClickListener {
    public final lf0 f52081a;
    public final org.telegram.ui.Components.ek0 f52082b;
    public final LinearLayout f52083c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f52084e;
    public final bn f52085f;

    public sh(bn bnVar, lf0 lf0Var, org.telegram.ui.Components.ek0 ek0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f52085f = bnVar;
        this.f52081a = lf0Var;
        this.f52082b = ek0Var;
        this.f52083c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f52084e = iArr;
    }

    @Override
    public final void onClick(View view) {
        lf0 lf0Var = this.f52081a;
        ArrayList arrayList = lf0Var.f49745b;
        ArrayList arrayList2 = lf0Var.f49746c;
        bn bnVar = this.f52085f;
        if (bnVar.f46209g9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f28641id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28492id);
                    }
                    bnVar.presentFragment(new ProfileActivity(bundle, null));
                    bnVar.P7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.bz.f23278c1 > 0 && bnVar.f46279m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.fc t6 = new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(bnVar.getParentActivity()), bnVar.Ba).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748295, null)), null);
                bnVar.C1 = t6;
                t6.f35091j = 4000;
                t6.j();
                org.telegram.messenger.bz.S(org.telegram.messenger.bz.f23278c1 - 1);
            }
            org.telegram.ui.Components.ek0 ek0Var = this.f52082b;
            ek0Var.requestLayout();
            this.f52083c.requestLayout();
            ek0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.f52084e[0]);
        }
    }
}
