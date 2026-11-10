package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uh implements View.OnClickListener {
    public final mf0 f50498a;
    public final org.telegram.ui.Components.pj0 f50499b;
    public final LinearLayout f50500c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f50501e;
    public final cn f50502f;

    public uh(cn cnVar, mf0 mf0Var, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f50502f = cnVar;
        this.f50498a = mf0Var;
        this.f50499b = pj0Var;
        this.f50500c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f50501e = iArr;
    }

    @Override
    public final void onClick(View view) {
        mf0 mf0Var = this.f50498a;
        ArrayList arrayList = mf0Var.f47942b;
        ArrayList arrayList2 = mf0Var.f47943c;
        cn cnVar = this.f50502f;
        if (cnVar.f44483e9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f27109id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f26960id);
                    }
                    cnVar.presentFragment(new ProfileActivity(bundle, null));
                    cnVar.P7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.iz.f23397c1 > 0 && cnVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.bc t6 = new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(cnVar.getParentActivity()), cnVar.f44750za).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748488, null)), null);
                cnVar.B1 = t6;
                t6.f32203j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23397c1 - 1);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f50499b;
            pj0Var.requestLayout();
            this.f50500c.requestLayout();
            pj0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.f50501e[0]);
        }
    }
}
