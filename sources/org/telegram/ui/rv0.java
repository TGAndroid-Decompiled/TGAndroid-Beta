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
public final class rv0 implements View.OnClickListener {
    public final rh0 f43303a;
    public final un f43304b;
    public final org.telegram.ui.Components.mm0 f43305c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.k80 e;
    public final org.telegram.ui.Components.k80 f43306f;
    public final xv0 h;

    public rv0(xv0 xv0Var, rh0 rh0Var, un unVar, org.telegram.ui.Components.mm0 mm0Var, LinearLayout linearLayout, org.telegram.ui.Components.k80 k80Var, org.telegram.ui.Components.k80 k80Var2) {
        this.h = xv0Var;
        this.f43303a = rh0Var;
        this.f43304b = unVar;
        this.f43305c = mm0Var;
        this.d = linearLayout;
        this.e = k80Var;
        this.f43306f = k80Var2;
    }

    @Override
    public final void onClick(View view) {
        rh0 rh0Var = this.f43303a;
        ArrayList arrayList = rh0Var.f43162b;
        ArrayList arrayList2 = rh0Var.f43163c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            xv0 xv0Var = this.h;
            un unVar = this.f43304b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f22176id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22027id);
                }
                unVar.presentFragment(new ProfileActivity(bundle, null));
                xv0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && unVar.f44295j1.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(xv0Var.getContext()), xv0Var.f45873b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                unVar.f44497z1 = t10;
                t10.f31889j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.mm0 mm0Var = this.f43305c;
            mm0Var.requestLayout();
            this.d.requestLayout();
            mm0Var.getAdapter().l();
            this.e.K(this.f43306f);
        }
    }
}
