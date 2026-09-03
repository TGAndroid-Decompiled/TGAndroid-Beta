package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class td1 implements View.OnClickListener {
    public final xh0 f41518a;
    public final xn f41519b;
    public final org.telegram.ui.Components.sl0 f41520c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.q70 f41521e;
    public final org.telegram.ui.Components.q70 f41522f;
    public final zd1 h;

    public td1(zd1 zd1Var, xh0 xh0Var, xn xnVar, org.telegram.ui.Components.sl0 sl0Var, LinearLayout linearLayout, org.telegram.ui.Components.q70 q70Var, org.telegram.ui.Components.q70 q70Var2) {
        this.h = zd1Var;
        this.f41518a = xh0Var;
        this.f41519b = xnVar;
        this.f41520c = sl0Var;
        this.d = linearLayout;
        this.f41521e = q70Var;
        this.f41522f = q70Var2;
    }

    @Override
    public final void onClick(View view) {
        xh0 xh0Var = this.f41518a;
        ArrayList arrayList = xh0Var.f43049b;
        ArrayList arrayList2 = xh0Var.f43050c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            zd1 zd1Var = this.h;
            xn xnVar = this.f41519b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20992id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20845id);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                zd1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && xnVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(zd1Var.getContext()), zd1Var.f43923a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                xnVar.f43219k1 = t6;
                t6.f27778j = 4000;
                t6.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.sl0 sl0Var = this.f41520c;
            sl0Var.requestLayout();
            this.d.requestLayout();
            sl0Var.getAdapter().l();
            this.f41521e.K(this.f41522f);
        }
    }
}
