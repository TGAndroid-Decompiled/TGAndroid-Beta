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
public final class yv0 implements View.OnClickListener {
    public final ai0 f39905a;
    public final xn f39906b;
    public final org.telegram.ui.Components.ml0 f39907c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.o70 e;
    public final org.telegram.ui.Components.o70 f39908f;
    public final fw0 h;

    public yv0(fw0 fw0Var, ai0 ai0Var, xn xnVar, org.telegram.ui.Components.ml0 ml0Var, LinearLayout linearLayout, org.telegram.ui.Components.o70 o70Var, org.telegram.ui.Components.o70 o70Var2) {
        this.h = fw0Var;
        this.f39905a = ai0Var;
        this.f39906b = xnVar;
        this.f39907c = ml0Var;
        this.d = linearLayout;
        this.e = o70Var;
        this.f39908f = o70Var2;
    }

    @Override
    public final void onClick(View view) {
        ai0 ai0Var = this.f39905a;
        ArrayList arrayList = ai0Var.f31800b;
        ArrayList arrayList2 = ai0Var.f31801c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            fw0 fw0Var = this.h;
            xn xnVar = this.f39906b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f18230id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18083id);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                fw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && xnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(fw0Var.getContext()), fw0Var.f33373b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                xnVar.f39471n1 = t10;
                t10.f27306j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.ml0 ml0Var = this.f39907c;
            ml0Var.requestLayout();
            this.d.requestLayout();
            ml0Var.getAdapter().l();
            this.e.K(this.f39908f);
        }
    }
}
