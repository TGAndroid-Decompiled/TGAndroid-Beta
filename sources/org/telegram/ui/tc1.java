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
public final class tc1 implements View.OnClickListener {
    public final qh0 f41637a;
    public final qn f41638b;
    public final org.telegram.ui.Components.im0 f41639c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.i80 e;
    public final org.telegram.ui.Components.i80 f41640f;
    public final yc1 h;

    public tc1(yc1 yc1Var, qh0 qh0Var, qn qnVar, org.telegram.ui.Components.im0 im0Var, LinearLayout linearLayout, org.telegram.ui.Components.i80 i80Var, org.telegram.ui.Components.i80 i80Var2) {
        this.h = yc1Var;
        this.f41637a = qh0Var;
        this.f41638b = qnVar;
        this.f41639c = im0Var;
        this.d = linearLayout;
        this.e = i80Var;
        this.f41640f = i80Var2;
    }

    @Override
    public final void onClick(View view) {
        qh0 qh0Var = this.f41637a;
        ArrayList arrayList = qh0Var.f40572b;
        ArrayList arrayList2 = qh0Var.f40573c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            yc1 yc1Var = this.h;
            qn qnVar = this.f41638b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20420id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20273id);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                yc1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && qnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(yc1Var.getContext()), yc1Var.f43442a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                qnVar.f40769n1 = t10;
                t10.f29594j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.im0 im0Var = this.f41639c;
            im0Var.requestLayout();
            this.d.requestLayout();
            im0Var.getAdapter().l();
            this.e.K(this.f41640f);
        }
    }
}
