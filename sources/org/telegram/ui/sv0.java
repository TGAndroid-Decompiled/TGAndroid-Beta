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
public final class sv0 implements View.OnClickListener {
    public final xh0 f41319a;
    public final xn f41320b;
    public final org.telegram.ui.Components.sl0 f41321c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.q70 f41322e;
    public final org.telegram.ui.Components.q70 f41323f;
    public final yv0 h;

    public sv0(yv0 yv0Var, xh0 xh0Var, xn xnVar, org.telegram.ui.Components.sl0 sl0Var, LinearLayout linearLayout, org.telegram.ui.Components.q70 q70Var, org.telegram.ui.Components.q70 q70Var2) {
        this.h = yv0Var;
        this.f41319a = xh0Var;
        this.f41320b = xnVar;
        this.f41321c = sl0Var;
        this.d = linearLayout;
        this.f41322e = q70Var;
        this.f41323f = q70Var2;
    }

    @Override
    public final void onClick(View view) {
        xh0 xh0Var = this.f41319a;
        ArrayList arrayList = xh0Var.f43049b;
        ArrayList arrayList2 = xh0Var.f43050c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            yv0 yv0Var = this.h;
            xn xnVar = this.f41320b;
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
                yv0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && xnVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(yv0Var.getContext()), yv0Var.f43708b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                xnVar.f43219k1 = t6;
                t6.f27778j = 4000;
                t6.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.sl0 sl0Var = this.f41321c;
            sl0Var.requestLayout();
            this.d.requestLayout();
            sl0Var.getAdapter().l();
            this.f41322e.K(this.f41323f);
        }
    }
}
