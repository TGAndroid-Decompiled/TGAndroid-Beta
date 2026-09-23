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
public final class yd1 implements View.OnClickListener {
    public final ai0 f39797a;
    public final xn f39798b;
    public final org.telegram.ui.Components.ml0 f39799c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.o70 e;
    public final org.telegram.ui.Components.o70 f39800f;
    public final de1 h;

    public yd1(de1 de1Var, ai0 ai0Var, xn xnVar, org.telegram.ui.Components.ml0 ml0Var, LinearLayout linearLayout, org.telegram.ui.Components.o70 o70Var, org.telegram.ui.Components.o70 o70Var2) {
        this.h = de1Var;
        this.f39797a = ai0Var;
        this.f39798b = xnVar;
        this.f39799c = ml0Var;
        this.d = linearLayout;
        this.e = o70Var;
        this.f39800f = o70Var2;
    }

    @Override
    public final void onClick(View view) {
        ai0 ai0Var = this.f39797a;
        ArrayList arrayList = ai0Var.f31800b;
        ArrayList arrayList2 = ai0Var.f31801c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            de1 de1Var = this.h;
            xn xnVar = this.f39798b;
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
                de1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && xnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(de1Var.getContext()), de1Var.f32621a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                xnVar.f39471n1 = t10;
                t10.f27306j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.ml0 ml0Var = this.f39799c;
            ml0Var.requestLayout();
            this.d.requestLayout();
            ml0Var.getAdapter().l();
            this.e.K(this.f39800f);
        }
    }
}
