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
public final class zd1 implements View.OnClickListener {
    public final ci0 f40476a;
    public final xn f40477b;
    public final org.telegram.ui.Components.yl0 f40478c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.a80 e;
    public final org.telegram.ui.Components.a80 f40479f;
    public final ee1 h;

    public zd1(ee1 ee1Var, ci0 ci0Var, xn xnVar, org.telegram.ui.Components.yl0 yl0Var, LinearLayout linearLayout, org.telegram.ui.Components.a80 a80Var, org.telegram.ui.Components.a80 a80Var2) {
        this.h = ee1Var;
        this.f40476a = ci0Var;
        this.f40477b = xnVar;
        this.f40478c = yl0Var;
        this.d = linearLayout;
        this.e = a80Var;
        this.f40479f = a80Var2;
    }

    @Override
    public final void onClick(View view) {
        ci0 ci0Var = this.f40476a;
        ArrayList arrayList = ci0Var.f32727b;
        ArrayList arrayList2 = ci0Var.f32728c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            ee1 ee1Var = this.h;
            xn xnVar = this.f40477b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f18476id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18329id);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                ee1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && xnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(ee1Var.getContext()), ee1Var.f33231a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                xnVar.f39852n1 = t10;
                t10.f27691j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.yl0 yl0Var = this.f40478c;
            yl0Var.requestLayout();
            this.d.requestLayout();
            yl0Var.getAdapter().l();
            this.e.K(this.f40479f);
        }
    }
}
