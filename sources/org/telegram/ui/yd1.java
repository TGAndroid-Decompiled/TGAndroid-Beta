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
    public final zh0 f40126a;
    public final wn f40127b;
    public final org.telegram.ui.Components.xl0 f40128c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.z70 e;
    public final org.telegram.ui.Components.z70 f40129f;
    public final de1 h;

    public yd1(de1 de1Var, zh0 zh0Var, wn wnVar, org.telegram.ui.Components.xl0 xl0Var, LinearLayout linearLayout, org.telegram.ui.Components.z70 z70Var, org.telegram.ui.Components.z70 z70Var2) {
        this.h = de1Var;
        this.f40126a = zh0Var;
        this.f40127b = wnVar;
        this.f40128c = xl0Var;
        this.d = linearLayout;
        this.e = z70Var;
        this.f40129f = z70Var2;
    }

    @Override
    public final void onClick(View view) {
        zh0 zh0Var = this.f40126a;
        ArrayList arrayList = zh0Var.f40493b;
        ArrayList arrayList2 = zh0Var.f40494c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            de1 de1Var = this.h;
            wn wnVar = this.f40127b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f18482id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18335id);
                }
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                de1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && wnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(de1Var.getContext()), de1Var.f33088a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                wnVar.f39569n1 = t10;
                t10.f27635j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.xl0 xl0Var = this.f40128c;
            xl0Var.requestLayout();
            this.d.requestLayout();
            xl0Var.getAdapter().l();
            this.e.K(this.f40129f);
        }
    }
}
