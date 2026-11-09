package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uh implements View.OnClickListener {
    public final lf0 f50396a;
    public final org.telegram.ui.Components.qj0 f50397b;
    public final LinearLayout f50398c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f50399e;
    public final cn f50400f;

    public uh(cn cnVar, lf0 lf0Var, org.telegram.ui.Components.qj0 qj0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f50400f = cnVar;
        this.f50396a = lf0Var;
        this.f50397b = qj0Var;
        this.f50398c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f50399e = iArr;
    }

    @Override
    public final void onClick(View view) {
        lf0 lf0Var = this.f50396a;
        ArrayList arrayList = lf0Var.f47591b;
        ArrayList arrayList2 = lf0Var.f47592c;
        cn cnVar = this.f50400f;
        if (cnVar.f44442e9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f27105id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f26956id);
                    }
                    cnVar.presentFragment(new ProfileActivity(bundle, null));
                    cnVar.P7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.iz.f23393c1 > 0 && cnVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(cnVar.getParentActivity()), cnVar.f44709za).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748488, null)), null);
                cnVar.B1 = t6;
                t6.f32627j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23393c1 - 1);
            }
            org.telegram.ui.Components.qj0 qj0Var = this.f50397b;
            qj0Var.requestLayout();
            this.f50398c.requestLayout();
            qj0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.f50399e[0]);
        }
    }
}
