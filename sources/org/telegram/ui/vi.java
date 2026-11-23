package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class vi extends org.telegram.ui.Components.zn {
    public final bn B0;

    public vi(bn bnVar, Context context, bn bnVar2, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, bnVar2, z10, i6Var);
        this.B0 = bnVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        bn bnVar = this.B0;
        if (!bnVar.mb && !bnVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.g2) bnVar).inBubbleMode;
            if (!z10 && bnVar.f46253k0 != null && !bnVar.H3) {
                if (!bnVar.fa() || bnVar.f46422x4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d() {
        bn bnVar = this.B0;
        TLRPC.User user = bnVar.f46187f;
        if (user != null && user.linked_community_id != 0) {
            bnVar.showDialog(new li.c0(bnVar, bnVar.f46187f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = bnVar.f46173e;
        if (chat != null && chat.linked_community_id != 0) {
            bnVar.showDialog(new li.c0(bnVar, bnVar.f46173e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        bn bnVar = this.B0;
        if (bnVar.ea()) {
            str = "";
        } else {
            str = null;
        }
        bnVar.Oa(str);
    }

    @Override
    public final boolean o() {
        if (this.B0.f46204g4 == 3) {
            return true;
        }
        return false;
    }
}
