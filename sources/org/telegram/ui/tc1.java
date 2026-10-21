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
    public final qh0 f41643a;
    public final qn f41644b;
    public final org.telegram.ui.Components.jm0 f41645c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.i80 e;
    public final org.telegram.ui.Components.i80 f41646f;
    public final yc1 h;

    public tc1(yc1 yc1Var, qh0 qh0Var, qn qnVar, org.telegram.ui.Components.jm0 jm0Var, LinearLayout linearLayout, org.telegram.ui.Components.i80 i80Var, org.telegram.ui.Components.i80 i80Var2) {
        this.h = yc1Var;
        this.f41643a = qh0Var;
        this.f41644b = qnVar;
        this.f41645c = jm0Var;
        this.d = linearLayout;
        this.e = i80Var;
        this.f41646f = i80Var2;
    }

    @Override
    public final void onClick(View view) {
        qh0 qh0Var = this.f41643a;
        ArrayList arrayList = qh0Var.f40578b;
        ArrayList arrayList2 = qh0Var.f40579c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            yc1 yc1Var = this.h;
            qn qnVar = this.f41644b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20423id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20276id);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                yc1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && qnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(yc1Var.getContext()), yc1Var.f43448a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                qnVar.f40775n1 = t10;
                t10.f29531j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.jm0 jm0Var = this.f41645c;
            jm0Var.requestLayout();
            this.d.requestLayout();
            jm0Var.getAdapter().l();
            this.e.K(this.f41646f);
        }
    }
}
